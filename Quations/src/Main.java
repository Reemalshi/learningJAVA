import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        FIRST quation :
        int x = 500;
        double y = 3.60;
        boolean re = true;
        String tr = "reem";

        System.out.println(x);
        System.out.println(y);
        System.out.println(re);
        System.out.println(tr);

        Scanner read = new Scanner(System.in);
        System.out.println("please enter your name: ");
        String name = read.next();
        System.out.println(" welcome " + name);

//        second quation :
        Scanner read = new Scanner(System.in);
        System.out.println("welcome to our system  ");
        System.out.println("please enter first number: ");
        double num1 = read.nextDouble();
        System.out.println("please enter second number: ");
        double num2 = read.nextDouble();
        System.out.println("ADDITION " + (num1 + num2));
        System.out.println("MULTIPLICATION " + (num1 * num2));
        System.out.println("SUBSTRACT " + (num1 - num2));
        System.out.println("DIVISION " + (num1 / num2));


//        third quation :
        Scanner read = new Scanner(System.in);
        System.out.println("welcome to our system  ");
        System.out.println("please enter RADIUS: ");
        double ip = 3.14;
        double rad = read.nextDouble();
        double area = ip * (rad * rad);
        double par = (2 * ip * rad);
        System.out.println(" Area =  " + area);
        System.out.println(" parimeter =  " + par);

//        four quation:


        Scanner read = new Scanner(System.in);
        System.out.println("welcome to our system  ");
        System.out.println("please enter first number: ");
        double fir = read.nextDouble();
        System.out.println("please enter second number: ");
        double sec = read.nextDouble();
        System.out.println("please enter third number: ");
        double thir =read.nextDouble();
        System.out.println(" The average number is : " + (fir + sec + thir) / 3);


        Scanner read = new Scanner(System.in);
        System.out.println("welcome to our system  ");
        System.out.println("please enter length: ");
        double len = read.nextDouble();
        System.out.println("please enter Width: ");
        double wit = read.nextDouble();
        double area = len * wit;
        double par = (2 * wit + 2 * len);
        System.out.println(" Area =  " + area);
        System.out.println(" parimeter =  " + par);

//      QUATION 5
        Scanner reed = new Scanner(System.in);
        System.out.println("welcome to our system  ");
        System.out.println("please enter first number : ");
        int fir = reed.nextInt();
        System.out.println("please enter second number : ");
        int sec = reed.nextInt();
        int x = fir;
        System.out.println(" FIRST NUMBER =  " + sec);
        System.out.println(" SECOND NUMBER =  " + x);
    }
}