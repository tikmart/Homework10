import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input password: ");
        String pass = sc.nextLine();

        passChecker(pass);

    }


    static void passChecker(String password) {

        char[] arr = password.toCharArray();

        boolean hasSymbols = false; // is true when has symbols


        //checking if the length of password has enough characters
        if (arr.length >= 8 && arr.length <= 24) {
            int letterCount = 0;
            int numCount = 0;

            for (char c : arr) {

                //checking if the char is a digit
                if (Character.isDigit(c)) {
                    numCount++;

                } else {
                    //checking the count of letters
                    if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122) && Character.isDigit(c) == false) {
                        letterCount++;

                    } //checking if the password has special symbols like ! $ % #
                    else if ((c < 65 || c > 122) && c != 32 && Character.isDigit(c) == false) {
                        hasSymbols = true;
                    }
                }
            }


            //checking if the given password is valid or not
            if (hasSymbols) {
                System.out.println("The password is invalid.");
            } else if ((letterCount > 2 && numCount > 2) && !hasSymbols) {
                System.out.println("The password is valid.");
            } else if (letterCount < 2){
                System.out.println("Should contain at least 2 letters");
            } else if (numCount < 2) {
                System.out.println("Should contain at least 2 numbers");
            }


        } //checking if the password is too long or too short if is not between 8 and 24
        else if (arr.length < 8) {
            System.out.println("The password is too short");
        } else if (arr.length > 24) {
            System.out.println("The password is too long");
        }

    }

}