

/*  3. Suppose, in a company , here are some employee salaries in an array
[35000, 25000, 28000, 32500, 44000, 32800]
Find out the 3rd highest salary.  */


package function_array;

public class Find_out_3rd_Highest_Salary {

    public static void main(String[] args) {

        int arr[] = {35000, 25000, 28000, 32500, 44000, 32800};
        int max1 = 0;
        int max2 = 0;
        int max3 = 0;

        for (int i=0; i<arr.length; i++){
            if(max1 < arr[i]){
                max1 = arr[i];
                max2 = max1;
            }
            else if(max2 < arr[i]){
                max2 = arr[i];
                max3 = max2;
            }
            else if(max3 < arr[i]){
                max3 = arr[i];
            }
        }
        System.out.println("\nThe 3rd Highest Salary is: " + max3);
    }

}
