package org.example;

import java.util.ArrayList;

public class Main {
    static final int CANTIDAD_JUGADORES = 900;
    static final int CARTAS_INICIALES = 2;

    public static void main(String[] args) {
        Mazo mazo = new Mazo("Rojo");
        mazo.revolver(10000);
        ArrayList<Jugador> jugadores = new ArrayList<>();
        iniciarJuego(jugadores, mazo);
        System.out.println(jugadores);
    }

    private static void iniciarJuego(ArrayList<Jugador> jugadores, Mazo mazo) {
        for (int i = 0; i < CANTIDAD_JUGADORES; i++) {
            jugadores.add(new Jugador(""+i));
        }
        for(Jugador jugador : jugadores) {
            for (int i = 0; i < CARTAS_INICIALES; i++) {
                jugador.añadirCarta(mazo.getCarta());
            }
        }
    }
}