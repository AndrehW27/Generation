package Lista6LacodeRepeticaoJava;

import java.util.Scanner;

public class exercicio5 {
	/*5-	Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. 
	 No final, mostre a soma dos n�meros digitados.(DO...WHILE)*/
	
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		int num,soma=0;
		
		
		do
		{
			System.out.println("Entre com um n�mero do teclado e digite zero quadno desejar parar.");
			num= ler.nextInt();
			soma=soma+num;			
		}
		
		while(num!=0);
		
		
		System.out.println("\nA soma dos valores digitados �: "+soma);
			
	}

}
