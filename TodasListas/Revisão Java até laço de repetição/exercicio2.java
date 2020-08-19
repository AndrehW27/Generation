package ListaRevisaoJava;

import java.util.Scanner;

public class exercicio2 {
	/*
	 
	2-	O IMC – Índice de Massa Corporal é um critério da Organização Mundial de Saúde para dar uma indicação sobre 
	a condição de peso de uma pessoa adulta. A fórmula é IMC = peso / ( altura )2 
	Elabore um programa que leia o peso e a altura de um adulto e mostre sua condição de acordo com a tabela abaixo. 
	IMC em adultos Condição 
	Abaixo de 18,5 Abaixo do peso 
	Entre 18,5 e 25 Peso normal 
	Entre 25 e 30 Acima do peso 
	Acima de 30 obeso

	 */
	
	public static void main(String[] args) {
		
		double peso,altura,imc;
				
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Olá, por favor digite o valor da sua altura em metros (exemplo: 1,72): ");
		altura = entrada.nextDouble();
		System.out.println("\nAgora, por favor digite o valor de seu peso em Kilogramas (exemplo: 72,8): ");
		peso = entrada.nextDouble();		

		imc=peso/(Math.pow(altura, 2));
		
		if(imc<18.5)
		{
			System.out.println("\nVocê está abaixo do peso ideal. Seu IMC é: "+imc);
		}
		else if(imc>=18.5 && imc<25)
		{
			System.out.println("\nParabéns, você está no peso ideal. Seu IMC é: "+imc);
		}
		else if(imc>=25 && imc<30)
		{
			System.out.println("\nVocê está acima do peso ideal. Seu IMC é: "+imc);
		}
		else if(imc>=30)
		{
			System.out.println("\nAtenção, você esta com obesidade. Seu IMC é: "+imc);
		}
		
	
	}
}
