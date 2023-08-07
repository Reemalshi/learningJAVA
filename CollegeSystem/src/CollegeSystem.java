import java.util.*;
class CollegeSystem {
    private List<Course> courses;
    private List<Student> students;

    public CollegeSystem() {
        this.courses = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayRegisteredCourses(Student student) {
        List<Course> registeredCourses = student.getRegisteredCourses();
        System.out.println("\n" + student.getName() + "'s Registered Courses:");
        for (Course course : registeredCourses) {
            System.out.println("Course: " + course.getName());
            System.out.println("Doctor: " + course.getDoctorName());
            System.out.println("Code: " + course.getCode());
            System.out.println("Hours: " + course.getHours());
            System.out.println();
        }
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the College System");

        Course course1 = new Course("Mathematics", "Dr. Smith", "MATH101", 3);
        Course course2 = new Course("Computer Science", "Dr. Johnson", "CS101", 4);
        Course course3 = new Course("Physics", "Dr. Williams", "PHYS101", 3);

        addCourse(course1);
        addCourse(course2);
        addCourse(course3);

        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();
        Student student = new Student(studentName);

        addStudent(student);

        boolean continueRegistering = true;
        while (continueRegistering) {
            System.out.println("\nAvailable Courses:");
            int courseNumber = 1;
            for (Course course : courses) {
                System.out.println(courseNumber + ". " + course.getName());
                courseNumber++;
            }
            System.out.println(courseNumber + ". Done registering");

            System.out.print("Choose a course (1-" + courseNumber + "): ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice >= 1 && choice <= courses.size()) {
                Course selectedCourse = courses.get(choice - 1);
                student.registerForCourse(selectedCourse);
            } else if (choice == courseNumber) {
                if (student.getRegisteredCourses().isEmpty()) {
                    System.out.println("Invalid choice. You haven't registered for any courses.");
                } else {
                    continueRegistering = false;
                }
            } else {
                System.out.println("Invalid choice.");
            }
        }

        displayRegisteredCourses(student);

        scanner.close();
    }
}