class Solution {
    public boolean isHappy(int n) {
        // Continue looping until n becomes either 1 (indicating a happy number)
        // or 4 (indicating a cycle)// this is used for avoiding exception because 4 is nuber which can cause infinite loop.
        while (n != 1 && n != 4) {
            int sumOfSquares = 0;
            // Calculate the sum of squares of the digits of n
            while (n != 0) {
                // Extract the last digit of n
                int digit = n % 10;
                // Add the square of the digit to the sumOfSquares
                sumOfSquares += digit * digit;
                // Remove the last digit from n
                n /= 10;
            }
            // Update n to be the sumOfSquares for the next iteration
            n = sumOfSquares;
        }
        // If n becomes 1, it's a happy number; otherwise, it's not
        return n == 1;
    }
}
