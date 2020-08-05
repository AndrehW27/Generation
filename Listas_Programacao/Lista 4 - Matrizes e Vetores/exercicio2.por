programa
{
	inclua biblioteca Util	--> u	
	
	funcao inicio()
	{
		inteiro dado[10], x, maiorvalor=0, contador=0
		real somatoria = 0.0, media=0.0
		

		para(x=0;x<=9;x++){
			dado[x] = u.sorteia(1,6)		
			escreva("\nLançamento [",x+1,"]: ",dado[x])
			
			se(maiorvalor<=dado[x]){
				maiorvalor = dado[x]				
			}			

			somatoria = somatoria+dado[x]			
		}	
		para(x=0;x<=9;x++){
			se(maiorvalor==dado[x]){
			contador++
			}
		}		
				
		media = somatoria/10
		
		escreva("\n\nO maior valor lançado no dado foi: ",maiorvalor)
		escreva("\n\nO número de vezes que o maior valor lançado apareceu é: ",contador)
		escreva("\n\nA média de todos os valores lançados é: ",media)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 198; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */