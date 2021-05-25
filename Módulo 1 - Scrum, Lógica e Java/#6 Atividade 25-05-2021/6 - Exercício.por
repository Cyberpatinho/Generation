programa{
	inclua biblioteca Matematica-->Math
	
	funcao inicio(){
		real x1, y1, x2, y2
		escreva("\nDigite o valor de x1: ")
		leia(x1)

		escreva("\nDigite o valor de y1: ")
		leia(y1)

		escreva("\nDigite o valor de x2: ")
		leia(x2)

		escreva("\nDigite o valor de y1: ")
		leia(y2)
		
		escreva("\nA distância entre os pontos é: ", Math.raiz(Math.potencia(x2-x1, 2.0) + Math.potencia(y2-y1, 2.0), 2.0)) 
		
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