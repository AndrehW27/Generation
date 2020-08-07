programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real b, a, A

		escreva("Por favor, insira medida da base do triângulo: ")
		leia(b)
		escreva("Por favor, insira medida da altura do triângulo: ")
		leia(a)

		se(b>0 e a>0){
			A=(b*a)/2
			escreva("\nA área do triângulo é: ",mat.arredondar(A,2))
			}
		senao{
			escreva("\nValores inseridos inváldos, por favor insira somente valores positivos.")
			}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 393; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */