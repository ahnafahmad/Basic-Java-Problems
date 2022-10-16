

/* 2. Price of a formal shirt is 1200 tk and Sharee is 3500 tk. If you buy 2 shirt and 1 sharee, then 400 tk will be discounted.
After your purchase what will be your total cost?  */


package String_Manipulation;

public class Extracting_Digits_And_Finding_Total_Cost_of_Shirt_And_Sharee {

    public static void main(String[] args) {

        String str = "Price of a formal shirt is 1200 tk and Sharee is 3500 tk. If you buy 2 shirt and 1 sharee, then 400 tk" +
                " will be discounted. After your purchase what will be your total cost?";

        str = str.replaceAll("[^\\d]", " ");
        str = str.trim();
        String str1 = str.replaceAll(" +", " ");
        String d400 = str1.substring(str1.indexOf("400"));



        String[] arr1 = (str1.split(" "));

        
        int shirt_price = Integer.parseInt(arr1[0]);
        int shirt_quantity = Integer.parseInt(arr1[2]);

        int sharee_price = Integer.parseInt(arr1[1]);
        int sharee_quantity = Integer.parseInt(arr1[3]);
        int discount = Integer.parseInt(arr1[4]);


        int totalShirtPrice = shirt_price * shirt_quantity;
        int totalShareePrice = sharee_price * sharee_quantity;


        int totalCost = ((totalShirtPrice + totalShareePrice) - discount);

        System.out.println("\nYour total purchasing Cost is: " + totalCost);

    }

}
