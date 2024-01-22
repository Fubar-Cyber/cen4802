package cen4802;

/**
 * The Fibonacci class calculates the nth term in the Fibonacci sequence.
 * It includes a recursive method and a main method to demonstrate the calculation.
 * 
 * <p>This class uses recursion to calculate Fibonacci numbers.</p>
 * 
 * @see #fibonacci(int)
 * @see #main(String[])
 * 
 * @author Jensy Fernandez
 * @version 1.0
 * @since January 23, 2024
 */
public class Fibonacci {
    // ... rest of the class code ...

    /**
     * Recursive method to calculate the nth term in the Fibonacci sequence.
     *
     * @param n The position in the Fibonacci sequence.
     * @return The nth term in the Fibonacci sequence.
     */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    /**
     * Main method to call the Fibonacci method and output the result.
     *
     * @param args Command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Pass in 10 as an argument to get the 10th term in the Fibonacci sequence
        int n = 10;

        // Calculate the nth term using the Fibonacci method
        int result = fibonacci(n);

        // Output the result along with descriptive text
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + result + ".");
    }
}