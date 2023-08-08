import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        array


        int [] x = new int[5];
         x [ 2] = 2;

         int [] y = {21 , 2 , 5, 6, 85 };
        System.out.println(y.length);
        System.out.println(y[3]);

//     array with for loop
        int [] g = {21 , 2 , 5, 6, 85 };
        for (int i=0; i<g.length; i++ ){
            System.out.println(g[i]);
        }

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

        for (int i = 0; i < qu1.length; i++) {
            System.out.println(qu1[i]);
            System.out.println("please enter your ANSWER: ");
            int ans2 = reed.nextInt();

            if (ans2 == ans1[i]){
                System.out.println( "correct ");
                score++;
            } else {
                System.out.println( " wrong ");

            }

        }
        System.out.println(" your score = " +score + " of 5");



        String arr1[] = { "hello", "in" , "our", "new" , "word"};
        System.out.println(Arrays.toString(arr1));

        for (int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");

        }




    }
}

