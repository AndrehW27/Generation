package Lista5LacoDecisaoJava;

import java.util.Scanner;

public class exercicio3 {
	/*3-	Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual 
	categoria ela se encontra:
	
�	10-14 infantil
�	15-17 juvenil
�	18-25 adulto
*/
	public static void main (String args[])
	{
		
		Scanner ler = new Scanner(System.in);
		
		int idade;
		System.out.println("Por favor, insira o primeiro n�mero");
		idade = ler.nextInt();

		if(idade>=10 && idade<=14) 
		{
			System.out.println("\nVoc� se encontra na categoria Infantil.");
		}
		else if(idade>=15 && idade<=17) 
		{
			System.out.println("\nVoc� se encontra na categoria Juvenil.");
		}
		else if(idade>=18 && idade<=25) 
		{
			System.out.println("\nVoc� se encontra na categoria Adulto.");
		}
		else
		{
			System.out.println("\nSua idade n�o se encaixa em nenhuma de nossas categorias.");
		}
		
	
	}

}
