/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrick;

/** step 1: generate 7 random cards and store in array 
 * 52 deck size: 
 * 2 spades
 * 5 hearts
 * 1 clubs
 * ... 7 cards
 * @author sivagamasrinivasan
 * @modifier Harkirat Bonkra/991614288
 * Date:02/02/2022
 * 
 */
import java.util.Scanner;
public class CardTrick {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       Scanner input = new Scanner (System.in);
        
      System.out.println("This is your hand: ");
  
      Card[] magicHand = new Card[7];  
        
      Card luckyCard = new Card():
      luckyCard.setValue(9);
      luckyCard.setSuits("spades");
      for (int i=0;i<magicHand.length;i++)
      {
        
          Card c= new Card();
          c.setNumbers(c.randomValue());
          c.setSuit(c.randomSuit());
          magicHand[i]=c; 
    }
      
      for(int i = 0; i<magicHand.length; i++){
          System.out.println(magicHand[i].getNumbers() + " " + magicHand[i].getSuit());
      }
      
      
     System.out.println("Enter a number between 1 and 13: ");
     int guess1 = input.nextInt();
     
     System.out.println("Enter a suit: ");
     String guess2 = input.next();
 
     int answer = 0;
     for(int i = 0; i<magicHand.length; i++){
          if(guess1 == magicHand[i].getNumbers() && guess2.equals(magicHand[i].getSuit())){
          
         answer=1;
         System.out.println("Correct!!!");
     }
      }
     
     if(answer == 0){
         System.out.println("Incorrect.");
     }
    }
    
}
