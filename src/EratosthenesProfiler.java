/**
 * A program to profile the Eratosthene's Sieve prime generator
 * and compare the exact value of the prime-counting function and
 * the n/ln(n) approximation.
 *
 * @author Duncan, YOUR NAME
 * @see EratosthenesUtil
 * <pre>
 * Date: LAST-DATE-MODIFIED
 * Course: csc 3102
 * Project # 0
 * Instructor: Dr. Duncan
 * </pre>
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.Math;

public class EratosthenesProfiler {
    public EratosthenesProfiler() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long input = in.nextLong();

        System.out.println("Enter an integer n to generate primes in [2,n] -> " + input);

        ArrayList<Long> result = new ArrayList<>();


        long startTime = System.nanoTime();
        result = EratosthenesUtil.sieve(input);
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        long finalTime = elapsedTime / 1000;

        System.out.print("P(" + input + ") = ");
        System.out.print((EratosthenesUtil.toString(result)));
        System.out.println();
        System.out.println("Time to Generate the Primes: " + finalTime + " microseconds");
        System.out.println("pi(" + input + ") = " + result.size());
        System.out.println();


        System.out.printf("%-12s %-12s %-12s %-12s %-12s \n", "n", "Time(us)", "pi(n)", "n/ln(n)", "%Error in pi(n)");

        for (int i = 10000; i <= 150000; i += 10000) {
            long startTime1 = System.nanoTime();
            ArrayList<Long> finalPrimeResult = EratosthenesUtil.sieve(i);
            long endTime1 = System.nanoTime();
            long elapsedTime1 = endTime1 - startTime1;
            long finalTime1 = elapsedTime1 / 1000;

            double log = i / Math.log(i);
            //double pi = Math.PI * i;
            long size = finalPrimeResult.size();
            double error = ((log - size) / size) * 100;

            System.out.printf("%-12d %-12d %-12d %-12.1f %-12.1f", i, finalTime1, size, log, error);
            System.out.println();
        }


    }
}