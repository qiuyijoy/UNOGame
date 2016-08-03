
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author air
 */
public class UNO1 {
static public UNOGame playGame(){
        
        Deck d = new Deck();
        d.createNewDeck();
        String id="deb123";
        ArrayList<Deck> deck = new ArrayList<Deck>();
        ArrayList<Player>players=new ArrayList<Player>();
        players.add(new Player("Janet","Janet"));
        players.add(new Player("Alice","Alice"));
        players.add(new Player("Aaron","Aaron"));
        players.add(new Player("Brandon","Bradon"));
        players.add(new Player("Cat","Cat"));
        
        System.out.println("Ready!!");
        return new UNOGame(id,players,"Started",deck,d.takeCard());
    }
    
    public static void main(String[] args) {
        UNOGame newGame = playGame();
       
       for(Player p : newGame.getPlayers()){
           for(int i = 0; i < 7 ; i++){
               p.Addcard(newGame.TakeFromDeck());
           }
       }
       
       System.out.println("run:");
       System.out.println("Id: "+newGame.getId());
       System.out.println("Discard card: "+newGame.getDiscardPile());
       System.out.println("Cards on Deck: "+newGame.getDeckOfcard().size());
       
        for(Player p : newGame.getPlayers()){
            System.out.println("Player: "+p);
            System.out.println("Card in hands");
            for(UNOCard c : p.getCardsOnhands()){
                System.out.println("Player "+ c);
            }
        }
               
        
    }
        
        
    }
    

