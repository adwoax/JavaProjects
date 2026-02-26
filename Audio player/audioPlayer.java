import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class audioPlayer {

    public static void main(String[] args) {

        String filePath = "A Stroll - The Grey Room _ Density & Time.wav";
        File file = new File(filePath);

        try (Scanner scanner = new Scanner(System.in);
             AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)) {

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String response = "";

            while (!response.equals("Q")) {

                System.out.println("\nP = Play");
                System.out.println("S = Stop");
                System.out.println("R = Restart");
                System.out.println("Q = Quit");
                System.out.print("Enter your choice: ");

                response = scanner.next().toUpperCase();

                switch (response) {
                    case "P":
                        clip.start();
                        break;

                    case "S":
                        clip.stop();
                        break;

                    case "R":
                        clip.setMicrosecondPosition(0);
                        clip.start();
                        break;

                    case "Q":
                        clip.stop();
                        clip.close();
                        System.out.println("Goodbye!");
                        break;

                    default:
                        System.out.println("Invalid choice.");
                }
            }

        } catch (UnsupportedAudioFileException e) {
            System.out.println("Unsupported audio file.");
        } catch (IOException e) {
            System.out.println("File not found or error reading file.");
        } catch (LineUnavailableException e) {
            System.out.println("Audio line unavailable.");
        }
    }
}