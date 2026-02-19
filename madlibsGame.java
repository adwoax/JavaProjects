import java.util.Scanner;

public class madlibsGame  {
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);

       String emotion;
       String place;
       String person;
       String place2;
       String emotion2;
       String person2;

        System.out.print("Enter an emotion(present tense)");
        emotion = scanner.nextLine();
        System.out.print("Enter any place of choice");
        place = scanner.nextLine();
        System.out.print("Enter a name of a person");
        person = scanner.nextLine();
        System.out.print("Enter another place of choice");
        place2 = scanner.nextLine();
        System.out.print("Enter another emotion(present tense");
        emotion2 = scanner.nextLine();
        System.out.print("Enter another name");
        person2 = scanner.nextLine();


        System.out.println("\nToday I went to the " + place + " with " + person);
        System.out.println("There, I got a call from " + person2 + " to go " + place2);
        System.out.println("Initially i was " + emotion + ",now I'm " + emotion2);
    }
}
