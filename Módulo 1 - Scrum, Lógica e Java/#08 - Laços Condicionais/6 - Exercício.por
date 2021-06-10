programa{

	funcao inicio(){

		inteiro id
		escreva("\nEntre com a idade: ")
		leia(id)

		se(id < 5){
			escreva("\nNadador muito jovem.")
		}
		senao se(id >= 5 e id <= 7){
			escreva("\nA classificação do nadador é: Infantil A")
		}
		senao se(id > 7 e id <= 11){
			escreva("\nA classificação do nadador é: Infantil B")
		}
		senao se(id > 11 e id <= 13){
			 escreva("\nA classificação do nadador é: Juvenil A")
		}
		senao se(id > 13 e id <= 17){
			 escreva("\nA classificação do nadador é: Juvenil B")
		}
		senao{
			escreva("\nA classificação do nadador é: Adultos")
		}
		
	}

	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 565; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */