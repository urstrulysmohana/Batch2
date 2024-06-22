package Batch2;

public class whle {
    // Method to calculate factorial of a number
    public static int factorial(int n) {
        int result = 1;
        int i = 1;
        while (i <= n) {
            result *= i;
            i++;
        }
        return result;
    }

    // Main method to demonstrate the use of while loop
    public static void main(String[] args) {
        // Calculate factorial for numbers from 1 to 5
        int number = 1;
        while (number <= 5) {
            System.out.println("The factorial of " + number + " is: " + factorial(number));
            number++;
        }
    }
}
    
