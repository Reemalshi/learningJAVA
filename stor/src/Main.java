import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product siplayer = new Product();

        Scanner read = new Scanner(System.in);
        int option1;
        do {
            System.out.println("welcome to our system:");
            System.out.println("Choose one option:");
            System.out.println("1) castmor");
            System.out.println("2) siplayer");
            System.out.println("3) Admin");
            System.out.println("4) Exit from system");

            option1 = read.nextInt();
            read.nextLine();

            switch (option1) {
                case 1:
                    siplayer.markroduct(read);

                    break;
                case 2:
                    siplayer.display();
                    break;
                case 3:

                    break;
                case 4:
                    System.out.println("Exiting from system");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option1 != 4);

        read.close();
    }
}