

/* 5. Write a program to sum of numbers which only divisible by 5 from 1 to 100. */

package if_else_loop;

public class Sum_Of_Numbers {

    public static void main(String[] args) {

        int sum =0;
        int n = 100;

       for(int i=1; i<=n; i++){
           if(i % 5 == 0){
               sum = sum+i;
           }
       }
        System.out.println("\nThe Sum of the Numbers is " + sum);

    }

}
