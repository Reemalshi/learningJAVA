import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> employeeList = new ArrayList<>(
                Arrays.asList("reem", "sara", "alaa", "mohammed", "salim"));
        Salary employee1 = new Salary(employeeList);
        Scanner read = new Scanner(System.in);
        int option;

        do {
            System.out.println("welcome to our salary system:");
            System.out.println("Choose one option:");
            System.out.println("1) singing new employee");
            System.out.println("2) Display salary for all employee");
            System.out.println("3) Exit from system");

            option = read.nextInt();
            read.nextLine();

            switch (option) {
                case 1:
                    employee1.marksalary(read);

                    break;
                case 2:
                    employee1.displaySalary();
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
}
