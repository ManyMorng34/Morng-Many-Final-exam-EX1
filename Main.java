import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            // Prompt the user for the number of elements in the list
            System.out.print("Enter the number of elements: ");
            int size = scanner.nextInt();

            // Create an array to store the numbers
            int[] numbers = new int[size];

            // Input the numbers
            System.out.println("Enter the numbers:");

            for (int i = 0; i < size; i++) {
                System.out.print("Number " + (i + 1) + ": ");
                numbers[i] = scanner.nextInt();
            }

            // Display the entered numbers
            System.out.println("Entered numbers:");

            for (int i = 0; i < size; i++) {
                System.out.println(numbers[i]);
            }
        } finally {
            // Close the Scanner in a finally block to ensure it gets closed even if an exception occurs
            scanner.close();
        }
    }
}
