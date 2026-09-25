package com.mycompany.pokerdeckk;

public class PokerDeckk {

    public static void main(String[] args) {

        Deck deck = new Deck();

        System.out.println("===== PRUEBA DEL DECK =====");

        deck.shuffle();

        System.out.println();

        System.out.println("===== METODO HEAD =====");
        deck.head();

        System.out.println();

        System.out.println("===== METODO PICK =====");
        deck.pick();

        System.out.println();

        System.out.println("===== METODO HAND =====");
        deck.hand();
    }
}