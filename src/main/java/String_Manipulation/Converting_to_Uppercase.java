

/* 8. Write a program to convert each 1st char to uppercase from a string
Input: rahim lives in sylhet
Output: Rahim Lives in Sylhet */



package String_Manipulation;

public class Converting_to_Uppercase {

    public static void main(String[] args) {

        String str = "rahim lives in sylhet";
        String fullWord= "";

        String words[] = str.split(" ");

        for(int i=0; i< words.length; i++) {
            String firstLetter = String.valueOf(words[i].charAt(0)).toUpperCase();
            String restLetter = words[i].substring(1);
            fullWord += firstLetter + restLetter + " ";
        }

        System.out.println(fullWord.trim());

    }

}
