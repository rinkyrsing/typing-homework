package typeing_week7;

import java.util.Scanner;

public class Program_12 {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character : ");
        char ch = scanner.next().charAt(0);
        //Object creation
        Program_12 program_12 = new Program_12();
        program_12.checkInputIsAlphabetNumberOrSymbol(ch);
        //Closing the scanner object
        scanner.close();
    }
    //Find the input value is ALPHABET, DIGIT AND SYMBOL
    public void checkInputIsAlphabetNumberOrSymbol(char ch){
        if((ch >= 'O' && ch <= 'z') || (ch >= 'A' && ch <= 'z')){
            System.out.println(ch + " is an ALPHABET. ");
        }else if(ch >= 'O' && ch <= '9'){
            System.out.println(ch + " is a DIGIT.");
        }else {
            System.out.println(ch + " is a SYMBOL.");
        }

    }
}
