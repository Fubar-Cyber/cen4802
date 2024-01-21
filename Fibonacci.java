package cen4802;

public class Fibonacci {

    // Recursive method to calculate the nth term in the Fibonacci sequence
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    // Main method to call the Fibonacci method and output the result
    public static void main(String[] args) {
        // Pass in 10 as an argument to get the 10th term in the Fibonacci sequence
        int n = 10;
        
        // Calculate the nth term using the Fibonacci method
        int result = fibonacci(n);
        
        // Output the result along with descriptive text
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + result + ".");
    }
}

