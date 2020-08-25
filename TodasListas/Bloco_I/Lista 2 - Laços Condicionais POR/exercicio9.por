programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		cadeia s
		real h, p		

		escreva("Por favor, insira seu sexo(homem, mulher ou outro): ")
		leia(s)
		escreva("Por favor, insira sua altura: ")
		leia(h)

		se (s=="homem" e h>0){
			p = (72.7*h)-58
			escreva("\nSeu peso ideal é: ",mat.arredondar(p,2),"Kg.")
			}
		senao se (s=="mulher" e h>0){
			p = (62.1*h)-58
			escreva("\nSeu peso ideal é: ",mat.arredondar(p,2),"Kg.")
			}
		senao se (s=="outro" e h>0){
			escreva("\nPor favor, começe novamente e insira com qual biotipo seu corpo se assemelha mais, homem ou mulher.")
			}
		senao{
			escreva("\nValores inseridos incorretamente, por favor verificar e tentar novamente.")
			}		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 528; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */