programa
{
	
	funcao inicio()
	{
		inteiro vetor[5], x, maiorvalor=0

		para(x=0;x<=4;x++){
			escreva("Entre com um valor para o vetor: ")
			leia(vetor[x])	
			se(maiorvalor<=vetor[x]){
				maiorvalor = vetor[x]
			}
		}
		limpa()
		para(x=0;x<=4;x++){
			escreva("\nPosição ",x," do vetor, corresponde ao valor: ",vetor[x])
		}
		escreva("\n\nMaior valor do vetor é: ",maiorvalor)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 313; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */