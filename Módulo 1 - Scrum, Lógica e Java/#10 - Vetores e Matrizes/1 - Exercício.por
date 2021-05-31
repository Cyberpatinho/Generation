programa{

	funcao inicio(){
		
		real v[5], ma = -2000000000.0
		para(inteiro i = 0; i<5; i++){
			escreva("\nEntre com o ", i+1, "° valor: ")
			leia(v[i])
			limpa()
			se(v[i] > ma) ma = v[i]
		}

		para(inteiro i = 0; i<5; i++){
			escreva(v[i], " ")
		}
		escreva("\nO maior valor no vetor é: ", ma) 

	}
	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 63; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */