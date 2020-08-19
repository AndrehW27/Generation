programa
{
	
	funcao inicio()
	{
		real i

		escreva("Por favor, insira o índice medido: ")
		leia(i)

		se(i>=0.3 e i<0.4){
			escreva("\nAs empresas do grupo 1 devem ser intimadas a suspenderem as atividades.")			
			}			
		senao se (i>=0.4 e i<0.5){
			escreva("\nAs empresas do grupo 1 e 2 devem ser intimadas a suspenderem as atividades.")
			}
		senao se (i>=0.5){
			escreva("\nAs empresas do grupo 1, 2 e 3 devem ser intimadas a suspenderem as atividades.")
			}
		senao{
			escreva("\nNenhuma empresa deve ser intimada a suspendere as atividades.")
			}
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 540; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */