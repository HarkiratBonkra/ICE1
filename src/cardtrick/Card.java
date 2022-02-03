/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrick;

/**
 *
 * @author sivagamasrinivasan
 * @modifier Harkirat Bonkra/991614288
 * Date:02/02/2022
 */
public class Card 
{
    private int numbers; //encapsulate it getters and setters
    private String suit;
    
    public static final String[] SUITS = {"diamonds","spades","clubs","hearts"};

    /**
     * @return the numbers
     */
    public int getNumbers() {
        return numbers;
    }

    /**
     * @param numbers the numbers to set
     */
    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }

    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }
    
    public int randomValue(){
        double number = (1 + Math.random()*13);
        return(int) number;
    }
    
    public String randomSuit(){
        
        double suit = (int) (Math.random()*4);
        return SUITS[(int) Math.floor(suit)];
        
    }
    
}
