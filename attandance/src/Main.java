import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class AttendanceApp {
    private ArrayList<Student> attendedStudents;
    private ArrayList<Student> allStudents;

    public AttendanceApp(ArrayList<Student> studentList) {
        attendedStudents = new ArrayList<>();
        allStudents = studentList;
    }

    public void markAttendance(Scanner scanner) {
        System.out.println("Enter your name to mark attendance:");
        String name = scanner.nextLine().trim();

        Student student = findStudent(name);
        if (student != null) {
            if (attendedStudents.contains(student)) {
                System.out.println(student.getName() + ", you have already attended today.");
            } else {
                attendedStudents.add(student);
                System.out.println(student.getName() + ", you are marked as attended today.");
            }
        } else {
            System.out.println("Invalid name. You are not on the student list.");
        }
    }

    private Student findStudent(String name) {
        return allStudents.stream()
                .filter(student -> student.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

    public void displayAttendance() {
        System.out.println("Attendance for today:");
        attendedStudents.forEach(student -> System.out.println(student.getName() + " attended today."));

        System.out.println("Not attended for today:");
        allStudents.stream()
                .filter(student -> !attendedStudents.contains(student))
                .forEach(student -> System.out.println(student.getName() + " did not attend today."));
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> studentsList = new ArrayList<>();
        studentsList.add(new Student("John"));
        studentsList.add(new Student("Mary"));
        studentsList.add(new Student("Bob"));

        AttendanceApp attendanceApp = new AttendanceApp(studentsList);
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Choose an option:");
            System.out.println("1. Mark your attendance");
            System.out.println("2. Display attendance for today");
            System.out.println("3. Exit");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    attendanceApp.markAttendance(scanner);
                    break;
                case 2:
                    attendanceApp.displayAttendance();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }
}
