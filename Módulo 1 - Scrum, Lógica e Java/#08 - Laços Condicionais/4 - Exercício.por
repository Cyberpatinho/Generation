programa{
	inclua biblioteca Matematica-->Math
	funcao inicio(){

		inteiro A
		escreva("\nEntre com o seu número: ")
		leia(A)

		logico par = (A%2) == 0
		logico pos = (A >= 0)

		escreva("\nO número ", A, " é ")
		se(par){
			escreva("par e ")
		}
		senao{
			escreva("ímpar e ")
		}
		se(pos){
			escreva("positivo.")
		}
		senao{
			escreva("negativo.")
		}
	

	}

	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 368; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */