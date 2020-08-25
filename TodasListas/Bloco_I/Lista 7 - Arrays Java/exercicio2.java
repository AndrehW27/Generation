package Lista7Arrays;

public class exercicio2 {
/*
2- Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.
*/
	public static void main(String[] args) {
		
		int somapar = 0,contimpar=0,tamanho=6;
		int vetor[] = new int[tamanho];

//GERAR VALORES DO VETOR AUTOMATICAMENTE
		for(int x=0;x<tamanho;x++)
		{
			vetor[x] = (int)(Math.random() * 11);
		}
		
//IMPRIMIR VETOR NO CONSOLE
		for(int x=0;x<tamanho;x++)
		{
			System.out.println(vetor[x]);
		}

//IMPRIMIR VALORES PARES
		System.out.println("\nOs números pares do vetor são: ");
		for(int x=0;x<tamanho;x++)
		{
			if(vetor[x]%2==0)
			{
				System.out.println(+vetor[x]);
				somapar = somapar+vetor[x];
			}			
		}
		
//SOMAR PARES
		System.out.println("\nA soma dos valores pares é: "+somapar);
		
//IMPRIMIR VALORES ÍMPARES
		System.out.println("\nOs números ímpares do vetor são: ");
		for(int x=0;x<tamanho;x++)
		{
			if(vetor[x]%2!=0)
			{
				System.out.println(vetor[x]);
				contimpar++;				
			}			
		}
		System.out.println("\nA quantidade dos valores ímpares é: "+contimpar);
		
	}
}
