package ListaRevisaoJava;

import java.util.Scanner;

public class exercicio1 {
	/*
	 
1-	Elabore um programa que calcule o que deve ser pago por um produto, considerando o pre�o normal de etiqueta 
e a escolha da condi��o de pagamento. Utilize os c�digos da tabela a seguir para ler qual a condi��o de pagamento 
escolhida e efetuar o c�lculo adequado. 
C�digo Condi��o de pagamento 
1 � vista em dinheiro ou cheque, recebe 20% de desconto 
2 � vista no cart�o de cr�dito, recebe 15% de desconto 
3 Em duas vezes, pre�o normal de etiqueta sem juros 
4 Em tr�s vezes, pre�o normal de etiqueta mais juros de 10%

	 */
	
	public static void main(String[] args) {
		
		double preco;
		int pgto;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ol�, por favor digite o valor do produto informado na etiqueta: R$");
		preco = entrada.nextDouble();
		
		System.out.println("\nAgora, informe o m�todo que gostaria de pagar (por favor insira n�meros de 1 a 4): "
				+ "\n1 - � vista em dinheiro ou cheque, recebe 20% de desconto."
				+ "\n2 - � vista no cart�o de cr�dito, recebe 15% de desconto."
				+ "\n3 - Em duas vezes, pre�o normal de etiqueta sem juros."
				+ "\n4 - Em tr�s vezes, pre�o normal de etiqueta mais juros de 10%.");		
		pgto = entrada.nextInt();
		
		while(pgto<1 || pgto>4)
		{
			System.out.println("Op��o inv�ida (por favor insira n�meros de 1 a 4): "
					+ "\n1 - � vista em dinheiro ou cheque, recebe 20% de desconto."
					+ "\n2 - � vista no cart�o de cr�dito, recebe 15% de desconto."
					+ "\n3 - Em duas vezes, pre�o normal de etiqueta sem juros."
					+ "\n4 - Em tr�s vezes, pre�o normal de etiqueta mais juros de 10%.");		
			pgto = entrada.nextInt();
		}
		
		if(pgto==1)
		{
			System.out.println("\nOp��o de pagamento � vista em dinheiro ou cheque escolhida.");
			preco=preco*(0.8);
		}
		else if(pgto==2)
		{
			System.out.println("Op��o de pagamento � vista no cart�o de cr�dito escolhida.");
			preco=preco*(0.85);
		}
		else if(pgto==3)
		{
			System.out.println("Op��o de pagamento em duas vezes escolhida.");
		}
		else 
		{
			System.out.println("Op��o de pagamento em tr�s vezes escolhida.");
			preco=preco*(1.1);
		}
		
		System.out.println("\nO valor final a ser pago �: R$ "+preco);
		
	}
}
