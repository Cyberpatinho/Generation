programa{

	funcao inicio(){

		real A, B, C, D, EPS = 0.0000001 

		escreva("\nEntre com o primeiro número: ")
		leia(A)
		escreva("\nEntre com o segundo número: ")
		leia(B)
		escreva("\nEntre com o terceiro número: ")
		leia(C)
		escreva("\nEntre com o quarto número: ")
		leia(D)
		
		A = A*A
		B = B*B
		C = C*C
		D = D*D

		se(C - 10000 >= -EPS){
			escreva("\nO valor de C é: ", C)
		}
		senao{
			escreva("\nO valor de A é: ", A, "\nO valor de B é: ", B, "\nO valor de C é: ", C, "\nO valor de D é: ", D)
			
		}

		
	}

	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 286; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */