package Batch2;

public class  forloop {


    // Method to calculate factorial of a number
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        } return result;

    }
 // Main method to demonstrate the use of for loop
 public static void main(String[] args) {
    // Calculate factorial for numbers from 1 to 5
    for (int number = 1; number <= 5; number++) {
        System.out.println("The factorial of " + number + " is: " + factorial(number));
    }
}
}