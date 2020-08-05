programa
{
	
	funcao inicio()
	{
		inteiro C, N, E, SN,ST
		cadeia nome

		escreva("Por favor, insira seu nome: ") 
		leia(nome)		
		escreva("Por favor, insira seu código: ") 
		leia(C)
		escreva("\nOlá, ",nome,", de código: ",C,". Por favor, insira o número de horas trabalhadas: ") 
		leia(N)		

		se (N>50){
			SN = 50*10
			E=(N-50)*20
			ST=SN+E
			escreva("\nSeu salário total é de R$",ST,". Sendo, R$",SN, " referente as horas normais trabalhadas, e R$",E, " referente as horas extras trabalhadas.")
			}
		 senao{
		 	SN = N*10
		 	E=0
		 	escreva("\nSeu salário total é de R$",SN,", e você teve ",E," horas excedentes trabalhadas.")
		 	}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 216; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */