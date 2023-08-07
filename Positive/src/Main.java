import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = read.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            nums[i] = read.nextInt();
        }

        int result = find(nums);
        System.out.println("The smallest missing positive integer is: " + result);
    }

    public static int find(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0) {
                nums[i] = n + 1;
            }
        }

        for (int i = 0; i < n; i++) {
            int num = nums[i];
            if (num <= n) {
                int x = num - 1;
                if (x >= 0 && x < n) {
                    nums[x] = -nums[x];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                return i + 1;
            }
        }

        return n + 1;
    }
}