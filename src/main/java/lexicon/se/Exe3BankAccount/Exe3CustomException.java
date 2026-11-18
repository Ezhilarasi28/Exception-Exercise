package lexicon.se.Exe3BankAccount;

import java.util.Scanner;

public class Exe3CustomException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BankAccount account = new BankAccount(1000);
        account.showBalance();

        //deposit money
        System.out.println("Enter deposit amount:" );
        double deposit = input.nextDouble();
        account.deposit(deposit);

        //withdraw money
        System.out.println("Enter withdrawal amount :");
        double withdrawal = input.nextDouble();
        try{
            account.withdraw(withdrawal);
        }catch (InsufficientBalanceException e)
        {
            System.out.println("Error:"+ e.getMessage());
        }
        account.showBalance();
        input.close();


    }
}
