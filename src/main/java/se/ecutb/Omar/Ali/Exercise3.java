package se.ecutb.Omar.Ali;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        int num1;
        int num2;
      System.out.println(" 45 + 11 = " + getSum(num1 = 45 , num2 = 11));
        System.out.println(" 55 - 12 = " + getSubtract(num1 = 55, num2 = 12));
        System.out.println(" 12 * 4 = " + getMultiply(num1 = 12, num2 = 4));
        System.out.println(" 24 / 6 = " + getDivided(num1 = 24, num2 = 6));
    }

    private static int getSum(int num1, int num2) {
        return num1 + num2;
    }

    private static int getMultiply(int num1, int num2) {
        return num1 * num2;
    }

    private static int getDivided(int num1, int num2) {
        return num1 / num2;
    }

    private static int getSubtract(int num1, int num2) {
        return num1 - num2;
    }
}



