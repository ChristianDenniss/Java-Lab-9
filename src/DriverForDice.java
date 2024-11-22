import java.util.Random;

/************************************************
* Java Lab 9
*
* Christian Dennis
* November 22nd 2024
* 0.0.1
*************************************************/

public class DriverForDice
{
   public static void main(String[] args)
   {
      //create a random number generator to test our driver rapidly
      Random randomNum = new Random(); 
      int rand = randomNum.nextInt(110)-10;
      int result1, result2;
      Dice die1 = new Dice(2);
      Dice die2 = new Dice(3);
      Dice die3 = new Dice(4);
      Dice die4 = new Dice(6);
      int[] frequencyTable = new int[12];
    
      
     /* Random assignment method i was using to test
     
      for (int i=0; i<100;i++)
      {
         rand = randomNum.nextInt(110)-10;
         die2.setSides(rand);
         result1 = die1.rollDie();
         result2 = die2.rollDie();
         System.out.println("Default Die Roll #: " + i + "\tNumber of Sides: " + die1.getSides() + "\tOutcome: " + result1 + "\tCustom Die Roll #: " + i + "\tNumber of Sides: " + die2.getSides() + "\tOutcome: " + result2);
      }*/
      
      for (int i=0; i<1000000;i++)
      {
         //least result can be is 4 most it can be is 2+3+4+6=15 so we need 12 indexes as its INCLUSIVE of 4 so we count it
         result1 = die1.rollDie() + die2.rollDie() + die3.rollDie() + die4.rollDie();
         
         //instead of a ladder of if else ifs this is much more abstract
         if (result1>=4 && result1 <= 15) 
         {
            frequencyTable[result1 - 4]++;
         }
         else
         {
            System.out.println("Error in summing occured the sum of the dice was " + result1 + " which is not within our 4-15 range\nThis occured on the " + i + " summation");
         }
      }
      
      for (int i = 0; i<frequencyTable.length; i++)
      {
         System.out.println("The Frequency of the sum " + (i + 4) + " |  " +  frequencyTable[i]);     
      }
      
   }   
}