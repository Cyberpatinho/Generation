programa{

	funcao inicio(){

		real M[3][3], ans1 = 0.0, ans2 = 0.0
		para(inteiro i = 0; i<3; i++){
			para(inteiro j = 0; j<3; j++){
				escreva("\nEntre com o valor da linha ", i+1, " e coluna ", j+1, ": ")
				leia(M[i][j])
				ans1 += M[i][j]
				se(i == j){
					ans2 += M[i][j]
				}
				limpa()
			}
		}

		escreva("\nA soma dos elementos da matriz é: ", ans1)
		escreva("\nA soma dos elementos da diagonal principal é: ", ans2)
		
	}

	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 303; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */