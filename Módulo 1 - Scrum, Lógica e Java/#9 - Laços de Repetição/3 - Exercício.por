programa{
	
	inclua biblioteca Matematica-->Math
	funcao inicio(){

		inteiro cnt = 0, in
		real sum = 0.0, aux

		escreva("Digite um número positivo para continuar: ")
		leia(in)
		enquanto(in > 0){
			escreva("\nEntre com o seu valor: ")
			leia(aux)
			sum = sum + aux
			cnt++
			limpa()
			escreva("Digite um número positivo para continuar: ")
			leia(in)
		}

		escreva("\nO somatório foi: ", Math.arredondar(sum, 2))
		escreva("\nA média dos valores lidos foi: ", Math.arredondar(sum/(cnt*1.0), 2))
		escreva("\nA quantidade de valores lidos foi: ", cnt)
		
	}

	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 291; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */