import java.util.Random;

public class randomNumbers {
    public static void main(String[] args){
        Random randomNumbers = new Random();


        //simple heads or tails game
        boolean isHeads;
        isHeads = randomNumbers.nextBoolean();
        if(isHeads){
            System.out.println("HEADS");
        }
//generate random number between 1 and 6
        /*
        int number;

        number = randomNumbers.nextInt(1,6);
        System.out.println(number);*
        else{
            System.out.println("TAILS");*/
        }
    }

