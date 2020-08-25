programa
{
	
	funcao inicio()
	{
		inteiro n

		escreva("Por favor, insira um número: ")
		leia(n)

		se (n>0 e n%2==0){
			escreva("\nO número inserido é positivo e par.")			
			}
		senao se (n<0 e n%2==0){
			escreva("\nO número inserido é negativo e par.")			
			}
		senao se (n>0 e n%2!=0){
			escreva("\nO número inserido é positivo e ímpar.")			
			}
		senao se (n<0 e n%2!=0){
			escreva("\nO número inserido é negativo e ímpar.")			
			}
		senao{
			escreva("\nZero não é positivo nem negativo, porém é par.")
			}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 480; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */