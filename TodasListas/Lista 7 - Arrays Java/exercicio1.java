package Lista7Arrays;

public class exercicio1 {
	/*1- Faça um programa que possua um vetor denominado A que armazene 6 números inteiros. 
	O programa deve executar os seguintes passos: 
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições A[0], A[1] e A[5] do vetor 
e mostre na tela esta soma. 
(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. 
(d) Mostre na tela cada valor do vetor A, um em cada linha.
 */
	public static void main(String[] args) {
		
		int tamanho=6,soma;
		int A[] = new int[tamanho];
		
//(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
		
		A[0] = 1;
		A[1] = 0;
		A[2] = 5;
		A[3] = -2;
		A[4] = -5;
		A[5] = 7;
		
		for(int x=0;x<tamanho;x++)
		{
			System.out.println("A["+x+"]"+A[x]);
		}
		
//(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições A[0], A[1] e A[5] do vetor 
//		e mostre na tela esta soma. 
		
		soma = A[0]+A[1]+A[5];		
		System.out.println("\nA soma das posições A[0]+A[1]+A[5] é: "+soma+"\n");

//(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. 
		
		A[4] = 100;
		
//(d) Mostre na tela cada valor do vetor A, um em cada linha.
		System.out.println("Novo vetor, mudando o valor da posição[4] para 100.");
		for(int x=0;x<tamanho;x++)
		{
			System.out.println("A["+x+"]"+A[x]);
		}

	}

}
