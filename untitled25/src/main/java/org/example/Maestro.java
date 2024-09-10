package org.example;

import java.util.*;

public class Maestro {

	ArrayList<Pokemon> equipo;
	private String nombre;

	/**
	 * 
	 * @param nombre
	 */
	public Maestro(String nombre) {
		this.nombre = nombre;
		equipo = new ArrayList<>();
	}

	/**
	 * 
	 * @param nombre
	 * @param pokemon
	 */
	public Maestro(String nombre, Pokemon pokemon) {
		this.nombre = nombre;
		equipo = new ArrayList<>();
		addPokemon(pokemon);
	}

	/**
	 * 
	 * @param pokemon
	 */
	public void addPokemon(Pokemon pokemon) {
		if(equipo.size()<6){
			equipo.add(pokemon);
		}else{
			System.out.println("Demasiados pokemones en el equipo");
		}
	}

	/**
	 * 
	 * @param maestro
	 */
	public void desafiar(Maestro maestro) {
		while(this.equipo.size()>0 && maestro.equipo.size()>0){
			Pokemon p1 = this.getPokemon();
			Pokemon p2  = maestro.getPokemon();
			System.out.println("p1 = " + p1);
			System.out.println("p2 = " + p2);
			p1.luchar(p2);
			if(!p2.isConVida()){
				continue;
			}
			p2.luchar(p1);
			if (!p1.isConVida()){
				continue;
			}
		}
	}
	
	public Pokemon getPokemon(){
		for (int i = 0; i < this.equipo.size(); i++) {
			if(equipo.get(i).isConVida()){
				return equipo.get(i);
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return "Maestro{" +
				"equipo=" + equipo +
				", nombre='" + nombre + '\'' +
				'}';
	}
}