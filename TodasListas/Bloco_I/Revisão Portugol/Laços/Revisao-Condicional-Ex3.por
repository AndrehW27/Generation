/*
3- Faça um programa que compute quantos são os múltiplos de 2, de 3 e de 5 entre 1 e 100;  
compute também quantos são os números múltiplos de 2, 3 e 5 ao mesmo tempo. 
*/
programa
{
	
	funcao inicio()
	{
		inteiro x, cont2 = 0, cont3 = 0, cont5 = 0, contall=0

		escreva("\nMúltiplos de 2 entre 1 e 100: ")
		para(x=1;x<=100;x++){
			se((x%2)==0){
				cont2++
				escreva(" ",x," ")
			}
		}
		escreva("\nA quantidade total de múltiplos de 2: ",cont2)

		escreva("\n\nMúltiplos de 3 entre 1 e 100: ")
		para(x=1;x<=100;x++){
			se((x%3)==0){
				cont3++
				escreva(" ",x," ")
			}
		}
		escreva("\nA quantidade total de múltiplos de 3: ",cont3)

		escreva("\n\nMúltiplos de 5 entre 1 e 100: ")
		para(x=1;x<=100;x++){
			se((x%5)==0){
				cont5++
				escreva(" ",x," ")
			}
		}
		escreva("\nA quantidade total de múltiplos de 5: ",cont5)

		escreva("\n\nMúltiplos de 2, 3 e 5 entre 1 e 100: ")
		para(x=1;x<=100;x++){
			se((x%2)==0 e (x%3)==0 e (x%5)==0){
				contall++
				escreva(" ",x," ")
			}
		}
		escreva("\nA quantidade tota de múltiplos de 2, 3 e 5 é: ",contall,"\n")		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1065; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */