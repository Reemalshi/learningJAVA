import java.util.ArrayList;
import java.util.Scanner;

public class Silar {
    private ArrayList<String> newproduct;
    private ArrayList<String> allproduct;
    private ArrayList<Integer> value;

    public Silar(ArrayList<String> productList) {
        newproduct = new ArrayList<>();
        allproduct = productList;
        value = new ArrayList<>();
    }


    public void markroduct(Scanner read) {
        System.out.println("Enter name of product: ");
        String productName = read.next();

        System.out.println("Enter value of the product: ");
        int salary = read.nextInt();

        if (allproduct.contains(productName)) {
            if (newproduct.contains(productName)) {
                System.out.println(productName + ", you have already marked his/her value.");
            } else {
                newproduct.add(productName);
                value.add(salary);
                System.out.println(productName + ", you have marked his/her value.");
            }
        } else {
            System.out.println("Invalid employee. Product is not on the list.");
        }

    }

    public void display() {
        System.out.println("all product:");

        int minSize = Math.min(allproduct.size(), value.size());

        for (int i = 0; i < minSize; i++) {
            String name = allproduct.get(i);
            int salary = value.get(i);
            System.out.println("Name of the product is: " + name + " and the value is : " + salary + " OR ");
        }
    }
}
