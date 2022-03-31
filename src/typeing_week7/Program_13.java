package typeing_week7;

import java.util.Scanner;

public class Program_13 {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number between 1 and 7 : ");
        int day = scanner.nextInt();
        findTheDaysName(day);
        //Closing the scanner object
        scanner.close();
    }
    // Finding the name of the day
    public static void findTheDaysName(int day){
        switch (day) {
            case 1:
                System.out.println("It's Monday");
                break;
            case 2:
                System.out.println("It's Tuesday");
                break;
            case 3:
                System.out.println("It's Wednesday");
                break;

            case 4:
                System.out.println("It's Thursday");
                break;
            case 5:
                System.out.println("It's Friday");
                break;
            case 6:
                System.out.println("It's Saturday");
                break;
            case 7:
                System.out.println("It's Sunday");
                break;
            default:
                System.out.println("Week contain 1 to 7");
        }
    }
}
