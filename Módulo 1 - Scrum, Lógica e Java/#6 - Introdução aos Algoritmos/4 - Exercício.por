programa{
	inclua biblioteca Matematica-->Math

	funcao inicio(){
		
		real A, B, C
		escreva("\nDigite A: ")
		leia(A)

		escreva("\nDigite B: ")
		leia(B)
		
		escreva("\nDigite C: ")
		leia(C)

		real D = (Math.potencia(A+B, 2.0) + Math.potencia(B+C, 2.0))/2
		escreva("\nD vale: ", D)
		
	}
	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 294; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */