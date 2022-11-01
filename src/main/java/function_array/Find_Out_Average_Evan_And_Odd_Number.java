

/*  5. Take 5 numbers from users in an array. Then find out the average number, how many even and how many odd numbers
using these functions: average(), countEvenNumbers(), countOddNumbers().  */


package function_array;

import java.util.Scanner;

public class Find_Out_Average_Evan_And_Odd_Number {


    static int[] arr = new int[5];

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\nPlease Enter your Numbers: ");

        for (int i=0; i< arr.length; i++){
            arr[i] = input.nextInt();

        }

        average();
        countingEvenNumbers();
        countingOddNumbers();
    }

    public static void average(){

        int avg;
        int sum = 0;
        int i;
        for(i=0; i<arr.length; i++){

            sum = sum + arr[i];

        }

        avg = sum/i;

        System.out.println("\nThe Average of Your Numbers is: " +avg);
    }

    public static void countingEvenNumbers(){

        int i;
        int count=0;

        for(i=0;i<arr.length;i++){

            if(arr[i]%2 == 0){
                count ++;
            }

        }
        System.out.println("The Total Number of Even Number is: " +count);

    }

    public static void countingOddNumbers(){

        int i;
        int count=0;

        for(i=0;i<arr.length;i++){

            if(arr[i]%2 != 0){
                count ++;
            }

        }
        System.out.println("The Total Number of Odd Number is: " +count);

    }

}
