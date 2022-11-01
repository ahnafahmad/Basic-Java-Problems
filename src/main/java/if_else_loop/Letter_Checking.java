

/* 1. Write a program to check if inputted letter is small or capital. */

package if_else_loop;
import java.util.Scanner;

public class Letter_Checking {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("\nPlease Input a Letter: ");

        char ch = input.next().charAt(0);
        if(ch >= 'A' && ch <= 'Z'){
            System.out.println("\n" + ch +" is a Capital Letter.");
        }
        else
            System.out.println("\n" + ch +" is a Small Letter.");
    }

}
