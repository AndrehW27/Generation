programa
{
	inclua biblioteca Matematica --> mat 
	
	funcao inicio()
	{
			inteiro A, B, C, R, S
			real D

			escreva("Por favor, insira um valor para A: ")
			leia(A)
			escreva("Por favor, insira um valor para B: ")
			leia(B)
			escreva("Por favor, insira um valor para C: ")
			leia(C)


			se(A>=0 e B>=0 e C>=0) {
			
				R = mat.potencia((A+B), 2.0)
				S = mat.potencia((B+C), 2.0)
				D = (R+S)/2
	
				escreva("\nO valor de D �: ",D)			
				}
			
			
			senao {
				escreva("\nErro! Por favor insira somente n�meros inteiros e positivos.")
				}		
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 548; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */