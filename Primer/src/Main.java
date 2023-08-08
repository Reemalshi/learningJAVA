public class Main {
    public static void main(String[] args) {
//        primary number:

        int i = 1;
        do {
            if ( i != 1
                    && i%2 !=0
                    && i%3 !=0
                    && i%5 !=0
                    &&i%7 !=0
                    || i==2
                    ||i == 3
                    || i ==5
                    || i ==7 ) {

                    System.out.println(i);


            } i++;
        } while (i <= 100);
    }
}