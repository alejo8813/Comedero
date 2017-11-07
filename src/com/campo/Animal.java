package com.campo;

public abstract class Animal {
	public int peso;
	public boolean sed;
	public boolean vacunarse;
	
	public abstract boolean tienehambre();
	public abstract void come(int cantidadcomida);
	public abstract boolean quierevacunar();
}
