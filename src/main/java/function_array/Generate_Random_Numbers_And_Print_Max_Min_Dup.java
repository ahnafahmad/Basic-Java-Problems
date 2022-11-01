

/*  7. Generate 20 random numbers from 0 to 100 and print the max, min and duplicate random numbers (if any). */


package function_array;

import java.util.Random;

public class Generate_Random_Numbers_And_Print_Max_Min_Dup {

        public static void main(String[] args) {
            int arr[]=Generate_Random_Numbers_And_Print_Max_Min_Dup.generateRandomNumber();
            int maxNumber = Generate_Random_Numbers_And_Print_Max_Min_Dup.findMax(arr);
            int minNumber = Generate_Random_Numbers_And_Print_Max_Min_Dup.findMin(arr);

            for (int c:arr) {
                System.out.println(c);
            }
            System.out.println("Max number "+maxNumber);
            System.out.println("Min number "+minNumber);
            Generate_Random_Numbers_And_Print_Max_Min_Dup.findDuplicate(arr);
        }
        public static int[] generateRandomNumber() {
            int min = 0, max = 100;
            double rand;
            int size=20;
            int numbers[] = new int[size];
            for (int i = 0; i < numbers.length; i++) {
                rand = Math.round(Math.random() * (max - min) + min);
                numbers[i] = (int) rand;
            }
            return numbers;
        }
        public static int findMax(int[] num) {
            int max = num[0];
            for (int i = 0; i < num.length; i++) {
                if (num[i] >= max) {
                    max = num[i];
                }
            }
            return max;
        }

        public static int findMin(int[] num) {
            int min = num[0];
            for (int i = 0; i < num.length; i++) {
                if (num[i] <= min) {
                    min = num[i];
                }
            }
            return min;
        }

        public static void findDuplicate(int[] num) {
            for (int i = 0; i < num.length; i++) {
                for (int j = i + 1; j < num.length; j++) {
                    if (num[i] == num[j]) {
                        System.out.println("Found Duplicate for " + num[i]);
                    }
                }
            }
        }

}
