package Lista1ProgramacaoSequencial;

import java.util.Scanner;

public class exercicio3 {
	public static void main (String args[]) 
	{
		/*Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica expressa em segundos 
		e mostre-o expresso em horas, minutos e segundos. */
		
		Scanner ler = new Scanner(System.in);
		int total, horas, minutos, segundos;
		System.out.println("Por favor, insira o tempo do evento em sua f�brica em segundos: ");	
		total = ler.nextInt();
		
		horas=total/3600;
		minutos=(total%3600)/60;
		segundos=(total%3600)%60;
				
		System.out.println("\nSeu evento tem dura��o de: "+horas+" horas, "+minutos+" minutos e "+segundos+" segundos.");
				
		
	}

}
