package org.example;

public class Pokemon {

	private String tipo;
	private String nombre;
	private int numero;
	private int hp;
	private boolean conVida;

	public Pokemon(String tipo, String nombre, int numero, int hp) {
		this.tipo = tipo;
		this.nombre = nombre;
		this.numero = numero;
		this.hp = hp;
		this.conVida = true;
	}

	/**
	 * 
	 * @param dano
	 */
	public void dano(int dano) {
		hp-=dano;
		if(hp<=0){
			System.out.println(this.nombre + " ha sido debilitado");
			hp = 0;
			conVida = false;
		}
	}

	/**
	 * 
	 * @param pokemon
	 */
	public void luchar(Pokemon pokemon) {
		if(conVida){
			pokemon.dano((int)(Math.random()*50));
		}else{
			System.out.println(this.nombre + " ha sido debilitado");
		}
	}

	public boolean isConVida() {
		return conVida;
	}

	@Override
	public String toString() {
		return "Pokemon{" +
				"tipo='" + tipo + '\'' +
				", nombre='" + nombre + '\'' +
				", numero=" + numero +
				", hp=" + hp +
				'}';
	}
}