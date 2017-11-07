package com.campo;

public class Cerdo extends Animal {

	public int comidas = 0;
	public boolean hambre = true;
	
	public Cerdo(int peso){
		this.peso=peso;
	}

	@Override
	public boolean tienehambre() {
		return this.sed=false;
	}

	@Override
	public void come(int cantidadcomida) {
		actualizarContComidas();
		if (cantidadcomida > 200){
			this.peso += cantidadcomida - 200;			
			if(cantidadcomida>1000){
				hambre = false;
			}
		}
		
	}

	@Override
	public boolean quierevacunar() {
		return true;
	}
	
	private void actualizarContComidas(){
		if(comidas==3){
			this.sed = true;
			comidas = 0;
		}else{
			comidas ++;
		}
	}

}
