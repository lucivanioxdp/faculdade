package com.unip.aps.dicas;
import java.util.Random;

public class Dicas{
	private String dica1 = " Dica: Diminua o tempo debaixo do chuveiro.\n"+
						" E nao esqueca de fechar a torneira ao \n"+
						"se ensaboar. Uma ducha rapida em vez de \n"+
						"um banho pode economizar ate 150 litros. \n";

	private String dica2 = "Aproveite a agua da chuva, para uso nao \n"+
							"potavel, podendo ser usada em lavagem de \n"+ 
							"quintal, rega das plantas, e ate em descargas.\n";

	private String dica3 = "Reaproveite a agua do segundo enxague das maquinas \n"+ 
							"de lavar roupa e louca, logo utilize para regar \n"+ 
							"as plantas, ou lavar quintais. \n";

	private String dica4 = 	"Feche a torneira ao escovar os dentes e \n"+ 
							"fazer a barba, essa atitude pode economizar \n"+
							"ate 10 litros de agua por cada uso. \n";

	private String dica5 = 	"Lave a louca de maneira consciente. Limpe os \n"+
							"restos de comida dos pratos e panelas com esponja e \n"+
							"sabao antes de abrir a torneira. Ensaboe tudo que tem \n"+
							"que ser lavado e, entao, abra a torneira novamente para \n"+
							"novo enxague. Utilize detergentes ecologicos, sem fosfato \n";
	
	private String dica6 = "Descongele alimentos na geladeira. Nada de usar a torneira. \n" +
							"Tire o alimento do freezer um dia antes e descongele na geladeira \n.";

	
	//array para guardar as dicas de consumo de água
	private String dicas[] = {dica1, dica2, dica3, dica4, dica5, dica6};

		//Metodo para retornar a lista de dicas cadastradas
		public String[] getDicas(){
			return this.dicas;
		}

}