

import java.util.Scanner;
import java.util.Random;

public class numberGuessingGame {
    public static void main(String[] args){

    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    int guess;
    int attempts = 0;
    int min = 1;
    int max = 100;
    int randomNumber = random.nextInt(min, max +1);

        System.out.println("----NUMBER GUESSING GAME------");
        System.out.println("----Guess a number between 1 and 100---");


        do{
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if(guess < randomNumber){
                System.out.print("TOO LOW! Try again!");
            }
            else if(guess > randomNumber){
                System.out.println("TOO HIGH! Try again!");
            }
            else{
                System.out.println("Correct! The number was " + randomNumber);
                System.out.println("No. of attempts: " + attempts);
            }

        }while(guess != randomNumber);
        scanner.close();
    }
}
