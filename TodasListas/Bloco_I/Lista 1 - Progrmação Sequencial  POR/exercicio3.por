programa
{
	funcao inicio()
	{
		inteiro eventoTotal, eventoHoras, eventoMinutos, eventoSegundos
		
		escreva("Por favor, insira o tempo do evento em sua f�brica em segundos: ")
		leia(eventoTotal)

		eventoHoras = eventoTotal/ 3600		
		eventoMinutos = (eventoTotal%3600)/ 60
		eventoSegundos = ((eventoTotal%3600)%60)	

		escreva("\nSeu evento tem dura��o de: ",eventoHoras," horas, ",eventoMinutos," minutos e ",eventoSegundos," segundos.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 318; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */