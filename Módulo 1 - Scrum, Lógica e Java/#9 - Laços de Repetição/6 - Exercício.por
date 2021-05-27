programa{

	funcao inicio(){

		inteiro n
		escreva("\nEntre com o número: ")
		leia(n)

		inteiro x = 1, sum = 0
		faca{
			sum += x
			x++
		}enquanto(x <= n)

		escreva("\n", sum)

		//sem loop
		escreva("\n", (n*n+n)/2)
		
	}
	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 157; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */