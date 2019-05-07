package com.unip.aps.hidrometros;

public class HidrometroObjeto extends HidrometroGeral{
	private double totalGasto;

	//construtor para objetos que escoam agua (torneiras)
	public HidrometroObjeto (double tempoGasto, double vazao){
		this.totalGasto = tempoGasto*vazao;
	}
	//construtor para objetos que gastam agua por ativacao
	public HidrometroObjeto(int ciclos, double vazao){
		this.totalGasto = ciclos*vazao;
	}
	//construtor para a maquina de lavar
	public HidrometroObjeto(int ciclos, double vazao, int diasSemana){
		int mediaGastoDiario = (int)(ciclos*vazao)/diasSemana;
		this.totalGasto = mediaGastoDiario;
	}
	/*construtor para calculo de gasto diario de atividade semanal
	com uso de torneira*/
	public HidrometroObjeto(double tempoGasto, double vazao, int diasSemana){
		int mediaGastoDiario = (int)(tempoGasto*vazao)/diasSemana;
		this.totalGasto = mediaGastoDiario;
	}
	public double getTotalGasto(){
		return this.totalGasto;
	}
	private void setTotalGasto(double totalGasto){
		this.totalGasto = totalGasto;
	}

	//calcular gasto de agua torneira, chuveiro
	public void calculaGasto(double tempoGasto, double vazao){
		this.totalGasto = tempoGasto*vazao;
	}
	//calcular gasto de agua privada, maquina de lavar
	public void calculaGasto(int ciclos, double vazao){
		this.totalGasto = ciclos*vazao;
	}
	//metodo para calcular gasto diario da maquina de lavar
	public void calculaGasto(int ciclos, double vazao, int diasSemana){
		int mediaGastoDiario = (int)(ciclos*vazao)/diasSemana;
		this.totalGasto = mediaGastoDiario;
	}
	/*metodo para calculo de gasto diario de atividade semanal
	com uso de torneira*/
	public void calculaGasto(double tempoGasto, double vazao, int diasSemana){
		int mediaGastoDiario = (int)(tempoGasto*vazao)/diasSemana;
		this.totalGasto = mediaGastoDiario;
	}


}