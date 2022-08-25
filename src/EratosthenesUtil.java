/**
 * Provides an implementation for the Eratosthene's sieve generator
 *
 * @author Aditya Srivastava
 * <pre>
 * Date: 08/24/2022
 * Course: csc 3102
 * Project # 0
 * Instructor: Dr. Duncan
 * </pre>
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Math;

class EratosthenesUtil {
    public static ArrayList<Integer> sieve(long n) {
        if (n < 2) { // returns an empty arraylist if n is less than two
            return new ArrayList();
        } else {
            ArrayList<Integer> primeNumbers = new ArrayList();
            boolean[] isPrimeNumber = new boolean[(int) n];
            Arrays.fill(isPrimeNumber, true);

            isPrimeNumber[0] = false;
            isPrimeNumber[1] = false;

            for (int i = 2; i < Math.sqrt(n); i++) {
                if (isPrimeNumber[i]) {
                    for (int j = 2; i * j < n; j++) {
                        isPrimeNumber[i * j] = false;
                    }
                }
            }

            for (int i = 2; i < n; i++) {
                if (isPrimeNumber[i]) {
                    primeNumbers.add(i);
                }
            }
            return primeNumbers;
        }
    }

    public static String toString(ArrayList<Integer> v) {
        String primes = "";

        System.out.print("{");
        for (int i = 0; i < v.size(); i++) {
            if (i > 0) {
                System.out.print(",");
            }
            System.out.print(v.get(i));
        }
        System.out.print("}");

        return "{" + primes + "}";
    }
}
