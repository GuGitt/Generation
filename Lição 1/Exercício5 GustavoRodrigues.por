programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		real nota1,nota2,nota3,media1,media2
		
		escreva("\nEntre com a nota1: ")
		leia(nota1)
		escreva("\nEntre com a nota2: ")
		leia(nota2)
		escreva("\nEntre com a nota3: ")
		leia(nota3)

		media1 = ((nota1*2)+(nota2*3)+(nota3*5))
		media2 = media1/(2+3+5)
		escreva("Sua média foi de:",media2)

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 380; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */