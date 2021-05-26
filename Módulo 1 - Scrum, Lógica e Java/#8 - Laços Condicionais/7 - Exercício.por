programa{

	funcao inicio(){

		real b, h
		escreva("\nEntre com a base do triângulo: ")
		leia(b)
		escreva("\nEntre com a altura do triângulo: ")
		leia(h)

		se(b > 0 e h > 0){
			escreva("\nA área do triângulo é: ", (b*h)/2)
		}
		senao{
			escreva("\nTriângulo Inválido!")
		}
		
	}
	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 175; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */