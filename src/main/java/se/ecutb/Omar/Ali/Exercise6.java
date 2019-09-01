package se.ecutb.Omar.Ali;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = input.nextInt();
        System.out.println("Enter second number");
        int num2 = input.nextInt();
        System.out.println(num1 +" + "+ num2 + " = " + getSum(num1, num2));
        System.out.println(num1 +" - "+ num2 + " = " + getSubtract(num1, num2));
        System.out.println(num1 +" * "+ num2 + " = " + getMultiply(num1, num2));
        System.out.println(num1 +" / "+ num2 + " = " + getDivided(num1, num2));
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
