/**
 * A program to profile the Eratosthene's Sieve prime generator
 * and compare the exact value of the prime-counting function and
 * the n/ln(n) approximation.
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
public class EratosthenesProfiler extends EratosthenesUtil {
    public EratosthenesProfiler() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer n to generate primes in [2,n] ");
        long input = in.nextLong();
        ArrayList<Long> result = new ArrayList<>();

        EratosthenesUtil a = new EratosthenesUtil();
        long startTime = System.nanoTime();
        result = a.sieve(input);
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        long finalTime = elapsedTime /1000;

        System.out.print("P(" + input + ") = " ); System.out.print((a.toString(result)));
        System.out.println();
        System.out.println("Time to Generate the Primes: " + finalTime + " microseconds");
        System.out.println("pi(" + input + ") = " + result.size());
        System.out.println();


        System.out.printf("%-12s %-12s %-12s %-12s %-12s \n" , "n", "Time(us)", "pi(n)", "n/ln(n)", "%Error in pi(n)");

       while( input != -1) {
            long startTime1 = System.nanoTime();
            result = a.sieve(input);
            long endTime1 = System.nanoTime();
            long elapsedTime1 = endTime1 - startTime1;
            long finalTime1 = elapsedTime1 /1000;

            double log = input/Math.log(input);
            double pi = Math.PI * input;
            double error = ((log - pi)/pi);
            double finalError = error * 100;


            System.out.printf("%-12d %-12d %-12d %-12.1f %-12.1f", input, finalTime1, result.size(),log, finalError );
            System.out.println();
           //System.out.println("Enter an integer n to generate primes in [2,n] ");
           input = in.nextLong();
        }










    }
}