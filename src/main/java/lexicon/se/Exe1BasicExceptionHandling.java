/*## Exercise 1: Basic Exception Handling
**Task:**
Write a program that asks the user to input two integers and then divides the first number by the second.
Implement exception handling to manage the scenario where the user inputs zero as the second number.

**Hint:**
Use `try-catch` to handle `ArithmeticException`.
*/


package lexicon.se;

import java.util.Scanner;

public class Exe1BasicExceptionHandling {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num = input.nextInt();
        System.out.println("Enter second number:" );
        int num1 = input.nextInt();
        try {
            double result = (double) num / num1;
            System.out.println("Result is: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot Division by zero");
        }
    }
}
