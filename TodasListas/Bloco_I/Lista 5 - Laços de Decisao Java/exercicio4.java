package Lista5LacoDecisaoJava;

import java.util.Scanner;

public class exercicio4 {
	/*Faça um programa em que permita a entrada de um número qualquer e exiba se este número
	 é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o 
	 número elevado ao quadrado.*/
	public static void main (String args[])
	{
		
		Scanner ler = new Scanner(System.in);
		
		int numero,quadrado;
		System.out.println("Por favor, insira o primeiro número");
		numero = ler.nextInt();
		
		if (numero%2==0)
		{
			System.out.println("\nO número inserido é par.");
			quadrado = (int) Math.pow(numero, 2);
			System.out.println("\nO número elevado ao quadrado é: "+quadrado);
		}
		else
		{
			System.out.println("\nO número inserido é ímpar.");
			quadrado = (int) Math.sqrt(numero);
			System.out.println("\nSua raiz quadrada é: "+quadrado);
		}
		
	}

}
