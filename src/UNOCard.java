/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author air
 */
public class UNOCard {
    public String Color; 
    public String Type;
    public int value;
    public String image;

    public UNOCard(String Color, String Type, int value, String image) {
        this.Color = Color;
        this.Type = Type;
        this.value = value;
        this.image = image;
    }

    public UNOCard(String Color, String Type) {
        this.Color = Color;
        this.Type = Type;
    }
    
    

    public String getColor() {
        return Color;
    }

    public String getType() {
        return Type;
    }

    public int getValue() {
        return value;
    }

    public String getImage() {
        return image;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "UNOCard{" + "Color=" + Color + ", Type=" + Type + ", value=" + value + ", image=" + image + '}';
    }
    
    
    
}