package Lista6LacodeRepeticaoJava;

import java.util.Scanner;

public class exercicio4 {
	/*4-	Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas psicol�gicas dos indiv�duos 
	de uma regi�o. Para tanto, a cada uma das pessoas era perguntado: idade, 
	sexo (1-feminino / 2-masculino / 3-Outros), e as op��es 
	(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, 
	se a pessoa era agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, 
	calcule e mostre: (WHILE)
�	o n�mero de pessoas calmas; 
�	o n�mero de mulheres nervosas; 
�	o n�mero de homens agressivos; 
�	o n�mero de outros calmos;
�	o n�mero de pessoas nervosas com mais de 40 anos; 
�	o n�mero de pessoas calmas com menos de 18 anos.
*/
	
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		int idade,sexo,opcao,x=0,contcalma=0, contMnerv=0, contHagre=0, contnerv40=0,contcalm18=0;
		
		while(x<5)
		{
			System.out.println("\nEntre com um valor para a sua idade: ");
			idade= ler.nextInt();
			System.out.println("Entre com um valor para seu sexo (1-masculino / 2-feminino / 3-Outros): ");
			sexo= ler.nextInt();
			System.out.println("Entre com um valor para sua personalidade (1-calmo / 2-nervoso / 3-agressivo): ");
			opcao= ler.nextInt();
			x++;
			if(opcao==1)
			{
				contcalma++;
			}
			if(sexo==2 && opcao==2)
			{
				contMnerv++;
			}
			if(sexo==1 && opcao==3)
			{
				contHagre++;
			}
			if(idade>40 && opcao==2)
			{
				contnerv40++;
			}
			if(idade<18&& opcao==1)
			{
				contcalm18++;
			}
		}
		
		System.out.println("\nO n�mero de pessoas calma: "+contcalma);
		System.out.println("\nO n�mero de mulheres nervosas: "+contMnerv);
		System.out.println("\nO n�mero de homens agressivos: "+contHagre);
		System.out.println("\n O n�mero de pessoas nervosas com mais de 40 anos: "+contnerv40);
		System.out.println("\nO n�mero de pessoas calmas com menos de 18 anos: "+contcalm18);
	
		
		
	}

}
