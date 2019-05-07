package com.unip.aps.questionario;
import com.unip.aps.tarefas.Tarefa;
import com.unip.aps.objetos.*;
import com.unip.aps.hidrometros.*;
import com.unip.aps.dicas.SorteiaDica;
import javax.swing.JOptionPane;

public class Questionario{

	//criação dos objetos para perguntas
	Torneira torneira = new Torneira (8.0, "comum", true);
	Chuveiro chuveiro = new Chuveiro ("comum", 10.0, true );
	MaquinaLavar maquinaLavar = new MaquinaLavar (true);
	Privada privada = new Privada (9, true);
	HidrometroGeral hidrometro = new HidrometroGeral();
	int diasSemana = 7;


		public void mensagemInicial(){
		JOptionPane.showMessageDialog(null, "Agora Sera iniciado um questionario \n"+
											"Sobre o uso de agua em sua residencia. \n"+
											"Ao final voce sabera se esta contribuindo \n"+
											"com a natureza ou esta desperdicando muita \n"+
											"Agua \n \n"+
											"Responda as perguntas utilizando numeros inteiros \n"+
											"ou reais (ex: 1.5)" );
		}
		
		public void perguntaLouca() throws QuestionarioException{
			//Pergunta sobre tempo gasto lavando louca
			try{
				double tempoLouca = Double.parseDouble(JOptionPane.showInputDialog
								(null, "Quantos minutos por dia voce passa lavando a louca?"));

				HidrometroObjeto calcularLouca = new HidrometroObjeto(tempoLouca, torneira.getVazao());
				//acumula o gasto de agua da pia
				hidrometro.calculaGastoDiario(calcularLouca.getTotalGasto());
			}catch  (NumberFormatException ex){
				throw new QuestionarioException("Erro ao responder", ex);
			}
		}

		public void perguntaBanho() throws QuestionarioException{
			//Pergunta sobre tempo gasto Tomando Banho
			try{
				double tempoBanho = Double.parseDouble(JOptionPane.showInputDialog
									(null, "Quantos minutos voce passa tomando banho diariamente?"));
				
				HidrometroObjeto calcularBanho = new HidrometroObjeto(tempoBanho, chuveiro.getVazao());
				//acumula o gasto de agua do chuveiro
				hidrometro.calculaGastoDiario(calcularBanho.getTotalGasto());
			}catch  (NumberFormatException ex){
				throw new QuestionarioException("Erro ao responder", ex);
			}
		}
		
		public void perguntaEscovarDente() throws QuestionarioException{
			//pergunta sobre o tempo gasto Escovando os Dentes
			try{
				double tempoEscovarDentes = Double.parseDouble(JOptionPane.showInputDialog
											(null, "Quantos minutos voce leva para escovar os \n"+
														"dentes por dia?"));

				HidrometroObjeto calculoEscovarDente = new HidrometroObjeto 
									(tempoEscovarDentes, torneira.getVazao());
					//acumula gasto de agua no banho
				hidrometro.calculaGastoDiario(calculoEscovarDente.getTotalGasto());
			}catch  (NumberFormatException ex){
				throw new QuestionarioException("Erro ao responder", ex);
			}
		}


		public void perguntaDescarga() throws QuestionarioException{
			//pergunta sobre agua gasta dando descarga
			try{
				int quantidadeDescargas = Integer.parseInt(JOptionPane.showInputDialog
											(null, "quantas descargas voce da ao dia no banheiro?"));

				HidrometroObjeto calculoDescarga = new HidrometroObjeto
												(quantidadeDescargas, privada.getLitrosPorDescarga());
				hidrometro.calculaGastoDiario(calculoDescarga.getTotalGasto());
			}catch  (NumberFormatException ex){
				throw new QuestionarioException("Erro ao responder", ex);
			}
		}

		public void perguntaLavarQuintal() throws QuestionarioException{
			//pergunta sobre o tempo gasto por semana, paralavar  o quintal
			try{
				double tempoLavarQuintal = Double.parseDouble(JOptionPane.showInputDialog
											(null, "Quantos minutos por semana, voce leva para lavar o quintal com \n"+ 
													"a mangueira?" ));
				Tarefa lavarQuintal = new Tarefa(tempoLavarQuintal);
				HidrometroObjeto calculoLavarQuintal = new HidrometroObjeto
													(tempoLavarQuintal, torneira.getVazao(), diasSemana);
					//acumula gasto de agua lavando o quintal
				hidrometro.calculaGastoDiario(calculoLavarQuintal.getTotalGasto());
			}catch  (NumberFormatException ex){
				throw new QuestionarioException("Erro ao responder", ex);
			}
		}
		
		public void perguntaLavarRoupa() throws QuestionarioException{
			//pergunta sobre a quantidade de agua gasta  lavando roupa
			try{
				int ciclosLavagemRoupa = Integer.parseInt(JOptionPane.showInputDialog
											(null, "Quantas vezes voce lava roupa por semana?"));
				HidrometroObjeto calculoLavarRoupa = new HidrometroObjeto(ciclosLavagemRoupa, 
														maquinaLavar.getLitrosPorCiclo(), diasSemana);
				hidrometro.calculaGastoDiario(calculoLavarRoupa.getTotalGasto());
			}catch  (NumberFormatException ex){
				throw new QuestionarioException("Erro ao responder", ex);
			}
		}

		public void perguntaTanque() throws QuestionarioException{
			//pergunta sobre tempo gasto usando o tanque de agua
			try{
				double tempoUsoTanque = Double.parseDouble(JOptionPane.showInputDialog
										(null, "Quantos minutos voce gasta usando o Tanque por dia?"));
				HidrometroObjeto calculaGastoTanque = new HidrometroObjeto 
													(tempoUsoTanque, torneira.getVazao());
				hidrometro.calculaGastoDiario(calculaGastoTanque.getTotalGasto());
			}catch  (NumberFormatException ex){
				throw new QuestionarioException("Erro ao responder", ex);
			}
		}
}