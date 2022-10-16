

/*  7. Generate 20 random numbers from 0 to 100 and print the max, min and duplicate random numbers (if any). */


package function_array;

import java.util.Random;

public class Generate_Random_Numbers_And_Print_Max_Min_Dup {

    public static void main(String[] args) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int dup =0;

        Random number = new Random();

        for (int i = 0; i < 20; i++) {
           int randomNumber = number.nextInt(100 - 0) + 0;

            if (randomNumber > max) {
                max = randomNumber;
            }

            if (randomNumber < min) {
                min = randomNumber;
            }

        }

        System.out.println("\nMax Number among these Random Numbers is: "+max);
        System.out.println("\nMin Number among these Random Numbers is: "+min);

    }

}
