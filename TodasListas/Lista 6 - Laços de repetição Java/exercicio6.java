package Lista6LacodeRepeticaoJava;

import java.util.Scanner;

public class exercicio6 {
	/*6-	Escrever um programa que receba vários números inteiros no teclado. 
	E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)*/
	
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		float num,soma=0,cont=0,media;
		
		
		do
		{
			System.out.println("Entre com um número do teclado e digite zero quadno desejar parar.");
			num= ler.nextFloat();			
			
			if(num%3==0)
			{
				soma=soma+num;
				cont++;
			}
							
		}
		
		while(num!=0);
		
		cont=cont-1;
		media=soma/cont;
		
		
		System.out.println("\nA média dos múltipls de 3, digitados é: "+media);
			
	}

}
