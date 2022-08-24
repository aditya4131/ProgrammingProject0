/**
 * Provides an implementation for the Eratosthene's sieve generator
 * @author Duncan, YOUR NAME
 * <pre>
 * Date: LAST-DATE-MODIFIED
 * Course: csc 3102
 * Project # 0
 * Instructor: Dr. Duncan
 * </pre>
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Math;

class EratosthenesUtil {
    public static ArrayList<Integer> sieve(int n) {
        if (n < 2) { // returns an empty arraylist if n is less than two
            return new ArrayList();
        } else {
            ArrayList<Integer> primeNumbers = new ArrayList();
            boolean[] isPrimeNumber = new boolean[n];
            Arrays.fill(isPrimeNumber, true);

            isPrimeNumber[0] = false;
            isPrimeNumber[1] = false;

            for(int i = 2; i<n/2; i++) {
                if (isPrimeNumber[i]) {
                    for(int j = 2; i*j< n; j++) {
                        isPrimeNumber[i*j] = false;
                    }
                }
            }

            for(int i = 2; i < n; i++) {
                if (isPrimeNumber[i]) {
                    primeNumbers.add(i);
                }
            }
            System.out.print("{");
            for(int k =  0; k<primeNumbers.size(); k++){

                System.out.print( " , " + primeNumbers.get(k));
            }

            System.out.print("}");

            return primeNumbers;
        }
    }

    public static String toString(ArrayList<Integer> v) {
        String primes = "";

        for(int i = 0; i < v.size(); i++) {
            primes = primes + v.get(i);
        }

        return "{" + primes + "}";
    }

    public static void main(String[] args) {
         toString(sieve(0));
    }
}
