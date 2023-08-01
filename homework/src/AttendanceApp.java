import java.util.ArrayList;
import java.util.Scanner;

public class AttendanceApp {
    private ArrayList<String> attendedStudents;
    private ArrayList<String> allStudents;

    public AttendanceApp(ArrayList<String> studentList) {
        attendedStudents = new ArrayList<>();
        allStudents = studentList;
    }

    public void markAttendance(Scanner scanner) {
        System.out.println("Enter your name to mark attendance: ");
        String name = scanner.nextLine();

        if (!name.isEmpty()) {
            if (allStudents.contains(name)) {
                if (attendedStudents.contains(name)) {
                    System.out.println(name + ", you have already marked attended today.");
                } else {
                    attendedStudents.add(name);
                    System.out.println(name + ", you are marked as attended today.");
                }
            } else {
                System.out.println("Invalid name. You are not on the student list.");
            }
        }
    }

    public void displayAttendance() {
        System.out.println("Attendance for today:");
        for (String name : attendedStudents) {
            System.out.println(name + " attended today.");
        }

        System.out.println("Not attended for today:");
        for (String name : allStudents) {
            if (!attendedStudents.contains(name)) {
                System.out.println(name + " did not attend today.");
            }
        }
    }
}
