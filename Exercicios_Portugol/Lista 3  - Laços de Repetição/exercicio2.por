programa
{
	
	funcao inicio()
	{
		inteiro numero, somador

		somador=0
		
	para(numero=1;numero<=500;numero++){			

		se((numero%2)!=0 e (numero%3)==0){
			somador = somador+numero
			escreva("\n Número: ",numero)
			}	
		}
		escreva("\n\nO valor da soma é: ",somador)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 203; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */