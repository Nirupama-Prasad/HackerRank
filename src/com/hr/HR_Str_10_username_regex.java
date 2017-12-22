package com.hr;
import java.util.Scanner;

public class HR_Str_10_username_regex {
    //A username is considered valid if all the
    // following constraints are satisfied:
    //i)8 to 30 characters
    //ii)alphanumeric characters, and underscores (_) only
    //iii)first character of the username must be an alphabetic
    class UsernameValidator {
        /*
         * Write regular expression here.
         */
        //public static final String regularExpression = "/^\w+{8-30}$/";
        public static final String regularExpression = "^[a-zA-Z]{1}[a-zA-Z0-9_]{7,29}$";
    }

        private static final Scanner scan = new Scanner(System.in);

        public void run() {
            int n = Integer.parseInt(scan.nextLine());
            while (n-- != 0) {
                String userName = scan.nextLine();

                if (userName.matches(UsernameValidator.regularExpression)) {
                    System.out.println("Valid");
                } else {
                    System.out.println("Invalid");
                }
            }
        }

}
