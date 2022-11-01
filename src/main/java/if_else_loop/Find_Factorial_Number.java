

/* 6. Write  a program to find the factorial of a given number. */

package if_else_loop;

import java.util.Scanner;

public class Find_Factorial_Number {

    public static void main(String[] args) {

        System.out.println("\nPlease Enter a Number: ");

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        long fact = 1;

        for(int i = 1; i<=num; i++){

        fact = fact * i;

        }

        System.out.println("\nThe factorial of the Number is: " + fact);
    }

}
