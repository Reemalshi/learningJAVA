public class Main {
    public static void main(String[] args) {
//        for loop :

        for (int i =1;i <= 10; i = i+1){
            System.out.println(i);
        }

        int i = 10;
        i = i+1;
        i = i++;
        System.out.println(i);
        System.out.println(i++);
        System.out.println(++i);
        System.out.println(i);

        int i = 10;
        while (i <= 1){
            System.out.println(i);



            i--;
        }

       int i = 1;

        do {
            System.out.println(i);
        i++;
        } while (i <= 10);

//        even number :
        for (int i=0; i<=100; i++) {
            if ( i % 2 == 0){

                System.out.println(i);
            }
        }

//        odd number :

        int i = 1;
        while (i<= 100){
            if ( i % 2 == 1){

                System.out.println(i);
            }

            i++;
        }

    }
}