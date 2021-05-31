programa{
	
	inclua biblioteca Util 
	inclua biblioteca Matematica-->Math
	
	funcao inicio(){

		inteiro v[6] = {0, 0, 0, 0, 0, 0}, ma = -1, sum = 0
		
		para(inteiro i = 0; i<10; i++){
			inteiro val = Util.sorteia(0, 5)
			v[val] += 1
			sum += (val+1)
			se(val > ma) ma = val
		}
		
		escreva("\nA média dos valores é: ", sum/10.0)
		escreva("\nA maior pontuação foi de ", ma+1, " e saiu ", v[ma], " vezes.")
		
	}
	
	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 418; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */