programa
{
	inclua biblioteca Util --> u
	
	funcao inicio()
	{
		const inteiro linha = 5, coluna = 7, inicial = 1, final = 10
		inteiro N1[linha][coluna], N2[linha][coluna], l, c, M1[linha][coluna], M2[linha][coluna]

//ENTRADA DE VALORES PARA A MATRIZ N1

		para(l=0;l<linha;l++){			
			
			para(c=0;c<coluna;c++){
				N1[l][c]= [u.sorteia(inicial,final)]				
			}
		}
		limpa()

//ENTRADA DE VALORES PARA A MATRIZ N2

		para(l=0;l<linha;l++){			
			
			para(c=0;c<coluna;c++){
				N2[l][c]= [u.sorteia(inicial,final)]	
			}
		}
		limpa()

//IMPRIMIR A MATRIZ N1

		escreva("\nMatriz N1:")
		escreva("\n")
		para(l=0;l<linha;l++){			
			
			para(c=0;c<coluna;c++){
				escreva("[",N1[l][c],"]")						
			}
			escreva("\n")
		}

//IMPRIMIR A MATRIZ N2

		escreva("\nMatriz N2:")
		escreva("\n")
		para(l=0;l<linha;l++){			
			
			para(c=0;c<coluna;c++){
				escreva("[",N2[l][c],"]")						
			}
			escreva("\n")
		}

//SOMATORIA(criação da matriz M1)
		
		para(l=0;l<linha;l++){			
			
			para(c=0;c<coluna;c++){
				M1[l][c] = N1[l][c]+N2[l][c] 	
			}
		}
		
//IMPRIMIR A MATRIZ M1

		escreva("\nMatriz M1:")
		escreva("\n")
		para(l=0;l<linha;l++){			
			
			para(c=0;c<coluna;c++){
				escreva("[",M1[l][c],"]")						
			}
			escreva("\n")
		}

//DIFERENÇA(criação da matriz M2)
		
		para(l=0;l<linha;l++){			
			
			para(c=0;c<coluna;c++){
				M2[l][c] = N1[l][c]-N2[l][c] 	
			}
		}
		
//IMPRIMIR A MATRIZ M2

		escreva("\nMatriz M2:")
		escreva("\n")
		para(l=0;l<linha;l++){			
			
			para(c=0;c<coluna;c++){
				escreva("[",M2[l][c],"]")						
			}
			escreva("\n")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 356; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */