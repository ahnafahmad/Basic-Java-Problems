

/*  6. Suppose a software system excepts valid credentials from user to logged in to the system. if the user inputs wrong
password for 3 times, system will say that "Your user has been temporary locked". Let the username: admin,
password: admin@123.  */


package function_array;

import java.util.Scanner;

public class Validate_Login_Credentials {

    public static void main(String[] args) {

        String userName = "admin";
        String password = "admin@123";

        Scanner input = new Scanner(System.in);
        System.out.println("\nPlease Enter Your Username: " );
        String myUserName = input.nextLine();

        System.out.println("\nPlease Enter Your Password: " );
        String myPassword = input.nextLine();

        int count = 0;

        while (count < 3){

            if(!(userName.equals(myUserName)) || !(password.equals(myPassword)))
            {
                System.out.println("\nPlease Give Valid Username & Password");

                System.out.println("\nPlease Enter Your Username: " );
                myUserName = input.nextLine();

                System.out.println("\nPlease Enter Your Password: " );
                myPassword = input.nextLine();

            }
                else
                {
                    System.out.println("\nCongratulations ! You are Logged in Successfully. ");
                    break;
               }

             count ++ ;

        }

        if(count >= 3)
        System.out.println("\nSorry! You are temporary Locked. Please Try again Later");
        System.exit(0);
    }

}
