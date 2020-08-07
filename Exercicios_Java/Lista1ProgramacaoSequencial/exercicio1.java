package Lista1ProgramacaoSequencial;

import java.util.Scanner;

public class exercicio1 {
	public static void main (String args[]) 
	{
		/*Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias 
		e mostre-a expressa apenas em dias.*/		
		
		Scanner ler = new Scanner(System.in);
		int anos, meses, dias, total;
		System.out.println("Por favor, entre com sua idade em  anos: ");	
		anos = ler.nextInt();
		System.out.println("Por favor, entre com sua idade em  meses: ");	
		meses = ler.nextInt();
		System.out.println("Por favor, entre com sua idade em  dias: ");	
		dias = ler.nextInt();
		
		
		anos = anos*365;
		meses = meses*30;
		total = anos+meses+dias;
				
		System.out.println("\nSua idade total em dias é: "+total);
				
		
	}

}
