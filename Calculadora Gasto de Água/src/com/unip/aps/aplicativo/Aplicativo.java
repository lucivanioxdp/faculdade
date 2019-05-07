package com.unip.aps.aplicativo;
import com.unip.aps.questionario.*;
import com.unip.aps.hidrometros.*;
import javax.swing.JOptionPane;

public class Aplicativo{

	public static void main (String[] args){
		Questionario questionario = new Questionario();
		//exibe apresentação do programa
		questionario.mensagemInicial();
		
		//mensagens de erro
		String txtErroPreenchimento = "Resposta preenchida incorretamente, tente novamente";
		String txtRespostaVazia = "Acao cancelada pelo Usuario";
		
		boolean flag = false;  
			//pergunta tempo gasto lavando louca
			do{
				try{
					questionario.perguntaLouca();
                 	flag = true;    
              	}catch(QuestionarioException ex){  
                 	flag = false;
                 	JOptionPane.showMessageDialog(null, txtErroPreenchimento, "Erro",
														JOptionPane.ERROR_MESSAGE); 
              	}catch(NullPointerException ex){ 
                 	JOptionPane.showMessageDialog(null, txtRespostaVazia, "Erro",
														JOptionPane.ERROR_MESSAGE);
                 	flag = false;
                 	break;
                }
            }while (!flag);

			//tempo gasto no Banho
            do{
				try{
					questionario.perguntaBanho();
                 	flag = true;    
              		}catch(QuestionarioException ex){  
                 	flag = false;
                 	JOptionPane.showMessageDialog(null, txtErroPreenchimento, "Erro",
														JOptionPane.ERROR_MESSAGE); 
              		}catch(NullPointerException ex){ 
                 	JOptionPane.showMessageDialog(null, txtRespostaVazia, "Erro",
														JOptionPane.ERROR_MESSAGE);
                 	flag = false;
                 	break;
              		}
              	}while (!flag);

        	//tempo gasto Escovando Dentes
            do{
				try{
					questionario.perguntaEscovarDente();
                 	flag = true;    
              		}catch(QuestionarioException ex){  
                 	flag = false;
                 	JOptionPane.showMessageDialog(null, txtErroPreenchimento, "Erro",
														JOptionPane.ERROR_MESSAGE); 
              		}catch(NullPointerException ex){ 
                 	JOptionPane.showMessageDialog(null, txtRespostaVazia, "Erro",
														JOptionPane.ERROR_MESSAGE);
                 	flag = false;
                 	break;
              		}
              	}while (!flag);

        	//Numero de descargas do vaso sanitario
            do{
				try{
					questionario.perguntaDescarga();
                 	flag = true;    
              		}catch(QuestionarioException ex){  
                 	flag = false;
                 	JOptionPane.showMessageDialog(null, txtErroPreenchimento, "Erro",
														JOptionPane.ERROR_MESSAGE); 
              		}catch(NullPointerException ex){ 
                 	JOptionPane.showMessageDialog(null, txtRespostaVazia, "Erro",
														JOptionPane.ERROR_MESSAGE);
                 	flag = false;
                 	break;
              		}
              	}while (!flag);

        	//tempo gasto Lavando Quintal
            do{
				try{
					questionario.perguntaLavarQuintal();
                 	flag = true;    
              		}catch(QuestionarioException ex){  
                 	flag = false;
                 	JOptionPane.showMessageDialog(null, txtErroPreenchimento, "Erro",
														JOptionPane.ERROR_MESSAGE); 
              		}catch(NullPointerException ex){ 
                 	JOptionPane.showMessageDialog(null, txtRespostaVazia, "Erro",
														JOptionPane.ERROR_MESSAGE);
                 	flag = false;
                 	break;
              		}
              	}while (!flag);

    		
        	//tempo gasto Lavando Roupa
            do{
				try{
					questionario.perguntaLavarRoupa();
                 	flag = true;    
              		}catch(QuestionarioException ex){  
                 	flag = false;
                 	JOptionPane.showMessageDialog(null, txtErroPreenchimento, "Erro",
														JOptionPane.ERROR_MESSAGE); 
              		}catch(NullPointerException ex){ 
                 	JOptionPane.showMessageDialog(null, txtRespostaVazia, "Erro",
														JOptionPane.ERROR_MESSAGE);
                 	flag = false;
                 	break;
              		}
              	}while (!flag);

        	//tempo gasto no tanque
            do{
				try{
					questionario.perguntaTanque();
                 	flag = true;    
              		}catch(QuestionarioException ex){  
                 	flag = false;
                 	JOptionPane.showMessageDialog(null, txtErroPreenchimento, "Erro",
														JOptionPane.ERROR_MESSAGE); 
              		}catch(NullPointerException ex){ 
                 	JOptionPane.showMessageDialog(null, txtRespostaVazia, "Erro",
														JOptionPane.ERROR_MESSAGE);
                 	flag = false;
                 	break;
              		}
              	}while (!flag);

        //calculo do gasto diario de água de água
        HidrometroGeral hidrometro = new HidrometroGeral();
        AvaliaGasto avaliaGasto = new AvaliaGasto();
		avaliaGasto.avaliaGastoAgua();
		
		double gastoDiario = hidrometro.getGastoDiario();
		hidrometro.calculaGastoMensal(gastoDiario);
		double gastoMensal = hidrometro.getGastoMensal();
		
		
        JOptionPane.showMessageDialog(null, "Seu Gasto Diario de agua e: "+gastoDiario+" Litros\n \n"+
										"Seu Gasto Mensal de agua e: "+gastoMensal+" Litros"+
        								"\n \n"+avaliaGasto.mensagem()); 
	}

}