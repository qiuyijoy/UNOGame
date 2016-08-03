
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author air
 */
public class Deck {
    private ArrayList<UNOCard> cards;
    int cardAmount = 108;

    public Deck(ArrayList<UNOCard> cards) {
        this.cards = cards;
    }
    
    public Deck(){
        
    }
    
    public Deck createNewDeck() {

        String colorArray[] = {"red", "yellow", "green", "blue", "wild"};
        String type[] = {"zero","one", "two", "three", "four", "five", "six", "seven", "eight", "nine","skip", "reverse", "draw_two,", "draw_four","wild"};
        cards = new ArrayList<UNOCard>();

        for (int c = 0; c < 4; c++) {

            for (int i = 0; i < 13; i++) {

                for(int a = 0; a < 2 ;a++ ){
                cards.add(new UNOCard(colorArray[c], type[i]));
                } 
            }
            cards.add(new UNOCard(colorArray[c],type[0]));
            cards.add(new UNOCard(colorArray[4],type[14]));
            cards.add(new UNOCard(colorArray[4],type[13]));
        }

        Collections.shuffle(cards);
        
        return new Deck(cards);
   }
    
    public UNOCard takeCard(){
        if(!cards.isEmpty()){
            cards.remove(0);
        }
         return null;
    }
}


    

    
    



