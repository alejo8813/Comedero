package com.campo;

public class Vaca extends Animal {

	public Vaca(int peso){
		this.peso=peso;
	}
	
	public boolean camino (){
		return true;
	}
	
	public boolean bebio(){
		if (sed = false){
			return false;
		}else{
			this.peso= this.peso - 500;
			this.sed = false;
			return true;
		}
	}
	@Override
	public boolean tienehambre() {
		if (camino()){
			this.peso = this.peso-3000;
		}
			return this.peso<200000;
	}

	@Override
	public void come(int cantidadcomida) {
		this.peso = cantidadcomida/3;
		this.sed = true;
	}

	@Override
	public boolean quierevacunar() {
		return this.vacunarse=false;
	}

}
