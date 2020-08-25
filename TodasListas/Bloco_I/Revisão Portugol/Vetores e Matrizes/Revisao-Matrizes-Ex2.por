programa
{
	inclua biblioteca Util --> u
	
	funcao inicio()
	{
		const inteiro tamanho=40
		inteiro vetor[tamanho], pos, cont=0, find_pos=0

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
		escreva("\n")
			
//ENCONTRAR POSIÇÀO DE X COM VALORES DO VETOR, E IMPRIMIR POSIÇÕES
		para(pos=0;pos<tamanho;pos++){
				se((vetor[pos]%2)==0){
					cont++
					find_pos=pos	
					escreva("\nUm valor par apareceu na posição: ",find_pos)								
				}
			}

//IMPRIMIR QUANTOS NUMEROS PARES APARECERAM
		escreva("\n\nNo total, apareceu ",cont," número(s) par(es) dentro deste vetor.")
				
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 399; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */