import java.util.ArrayList;
import java.util.Scanner;

public class Subjectlist {
        private ArrayList<String>regestsubject;
        private ArrayList<String>allsubject;

        public Subjectlist(ArrayList<String>subjList) {
            regestsubject = new ArrayList<>();
            allsubject = subjList;
        }
    public void marksubject(Scanner scanner) {
        System.out.println("Enter your name of course: ");
        String name = scanner.nextLine();

        if (!name.isEmpty()) {
            if (allsubject.contains(name)) {
                if (regestsubject.contains(name)) {
                    System.out.println(name + ", you have already registered .");
                } else {
                    regestsubject.add(name);
                    System.out.println(name + ", you are registered for this course.");
                }
            } else {
                System.out.println("Invalid course. this course not in the list.");
            }
        }
    }
}

