package Lista1ProgramacaoSequencial;

import java.util.Scanner;

public class exercicio8 {
	public static void main (String args[]) 
	{
		
		 /*O custo ao consumidor de um carro novo � a soma do custo de f�brica com a percentagem do distribuidor 
		 e dos impostos (aplicados ao custo de f�brica). Supondo que a percentagem do distribuidor 
		 seja de 28% e os impostos de 45%, escrever um sistema que leia o custo de f�brica de um 
		 carro e escreva o custo ao consumidor.*/ 
		
		Scanner ler = new Scanner(System.in);
		
		double fab;	
		
		System.out.println("Por favor, insria o valor de f�brica dos carro: ");
		fab = ler.nextDouble();

		fab= fab*1.73;

		System.out.println("\nO valor total do carro ap�s percentagem do distribuidor e dos impostos � R$: "+fab);
	}

}
