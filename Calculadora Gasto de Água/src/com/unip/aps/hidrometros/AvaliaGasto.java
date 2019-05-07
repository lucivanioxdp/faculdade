package com.unip.aps.hidrometros;
import com.unip.aps.dicas.*;
public class AvaliaGasto{
	boolean gastoAlto = false;
	boolean gastoBaixo = false;
	boolean gastoMediano = false;
	String mensagem;

		public boolean getGastoAlto(){
			return this.getGastoAlto();
		}
		public void setGastoAlto(boolean gastoAlto){
			this.gastoAlto = gastoAlto;
		}
		public boolean getGastoBaixo(){
			return this.gastoBaixo;
		}
		public void setGastoBaixo(boolean gastoBaixo){
			this.gastoBaixo = gastoBaixo;
		}
		public boolean getGastoMediano(){
			return this.gastoMediano;
		}
		public void setGastoMediano(boolean gastoMediano){
			this.gastoMediano = gastoMediano;
		}
		
		//verifica se o usuario gasta muita ou pouca agua
		public void avaliaGastoAgua(){
			HidrometroGeral hidrometro = new HidrometroGeral();
			double gastoDiario = (double)hidrometro.getGastoDiario();
			if (gastoDiario < 111.0){
				this.gastoBaixo = true;
			}else if(gastoDiario > 110.0 && gastoDiario < 220.0){
				this.gastoMediano = true;
			}else{
				this.gastoAlto = true;
			}
		}
				
		public String mensagem(){
			//sorteia uma dica de consumo de agua para exibir
			SorteiaDica dicas = new SorteiaDica();
			dicas.sorteiaDica();

			if (this.gastoBaixo){
				this.mensagem = "Parabens Voce esta colaborando com o meio "+ 
									"ambiente";
			}else if(gastoMediano){
				this.mensagem = "Seu gasto esta mediano tente economizar "+ 
									"um poouco mais de agua \n \n"+
										dicas.getDicaSorteada();
			}else if(gastoAlto){
				this.mensagem = "Gasto de agua muito elevado tente economizar "+ 
									"mais agua em casa\n \n"+
										dicas.getDicaSorteada();;
			}
			return this.mensagem;
		}
}