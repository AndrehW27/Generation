package Lista7Arrays;

public class exercicio2 {
/*
2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados.
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
		System.out.println("\nOs n�meros pares do vetor s�o: ");
		for(int x=0;x<tamanho;x++)
		{
			if(vetor[x]%2==0)
			{
				System.out.println(+vetor[x]);
				somapar = somapar+vetor[x];
			}			
		}
		
//SOMAR PARES
		System.out.println("\nA soma dos valores pares �: "+somapar);
		
//IMPRIMIR VALORES �MPARES
		System.out.println("\nOs n�meros �mpares do vetor s�o: ");
		for(int x=0;x<tamanho;x++)
		{
			if(vetor[x]%2!=0)
			{
				System.out.println(vetor[x]);
				contimpar++;				
			}			
		}
		System.out.println("\nA quantidade dos valores �mpares �: "+contimpar);
		
	}
}
