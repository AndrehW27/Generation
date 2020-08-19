package Lista6LacodeRepeticaoJava;

import java.util.Scanner;

public class exercicio2 {
	/*2-	Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/
	
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
		System.out.println("\nO total de números pares digitados é: "+contpar);
		System.out.println("O total de números ímpares digitados é: "+contimpar);
	}
}
