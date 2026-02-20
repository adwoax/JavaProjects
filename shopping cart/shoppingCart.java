import java.util.Scanner;

public class shoppingCart {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    String item;
    double price;
    int quantity;
    char currency='$';
    double total;

    System.out.print("What item would you like to buy?");
    item = scanner.nextLine();
    System.out.print("What is the price for each?");
    price = scanner.nextDouble();
    System.out.print("How many would you like?");
    quantity = scanner.nextInt();

    total = price * quantity;
    System.out.print("\n You have bought " + quantity +" " + item + "/s.");
    System.out.print(" Your total is " + currency + total);

    scanner.close();
    }
}
