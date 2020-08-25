package Lista6LacodeRepeticaoJava;

import java.util.Scanner;

public class exercicio5 {
	/*5-	Crie um programa que leia um número do teclado até que encontre um número igual a zero. 
	 No final, mostre a soma dos números digitados.(DO...WHILE)*/
	
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		int num,soma=0;
		
		
		do
		{
			System.out.println("Entre com um número do teclado e digite zero quadno desejar parar.");
			num= ler.nextInt();
			soma=soma+num;			
		}
		
		while(num!=0);
		
		
		System.out.println("\nA soma dos valores digitados é: "+soma);
			
	}

}
