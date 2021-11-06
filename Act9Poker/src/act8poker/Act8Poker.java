/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act8poker;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * @author juliolopez
 */
public class Act8Poker {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) throws Exception {String[] palo = {"Pika", "Corazon", "Diamante", "Trebol"};
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
        
        Act8Poker.showMenu(deck);
        
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
    
    public static String showMenu(Deck deck) throws Exception, InputMismatchException{
        int n = 0;
        do{
            try{
                System.out.println("------------------------------\n" 
                    + "Bienvenido a Poker!Selecciona una opción:\n"
                    + "1 Mezclar deck\n"
                    + "2 Sacar una carta\n"
                    + "3 Carta al azar\n"
                    + "4 Generar una mano de 5 cartas\n"
                    + "0 Salir");
                Scanner leer = new Scanner(System.in);
                n = leer.nextInt(); 
            }
            catch(InputMismatchException e){
                n=5;
                System.out.print("Opción no valida\n");
            }
            if(n>5){
                n = 5;
                System.out.println("Opción no valida\n");
            }
            
            switch(n){
                case 1: 
                    System.out.println("El tamaño del deck es: " + deck.getCard().size());
                    System.out.println("Mezclar Deck\n" + deck.mezclar());
                    break; 
            
                case 2: 
                    deck.head();
                     break;
                
                case 3: 
                    deck.pick();
                    break;
            
                case 4: 
                    deck.hand();
                    break;
            
                case 0: 
                    System.out.println("Salida exitosa\n");
                    System.exit(n);
                    break;
                    
                default:
                    n = 5;
                    break;
                } 
        }while( n < 5 | n > -1);
        
        return "";  
    }
    
    
}
    

