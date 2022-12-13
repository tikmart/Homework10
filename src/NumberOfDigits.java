import java.util.Scanner;

public class NumberOfDigits {
    public static void main(String[] args) {
        int x = 1663;
        System.out.println(x % 10);
        countDigits(x);
    }


    static void countDigits(int n){
        int count = 0;
        int sum = 0;
        while (n != 0){
            sum += n % 10;
            n /= 10;
            count++;
        }

        System.out.println("The number has " + count + " digits and the sum of the digits is " + sum);

    }
}
