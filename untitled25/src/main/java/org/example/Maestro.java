package org.example;

import java.util.*;

public class Maestro {

	private ArrayList<Pokemon> equipo;
	private String nombre;
	private boolean gano;

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
		this.gano = true;
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
		while(this.getPokemon()!=null && maestro.getPokemon()!=null){
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
		String ganador = this.gano ? this.nombre : maestro.nombre;
		System.out.println("Gano el Maestro: " + ganador);
	}
	
	public Pokemon getPokemon(){
		for (int i = 0; i < this.equipo.size(); i++) {
			if(equipo.get(i).isConVida()){
				return equipo.get(i);
			}
		}
		this.gano = false;
		return null;
	}

	public boolean isGano() {
		return gano;
	}

	@Override
	public String toString() {
		return "Maestro{" +
				"equipo=" + equipo +
				", nombre='" + nombre + '\'' +
				'}';
	}

	public ArrayList<Pokemon> getEquipo() {
		return equipo;
	}
}