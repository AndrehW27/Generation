programa
{
	
	funcao inicio()
	{
		inteiro idadeAnos, idadeMeses, idadeDias, idadeTotal
		
		escreva("Por favor, insira sua idade em anos: ")
		leia(idadeAnos)
		escreva("Por favor, insira sua idade em meses: ")
		leia(idadeMeses)
		escreva("Por favor, insira sua idade em dias: ")
		leia(idadeDias)

		idadeAnos = idadeAnos * 365
		idadeMeses = idadeMeses * 30

		idadeTotal = idadeAnos + idadeMeses + idadeDias
		
		escreva("\nSua idade total em dias �: ", idadeTotal," dias.")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 455; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */