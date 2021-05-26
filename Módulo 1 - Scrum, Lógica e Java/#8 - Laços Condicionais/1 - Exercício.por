programa{
	
	funcao inicio(){
		
		inteiro P, M = 0, E = 0
		escreva("\nEntre com o peso dos tomates: ")
		leia(P)
		se (P > 50){
			M = (P-50)*4
			E = P-50
		}

		escreva("\nExcesso de tomates: ", E, "kg")
		escreva("\nMulta a pagar: R$", M, ",00")
		
	}
	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 120; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */