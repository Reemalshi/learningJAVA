import javax.security.auth.Subject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> subjList = new ArrayList<>(Arrays.asList(
                "code ",
                "course name",
                "doctor name ",
                "timing"
                ));
        Subject sub1 = new Subject(subjList);

        Scanner read = new Scanner(System.in);
        int option;

        do {
            System.out.println("welcome to our course registration system:");
            System.out.println("Choose one option:");
            System.out.println("1) register your course");
            System.out.println("2) Display your courses ");
            System.out.println("3) Exit from system");

            option = read.nextInt();
            read.nextLine();
            switch (option) {
                case 1:
                   subjectList.subList(read);
                    break;
                case 2:
                    attendanceApp.displayAttendance();
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