programa{

	funcao inicio(){

		real id
		escreva("\nEntre com o índice de poluição: ")
		leia(id)

		se(id < 0.3){
			escreva("\nNenhuma notificação necessária.")	
		}
		senao se(id >= 0.3 e id < 0.4){
			escreva("\nO grupo 1 de empresas deve suspender as suas atividades.")
		}
		senao se(id >= 0.4 e id < 0.5){
			escreva("\nOs grupos 1 e 2 de empresas devem suspender as suas atividades.")
		}
		senao{
			escreva("\nTodos os grupos de empresas devem suspender as suas atividades.")
		}
		
		
	}
	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 238; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */