import java.util.Random;

/************************************************
* Java Lab 9
*
* Christian Dennis
* November 22nd 2024
* 0.0.1
*************************************************/

/*Set up your Dice class in a Java project. also set up a Driver class to use to test your
Dice class constantly as you develop it. */

/*
Dice class
   Dice method to create dice (These will be construcotr methods to make our dice)
      default method with no parameters 
      dice method with sides as a parameter
      
   Roll method to roll the dice and return its value
   
   accesor method?
*/

public class Dice
{
   private int sides;
   private int sideRolled;
   private static final Random randomNum = new Random();
   private static final int maxSides = 20;
   
   // dice default constructor
   public Dice()
   {
      sides = 6; 
   }
   
   //dice constructor with param
   public Dice(int sides)
   {
      //check for bad input, if bad set it to default
      if (sides <1)
      {
         sides = 6;
      }
      else
      {
         //use this.sides to assign the class variable to be equal to our parameter
         this.sides = sides;
      }
   }
   
   //accessor method
   public int getSides()
   {
      return sides; //this takes no side param so we dont need this.sides
   }
   
   public int rollDie()
   {
      return randomNum.nextInt(sides) + 1;
   }  
   public void incrementSides()
   {
      if (sides < maxSides)
      {
         sides++;
      }
      else
      {
         System.out.println("ERROR: Cannot exceed maximum dice side value");
      }
   }
   
   public void decrementSides()
   {
      if (sides < maxSides)
      {
         sides--;
      }
      else
      {
         System.out.println("ERROR: Cannot go below 1 side");
      }
 
   }
   
   public void setSides(int sides)
   {
      if (sides < 1)
      {
         this.sides = 6;
      }
      else 
      {
         this.sides = sides; 
      }
   } 
}
