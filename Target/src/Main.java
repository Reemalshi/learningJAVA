import java.util.Scanner;
class Target {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = read.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = read.nextInt();
        }

        System.out.print("Enter the target sum: ");
        int target = read.nextInt();

        int[] indices = new int[2];
        boolean found = false;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    indices[0] = i;
                    indices[1] = j;
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        if (found) {
            System.out.println("Indices of elements " + nums[indices[0]] + " and " + nums[indices[1]] + ": [" + indices[0] + ", " + indices[1] + "]");
        } else {
            System.out.println("No two elements found that add up to the target value.");
        }
    }
}