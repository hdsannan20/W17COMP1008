package january18;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hdsan
 */
public class Card {
    private String faceName, suit;
    private int faceValue;
    public Card(String face, String suit, int value)
    {
        faceName = face;
        setSuit(suit);
        setValue(value);
        
    }
    // this method all validate if the null is valid 
        private void setSuit(String suit) {
            if (suit.equalsIgnoreCase("heart") || suit.equalsIgnoreCase("diamonds") || suit.equalsIgnoreCase("spades") || suit.equalsIgnoreCase("club"))
            {
                this.suit=suit;

            }
            else 
                  throw new IllegalArgumentException("suit");
            
    }

    public String getFaceName() {
        return faceName;
    }

    public String getSuit() {
        return suit;
    }

    public int getFaceValue() {
        return faceValue;
    }
        //this will alidate the face value is between 2 to 14 
        private void setValue(int value) {
            if (value <2 || value>14) {
              
                throw new IllegalArgumentException("Face value must be 2-4 inclusive");
            }
            else 
            {
                faceValue = value;
            }
                        
        }
        public String toString() {
            return faceName + " of " +suit;
        }
}

