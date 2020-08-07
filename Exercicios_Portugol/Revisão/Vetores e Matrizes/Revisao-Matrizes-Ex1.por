programa
{
	inclua biblioteca Util --> u
	
	funcao inicio()
	{
		const inteiro tamanho=20
		inteiro vetor[tamanho], pos, X=u.sorteia(1,10), cont=0, find_pos=0

//IMPRIMIR X
		escreva("Valor de X : ",X)
		escreva("\n\n")

//CRIAR O VETOR AUTOMATICAMENTE
		para(pos=0;pos<tamanho;pos++){
			vetor[pos] = u.sorteia(1,10)			
			}
			
//VISUALIZAR NO CONSOLE O VETOR
		
			escreva("Vetor = [")
		para(pos=0;pos<tamanho;pos++){
			escreva(" ",vetor[pos]," ")			
			}
			escreva("]\n")

		para(pos=0;pos<tamanho;pos++){
			escreva("\nPosição [",pos,"]: ",vetor[pos])			
			}

//COMPARAR VALOR DE X COM VALORES DO VETOR
		para(pos=0;pos<tamanho;pos++){
				se(X==vetor[pos]){
					cont++				
				}
			}
		escreva("\n")
		
//ENCONTRAR POSIÇÀO DE X COM VALORES DO VETOR, E IMPRIMIR POSIÇÕES
		para(pos=0;pos<tamanho;pos++){
				se(X==vetor[pos]){
					find_pos=pos	
					escreva("\nA variável X = ",X,", apareceu na posição:",find_pos)								
				}
			}			
			
//IMPRIMIR CONTADOR	
		escreva("\n\nO valor de X = ",X,", apareceu ",cont," vezes dentro do vetor.")
		
					
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 476; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */