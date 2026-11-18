/*## Exercise 6: Throwing Exceptions
**Task:**
Write a method that takes a string as input and checks if it is a valid email address.

If the input is invalid, throw an `IllegalArgumentException` with an appropriate message.

**Hint:**
Use the `throw` keyword to manually throw the exception.*/

package lexicon.se;
import java.util.Scanner;

public class Exe6ThrowingExceptions {

    public static void checkEmail(String email) {
        if (!email.contains("@") || !email.contains(".")) {
            throw new IllegalArgumentException("Invalid email address!");
        }

        System.out.println("Valid email address!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        try {
            checkEmail(email);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}