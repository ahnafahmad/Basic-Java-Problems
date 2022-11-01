

/* 2. Input an amount from the user and find out the number of notes from input amount in given array
[1000,500,100,50,20,10,5,2,1]
Input: 1256
Output:
1000 1
100 2
50 1
2 3. */


package function_array;

import java.util.Scanner;

public class Find_Out_The_Number_of_Notes {

    public static void main(String[] args) {

        System.out.println("\nPlease Give Your Amount: ");
        Scanner input = new Scanner(System.in);
        int amount = input.nextInt();
        int note = 0;
        int i;

        int arr[] = {1000,500,100,50,20,10,5,2,1};


        for(i = 0; i<arr.length; i++){

            if(amount >= arr[i]){
                 note = amount/arr[i];
                amount = amount - (note * arr[i]);

                System.out.println(arr[i] + " taka note: " + note) ;
            }

        }

    }

}
