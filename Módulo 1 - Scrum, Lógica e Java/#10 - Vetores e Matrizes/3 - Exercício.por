programa{
	
	funcao inicio(){

		real N1[4][6], N2[4][6], M1[4][6], M2[4][6]
		inteiro n = 4, m = 6 

		para(inteiro k = 0; k<2; k++){
			para(inteiro i = 0; i<n; i++){
				para(inteiro j = 0; j<m; j++){
					se(k == 0){
						escreva("\nEntre com o valor da linha ", i+1, " e coluna ", j+1, " da matriz N1: ")
						leia(N1[i][j])
					}
					senao{
						escreva("\nEntre com o valor da linha ", i+1, " e coluna ", j+1, " da matriz N2: ")
						leia(N2[i][j])
						M1[i][j] = N1[i][j] + N2[i][j]
						M2[i][j] = N1[i][j] - N2[i][j]
					}
					limpa()
				}
			}
		}

		para(inteiro k = 0; k<2; k++){
			escreva("\n\nMatriz M", k+1, ": \n")
			para(inteiro i = 0; i<n; i++){
				para(inteiro j = 0; j<m; j++){
					se(k == 0){
						escreva(M1[i][j], " ")
					}
					senao{
						escreva(M2[i][j], " ")
					}
				}
				escreva("\n")
			}
		}
		
		
	}
	
	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 168; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */