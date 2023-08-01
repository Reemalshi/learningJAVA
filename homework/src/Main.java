import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> studentList = new ArrayList<>(Arrays.asList("reem", "sara", "shamsa", "alaa", "buthina"));
        AttendanceApp attendanceApp = new AttendanceApp(studentList);

        Scanner read = new Scanner(System.in);
        int option;

        do {
            System.out.println("welcome to our attendance system:");
            System.out.println("Choose one option:");
            System.out.println("1) Mark your attendance");
            System.out.println("2) Display attendance for today");
            System.out.println("3) Exit from system");

            option = read.nextInt();
            read.nextLine();

            switch (option) {
                case 1:
                    attendanceApp.markAttendance(read);
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
