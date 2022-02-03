/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrick;

import java.util.Scanner;
/** step 1: generate 7 random cards and store in array 
 * 52 deck size: 
 * 2 spades
 * 5 hearts
 * 1 clubs
 * ... 7 cards
 * @modifier Harkirat Bonkra/991614288
 * @author sivagamasrinivasan
 * 
 */
public class CardTrick {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       Scanner input = new Scanner (System.in);
        
      System.out.println("This is your hand: ");
    
      Card[] magicHand = new Card[7]; //Array of object 
      for (int i=0;i<magicHand.length;i++)
      {
        // step 1: generate 7 random cards and store in array
          Card c= new Card();
          c.setNumbers(c.randomValue);//random generation for number/use method
          c.setSuit(c.randomSuit());
          magicHand[i]=c; // stores the card object  in array
    }
      
      //step 2: take input guess the card 2 spades find in array - print your card is found
     System.out.println("Enter a number between 1 and 13: ");
     int guess1 = input.nextInt();
     
     System.out.println("Enter a suit: ");
     String guess2 = input.next();
    // step 3 do change in remote repository. hard coded card details card number =2,hearts to find in array
    }
    
}
