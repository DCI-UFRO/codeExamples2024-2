package org.example;

public class Carta {
    private int valor;
    private String pinta;
    private String simbolo;

    public Carta(int valor, String pinta, String simbolo) {
        this.valor = valor;
        this.pinta = pinta;
        this.simbolo = simbolo;
    }

    public int getValor() {
        return valor;
    }

    public String toString() {
        return "{" +
                "valor:" + valor +
                ", pinta:'" + pinta + '\'' +
                ", simbolo:'" + simbolo + '\'' +
                '}';
    }
}
