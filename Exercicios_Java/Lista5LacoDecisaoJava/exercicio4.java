package Lista5LacoDecisaoJava;

import java.util.Scanner;

public class exercicio4 {
	/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero
	 � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o 
	 n�mero elevado ao quadrado.*/
	public static void main (String args[])
	{
		
		Scanner ler = new Scanner(System.in);
		
		int numero,quadrado;
		System.out.println("Por favor, insira o primeiro n�mero");
		numero = ler.nextInt();
		
		if (numero%2==0)
		{
			System.out.println("\nO n�mero inserido � par.");
			quadrado = (int) Math.pow(numero, 2);
			System.out.println("\nO n�mero elevado ao quadrado �: "+quadrado);
		}
		else
		{
			System.out.println("\nO n�mero inserido � �mpar.");
			quadrado = (int) Math.sqrt(numero);
			System.out.println("\nSua raiz quadrada �: "+quadrado);
		}
		
	}

}
