

/* 2. Write a program to calculate GPA and find grade. */

package if_else_loop;

import java.util.Scanner;

public class Calculate_GPA {

   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       System.out.println("Please Enter Your Number : ");
       float num = input.nextInt();

       if(num>=80){
           System.out.println("\nYour GPA is 5.00 & Grade is A+");
       }
       else if(num>=70 && num<80){
           System.out.println("\nYour GPA is 4.00 & Grade is A");
       }
       else if(num>=60 && num<70){
           System.out.println("\nYour GPA is 3.5 & Grade is A-");
       }
       else if(num>=50 && num<60){
           System.out.println("\nYour GPA is 3.00 & Grade is B");
       }
       else if(num>=40 && num<50){
           System.out.println("\nYour GPA is 2.00 & Grade is C");
       }
       else if(num>=33 && num<40){
           System.out.println("\nYour GPA is 1.00 & Grade is D");
       }
       else {
           System.out.println("\nYour are Failed & Grade is F");
       }

}
}