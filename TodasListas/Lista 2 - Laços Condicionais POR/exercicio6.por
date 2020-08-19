programa
{
	
	funcao inicio()
	{
		inteiro idade

		escreva("Por favor, insira sua idade: ")
		leia(idade)

		se(idade>=5 e idade<=7){
			escreva("\nO(a) nadador(a), se enquadra na categoria: Infantil A.")			
			}			
		senao se(idade>=8 e idade<=11){
			escreva("\nO(a) nadador(a), se enquadra na categoria: Infantil B.")			
			}
		senao se(idade>=12 e idade<=13){
			escreva("\nO(a) nadador(a), se enquadra na categoria: Juvenil A.")			
			} 
		senao se(idade>=14 e idade<=17){
			escreva("\nO(a) nadador(a), se enquadra na categoria: Juvenil B.")			
			}
		senao se(idade>=18){
			escreva("\nO(a) nadador(a), se enquadra na categoria: Adultos.")			
			}			
		senao{
			escreva("\nÉ uma pena, mas o nadador(a) ainda é muito jovem e não se enquandra em nenhuma categoria.")
			}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 464; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */