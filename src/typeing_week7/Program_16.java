package typeing_week7;

import java.util.Scanner;

public class Program_16 {
    public static void main(String[] args) {
//Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        findNumberIsPositiveOrZero(number);
        //Closing the scanner object
        scanner.close();
    }
    //Finding the number is Positive Negative or zero
    public static void findNumberIsPositiveOrZero(int number){
        if(number > 0){
            System.out.println(number + "is POSITIVE number");
        }else if(number < 0){
            System.out.println(number + "is NEGATIVE number");
        }else {
            System.out.println(number + "is ZERO");
        }

    }
}
