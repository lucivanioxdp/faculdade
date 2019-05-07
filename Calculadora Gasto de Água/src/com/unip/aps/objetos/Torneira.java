package com.unip.aps.objetos;

public class Torneira extends Valvula{
	private double vazao;
	private String tipo;//comum, com redutor de vazao


		public Torneira (double vazao, String tipo, boolean estado){
			super(estado);
			this.vazao = vazao;
			this.tipo = tipo;
		}
		//getthers e setthers
		public double getVazao(){
			return this.vazao;
		}
		public void setVazao(double vazao){
			this.vazao = vazao;
		}
		public String getTipo (){
			return this.tipo;
		}
		public void setTipo (String tipo){
			this.tipo = tipo;
		}
}