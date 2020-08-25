package Lista6LacodeRepeticaoJava;

import java.util.Scanner;

public class exercicio3 {
	/*3-	Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
	 Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)*/
	
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		int idade=0,cont21=0,cont50=0;		
		
		while(idade!=-99)
		{
			System.out.println("Entre com um valor para idade: ");
			idade= ler.nextInt();
			if(idade<21)
			{
				cont21++;
			}
			if(idade>50)
			{
				cont50++;
			}
		}
		cont21=cont21-1;
		System.out.println("\nO total de pessoas com menos de 21  anos é: "+cont21);
		System.out.println("\nO total de pessoas com mais de 50  anos é: "+cont50);

		
	}

}
