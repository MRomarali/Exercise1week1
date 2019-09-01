package se.ecutb.Omar.Ali;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1;
        double num2;
        double num3;

        System.out.println("Enter first number");
        num1 = input.nextInt();
        System.out.println("Enter second number");
        num2 = input.nextInt();
        System.out.println("Enter third number");
        num3 = input.nextInt();
        System.out.println("The Average of the three numbers are" + average(num1,num2,num3));

    }
    public static double average(double num1, double num2, double num3)
    {
        return (num1 + num2 + num3) / 3;
    }
}
