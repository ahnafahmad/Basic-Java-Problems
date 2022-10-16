

/* 9. Write a program to sum of user input until users input ‘q’ from keyboard. */

package if_else_loop;

import java.util.Scanner;

public class Sum_of_User_Input {
    public static void main(String[] args) {

        int sum = 0;
        char ch;

        Scanner input = new Scanner(System.in);

        do{
            System.out.println("\nPlease Enter a Number: ");
            sum = sum + input.nextInt();
            System.out.println("Total Sum is: "+ sum);
            System.out.println("\nDo You Want to Continue? y/q");
            ch=input.next().charAt(0);

        }
        while(ch != 'q');
        System.out.println("\nTHANK YOU SO MUCH !!! ");
        System.out.println("\nYour Calculated Total Sum is:  " +sum);

    }

}
