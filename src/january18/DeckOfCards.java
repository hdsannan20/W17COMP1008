package january18;


import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hdsan
 */
public class DeckOfCards {
    ArrayList<Card> deck;
    
    public DeckOfCards() 
    {
        String[] suits = {"hearts", "diamonds", "spades", "clubs"};
        String[] faceName = {"two", "three", "four", "five", "six", "seven", "eight","nine", "ten", "eleven", "twelve", "thirteen", "fourteen"}; 
               
        
        for (String suit : suits) 
        
            for(int i=0;i<faceName.length;i++)
            {
                  Card newCard = new Card( suit, faceName[i],i+2 );
            deck.add(newCard);
            }
        
    }
          public  String toString()
          {
              String deckString ="";
              for (Card card: deck)
              {
                deckString += card.toString() + "%n";
              }
              return deckString;
          }
            // this method will shufle deck of card
          public void shuffle()
          {
              Collections.shuffle(deck);
          }
          //this method will deal the top of card 
          public Card dealTopCard()
          {
              if (deck.isEmpty())
                  return null;
              else
                  return deck.remove(0);
          }
          
        
}


