package ListaRevisaoJava;

import java.util.Scanner;

public class exercicio6 {
	/*
	 
6-	Faça um programa que lê um vetor de 3 elementos e uma matriz de 3 x 3 elementos. Em seguida o programa deve fazer 
a multiplicação do vetor pelas colunas da matriz.
	 */
	
	public static void main(String[] args) {
		
		
		int vetor[] = new int [3];
		int vetor1[] = new int [3];
		int vetor2[] = new int [3];
		int vetor3[] = new int [3];
		int matriz[][] = new int [3][3];
		
//CRIACAO VETOR				
		for(int x=0;x<3;x++)
		{
			vetor[x] = (int) (Math.random()*10);
		}
		
//IMPRIMIR VETOR
		System.out.printf("\nVETOR = [");
		for(int x=0;x<3;x++)
		{
			System.out.print(" "+vetor[x]+" ");
		}
		System.out.printf("]");
		
//GERAR MATRIZ AUTOMATICAMENTE
		for(int l=0;l<3;l++)
		{
			for(int c=0;c<3;c++)
			{
				matriz[l][c] = (int)(Math.random()*20);
			}
		}
		
//IMPRIMIR MATRIZ
		System.out.println("\n\nMATRIZ ("+3+" X "+3+"):\n");
		for(int l=0;l<3;l++)
		{
			for(int c=0;c<3;c++)
			{
				System.out.printf("\t %d",matriz[l][c]);
			}
			System.out.println("\n");
		}	
		
//MULTIPLCACAO COLUNA 1
		int x1=0;
			for(int l=0;l<3;l++)
			{
				vetor1[x1] = vetor[x1]*matriz[l][0];
				x1++;
			}
		
			
		System.out.printf("\nVetor X coluna 1 da Matriz = [");
		for(int x=0;x<3;x++)
		{
			System.out.print(" "+vetor1[x]+" ");
		}
		System.out.printf("]");
		
//MULTIPLCACAO COLUNA 2
		int x2=0;
			for(int l=0;l<3;l++)
			{
				vetor2[x2] = vetor[x2]*matriz[l][1];
				x2++;
			}
		
			
		System.out.printf("\n\nVetor X coluna 2 da Matriz = [");
		for(int x=0;x<3;x++)
		{
			System.out.print(" "+vetor2[x]+" ");
		}
		System.out.printf("]");		
		
//MULTIPLCACAO COLUNA 3
		int x3=0;
			for(int l=0;l<3;l++)
			{
				vetor3[x3] = vetor[x3]*matriz[l][2];
				x3++;
			}
		
			
		System.out.printf("\n\nVetor X coluna 1 da Matriz = [");
		for(int x=0;x<3;x++)
		{
			System.out.print(" "+vetor3[x]+" ");
		}
		System.out.printf("]");
		
		
	}

}
