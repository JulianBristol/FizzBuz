/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fizzbuzz;
import java.util.Scanner;

/**
 *
 * @author Bristol
 */
public class FizzBuzz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //initialize values
        int fizzbuzz = 0;
        int max = 0;
        int min = 0;
            
            //Get an integer from the user.
        Scanner input = new Scanner(System.in);
        System.out.print("[FizzBuzz]\nEnter an integer between -1000 and 1000: ");
        try {
            //Store the integer the user provided
            fizzbuzz = input.nextInt();
            
            //Determine the sign of the integer and adjust the min and max values accordingly
            if (fizzbuzz >= 0){
            max = fizzbuzz;
            min = 0;
            }else{
                max = 0;
                min = fizzbuzz;
            }
            //Loop through, testing each integer's divisibility to 3 and 5 
            for (int i = min; i <= max; i++) {
                String numberText = i + "\t";
                if (i % 3 == 0){
                    numberText += "Fizz";
                }
                if (i % 5 == 0){
                    numberText += "Buzz";
                }
                //Print out whether each number is Fizz, Buzz, none, or both
                System.out.println(numberText);
            }
            //catch the errors from inappropiate inputs
        } catch (Exception e) {
            System.out.println("Please chose a integer that is between the numbers of -1000 to 1000.");
        }
    }
    
}
