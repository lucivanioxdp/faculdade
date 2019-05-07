package com.unip.aps.tarefas;

//classe reponsável pela lavagem da louca
public class Tarefa{
	private double tempoGasto;
	private int numCiclos;

		
		public Tarefa (double tempoGasto){
			this.tempoGasto = tempoGasto;
		}
		public Tarefa (int numCiclos){
			this.numCiclos = numCiclos;
		}

		
		public double getTempoGasto(){
			return this.tempoGasto;
		}
		public void setTempoGasto(int tempoGasto){
			this.tempoGasto = tempoGasto;
		}

}