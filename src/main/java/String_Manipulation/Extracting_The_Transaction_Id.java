

/* 1. Extract the transaction ID from the HTML body
<html>
<title>Test</title>
<body>
Your trnx is successful. Trnx Id is: TXN123456
</body>
</html>
Output: TXN123456 */


package String_Manipulation;

public class Extracting_The_Transaction_Id {

    public static void main(String[] args) {

        String str = "<html>\n" +
                "<title>Test</title>\n" +
                "<body>\n" +
                "Your trnx is successful. Trnx Id is: TXN123456\n" +
                "</body>\n" +
                "</html>";

        String str1 = str.replaceAll("<.*?>"," ");
        str1 = str1.trim();

        str1 = str1.substring(str1.indexOf("TXN"));

            System.out.println("\n" + str1);

    }

}
