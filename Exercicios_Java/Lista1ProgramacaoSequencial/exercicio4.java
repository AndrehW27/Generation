package Lista1ProgramacaoSequencial;

import java.util.Scanner;

public class exercicio4 {
	public static void main (String args[]) 
	{
		/*Escreva  um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) 
		e calcule a seguinte express�o: D=(R+S)/2; R=(A+B)^2; S=(B+C)^2 */
		
		Scanner ler = new Scanner(System.in);
		int A,B,C,S,R;
		float D;
		System.out.println("Por favor, insira um valor para A: ");	
		A = ler.nextInt();
		System.out.println("Por favor, insira um valor para B: ");	
		B = ler.nextInt();
		System.out.println("Por favor, insira um valor para C: ");	
		C = ler.nextInt();
		
		if(A>=0 && B>=0 && C>=0)
		{
			
			R = (int) Math.pow((A+B), 2);
			S = (int) Math.pow((B+C), 2);
			D = (R+S)/2;

			System.out.println("\nO valor de D �: "+D);			
		}
		
		
		else {
			System.out.println("\nErro! Por favor insira somente n�meros inteiros e positivos.");
			}
				
		
	}

}
