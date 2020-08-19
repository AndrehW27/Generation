programa
{
	
	funcao inicio()
	{
		inteiro n1, n2, n3, n4, n12, n22, n32, n42

		escreva("Por favor, insira o primeiro número: ")
		leia(n1)
		escreva("Por favor, insira o segundo número: ")
		leia(n2)
		escreva("Por favor, insira o terceiro número: ")
		leia(n3)
		escreva("Por favor, insira o quarto número: ")
		leia(n4)

		n12 = n1*n1
		n22 = n2*n2
		n32 = n3*n3
		n42 = n4*n4
		
		se(n32>=1000){
			escreva("\nO quadrado do terceiro número inserido é: ",n32)
			}
		senao{
			escreva("\nOs valores do números inseridos são: ",n1,", ",n2,", ",n3,", ",n4,".")
			escreva("\n\nE seus respectivos quadrados são: ",n12,", ",n22,", ",n32,", ",n42,".")
			}
				
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 579; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */