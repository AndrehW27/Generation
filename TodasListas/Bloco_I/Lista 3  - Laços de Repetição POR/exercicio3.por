programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		real numero, soma, media=0, contador=1

		escreva("Olá, por favor entre com um número: ")
		leia(numero)
		limpa()
		soma=numero

			enquanto(numero>0){
			escreva("Olá, por favor entre com um número: ")
			leia(numero)
			limpa()
			se (numero>0){
				soma=soma+numero
				contador=contador+1	
				media = soma/contador					
				}		
			}

			escreva("\nA quantidade de números inseridos foi: ",contador)
			escreva("\nA somatória destes valores é: ",soma)
			escreva("\nA média desses valores é: ",mat.arredondar(media, 2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 437; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {numero, 6, 7, 6}-{soma, 6, 15, 4}-{media, 6, 21, 5}-{contador, 6, 30, 8};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */