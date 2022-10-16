

/* 10. Write a program to enter the numbers till the user wants and at the end, the program should display the largest and
    smallest numbers user entered. */


package if_else_loop;

import java.util.Scanner;

public class Display_The_Largest_And_Smallest_Numbers {

    public static void main(String[] args) {

        int large_number = Integer.MIN_VALUE;
        int small_number = Integer.MAX_VALUE;
        char ch;

        do{
            System.out.println("\nPlease Enter a Number: ");
            Scanner input = new Scanner(System.in);
            int num = input.nextInt();

            if(num > large_number) {
                large_number = num;
            }
            {
                if(num < small_number)
                    small_number = num;
            }

            System.out.println("\nDo You Want to Continue? y/n");
            ch=input.next().charAt(0);
        }
        while(ch == 'y' || ch == 'Y');
        System.out.println("\nThe Largest Number is " +large_number);
        System.out.println("\nThe Smallest Number is " +small_number);
    }

}


