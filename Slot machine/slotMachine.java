import java.util.Scanner;
import java.util.Random;

public class slotMachine {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int balance = 100;
        int bet;
        int payout;
        String[] row;

        System.out.println("*****************************");
        System.out.println("Welcome to Java Slot Machine");
        System.out.println("Symbols: ❤️ 🏀 🍷 🍒 🛹");
        System.out.println("*****************************");

        while(balance > 0){

            System.out.println("\nCurrent balance: $" + balance);
            System.out.print("Place your bet amount ---> ");
            bet = scanner.nextInt();

            if(bet > balance){
                System.out.println("Insufficient funds!!");
                continue;
            }
            else if(bet <= 0){
                System.out.println("Bet must be greater than zero!");
                continue;
            }

            balance -= bet;

            System.out.println("Spinning...");
            row = spinRow();
            printRow(row);

            payout = getPayout(row, bet);
            balance += payout;

            System.out.println("Payout: $" + payout);
        }

        System.out.println("Game Over! You ran out of money.");
        scanner.close();
    }

    static String[] spinRow(){

        String[] symbols = {"❤️", "🏀", "🍷", "🍒", "🛹"};
        String[] row = new String[3];
        Random random = new Random();

        for(int i = 0; i < 3; i++){
            row[i] = symbols[random.nextInt(symbols.length)];
        }

        return row;
    }

    static void printRow(String[] row){
        System.out.println(" " + String.join(" | ", row));
    }

    static int getPayout(String[] row, int bet){

        if(row[0].equals(row[1]) && row[1].equals(row[2])){
            System.out.println("JACKPOT! 🎉");
            return bet * 5;
        }
        else if(row[0].equals(row[1]) || row[1].equals(row[2]) || row[0].equals(row[2])){
            System.out.println("Nice! Two matching symbols!");
            return bet * 2;
        }
        else{
            System.out.println("No match. Try again!");
            return 0;
        }
    }
}