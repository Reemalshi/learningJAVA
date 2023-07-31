
import java.util.*;

public class taskt1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the number of element in array : ");
        int x = read.nextInt();
        int[] array = new int[x];
        int temp;

        System.out.println("Enter the number of array :");
        for (int i = 0; i < x; i++) {
            array[i] = read.nextInt();
        }
        for (int i = 0; i < x; i++) {
            for (int j = i + 1; j < x; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.print(" sorted array in order :");
        for (int i = 0; i < x - 1; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(array[x - 1]);




//        Arrays.sort(array);

//        for ( array ){
//            System.out.printf( array +" ");
//        }
    }
}

