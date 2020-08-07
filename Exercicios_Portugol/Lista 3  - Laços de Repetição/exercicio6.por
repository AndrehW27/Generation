programa
{
	
	funcao inicio()
	{
		inteiro numero, acm, somatorio

		escreva("Olá, por favor, insira um número: ")
		leia(numero)
		limpa()

		escreva("Número inserido = ", numero)
		
		acm = 1
		somatorio = 0

		faca{
			escreva("\n\nValores a serem somados: ",acm)
			somatorio = somatorio+acm
			acm=acm+1			
			escreva("\nSomatório parcial: ",somatorio)			
			}

		enquanto(acm<=numero)
		
			escreva("\n\nSOMATÓRIO TOTAL: ",somatorio)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 260; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */