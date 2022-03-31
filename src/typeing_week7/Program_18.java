package typeing_week7;

import java.util.Arrays;

public class Program_18 {
    public static void main(String[] args) {
        //Numeric Array declaration
        int[]numArray = {
                1789, 2035, 1899, 2040, 1950, 2255, 7897, 1455, 787
        };
        int sum = 0;
        //Calculating the sun of arrays value using for loop
        for(int i = 0;  i <numArray.length; i++){
            sum = sum + numArray[i];
        }
        System.out.println("Values of the elements of the array are: " + Arrays.toString(numArray));
        System.out.println("Sum of all the value of the array are: " + sum);


    }
}
