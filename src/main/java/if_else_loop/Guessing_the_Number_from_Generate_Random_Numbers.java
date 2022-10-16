

/* 8. Write a program to generate 2 random numbers which will not be shown to the user. Take a user input and match it with
      any of the random numbers. If correct give it 1 point and if incorrect, do not give it any point. Finally, repeat this
      for 10 times and count the point user achieved. */


package if_else_loop;

import java.util.Scanner;

public class Guessing_the_Number_from_Generate_Random_Numbers {

    public static void main(String[] args) {

        int count = 0;

        for(int i = 1; i<=10; i++){

            int random_1 = (int) Math.floor(Math.random() * 100);
            int random_2 = (int) Math.floor(Math.random() * 100);

            System.out.println("\nPlease Guess a Number: ");
            Scanner input = new Scanner(System.in);
            int num = input.nextInt();


            if(num == random_1 || num == random_2){
                count ++;
            }
        }

        System.out.println("\nYour Total Point is :  " +count);

    }

}
