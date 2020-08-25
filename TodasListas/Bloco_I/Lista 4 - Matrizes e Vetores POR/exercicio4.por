programa
{
	
	funcao inicio()
	{
		inteiro linha=5, coluna=5, matriz[5][5], l, c, somatoria=0, diagonal

		para(l=0;l<linha;l++){			
			
			para(c=0;c<coluna;c++){
				escreva("Entre com um valor para a matriz: ")
				leia(matriz[l][c])	
				somatoria = somatoria+matriz[l][c]
			}
		}
		limpa()

		
		para(l=0;l<linha;l++){			
			
			para(c=0;c<coluna;c++){
				escreva("[",matriz[l][c],"]")						
			}
			escreva("\n")
		}

		diagonal = matriz[0][0]+matriz[1][1]+matriz[2][2]

		
		escreva("\nA somatória da diagonal da matriz é: ",diagonal)	
		escreva("\n\nA somatória de todos os valores da matriz é: ",somatoria)	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 73; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */