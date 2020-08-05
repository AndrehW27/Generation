programa
{
	inclua biblioteca Util --> u
	
	funcao inicio()
	{
		const inteiro tamanho=10
		inteiro vetor[tamanho], pos, cont=0, find_pos=0

//CRIAR O VETOR AUTOMATICAMENTE
		para(pos=0;pos<tamanho;pos++){
			vetor[pos] = u.sorteia(-10,10)			
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

//ENCONTRAR NUMEROS NEGATIVOS
		para(pos=0;pos<tamanho;pos++){
				se(vetor[pos]<0){
					vetor[pos]=0
					cont++
					escreva("\nFoi encontrado um número negativo na posição: ",pos)					
					}		
			}
			escreva("\n")
			escreva("\nFoi encontrado um total de ",cont," números negativos.")
			escreva("\n\n")

//REESCEVENDO NO CONSOLE O NOVO VETOR

	se(cont!=0){
		escreva("NOVO VETOR")
		escreva("\n\n")

			
			escreva("Vetor = [")
		para(pos=0;pos<tamanho;pos++){
			escreva(" ",vetor[pos]," ")			
			}
			escreva("]\n")
		
		para(pos=0;pos<tamanho;pos++){
			escreva("\nPosição [",pos,"]: ",vetor[pos])			
			}

	{	
		
	}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 910; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */