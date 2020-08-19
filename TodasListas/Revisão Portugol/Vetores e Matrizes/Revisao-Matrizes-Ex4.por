programa
{
	inclua biblioteca Util --> u
	
	funcao inicio()
	{
		const inteiro linhas=10, colunas=10
		inteiro matriz[linhas][colunas], l, c, maiorValor=0, cont=0
		cadeia entrada
		
//CRIANDO MATRIZ 
		escreva("Você deseja popular a matriz automaticamente(responda s ou n)?: ")
		leia(entrada)
		limpa()

		se (entrada=="s"){
			para (l=0;l<linhas;l++){
				para (c=0;c<linhas;c++){
					matriz[l][c] = u.sorteia(1, 10)
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
				
//ENCONTRANDO MAIOR VALOR		
		para (l=0;l<linhas;l++){
			
			para (c=0;c<linhas;c++){
				se(maiorValor <= matriz[l][c]){
					maiorValor = matriz[l][c]
				}
			}			
		}		
		escreva("\nO maior valor encontrado na matriz foi: ",maiorValor)
		
//ESCREVER TODAS AS POSIÇÕES DO MAIOR VALOR
		escreva("\n")
		para (l=0;l<linhas;l++){
			
			para (c=0;c<linhas;c++){
				se(maiorValor == matriz[l][c]){
					cont++
				}
			}			
		}

		se(cont>1){
		escreva("\nTodas as posições do maior valor encontrado:\n")
		}
		senao{
		escreva("\nO maior valor encontrado encontra-se em apenas em uma posição:\n")
		}

			para (l=0;l<linhas;l++){			
				para (c=0;c<linhas;c++){
					se(maiorValor == matriz[l][c]){
					escreva("\nLinha: ",l+1,", ")
					escreva("Coluna: ",c+1"\n")
					cont++
				}
			}			
		}
			escreva("\n")		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1505; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */