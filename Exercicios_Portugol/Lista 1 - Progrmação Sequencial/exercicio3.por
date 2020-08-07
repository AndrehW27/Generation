programa
{
	funcao inicio()
	{
		inteiro eventoTotal, eventoHoras, eventoMinutos, eventoSegundos
		
		escreva("Por favor, insira o tempo do evento em sua fábrica em segundos: ")
		leia(eventoTotal)

		eventoHoras = eventoTotal/ 3600		
		eventoMinutos = (eventoTotal%3600)/ 60
		eventoSegundos = ((eventoTotal%3600)%60)	

		escreva("\nSeu evento tem duração de: ",eventoHoras," horas, ",eventoMinutos," minutos e ",eventoSegundos," segundos.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 318; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */