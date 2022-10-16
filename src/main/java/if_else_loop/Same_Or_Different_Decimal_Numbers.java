
/* 3. Input 2 decimal numbers and check if they are both same or different up to two decimal places.
      E.g 120.546 & 120.241. */

package if_else_loop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Same_Or_Different_Decimal_Numbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("\nPlease Enter 1st Number: ");
        double num1 = input.nextDouble();
        double num3 = Double.parseDouble(df.format(num1));

        System.out.println("\nPlease Enter 2nd Number: ");
        double num2 = input.nextDouble();
        double num4 = Double.parseDouble(df.format(num2));

        double num = num3 - num4;

        if(Math.abs(num) == 0)
        {
            System.out.println("\nThe Numbers are Same");
        }
        else
        {
            System.out.println("\nThe Numbers are Different");
        }

    }

}
