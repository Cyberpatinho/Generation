programa{
	
	funcao inicio(){
		
		inteiro segundos
		escreva("\nDigite quantos segundos: ")
		leia(segundos)
		
		inteiro horas = segundos/3600
		segundos = segundos%3600

		inteiro minutos = segundos/60
		segundos = segundos%60

		escreva("\nA duração foi de ", horas, " hora(s), ", minutos, " minuto(s) e ", segundos, " segundo(s).")
		 
		
	}

	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 323; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */