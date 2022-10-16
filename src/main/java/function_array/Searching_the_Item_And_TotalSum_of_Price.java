

/*  4. Create your todays bazar list/pocket expenditure which includes the item name and price. Then create a function named
searchItem(String item) which will be used to search any item from your HashMap and return the price. If found no item, then
print message as "No item found" and another function named totalSum() which will return total price of items. */


package function_array;

import java.util.HashMap;
import java.util.Scanner;

public class Searching_the_Item_And_TotalSum_of_Price {

     static HashMap<String, Integer> items = new HashMap<String, Integer>();

    public static void main(String[] args) {

        System.out.println("\nPlease Enter Your Product: ");
        Scanner input = new Scanner(System.in);
        String item_name = input.nextLine();


        searchItem(item_name);
        totalSum();

        }


    public static String searchItem(String item){

        items.put("pen", 10);
        items.put("pencil", 5);
        items.put("book", 300);
        items.put("eraser", 2);
        items.put("ledger", 45);

        int save =0;

        if (items.containsKey(item)){
            save = (int) items.get(item);
            System.out.println("\nThe Item's Price is " + save + " Taka");
        }
        else
            System.out.println("No item found");

        return item;
    }

    public static void totalSum(){
        int sum = 0;

        for (int value : items.values()){
            sum = sum + value;
        }
        System.out.println("              &           ");
        System.out.println("Total Product You Bought " +sum +" Taka");
    }

}
