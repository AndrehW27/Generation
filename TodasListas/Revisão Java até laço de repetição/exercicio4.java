package ListaRevisaoJava;

import java.util.Scanner;

public class exercicio4 {
	/*
	 
	4-	Faça um programa em C que calcula e escreve a seguinte soma: soma = 1/1 + 3/2 + 5/3 + 7/4 + ... + 99/50

	 */
	
	public static void main(String[] args) {
		
		double res,soma=0.0,dividendo=1.0, divisor;
				
		for(divisor=1.0;divisor<51;divisor++)
		{
			res=dividendo/divisor;
			soma = soma+res;
			
			System.out.println(dividendo+" / "+divisor+" = "+res+" + ");
			 
			dividendo=dividendo+2;			
		}
		
		System.out.println("\nResultado final = "+soma);
	
	}

}
