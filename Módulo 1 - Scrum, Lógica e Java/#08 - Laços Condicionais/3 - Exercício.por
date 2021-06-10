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


		se(C*C - 10000 >= -EPS){
			escreva("\nO quadrado de ", C, " é: ", C*C)
		}
		senao{
			escreva("\nO quadrado de ", A, " é " , A*A, "\nO quadrado de ", B, " é: ", B*B, "\nO quadrado de ", C, " é: ", C*C, "\nO quadrado de ", D, " é: ", D*D)
			
		}

		
	}

	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 341; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */