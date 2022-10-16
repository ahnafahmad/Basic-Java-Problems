

/* 4. Write a program to check balance and withdraw money from ATM booth using if else or switch case */

package if_else_loop;

import java.util.Scanner;

public class Check_Balance_And_Withdraw_Money {

    public static void main(String[] args) {
        Scanner option = new Scanner(System.in);
        System.out.println("Please Choose an Option");
        System.out.println("\nOption 1: Check Balance\n");
        System.out.println("Option 2: Withdraw Money");

        double balance = 100000;

        int choice = option.nextInt();

        switch (choice) {
            case 1:
                checkBalance(balance);
                break;

            case 2:
                withDrawMoney(balance);
                break;
           }
    }


    public static void checkBalance(double balance) {

        System.out.println("\nYour Current Balance: " + balance + "\n");

    }


    public static double withDrawMoney(double balance){

        System.out.println("\nPlease Enter Your Amount: ");
        Scanner input = new Scanner(System.in);
        double money = input.nextDouble();

        if (balance >= money) {
                    balance = balance - money;
                    System.out.println("\nPlease Recieve Your Cash \n");
                    checkBalance(balance);
                }
                else {
                    System.out.println("\nSorry! You have Insufficient Balance \n");
                }

        return balance;
    }


}
