programa
{
	
	funcao inicio()
	{
		inteiro P, M
		cadeia E

		escreva("Por favor, digite o peso dos peixes: ")
		leia(P)

		se (P>50){
			E = "excesso"
			M = (P-50)*4
			escreva("\nVocê excedeu o peso estabelecido pelo regulamento.")
			escreva("\n\nVocê deve pagar uma multa no valor de: R$",M)
		}
		senao{
		M=0	
		P=0
			escreva("Você não excedeu o peso.")
			escreva("\n\nO valor das variáveis são: M = ",M,", P= ",P,".")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 416; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */