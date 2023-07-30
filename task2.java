import java.util.Random;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        System.out.println("Think of a whole number betwen 1 and 100. I'll guess what it is!");
        System.out.println("When you're ready, type yes and press enter.");

        Scanner scanner = new Scanner(System.in);

        scanner.nextLine();
        Random random = new Random();
        int rightn = random.nextInt(100);

        boolean done = false;
        while (!done) {

            System.out.println("write your guess number: ");
            int guess = scanner.nextInt();
            if (rightn > guess) {
                System.out.println("Please type greater  ");
            } else if (rightn < guess) {
                System.out.println("Please type lower  ");
            } else if (rightn == guess) {
                System.out.println("correct answer  ");
                done = true;
            } else {
                scanner.close();
            }
        }
    }
}
