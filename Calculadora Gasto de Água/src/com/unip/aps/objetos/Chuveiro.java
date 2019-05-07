package com.unip.aps.objetos;

public class Chuveiro extends Valvula{
	private String tipo;
	private double vazao;

		//construtor do chuveiro
		public Chuveiro(String tipo, double vazao, boolean estado){
			super(estado);
			this.tipo = tipo;
			this.vazao = vazao;
		}

		//getthers e setthers
		public String getTipo(){
			return this.tipo;
		}
		public void setTipo(String tipo){
			this.tipo = tipo;
		}
		public double getVazao(){
			return this.vazao;
		}
		public void setVazao(double vazao){
			this.vazao = vazao;
		}

}