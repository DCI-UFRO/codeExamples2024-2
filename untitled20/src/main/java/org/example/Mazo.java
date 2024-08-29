package org.example;

import java.util.ArrayList;

public class Mazo {
    private ArrayList<Carta> cartas;
    private String color;

    public Mazo(String color) {
        this.color = color;
        this.cartas = new ArrayList<>();
        crearMazo();
    }

    public void crearMazo() {
        int[] valor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
        String[] simbolo = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] pinta = {"T", "D", "P", "C"};

        for (int i = 0; i < valor.length; i++) {
            for (String s : pinta) {
                cartas.add(new Carta(valor[i], simbolo[i], s));
            }
        }
    }

    public void mostrar() {
        System.out.println("Mazo:" + color);
        for (Carta c : cartas) {
            System.out.println(c);
        }
    }

    public void revolver(int n) {
        for (int i = 0; i < cartas.size(); i++) {
            int index = (int) (Math.random() * cartas.size());
            Carta c = cartas.get(0);
            cartas.remove(0);
            cartas.add(index,c);
        }
    }

    public Carta getCarta() {
        if (cartas.size() <= 1) {
            crearMazo();
            revolver(1000);
        }

        Carta carta = cartas.get(0);
        cartas.remove(0);
        return carta;
    }
}

