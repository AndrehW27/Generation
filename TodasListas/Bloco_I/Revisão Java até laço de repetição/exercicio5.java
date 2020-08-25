package ListaRevisaoJava;

import java.util.Scanner;

public class exercicio5 {
	/*
	 
	5-	Fa�a um programa que leia um vetor de 5 posi��es para n�meros reais e, depois, um c�digo inteiro. 
	Se o c�digo for zero, finalize o programa; se for 1, mostre o vetor na ordem direta; se for 2, mostre 
	o vetor na ordem inversa. Caso, o c�digo for diferente de 1 e 2, escreva uma mensagem informando que 
	o c�digo inv�lido.

	 */
	
	public static void main(String[] args) {
		
		int codigo;
		double vetor[] = new double [5];
		
		Scanner entrada = new Scanner(System.in);
		
		for(int x=0;x<5;x++)
		{
			vetor[x] = Math.random()*10;
		}
		
	
		
	
		System.out.println("Vetor criado automaticamente, agora entre com um c�digo:"
				+ "\n0 - Encerra o progrma"
				+ "\n1 - Mostra o vetor"
				+ "\n2 - Mostra o vetor na ordem inversa");
		codigo = entrada.nextInt();
		while(codigo<0 || codigo>2)
		{
			System.out.println("Op��o invalida, entre com um n�mero entre 0 e 2:"
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
				System.out.println("Posi��o["+x+"]: "+vetor[x]);
			}
		}
		else if(codigo==2)
		{
			for(int x=4;x>-1;x--)
			{
				System.out.println("Posi��o["+x+"]: "+vetor[x]);
			}
		}
				
		
	}

}
