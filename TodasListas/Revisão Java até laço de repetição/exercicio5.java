package ListaRevisaoJava;

import java.util.Scanner;

public class exercicio5 {
	/*
	 
	5-	Faça um programa que leia um vetor de 5 posições para números reais e, depois, um código inteiro. 
	Se o código for zero, finalize o programa; se for 1, mostre o vetor na ordem direta; se for 2, mostre 
	o vetor na ordem inversa. Caso, o código for diferente de 1 e 2, escreva uma mensagem informando que 
	o código inválido.

	 */
	
	public static void main(String[] args) {
		
		int codigo;
		double vetor[] = new double [5];
		
		Scanner entrada = new Scanner(System.in);
		
		for(int x=0;x<5;x++)
		{
			vetor[x] = Math.random()*10;
		}
		
	
		
	
		System.out.println("Vetor criado automaticamente, agora entre com um código:"
				+ "\n0 - Encerra o progrma"
				+ "\n1 - Mostra o vetor"
				+ "\n2 - Mostra o vetor na ordem inversa");
		codigo = entrada.nextInt();
		while(codigo<0 || codigo>2)
		{
			System.out.println("Opção invalida, entre com um número entre 0 e 2:"
					+ "\n0 - Encerra o progrma"
					+ "\n1 - Mostra o vetor"
					+ "\n2 - Mostra o vetor na ordem inversa");
			codigo = entrada.nextInt();
		}
		
		if(codigo==0)
		{
			System.out.println("Programa finalizado.");
		}
		else if(codigo==1)
		{
			for(int x=0;x<5;x++)
			{
				System.out.println("Posição["+x+"]: "+vetor[x]);
			}
		}
		else if(codigo==2)
		{
			for(int x=4;x>-1;x--)
			{
				System.out.println("Posição["+x+"]: "+vetor[x]);
			}
		}
				
		
	}

}
