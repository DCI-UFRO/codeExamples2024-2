package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Loteria {
    public static void main(String[] args) {
        //generar numeros aleatorios
        // 1 - 50
        // ordenados
        // sin repetir
        // arreglo de largo 15

        int[] carton = generarCarton(15, 50);
        System.out.println(carton);
        System.out.println(Arrays.toString(carton));

    }

    private static int[] generarCarton(int largo, int rango) {
        Set<Integer> carton = new HashSet<>();
        while (carton.size() < largo) {
            carton.add((int)(Math.random()*50)+1);
        }
        System.out.println(carton);
        int[] arr = new int[carton.size()];
        int i = 0;
        for(Integer num : carton){
            arr[i] = num;
            i++;
        }
        return arr;
    }
}
