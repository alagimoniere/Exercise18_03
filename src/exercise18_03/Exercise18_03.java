package exercise18_03;

import java.util.Scanner;

public class Exercise18_03 {
    
    /** Return the factorial for the specified number */
    public static long gcd(long m, long n) {
        if ((m % n) == 0) {
            return n;
        } else {
            return gcd(n, m % n);
        }   
    }

    public static void main(String[] args) {

        /** Get input from user */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter integer 1: ");
        long m = input.nextLong();
        System.out.print("Enter integer 2: ");
        long n = input.nextLong();

        /** Print factorial */
        System.out.println("The greatest common denominator is " + gcd(m, n));

    }

}