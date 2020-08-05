programa
{
		
	funcao inicio()
	{
		real notaA, notaB, mp
		cadeia nome
		inteiro x=1

		enquanto(x<=5){
			escreva("Entre com o seu nome: ")
			leia(nome)			
			escreva("Entre com a nota A: ")
			leia(notaA)
			enquanto(notaA>10 ou notaA<0){
				escreva("Entre novamente com a nota A: ")
				leia(notaA)
			}			
			escreva("Entre com a nota B: ")
			leia(notaB)
			enquanto(notaB>10 ou notaB<0){
				escreva("Entre novamente com a nota B: ")
				leia(notaB)
			}
			mp = (notaA+(notaB*2))/3
			escreva("\nAluno: ",nome)
			escreva("\nMédia ponderada: ",mp)
			x++			
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 89; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */