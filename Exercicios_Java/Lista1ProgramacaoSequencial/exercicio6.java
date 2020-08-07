package Lista1ProgramacaoSequencial;

import java.util.Scanner;

public class exercicio6 {
	public static void main (String args[]) 
	{
		/*Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano, 
		P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula que efetua tal cálculo é: */
		
		Scanner ler = new Scanner(System.in);
		double x1, x2, y1, y2, d;
		System.out.println("Por favor, insira a coordenada x do ponto 1: ");	
		x1 = ler.nextDouble();
		System.out.println("Por favor, insira a coordenada y do ponto 1: ");	
		y1 = ler.nextDouble();
		System.out.println("Por favor, insira a coordenada x do ponto 1: ");	
		x2 = ler.nextDouble();
		System.out.println("Por favor, insira a coordenada y do ponto 1: ");	
		y2 = ler.nextDouble();
		
		d = Math.sqrt(((Math.pow((x2-x1), 2.0))+(Math.pow((y2-y1), 2.0))));
		
				
		System.out.println("\nA distância entre os pontos P1("+x1+","+y1+") e P2("+x2+","+y2+") é: "+d);
				
		
	}

}
