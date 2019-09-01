package se.ecutb.Omar.Ali;

import java.util.Random;
import java.util.Scanner;

public class Exercise8 {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Random slumptal = new Random();
        int val = slumptal.nextInt(500);
        int count = 0;
        System.out.println("Guess a number between 1 and 500");
        int resultat = input.nextInt();
        boolean asLongAs = true;
        while (asLongAs){
            count++;
            if (resultat < val) {
                System.out.println("You guessed " + resultat + " Your guess was to low");
                resultat = input.nextInt();
            }else if (resultat > val) {
                System.out.println("You guessed " + resultat + " Your guess was to high");
                resultat = input.nextInt();
            }
            else if (resultat == val) {
                System.out.println("Congrats!! " + resultat + " Is the hidden number " + " you guessed " + count + " Times");
                asLongAs = false;
                break;
            }else {
                System.out.println("Something went wring, Try again");
                resultat = input.nextInt();
            }
        }

    }
}
