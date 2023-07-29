import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = read.nextLine();

        String reversedString = new StringBuilder(input).reverse().toString();
        System.out.println("Reversed a word : " + reversedString);
    }
}
