package Lista6LacodeRepeticaoJava;

import java.util.Scanner;

public class exercicio2 {
	/*2-	Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)*/
	
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		int num,x,contpar=0,contimpar=0;		
		
		for(x=0;x<10;x++)
		{
			System.out.println("Entre com um valor");
			num = ler.nextInt();
			if(num%2==0)
			{
				contpar++;
			}
			else
			{
				contimpar++;
			}
		}
		System.out.println("\nO total de n�meros pares digitados �: "+contpar);
		System.out.println("O total de n�meros �mpares digitados �: "+contimpar);
	}
}
