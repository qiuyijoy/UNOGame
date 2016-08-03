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
public class UNOGame {
    private String id;
    private ArrayList<Player>players;
    private String status;
    private ArrayList<Deck>deckOfcard;
    private UNOCard discardPile;

    public UNOGame(String id, ArrayList<Player> players, String status, ArrayList<Deck> deckOfcard, UNOCard discardPile) {
        this.id = id;
        this.players = players;
        this.status = status;
        this.deckOfcard = deckOfcard;
        this.discardPile = discardPile;
    }

    public UNOGame() {
    }
    
    

    

    public String getId() {
        return id;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public String getStatus() {
        return status;
    }

    public ArrayList<Deck> getDeckOfcard() {
        return deckOfcard;
    }

    public UNOCard getDiscardPile() {
        return discardPile;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDeckOfcard(ArrayList<Deck> deckOfcard) {
        this.deckOfcard = deckOfcard;
    }

    public void setDiscardPile(UNOCard discardPile) {
        this.discardPile = discardPile;
    }
    
    
    
    public void AddPlayer(Player p){
        players.add(p);
    }
    
    public UNOCard TakeFromDeck(){
        if(!deckOfcard.isEmpty()){
            deckOfcard.remove(0);
        }
        return null;
    }
    
    public void DiscardCard(UNOCard c){
        this.discardPile = c;
    }
    
    public void TakeFromdiscard(){
        this.discardPile=null;
    }
    
    public void ChangeStatus(String status){
        this.status=status;
    }
}
