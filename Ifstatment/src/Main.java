public class Main {
    public static void main(String[] args) {
//        If statement
        int x = 5;
        int y = 6;

        if (x > y) {
            System.out.println("x is grater than y ");
        } else {
            System.out.println(" y is grater than x");
        }
        int x = 5;
        int y = 6;

        if (x > y) {
            System.out.println("x is grater than y ");
        } else if (x == y) {
            System.out.println(" y is equal x");
        } else {
            System.out.println(" error");


        }


//      If statement with scanner
        Scanner reed = new Scanner(System.in);
        System.out.println("please enter first number: ");
        int num1 = reed.nextInt();
        System.out.println("please enter second number: ");
        int num2 = reed.nextInt();
        System.out.println("please enter third number: ");
        int num3 = reed.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println("first  is grater number  ");
        } else if (num2 > num3 && num2 > num1) {
            System.out.println("second is grater number  ");
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("third is grater number  ");
        } else {
            System.out.println("error ");
        }
        Scanner reed = new Scanner(System.in);
        System.out.println("please enter first number: ");
        int num1 = reed.nextInt();
        System.out.println("please enter second number: ");
        int num2 = reed.nextInt();
        System.out.println("please enter opration: ");
        int result;
        String opration = reed.next();
        if (opration.equals("+")) {
            result = num1 + num2;
            System.out.println("result of = " + result);
        } else if (opration.equals("-")) {
            result = num1 - num2;
            System.out.println("result of = " + result);

        } else if (opration.equals("/")) {
            result = num1 / num2;
            System.out.println("result of = " + result);

        } else if (opration.equals("*")) {
            result = num1 * num2;
            System.out.println("result of = " + result);

        } else {
            System.out.println("error");
        }


//      If statement with scanner
        Scanner reed = new Scanner(System.in);
        System.out.println("please enter first subjact: ");
        int sub1 = reed.nextInt();
        System.out.println("please enter second subjact: ");
        int sub2 = reed.nextInt();
        System.out.println("please enter third subjact: ");
        int sub3 = reed.nextInt();
        System.out.println("please enter fourth subjact: ");
        int sub4 = reed.nextInt();
        System.out.println("please enter fifth subjact: ");
        int sub5 = reed.nextInt();
        int grad;
        grad = ((sub1 + sub2 + sub3 + sub4 + sub5) / 5);
        if (grad >= 90 && grad <= 100) {
            System.out.println("the grad = " + grad + " A ");
        } else if (grad >= 80 && grad <= 100) {
            System.out.println("the grad = " + grad + " B ");
        } else if (grad >= 70 && grad <= 100) {
            System.out.println("the grad = " + grad + " C ");
        } else if (grad >= 50 && grad <= 100) {
            System.out.println("the grad = " + grad + " D ");
        } else {
            System.out.println("error ");
        }
//             if statement with scanner:
        Scanner reed = new Scanner(System.in);
        System.out.println("please enter first number: ");
        int num1 = reed.nextInt();
        System.out.println("please enter second number: ");
        int num2 = reed.nextInt();
        System.out.println("please enter third number: ");
        int num3 = reed.nextInt();
        System.out.println("please enter opration1: ");
        String opration1 = reed.next();
        System.out.println("please enter opration2: ");
        String opration2 = reed.next();
        int result;
        int re1;
        int re2;
        if (opration1.equals("+") && opration2.equals("+")) {
            result = num1 + num2 + num3;
            System.out.println("result of = " + result);
        } else if (opration1.equals("-") && opration2.equals("-")) {
            result = num1 - num2 - num3;
            System.out.println("result of = " + result);

        } else if (opration1.equals("/") && opration2.equals("/")) {
            result = num1 / num2 / num3;
            System.out.println("result of = " + result);

        } else if (opration1.equals("*") && opration2.equals("*")) {
            result = num1 * num2 * num3;
            System.out.println("result of = " + result);
        } else if (opration1.equals("+") || opration1.equals("-") && opration2.equals("*") || opration2.equals("/")) {
            re1 = num2 * num3 + num1;
            re2 = num2 / num3 - num1;
            System.out.println("result of = " + re1);
            System.out.println("result of = " + re2);
        }

    }
}