/*## Exercise 5: finally Block
**Task:**
Modify the program from Exercise 1 to include a `finally` block that always executes.

**Hint:**
The `finally` block should print a message to the console and execute whether an exception occurs or not.*/


package lexicon.se;

import java.util.Scanner;

public class Exe5FinallyBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter first number:");
            int num = sc.nextInt();
            System.out.println("Enter second number:");
            int num1 = sc.nextInt();


            int result = num / num1;
            System.out.println("Result is: " + result);
        }catch(ArithmeticException e){
            System.out.println("Error: cannot divide by zero");
        }finally{
            System.out.println("finally block executed");
            sc.close();
        }
    }
}
