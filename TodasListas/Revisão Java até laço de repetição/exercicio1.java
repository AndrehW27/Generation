package ListaRevisaoJava;

import java.util.Scanner;

public class exercicio1 {
	/*
	 
1-	Elabore um programa que calcule o que deve ser pago por um produto, considerando o preço normal de etiqueta 
e a escolha da condição de pagamento. Utilize os códigos da tabela a seguir para ler qual a condição de pagamento 
escolhida e efetuar o cálculo adequado. 
Código Condição de pagamento 
1 À vista em dinheiro ou cheque, recebe 20% de desconto 
2 À vista no cartão de crédito, recebe 15% de desconto 
3 Em duas vezes, preço normal de etiqueta sem juros 
4 Em três vezes, preço normal de etiqueta mais juros de 10%

	 */
	
	public static void main(String[] args) {
		
		double preco;
		int pgto;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Olá, por favor digite o valor do produto informado na etiqueta: R$");
		preco = entrada.nextDouble();
		
		System.out.println("\nAgora, informe o método que gostaria de pagar (por favor insira números de 1 a 4): "
				+ "\n1 - À vista em dinheiro ou cheque, recebe 20% de desconto."
				+ "\n2 - À vista no cartão de crédito, recebe 15% de desconto."
				+ "\n3 - Em duas vezes, preço normal de etiqueta sem juros."
				+ "\n4 - Em três vezes, preço normal de etiqueta mais juros de 10%.");		
		pgto = entrada.nextInt();
		
		while(pgto<1 || pgto>4)
		{
			System.out.println("Opção inváida (por favor insira números de 1 a 4): "
					+ "\n1 - À vista em dinheiro ou cheque, recebe 20% de desconto."
					+ "\n2 - À vista no cartão de crédito, recebe 15% de desconto."
					+ "\n3 - Em duas vezes, preço normal de etiqueta sem juros."
					+ "\n4 - Em três vezes, preço normal de etiqueta mais juros de 10%.");		
			pgto = entrada.nextInt();
		}
		
		if(pgto==1)
		{
			System.out.println("\nOpção de pagamento à vista em dinheiro ou cheque escolhida.");
			preco=preco*(0.8);
		}
		else if(pgto==2)
		{
			System.out.println("Opçào de pagamento à vista no cartão de crédito escolhida.");
			preco=preco*(0.85);
		}
		else if(pgto==3)
		{
			System.out.println("Opçào de pagamento em duas vezes escolhida.");
		}
		else 
		{
			System.out.println("Opçào de pagamento em três vezes escolhida.");
			preco=preco*(1.1);
		}
		
		System.out.println("\nO valor final a ser pago é: R$ "+preco);
		
	}
}
