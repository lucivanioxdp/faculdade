package com.unip.aps.dicas;
import java.util.Random;

public class SorteiaDica extends Dicas{
	private String dicaSorteada;
	private int numeroDica;

		public String getDicaSorteada(){
			return this.dicaSorteada;
		}
		private void setDicaSorteada(String dicaSorteada){
			this.dicaSorteada = dicaSorteada;
		}

		public int getNumeroDica(){
			return this.numeroDica;
		}

		//metodo para sortear uma dica
		public void sorteiaDica(){
			Random sorteio = new Random();
			//sorteia um valor inteiro de 0 a 6
			//this.numeroDica = sorteio.nextInt(6)+1;   apagar depois

			//armazena dicas cadastradas na classe Dicas
			String dicas[] = getDicas();

			setDicaSorteada(dicas[sorteio.nextInt(6)+1]);
		}
		public void imprimeDica(){
			System.out.println(getDicaSorteada());
		}




}
