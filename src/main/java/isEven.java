import java.util.Random;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danny
 */
public class isEven {
  public static boolean isEven(int number)
{
    if (number%2==0)
{
return(true); 
}
else
{
return(false); 
}
}
 public static void main(String[] args)
{
System.out.println("Generating 100 random integers");

Random rand = new Random();
int EvenCount=0,OddCount=0;
for(int i=1;i<=100;i++)
{
int number = rand.nextInt();
if ( isEven(number))
    {
     EvenCount++;
    }
else 
    {
        OddCount++;
        System.out.println("Even numbers = "+EvenCount); 
        System.out.println("Odd numbers = "+OddCount);
        
        }
}
}
}
