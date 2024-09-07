package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] pokemonData = leerArchivo("pokemon.csv").split("\n");
        ArrayList<Pokemon> pokemones = new ArrayList<Pokemon>();
        generarPokemones(pokemones, pokemonData);
        System.out.println("pokemones.size() = " + pokemones.size());

    }
    public static void generarPokemones(ArrayList<Pokemon> pokemones, String[] pokemonData){

        for(int i = 1; i < pokemonData.length; i++){
            String[] pokemonUnitData = pokemonData[i].split(",");
            pokemones.add(new Pokemon(pokemonUnitData[2],
                    pokemonUnitData[1],
                    Integer.parseInt(pokemonUnitData[0]),
                    Integer.parseInt(pokemonUnitData[5])));
        }
    }

    public static String leerArchivo(String ruta) {
        Path rutaArchivo = Paths.get(ruta);
        String contenido = "";
        try{
            contenido = new String(Files.readAllBytes(rutaArchivo));
        }catch (IOException e){
            System.out.println("El archivo no puede ser leido");
        }
        return  contenido;
    }
}