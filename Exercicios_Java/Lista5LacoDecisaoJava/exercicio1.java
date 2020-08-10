package Lista5LacoDecisaoJava;

import java.util.Scanner;

public class exercicio1 {
	/*Faça um programa que receba três inteiros e diga qual deles é o maior.*/
	
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		
		int n1,n2,n3, maior=0;
		System.out.println("Por favor, insira o primeiro número");
		n1 = ler.nextInt();
		//System.out.flush();
		System.out.println("Por favor, insira o segundo número");
		n2 = ler.nextInt();
		System.out.println("Por favor, insira o terceiro número");
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
		System.out.println("O maior valor inserido é: "+maior);
				
	}
}
