programa
{
	
	funcao inicio()
	{
	inteiro habitantes,  filhos, cont100=0
	real salario, soma_sal = 0, soma_fil = 0, media_sal, media_fil, maiorsal=0.0, porc

	para(habitantes=1;habitantes<=2;habitantes++){
		escreva("\n\nOlá, por favor, entre com o valor do seu salário R$:")
		leia(salario)		
		escreva("Por favor, entre com o número de filhos que você tem: ")
		leia(filhos)
		soma_sal = soma_sal+salario	
		soma_fil = soma_fil+filhos

			se(maiorsal<salario){
				maiorsal=salario			
				}
			se(salario<=100){
					cont100++			
				}
		
		}

		habitantes = habitantes-1
		escreva("\n\nNúmero de habitantes: ",habitantes)
		media_sal = soma_sal/habitantes
		media_fil = soma_fil/habitantes
		porc = (cont100*100)/habitantes
		
	
	escreva("\n\na) Média salarial R$:",media_sal)		
	escreva("\n\nb) Média do número de filhos: ",media_fil)
	escreva("\n\nc) Maior salário: ",maiorsal)	
	escreva("\n\nd) Porcentagem de pessoas com salário até R$100: ",porc,"%")	
	
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 923; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {habitantes, 6, 9, 10};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */