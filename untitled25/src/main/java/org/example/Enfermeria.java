package org.example;

public class Enfermeria {

	/**
	 * 
	 * @param pokemon
	 */
	public void recuperar(Pokemon pokemon) {
		pokemon.setHp(pokemon.getHpMax());
	}

	public void recuperar(Maestro maestro) {
		for (Pokemon p: maestro.getEquipo()){
			p.setHp(p.getHpMax());
		}
	}
}