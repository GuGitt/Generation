programa
{
	
	funcao inicio()
	{
		inteiro totaldias, a, m, d

		escreva("\nEntre com o total de dias vividos: ")
		leia(totaldias)

		a = totaldias / 365
		m = (totaldias % 365) / 30
		d = (totaldias % 365) % 303

		 escreva("\nVocê viveu: "+a+" ano(s), "+m+" meses e"+d+" dias de vida...")
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