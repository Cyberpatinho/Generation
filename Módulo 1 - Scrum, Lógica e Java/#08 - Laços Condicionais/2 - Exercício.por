programa{
	
	funcao inicio(){
		
		inteiro C, N, S, E = 0
		escreva("\nEntre com o código de funcionário: ")
		leia(C)
		escreva("\nEntre com o número de horas trabalhadas: ")
		
		se(N > 50){
			E = 20*(N-50)
			N = N - 50
		}

		S = N*10

		escreva("\nFuncionário de código: ", C, "\nSalário total: R$", S + E, ",00\nSalário excedente: R$", E, ",00")
	
		
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