//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.Arrays;

class EratosthenesUtil {
    EratosthenesUtil() {
    }

    public static ArrayList<Integer> sieve(int n) {
        if (n < 2) {
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
