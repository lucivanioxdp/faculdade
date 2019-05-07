package com.unip.aps.objetos;

public class Valvula{
	private boolean estado;

	//a valvula sempre tera o valor inicial fechada.
	public Valvula (boolean estado){
		this.estado = estado;
	}

		public boolean getEstado(){
			return this.estado;
		}
		public void setEstado(boolean estado){
			this.estado = estado;
		}
		//abre dispositivo
		public void abre (boolean estado){
			this.estado = true;
		}
		//fecha dispositivo
		public void fecha (boolean estado){
			this.estado = false;
		}
}