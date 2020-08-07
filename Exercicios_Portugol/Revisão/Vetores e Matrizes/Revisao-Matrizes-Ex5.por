
//5.	Leia uma matriz 6 x 6, conte e escreva quantos valores maiores que 10 ela possui.

programa
{
	inclua biblioteca Util --> u
	
	funcao inicio()
	{
		const inteiro linhas=6, colunas=6
		inteiro matriz[linhas][colunas], l, c, maior10=0, cont=0
		cadeia entrada
		
//CRIANDO MATRIZ 
		escreva("Você deseja popular a matriz automaticamente(responda s ou n)?: ")
		leia(entrada)
		limpa()

		se (entrada=="s"){
			para (l=0;l<linhas;l++){
				para (c=0;c<linhas;c++){
					matriz[l][c] = u.sorteia(1, 20)
				}
			}
		}
		senao{
			para (l=0;l<linhas;l++){
				para (c=0;c<linhas;c++){
					escreva("\nEntre com o valor para a posição[",l,"][",c,"]: ")
					leia(matriz[l][c])
					limpa()
				}
			}
		
		}
		
//IMPRIMINDO MATRIZ NO CONSOLE	
		escreva("\n\t")
		para (c=0;c<colunas;c++){			
			escreva("C",c+1," ")
		}
		escreva("\n")
		escreva("\n")
			
		para (l=0;l<linhas;l++){
			escreva("   L",l+1,"  ")
			para (c=0;c<linhas;c++){
				escreva("[",matriz[l][c],"]")
			}			
			escreva("\n")
		}
				
//ENCONTRANDO VALORES MAIORES QUE 10, E ESCREVER OS VALORES ACIMA DE !0	
		para (l=0;l<linhas;l++){
			para (c=0;c<linhas;c++){
				se(matriz[l][c]>10){
					escreva("\nValor acima de 10 encontrado: ",matriz[l][c],", posição na matriz: L",l+1," C",c+1)
					cont++				
				}
			}			
		}

		escreva("\n\nQuantidade total de valores acima de 10: ",cont)

	
			escreva("\n")		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1310; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */