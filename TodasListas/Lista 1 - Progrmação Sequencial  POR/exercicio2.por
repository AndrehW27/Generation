programa
{
	funcao inicio()
	{
		inteiro idadeTotal, idadeAnos, idadeMeses, idadeDias		
		
		escreva("Por favor, insira sua idade total em dias: ")
		leia(idadeTotal)

		idadeAnos = idadeTotal / 365		
		idadeMeses = (idadeTotal%365)/ 30
		idadeDias = ((idadeTotal%365)%30)
		
		escreva("\nSua idade � de: ",idadeAnos," anos, ",idadeMeses," meses e ",idadeDias," dias.")		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 64; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */