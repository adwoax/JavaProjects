import java.util.Scanner;

public class weightConverter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight conversion programme");
        System.out.println("1. convert lbs to kgs");
        System.out.println("convert kgs to lbs");

        System.out.println("choose an option [1/2]: ");
        choice = scanner.nextInt();

        if(choice == 1){
            System.out.println("Enter the weight in pounds[lbs]: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.println("weight in kilograms = " + newWeight + "kgs");
        }
        else if(choice == 2){
            System.out.println("Enter the weight in kilograms[kgs]: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.println("weight in pounds = " + newWeight + "lbs");
        }
        else{
            System.out.println("INVALID CHOICE!");
        }
        scanner.close();


    }
}
