package Lista5LacoDecisaoJava;

import java.util.Scanner;

public class exercicio1 {
	/*Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.*/
	
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		
		int n1,n2,n3, maior=0;
		System.out.println("Por favor, insira o primeiro n�mero");
		n1 = ler.nextInt();
		//System.out.flush();
		System.out.println("Por favor, insira o segundo n�mero");
		n2 = ler.nextInt();
		System.out.println("Por favor, insira o terceiro n�mero");
		n3 = ler.nextInt();
		
		if (n1>=maior)
		{
			maior=n1;
		}
		if (n2>=maior)
		{
			maior=n2;
		}
		if (n3>=maior)
		{
			maior=n3;
		}
		System.out.println("O maior valor inserido �: "+maior);
				
	}
}
