/*## Exercise 2: Multiple Exception Types
**Task:**
Create a method that reads an integer from the user and checks whether it is within a certain range (e.g., 1 to 100).

Handle exceptions for:
- Invalid input (non-integer input)
- Out-of-range values

**Hint:**
Use `try-catch` to handle `InputMismatchException` and a **custom exception** for out-of-range values.*/




package lexicon.se;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Exe2MultipleExceptionTypes {
    static class OutOfRangeException extends Exception {
        public OutOfRangeException(String message) {
            super(message);
        }
    }
    public static void checkNumber(int num) throws OutOfRangeException {
        if (num < 1 || num > 100) {
            throw new OutOfRangeException("number must be between 1 and 100");
        }
        System.out.println("Valid number is: " + num);
    }

public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            System.out.print("Enter a number between 1 and 100: ");
            int num = input.nextInt();
            checkNumber(num);
        }catch(InputMismatchException e){
            System.out.println("Error: Please enter an integer");
        }catch(OutOfRangeException e){
            System.out.println("Error: "+e.getMessage());
        }
}
}
