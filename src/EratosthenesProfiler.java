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

import java.util.Scanner;
public class EratosthenesProfiler extends EratosthenesUtil {
    public EratosthenesProfiler() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number or enter 000 to quit: ");
        int input = in.nextInt();


        EratosthenesUtil a = new EratosthenesUtil();
        long startTime = System.nanoTime();
        a.toString(sieve(input));
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        input = 0;
        System.out.println("Time: " + elapsedTime / 1000000);
    }
}