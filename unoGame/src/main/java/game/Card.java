/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author Üveys SARAÇ
 */
public class Card {
    public int sayi;
    public char color;
    
    public Card(int sayi, char color) {
        this.sayi = sayi;
        this.color = color;
    }
    
    public String getImage(){
       
       return ""+this.color+this.sayi; 
    }
}
