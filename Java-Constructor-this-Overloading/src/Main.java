/*
In a bank, to open a bank account, you need to provide:
 the account number,
 the account holder's name,
 and the initial deposit amount that the account holder deposited when opening the account.
 However, this initial deposit amount is optional, meaning that if the account holder has no money to deposit at the time of opening the account, the initial deposit will not be made, and the initial account balance will naturally be zero.

Important: once a bank account has been opened, the account number can never be changed.
However, the account holder's name can be changed (as a person may change their name due to marriage, for example).

Finally, the account balance cannot be freely altered. There must be a mechanism to protect it.
The balance only increases through deposits and decreases only through withdrawals.
For each withdrawal made, the bank charges a fee of $5.00.
Note: the account can have a negative balance if the balance is insufficient to make the withdrawal and/or pay the fee.

You should create a program that registers an account, giving the option to inform or not inform the initial deposit amount.
Then, perform a deposit and a withdrawal, always showing the account details after each operation.

 */


import Entities.Account;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String holderName = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n)? ");
        String hasInitialDeposit = sc.nextLine();
        double deposit = 0;
        Account account;
        if(hasInitialDeposit.equals("y")){
            System.out.print("Enter initial deposit value: ");
            deposit = sc.nextDouble();
            account = new Account(accountNumber, holderName, deposit);
        }else {
            account = new Account(accountNumber, holderName);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(account.toString());
        System.out.println();

        System.out.print("Enter a deposit value: ");
        deposit = sc.nextDouble();
        account.deposit(deposit);
        System.out.println("Updated account data: ");
        System.out.println(account.toString());
        System.out.println();

        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        account.withdraw(withdraw);
        System.out.println("Updated account data: ");
        System.out.println(account.toString());



    }
}