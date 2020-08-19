package MaquinaVendaAutomatica;

import java.util.ArrayList;
import java.util.Scanner;

public class MaquinaVendaTeste {
	public static void main(String[] args) {
		
		Maquinas maquina1 = new Maquinas("ATR-Y07","Google");		
		double precoCoca=4.00,precoAgua=2.00,precoLaranja=7.0,precoLanche=10.0,precoChoco=8.0,precoDori=7.0;		
		Scanner entrada = new Scanner(System.in);
		ArrayList<String> produtos = new ArrayList<String>();		
		
//INSERINDO COCA NA M�QUINA		
		int qtdCoca = 10;		
		for(int x=0;x<qtdCoca;x++)
		{
			produtos.add("Coca-Cola");
		}
//INSERINDO �GUA NA M�QUINA		
		int qtdAgua = 30;		
		for(int x=0;x<qtdAgua;x++)
		{
			produtos.add("�gua");
		}
//INSERINDO SUCO NA M�QUINA		
		int qtdSuco = 20;		
		for(int x=0;x<qtdSuco;x++)
		{
			produtos.add("Suco de Laranja");
		}
//INSERINDO LANCHE NA M�QUINA		
		int qtdLanche = 20;		
		for(int x=0;x<qtdLanche;x++)
		{
			produtos.add("Lanche Natural");
		}
//INSERINDO CHOCOLATE NA M�QUINA		
		int qtdChoco = 40;		
		for(int x=0;x<qtdChoco;x++)
		{
			produtos.add("Chocolate");
		}
//INSERINDO DORITOS NA M�QUINA		
		int qtdDori = 40;		
		for(int x=0;x<qtdDori;x++)
		{
			produtos.add("Doritos");
		}

		
		maquina1.LigarMaquina("Pi...Pi...");
		
//MSG BOAS VINDAS 	
		System.out.println("***OL�, SEJA BEM VINDO A M�QUINA DE VENDAS AUTOM�TICA!***");
		System.out.println("Primeiramente, gostar�amos de apresentar os produtos dispon�veis:\n");
		System.out.println("-Coca-cola, pre�o: R$ "+precoCoca+", quantidade: "+qtdCoca+".");
		System.out.println("-�gua, pre�o: R$ "+precoAgua+", quantidade: "+qtdAgua+".");
		System.out.println("-Suco de Laranja, pre�o: R$ "+precoLaranja+", quantidade: "+qtdSuco+".");
		System.out.println("-Lanche Natural, pre�o: R$ "+precoLanche+", quantidade: "+qtdLanche+".");
		System.out.println("-Chocolate, pre�o: R$ "+precoChoco+", quantidade: "+qtdChoco+".");
		System.out.println("-Doritos, pre�o: R$ "+precoDori+", quantidade: "+qtdDori+".");
		System.out.println("\nA quantidade total de produtos na m�quina �: "+produtos.size());
		
//INSERIR DINHEIRO		
		double notaInserida=0; 
		
			System.out.println("\nPor favor, insira uma nota: "
						+ "\n2- R$2.00"
						+ "\n5- R$5.00"
						+ "\n10- R$10.00"
						+ "\n20- R$20.00"
						+ "\n50- R$50.00");
			notaInserida = entrada.nextDouble();
		 
		while(notaInserida != 2.0 && notaInserida != 5.0 && notaInserida != 10.0 && notaInserida != 20.0 && notaInserida != 50.0)
		{
			System.out.println("\nNota inv�lida, estamos devolvendo sua nota, por favor, insira uma nota v�lida: "
					+ "\n2- R$2.00"
					+ "\n5- R$5.00"
					+ "\n10- R$10.00"
					+ "\n20- R$20.00"
					+ "\n50- R$50.00");	
			notaInserida = entrada.nextDouble();
		}
						
				if(notaInserida==2)
				{
					System.out.println("\nValor inserido: R$ 2.00");
				}
				else if(notaInserida==5)
				{
					System.out.println("\nValor inserido: R$ 5.00");
				}
				else if(notaInserida==10)
				{
					System.out.println("\nValor inserido: R$ 10.00");
				}
				else if(notaInserida==20)
				{
					System.out.println("\nValor inserido: R$ 20.00");
				}
				else if(notaInserida==50)
				{
					System.out.println("\nValor inserido: R$ 50.00");
				}
									
		
//ESCOLHA DO PRODUTO		
		System.out.println("\nEscolha um produto: "
				+ "\n1- Coca-Cola - R$"+precoCoca
				+ "\n2- �gua- R$"+precoAgua
				+ "\n3- Suco de Laranja- R$"+precoLaranja
				+ "\n4- Lanche Natural- R$"+precoLanche
				+ "\n5- Chocolate- R$"+precoChoco
				+ "\n6- Doritos- R$"+precoDori);		
		
		int escolhaUsuario = entrada.nextInt();
		
		System.out.println("\nQual a quantidade?");		
		int qtd = entrada.nextInt();		
		
			if(escolhaUsuario==1)
			{	
				double troco = notaInserida-(qtd*precoCoca);
				if(qtd*precoCoca<=notaInserida)
				{	
					System.out.println("\nVoc� escolheu coca-cola, valor total: R$"+precoCoca*qtd+", seu troco � de R$"+troco+". Retire seu produto e seu troco abaixo.");
					for(int x=0;x<qtd;x++)
					{
						produtos.remove("Coca-Cola");
					}
				}
				else
				{
					System.out.println("\nValor inserido menor que o necess�rio para efetuar a compra, estamos devolvendo seu dinheiro, por favor tente novamente.");  
					   System.exit(1);
				}
				
			}
			else if(escolhaUsuario==2)
			{
				double troco = notaInserida-(qtd*precoAgua);
				if(qtd*precoAgua<=notaInserida)
				{	
					System.out.println("\nVoc� escolheu �gua, valor total: R$"+precoAgua*qtd+", seu troco � de R$"+troco+". Retire seu produto e seu troco abaixo.");
					for(int x=0;x<qtd;x++) 
					{
						produtos.remove("�gua");
					}
				}
				else
				{
					System.out.println("\nValor inserido menor que o necess�rio para efetuar a compra, estamos devolvendo seu dinheiro, por favor tente novamente.");   
					System.exit(1);
				}
			}
			else if(escolhaUsuario==3)
			{
				double troco = notaInserida-(qtd*precoLaranja);
				if(qtd*precoLaranja<=notaInserida)
				{	
					System.out.println("\nVoc� escolheu suco de laranja, valor total: R$"+precoLaranja*qtd+", seu troco � de R$"+troco+". Retire seu produto e seu troco abaixo.");
					for(int x=0;x<qtd;x++) 
					{
						produtos.remove("Suco de Laranja");
					}
				}
				else
				{
					System.out.println("\nValor inserido menor que o necess�rio para efetuar a compra, estamos devolvendo seu dinheiro, por favor tente novamente.");   
					System.exit(1);
				}
			}
			else if(escolhaUsuario==4)
			{
				double troco = notaInserida-(qtd*precoLanche);
				if(qtd*precoLanche<=notaInserida)
				{	
					System.out.println("\nVoc� escolheu lanche natural, valor total: R$"+precoLanche*qtd+", seu troco � de R$"+troco+". Retire seu produto e seu troco abaixo.");
					for(int x=0;x<qtd;x++) 
					{
						produtos.remove("Lanche Natural");
					}
				}
				else
				{
					System.out.println("\nValor inserido menor que o necess�rio para efetuar a compra, estamos devolvendo seu dinheiro, por favor tente novamente.");   
					System.exit(1);
				}
			}
			else if(escolhaUsuario==5)
			{
				double troco = notaInserida-(qtd*precoChoco);
				if(qtd*precoChoco<=notaInserida)
				{	
					System.out.println("\nVoc� escolheu chocolate, valor total: R$"+precoChoco*qtd+", seu troco � de R$"+troco+". Retire seu produto e seu troco abaixo.");
					for(int x=0;x<qtd;x++) 
					{
						produtos.remove("Chocolate");
					}
				}
				else
				{
					System.out.println("\nValor inserido menor que o necess�rio para efetuar a compra, estamos devolvendo seu dinheiro, por favor tente novamente.");   
					System.exit(1);
				}
			}
			else if(escolhaUsuario==6)
			{
				double troco = notaInserida-(qtd*precoDori);
				if(qtd*precoDori<=notaInserida)
				{	
					System.out.println("\nVoc� escolheu doritos, valor total: R$"+precoDori*qtd+", seu troco � de R$"+troco+". Retire seu produto e seu troco abaixo.");
					for(int x=0;x<qtd;x++) 
					{
						produtos.remove("Doritos");
					}
				}
				else
				{
					System.out.println("\nValor inserido menor que o necess�rio para efetuar a compra, estamos devolvendo seu dinheiro, por favor tente novamente.");   
					System.exit(1);
				}
			}
			
//OBRIGADO
			System.out.println("\n***OBRIGADO PELA COMPRA, VOLTE SEMPRE!***");
		
//CONTANDO QTD PRODUTOS NA MAQUINA		
			int contCoca=0, contAgua=0,contSuco=0,contLanche=0,contChoco=0,contDori=0;
			for(String produto:produtos) {
				if(produto=="Coca-Cola")
				{
					contCoca++;
				}
				else if(produto=="�gua")
				{
					contAgua++;
				}
				else if(produto=="Suco de Laranja")
				{
					contSuco++;
				}
				else if(produto=="Lanche Natural")
				{
					contLanche++;
				}
				else if(produto=="Chocolate")
				{
					contChoco++;
				}
				else if(produto=="Doritos")
				{
					contDori++;
				}
			}		
			
//MSG DE QTD DEPOIS DA COMPRA			
			System.out.println("\nA quantidade total de produtos na m�quina �: "+produtos.size());
			System.out.println("Os produtos dispon�veis s�o: "
					+ "\n\n-Coca-Cola: "+contCoca+""
					+ "\n-�gua: "+contAgua+""
					+ "\n-Suco de Laranja: "+contSuco
					+ "\n-Lanche Natural: "+contLanche
					+ "\n-Chocolate: "+contChoco
					+ "\n-Doritos: "+contDori);
			
						System.out.println("\nFabricante: "+maquina1.getFabricante()+".");
						System.out.println("C�digo de f�brica da m�quina: "+maquina1.getCodigoDaMaquina()+".");
						
			
			maquina1.DesligarMaquina("Piiiii...");
			
	}
}
