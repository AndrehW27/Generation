programa
{
	funcao inicio()
	{
		real a, b, c, d, E, f, x, y, eq1, eq2
		
		escreva("Por favor, insira o valor da variável a: ")
		leia(a)
		escreva("Por favor, insira o valor da variável b: ")
		leia(b)
		escreva("Por favor, insira o valor da variável c: ")
		leia(c)
		escreva("Por favor, insira o valor da variável d: ")
		leia(d)
		escreva("Por favor, insira o valor da variável e: ")
		leia(E)
		escreva("Por favor, insira o valor da variável f: ")
		leia(f)

		x= ((c*E) - (b*f))/((a*E) - (b*d))
		y= ((a*f) - (c*d))/((a*E) - (b*d))
		eq1 = a*x + b*y 
		eq2 = d*x + E*y

		escreva("\nO valor de x é: ",x)
		escreva("\nO valor de y é: ",y)

		escreva("\n\nO valor inserido de c é: ",c)
		escreva("\nO valor inserido de f é: ",f)

		escreva("\n\nEquação1 -> a*x + b*y = ",eq1," = c, portanto a equqção 1 é válida: ",eq1==c)
		escreva("\nEquação2 -> d*x + E*y = ",eq2," = f, portanto a equqção 2 é válida: ",eq2==f)
		
			}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 575; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */