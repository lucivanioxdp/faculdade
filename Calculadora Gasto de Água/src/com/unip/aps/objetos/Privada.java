package com.unip.aps.objetos;


public class Privada extends Valvula{
	private int litrosPorDescarga;
	private String tipo;

		public Privada (int litrosPorDescarga, boolean estado){
			super(estado);
			this.litrosPorDescarga = litrosPorDescarga;
		}
		public int getLitrosPorDescarga(){
			return this.litrosPorDescarga;
		}
		public void setLitrosPorDescarga(int litrosPorDescarga){
			this.litrosPorDescarga = litrosPorDescarga;
		}
		public String getTipo(){
			return this.tipo;
		}
		public void setTipo(String tipo){
			this.tipo = tipo;
		}

		//dar descarga
		public void descarga(){

		}

}