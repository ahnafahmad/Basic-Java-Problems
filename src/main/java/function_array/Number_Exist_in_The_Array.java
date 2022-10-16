

/* 1. Take input from a user and check if the number exists in the array
let the array is [1,3,5,7,2,4,6,8]
Input: 7
Output: Found in the position 3
Input: 9
Output: Found no element. */



package function_array;

import java.util.Scanner;

public class Number_Exist_in_The_Array {

    public static void main(String[] args) {

        System.out.println("\nPlease Enter a number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        boolean found = false;
        int i;

        int arr[] = {1,3,5,7,2,4,6,8};

        for(i = 0; i<arr.length; i++){

            if(num == arr[i]){
                found = true;
                break;
            }

        }

        if(found)
            System.out.println("\n"+ num + " found in the Position " + i + ".");
        else
            System.out.println("\nThe Number " +num + " doesn't found.");

    }

}
