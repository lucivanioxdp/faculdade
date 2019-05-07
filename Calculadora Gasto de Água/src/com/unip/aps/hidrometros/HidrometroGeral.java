package com.unip.aps.hidrometros;

public class HidrometroGeral {
	private static double gastoDiario;
	private static double gastoMensal;

		public double getGastoDiario(){
			return this.gastoDiario;
		}
		public double getGastoMensal(){
			return this.gastoMensal;
		}

		//metodo para calcular gasto diario vai acumulando com o passar dos parametros.
		public void calculaGastoDiario(double gastoAgua){
			gastoDiario += gastoAgua;
		}
		//calculo do gasto mensal de agua
		public void calculaGastoMensal(double gastoAgua) {
			int diasMes = 30;
			gastoMensal = this.gastoDiario*diasMes;
		}
}