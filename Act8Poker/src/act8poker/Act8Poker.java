/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act8poker;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author juliolopez
 */
public class Act8Poker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {String[] palo = {"Pika", "Corazon", "Diamante", "Trebol"};
        String[] valor = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        Integer cont = 1;
        Deck deck = new Deck();
        deck.setCard(new ArrayList<Card>());
        for (int i = 0; i < palo.length; i++) {
            for (int j = 0; j < valor.length; j++) {
                Card card = new Card(palo[i], getColor(palo[i]), valor[j]);
                deck.getCard().add(card);
            }   
        }
        System.out.println("El tamaño del deck es:" + deck.getCard().size());
        System.out.println("Mezclar Deck\n" + deck.mezclar());
        System.out.println(deck.head());
        System.out.println(deck.pick());
        System.out.println(deck.hand());
    }

    public static String getColor(String palo) {
        if (palo.toLowerCase().equals("pika") || palo.toLowerCase().equals("trebol")) {
            return "negro";
        }
        if (palo.toLowerCase().equals("corazon") || palo.toLowerCase().equals("diamante")) {
            return "rojo";
        }
        return null;
    }
}
