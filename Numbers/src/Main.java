import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] inputArray = new int[n - 1];

        System.out.println("Enter " + (n - 1) + " elements of the array (numbers from 1 to " + n + "):");
        for (int i = 0; i < n - 1; i++) {
            inputArray[i] = scanner.nextInt();
        }

        int missingNumber = 0;
        for (int i = 1; i <= n; i++) {
            boolean found = false;
            for (int num : inputArray) {
                if (num == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                missingNumber = i;
                break;
            }
        }

        System.out.println("The missing number is: " + missingNumber);
    }
}