

/* 4. Write a program that will give following output:
Input: chattogram
Output: C8M  */


package String_Manipulation;

public class String_Encryption {

    public static void main(String[] args) {

            String str = "chattogram";

            String firstWord =String.valueOf(str.charAt(0)).toUpperCase();

            String lastWord =String.valueOf(str.charAt(str.length()-1)).toUpperCase();

            int middleWord = str.length()-2;

        System.out.println(firstWord + middleWord + lastWord);

    }

}
