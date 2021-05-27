programa{

	inclua biblioteca Matematica-->Math
	
	funcao inicio(){

		real totS = 0.0, totF = 0.0, maxS = -1.0, n100 = 0.0

		para(inteiro i = 0; i<5; i++){
			real temp
			escreva("\nEntre com o salário: ")
			leia(temp)
			totS = totS + temp
			maxS = Math.maior_numero(maxS, temp)
			se(temp >= 100){
				n100++
			}
			escreva("\nEntre com o número de filhos: ")
			leia(temp)
			totF = totF + temp
			limpa()
		}

		escreva("\nA média salárial da cidade é: R$", Math.arredondar(totS/20, 2))
		escreva("\nA média do número de filho na cidade é: ", Math.arredondar(totF/20, 2))
		escreva("\nO maior salário na cidade é: R$", Math.arredondar(maxS, 2))
		escreva("\nO percentual de pessoas ganhando acima de R$100,00 na cidade é de: ", n100/20*100, "%")
	}
	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 745; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */