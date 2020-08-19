package ListaRevisaoJava;

import java.util.Scanner;

public class exercicio3 {
	/*
	 
	3-	Escrever um programa que leia uma quantidade desconhecida de números e conte quantos deles estão nos seguintes intervalos: 
	[0-25], [26-50], [51-75] e [76-100]. A entrada de dados deve terminar quando for lido um número negativo.

	 */
	
	public static void main(String[] args) {
		
		int valor,cont25=0,cont50=0,cont75=0,cont100=0;
				
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Olá, por favor digite diversos valores, digite um valor negativo quando desejar parar: ");	
		do
		{		
		valor = entrada.nextInt();
			if(valor>=0 && valor<=25)
			{
				cont25++;
			}
			if(valor>=26 && valor<=50)
			{
				cont50++;
			}
			if(valor>=51 && valor<=75)
			{
				cont75++;
			}
			if(valor>=76 && valor<=100)
			{
				cont100++;
			}
		}
		
		while(valor>0);
		
		System.out.println("\nFoi digitado "+cont25+" valore(s)no intervalo de 0 à 25."
				+ "\nFoi digitado "+cont50+" valore(s) no intervalo de 26 à 50."
				+ "\nFoi digitado "+cont75+" valore(s) no intervalo de 51 à 75."
				+ "\nFoi digitado "+cont100+" valore(s) no intervalo de 76 à 100.");
	
	
	}
}
