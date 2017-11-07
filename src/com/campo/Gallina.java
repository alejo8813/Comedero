package com.campo;

public class Gallina extends Animal {

	int comidas = 0;
	
	public Gallina(int peso){
		this.peso = 4000;
	}
	
	@Override
	public boolean tienehambre() {
		return true;
	}

	@Override
	public void come(int cantidadcomida) {
		comidas ++;
	}

	@Override
	public boolean quierevacunar() {
		return false;
	}

}
