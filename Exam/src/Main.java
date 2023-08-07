import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reed = new Scanner(System.in);
        System.out.println("please enter your name: ");
        String nam1 = reed.next();
        System.out.println("please enter number of quation: ");
        int qua2 = reed.nextInt();

        String[] qu1 = {
                "3+3=",
                "2+6=",
                "5+1=",
                "6-1=",
                "85-5="};

        int[] ans1 = {
                6,
                8,
                6,
                5,
                80

        };
        int score = 0;

        for (String s : qu1) {
            System.out.println(s);
            System.out.println("please enter your ANSWER: ");
            int ans2 = reed.nextInt();

            if (ans2 == ans1[0]) {
                score = score + 3;
                System.out.println(score);
//                score++;
            } else {

            }
                if (ans2 == ans1[1]) {
                score = score + 2;
//                score--;
                System.out.println(score);

//
            } else if (ans2 == ans1[2]) {
                score = score + 1;
                System.out.println(score);


            } else if (ans2 == ans1[3]) {
                score = score + 3;
                System.out.println(score);

            } else if (ans2 == ans1[4]) {
                score = score + 1;
                System.out.println(score);

            }
        }
        System.out.println(" your score = " + score);
    }
}