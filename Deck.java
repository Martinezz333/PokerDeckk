package com.mycompany.pokerdeckk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {

    // Atributos del Collection Framework
    private List<Card> deck;
    private List<Card> cartasOriginales;

    // Constructor
    public Deck() {
        deck = new ArrayList<>();
        cartasOriginales = new ArrayList<>();

        inicializarDeck();
    }

    // Inicializar las 52 cartas
    private void inicializarDeck() {

        String[] palos = {
            "Tréboles",
            "Corazones",
            "Picas",
            "Diamantes"
        };

        String[] colores = {
            "Negro",
            "Rojo",
            "Negro",
            "Rojo"
        };

        String[] valores = {
            "2", "3", "4", "5", "6", "7", "8", "9",
            "10", "A", "J", "Q", "K"
        };

        for (int i = 0; i < palos.length; i++) {

            for (String valor : valores) {

                Card carta = new Card(
                        palos[i],
                        colores[i],
                        valor
                );

                deck.add(carta);
                cartasOriginales.add(carta);
            }
        }
    }

    // Método shuffle
    public void shuffle() {

        Collections.shuffle(deck);

        System.out.println("Se mezclo el Deck.");
    }

    // Método head
    public Card head() {

        if (deck.isEmpty()) {
            System.out.println("El Deck está vacío.");
            return null;
        }

        Card carta = deck.remove(0);

        System.out.println(carta);
        System.out.println("Quedan " + deck.size() + " cartas en deck");

        return carta;
    }

    // Método pick
    public Card pick() {

        if (deck.isEmpty()) {
            System.out.println("El Deck está vacío.");
            return null;
        }

        Random random = new Random();

        int posicion = random.nextInt(deck.size());

        Card carta = deck.remove(posicion);

        System.out.println(carta);
        System.out.println("Quedan " + deck.size() + " cartas en deck");

        return carta;
    }

    // Método hand
    public Card[] hand() {

        if (deck.size() < 5) {
            System.out.println("No hay suficientes cartas para formar una mano.");
            return new Card[0];
        }

        Card[] mano = new Card[5];

        for (int i = 0; i < 5; i++) {

            mano[i] = deck.remove(0);

            System.out.println(mano[i]);
        }

        System.out.println("Quedan " + deck.size() + " cartas en deck");

        return mano;
    }
}
