
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
public class Player {
    private String id;
    private String name;
    ArrayList<UNOCard> cardsOnhands;

    public Player(String id, String name, ArrayList<UNOCard> cardsOnhands) {
        this.id = id;
        this.name = name;
        this.cardsOnhands = cardsOnhands;
    }

    public Player(String id, String name) {
        this.id = id;
        this.name = name;
    }

   

    public String getId() {
        return id;
    }

    public ArrayList<UNOCard> getCardsOnhands() {
        return cardsOnhands;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCardsOnhands(ArrayList<UNOCard> cardsOnhands) {
        this.cardsOnhands = cardsOnhands;
    }
    
    
    public void Addcard(UNOCard c)
    {
        
        cardsOnhands.add(c);
    }
    
    public void Removecard(UNOCard c)
    {    if(!cardsOnhands.isEmpty())
        cardsOnhands.remove(c);
    }
}
