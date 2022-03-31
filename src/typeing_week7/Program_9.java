package typeing_week7;

import java.util.Locale;
import java.util.Scanner;

public class Program_9 {
    public static void main(String[] args) {
    //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter alphabet between A to F :");
        String city = scanner.next().toUpperCase();
        //Creating object
        Program_9 program_9 = new Program_9();
        program_9.printCityName(city);
        //Closing the scanner object
        scanner.close();
    }

    // Printing city name
    public void printCityName(String city){
        switch (city){
            case "A":
                System.out.println("Aberdeen");
                break;
            case "B":
                System.out.println("Belfast");
                break;
            case "C":
                System.out.println("Cambridge");
                break;
            case "D":
                System.out.println("Derby");
                break;
            case "E":
                System.out.println("Edinburgh");
                break;
            case "F":
                System.out.println("Feltham");
                break;
            default:
                System.out.println("The alphabet you enter is not between A to F");
        }
    }
}
