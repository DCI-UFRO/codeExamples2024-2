package org.example;

import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Set<Integer> conjunto = new HashSet<Integer>();
        conjunto.add(3);
        conjunto.add(1);
        conjunto.add(2);
        conjunto.add(3);
        System.out.println("conjunto = " + conjunto);

        System.out.println(conjunto);
    }
}