import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Product {
    ArrayList<String> productList = new ArrayList<>(
            Arrays.asList("shose", "bages", "miackup"));
    Silar product1 = new Silar(productList);
    Scanner read = new Scanner(System.in);
    int option;

        do {
        System.out.println("welcome to our system:");
        System.out.println("Choose one option:");
        System.out.println("1) singing new product");
        System.out.println("2) Display all product");
        System.out.println("3) Exit from system");

        option = read.nextInt();
        read.nextLine();

        switch (option) {
            case 1:
                product1.markroduct(read);

                break;
            case 2:
                product1.display();
                break;
            case 3:
                System.out.println("Exiting from system");
                break;
            default:
                System.out.println("Invalid option. Please try again.");
        }
    } while (option != 3);

        read.close();
}
