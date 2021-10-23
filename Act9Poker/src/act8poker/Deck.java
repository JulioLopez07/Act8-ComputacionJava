/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act8poker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author juliolopez
 */
public class Deck {
    private List<Card> card;
    private Integer numCard = 52;

    public List<Card> getCard() {
        return card;
    }

    public void setCard(List<Card> card) {
        this.card = card;
    }

    public Integer getNumCard() {
        return numCard;
    }

    public void setNumCard(Integer numCard) {
        this.numCard = numCard;
    }

    public String mezclar() {
        Collections.shuffle(card);
        return "Se mezcló el deck";
    }
    
     public String head(){
        System.out.println("-----Head-----\nPrimera carta: ");
        Card card = getCard().get(0);
        System.out.println(getCard().get(0).getPalo() + " "+ getCard().get(0).getColor() + " "+ getCard().get(0).getValor());
        getCard().remove(0);
        return "Quedan " +  getCard().size() + " cartas en el deck";
    }
     
    public String pick(){
        System.out.println("-----Pick-----\nPrimera carta: ");
        Random randomGenerator = new Random();
        int index = randomGenerator.nextInt(getCard().size());
        Card card = getCard().get(index);
        System.out.println(getCard().get(index).getPalo() + " "+ getCard().get(index).getColor() + " "+ getCard().get(index).getValor());
        getCard().remove(0);
        return "Quedan " + getCard().size() + " cartas en el deck";
    }  
    
        public String hand(){
        System.out.println("-----Hand-----");
        for (int i = 0; i < 5; i++){
            System.out.println(getCard().get(0).getPalo() + " "+ getCard().get(0).getColor() + " "+ getCard().get(0).getValor());
            getCard().remove(0);
        }
        
        return "Quedan " + getCard().size() + " cartas en el deck";
    }
    
}
    

    