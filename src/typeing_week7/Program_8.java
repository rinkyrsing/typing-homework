package typeing_week7;

import java.util.Scanner;

public class Program_8 {
    public static void main(String[] args) {
      // //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter alphabet between A to F : ");
        char city = scanner.next().charAt(0);
        //object creation
        Program_8 program_8 = new Program_8();
        program_8.printcityName(city);
        //Closing the scanner object
        scanner.close();
    }
    //Printing city name
    public void printcityName(char city){
        if(city == 'A' || city =='a'){
            System.out.println("Aberdeen");
        }else if(city == 'B' || city == 'a'){
            System.out.println("Belfast");
        }else if(city == 'C' || city == 'c'){
            System.out.println("Cambridge");
        }else if(city == 'D' || city == 'd'){
            System.out.println("Derby");
        }else if(city == 'E' || city == 'e'){
            System.out.println("Edinburgh");
        }else if(city == 'F' || city =='f'){
            System.out.println("Feltham");
        }else {
            System.out.println("The alphabet you enter is not between A to F");
        }
    }
}
