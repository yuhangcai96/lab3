import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danny
 */
public class isPrimeMethod {
     public static void main(String[] args)
    {   
        int number;
        int number1 = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a integer: ");
        number = keyboard.nextInt();
        
        for(int number2 = 2; number2 < number; number2++)
        {
            if(number%number2 != 0)
            {
               number1++;
            }
        }
        {
            if(number1 == number - 2)
            {
                System.out.println(number + " is a prime number");
            }else{
                System.out.println(number + " is not a prime number");
             }        
    }
   }
}
       
