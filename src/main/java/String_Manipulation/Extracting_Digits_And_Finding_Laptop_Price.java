

/* 3. Core i7 HP laptop price is 76000 tk and cash payment discount 10%. What will be the purchase price? */


package String_Manipulation;

public class Extracting_Digits_And_Finding_Laptop_Price {

    public static void main(String[] args) {

        String str = "Core i7 HP laptop price is 76000 tk and cash payment discount 10%. What will be the purchase price?";

        str = str.replaceAll("[^\\d]", " ");
        str = str.replaceAll(" +", " ");
        str = str.replace("7 ", " ");
        str = str.trim();

        String[] arr = (str.split(" "));

        int laptop_price = Integer.parseInt(arr[0]);
        int discount = Integer.parseInt(arr[1]);

        int totalPrice = (laptop_price - laptop_price*(discount)/100);


        System.out.println("\nTotal Purchase price of the Laptop is: " +totalPrice);

    }

}
