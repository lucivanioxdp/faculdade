package com.unip.aps.objetos;

public class MaquinaLavar extends Valvula{
	private final int litrosPorCiclo = 130;

	//herda o atributo estado da classe valvula
	public MaquinaLavar(boolean estado){
		super(estado);
	}
	public int getLitrosPorCiclo(){
		return this.litrosPorCiclo;
	}
	
}