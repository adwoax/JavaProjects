import java.util.Scanner;

public class javaHangman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = "java";
        String hidden = "____";

        StringBuilder newHidden;
        for(int attempts = 6; attempts > 0 && hidden.contains("_"); hidden = newHidden.toString()) {
            System.out.println("Word: " + hidden);
            System.out.print("Guess a letter: ");
            char guess = scanner.next().charAt(0);
            newHidden = new StringBuilder(hidden);

            for(int i = 0; i < word.length(); ++i) {
                if (word.charAt(i) == guess) {
                    newHidden.setCharAt(i, guess);
                }
            }

            if (hidden.equals(newHidden.toString())) {
                --attempts;
                System.out.println("Wrong! Attempts left: " + attempts);
            }
        }

        if (hidden.equals(word)) {
            System.out.println("You Win!");
        } else {
            System.out.println("You Lose! Word was: " + word);
        }

    }
}
