package typeing_week7;

import java.util.Scanner;

public class Program_2 {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the Year:");
        int year = scanner.nextInt();
        Program_2 program_2 = new Program_2();
        program_2.isItLeapYear(year);
        // closing the scanner object
        scanner.close();
    }

    // Checking is it leap year or not
    public void isItLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("The year " + year + " is leap year ");
            return;
        }
        System.out.println("The year " + year + " is not a leap year ");
    }
}
