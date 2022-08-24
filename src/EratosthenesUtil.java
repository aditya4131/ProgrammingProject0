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

class EratosthenesUtil {
    EratosthenesUtil() {
    }

    public static ArrayList<Integer> sieve(int n) {
        if (n < 2) { // returns an empty arraylist if n is less than two
            return new ArrayList();
        } else {
            ArrayList<Integer> primeNumbers = new ArrayList();
            boolean[] isPrimeNumber = new boolean[n];
            Arrays.fill(isPrimeNumber, true);

            int i;
            for(i = 2; (double)i < Math.sqrt((double)n); ++i) {
                if (isPrimeNumber[i]) {
                    for(int j = i * i; j < n; ++j) {
                        isPrimeNumber[j] = false;
                    }
                }
            }

            for(i = 2; i < n; ++i) {
                if (isPrimeNumber[i]) {
                    primeNumbers.add(i);
                }
            }

            for(i = 0; i < primeNumbers.size(); ++i) {
                System.out.println(primeNumbers.get(i));
            }

            return primeNumbers;
        }
    }

    public static String toString(ArrayList<Long> v) {
        String primes = "";

        for(int i = 0; i < v.size(); ++i) {
            primes = primes + v.get(i);
        }

        return "{" + primes + "}";
    }

    public static void main(String[] args) {
    }
}
