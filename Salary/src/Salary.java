import java.util.ArrayList;
import java.util.Scanner;

public class Salary {
    private ArrayList<String> newemployee;
    private ArrayList<String> allEmployee;
    private ArrayList<Integer> employeeSalaries;

    public Salary(ArrayList<String> employeeList) {
        newemployee = new ArrayList<>();
        allEmployee = employeeList;
        employeeSalaries = new ArrayList<>();
    }

    public void marksalary(Scanner read) {
        System.out.println("Enter employee name: ");
        String employeeName = read.next();

        System.out.println("Enter employee salary: ");
        int salary = read.nextInt();

        if (allEmployee.contains(employeeName)) {
            if (newemployee.contains(employeeName)) {
                System.out.println(employeeName + ", you have already marked his/her salary.");
            } else {
                newemployee.add(employeeName);
                employeeSalaries.add(salary);
                System.out.println(employeeName + ", you have marked his/her salary.");
            }
        } else {
            System.out.println("Invalid employee. Employee is not on the list.");
        }
    }

    public void displaySalary() {
        System.out.println("Salary for all employees:");

        int minSize = Math.min(allEmployee.size(), employeeSalaries.size());

        for (int i = 0; i < minSize; i++) {
            String name = allEmployee.get(i);
            int salary = employeeSalaries.get(i);
            System.out.println("Name of the employee is: " + name + " and the Salary is : " + salary);
        }

    }
}