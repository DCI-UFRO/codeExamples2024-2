package org.example;

import java.util.ArrayList;

public class Jugador {
    private String nombre;
    private int puntos;
    private ArrayList<Carta> mano;
    private boolean estado;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.puntos = 0;
        this.estado = true;
        mano = new ArrayList<>();
    }

    public void añadirCarta(Carta carta) {
        mano.add(carta);
        calcularPuntos();
    }

    public void calcularPuntos() {
        puntos = 0;
        for (Carta carta : mano) {
            puntos += carta.getValor();
        }
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", puntos=" + puntos +
                ", mano=" + mano +
                '}'+"\n";
    }
}
