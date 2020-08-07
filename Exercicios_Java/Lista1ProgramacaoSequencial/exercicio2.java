package Lista1ProgramacaoSequencial;

import java.util.Scanner;

public class exercicio2 {
	public static void main (String args[]) 
	{
		/*Faça um sistema que leia a idade de uma pessoa expressa em dias 
		e mostre-a expressa em anos, meses e dias.*/	
		
		Scanner ler = new Scanner(System.in);
		int anos, meses, dias, total;
		System.out.println("Por favor, entre com total em dias: ");	
		total = ler.nextInt();
		
		anos=total/365;
		meses=(total%365)/30;
		dias=(total%365)%30;
				
		System.out.println("\nSua idade é de: "+anos+" anos, "+meses+" meses e "+dias+" dias.");
				
		
	}

}
