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
    public static ArrayList<Long> sieve(long n) {
        if (n < 2)
            return new ArrayList();


        ArrayList<Long> primeNumbers = new ArrayList();
        boolean[] isPrimeNumber = new boolean[(int) n + 1];
        Arrays.fill(isPrimeNumber, true);

        isPrimeNumber[0] = false;
        isPrimeNumber[1] = false;

        for (long i = 2; i <= Math.sqrt(n); i++) {
            if (isPrimeNumber[(int) i]) {
                for (long j = i * i; j <= n; j += i) {
                    isPrimeNumber[(int) j] = false;
                }
            }
        }

        for (long i = 2; i <= n; i++) {
            if (isPrimeNumber[(int) i]) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }
    public static String toString(ArrayList<Long> v) {
        String primes = "";
        primes += "{";
        for (int i = 0; i < v.size(); i++) {
            if (i > 0) {
                primes += ",";
            }
            primes += v.get(i);
        }
        primes += "}";
        return primes;
    }
}
