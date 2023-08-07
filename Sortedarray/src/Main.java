import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the number of elements in the sorted array: ");
        int n = read.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the sorted elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = read.nextInt();
        }

        int newIndex = 0;
        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[newIndex]) {
                newIndex++;
                nums[newIndex] = nums[i];
            }
        }

        int newLength = newIndex + 1;

        System.out.print("Output: [");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i]);
            if (i < newLength - 1) {
                System.out.print(", ");
            }
        }
    }
}