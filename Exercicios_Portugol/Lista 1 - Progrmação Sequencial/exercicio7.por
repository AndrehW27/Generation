programa
{
	funcao inicio()
	{
		real a, b, c, d, E, f, x, y, eq1, eq2
		
		escreva("Por favor, insira o valor da vari�vel a: ")
		leia(a)
		escreva("Por favor, insira o valor da vari�vel b: ")
		leia(b)
		escreva("Por favor, insira o valor da vari�vel c: ")
		leia(c)
		escreva("Por favor, insira o valor da vari�vel d: ")
		leia(d)
		escreva("Por favor, insira o valor da vari�vel e: ")
		leia(E)
		escreva("Por favor, insira o valor da vari�vel f: ")
		leia(f)

		x= ((c*E) - (b*f))/((a*E) - (b*d))
		y= ((a*f) - (c*d))/((a*E) - (b*d))
		eq1 = a*x + b*y 
		eq2 = d*x + E*y

		escreva("\nO valor de x �: ",x)
		escreva("\nO valor de y �: ",y)

		escreva("\n\nO valor inserido de c �: ",c)
		escreva("\nO valor inserido de f �: ",f)

		escreva("\n\nEqua��o1 -> a*x + b*y = ",eq1," = c, portanto a equq��o 1 � v�lida: ",eq1==c)
		escreva("\nEqua��o2 -> d*x + E*y = ",eq2," = f, portanto a equq��o 2 � v�lida: ",eq2==f)
		
			}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 733; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */