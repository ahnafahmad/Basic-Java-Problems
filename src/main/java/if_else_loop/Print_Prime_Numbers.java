

/* 7. Write a program to print prime numbers from 2 to n. */

package if_else_loop;

import java.util.Scanner;

public class Print_Prime_Numbers {

    public static void main(String[] args) {

        System.out.println("Please Enter How many Numbers do you Want to see up to: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        int isPrime = 0;

        System.out.println("Prime Numbers are: ");

        for(int i = 1; i<=num; i++){

           for(int j =2; j < i-1; j++){

               if(i%j == 0) {
                   isPrime++;
                   break;
               }
           }

           if(isPrime == 0)
               System.out.println(i);
               isPrime = 0;

        }
    }
}
