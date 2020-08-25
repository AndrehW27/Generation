programa
{
	
	funcao inicio()
	{
		inteiro acumulador, num_inserido

		escreva("Olá, por favor, insira um número: ")
		leia(num_inserido)
		limpa()

		acumulador = num_inserido

		enquanto(acumulador<100){
			escreva(acumulador,", ")
			acumulador = acumulador*3			
			}
		escreva(acumulador,".")			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 42; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */