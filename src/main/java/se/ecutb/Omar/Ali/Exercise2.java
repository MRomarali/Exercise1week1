package se.ecutb.Omar.Ali;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any Year");
        int Year = input.nextInt();
        boolean asLongAs = true;
        if (Year % 400 == 0) {
            asLongAs = true;
        }else if (Year % 4 == 0) {
            asLongAs = true;
        }else if (Year % 100 == 0) {
            asLongAs = false;
        }else {
            asLongAs = false;
        }
        if (asLongAs) {
            System.out.println("Year " + Year + " is a Leap Year");
        }
        else {
            System.out.println("Year " + Year + " Is not a Leap Year");
        }

    }
}
