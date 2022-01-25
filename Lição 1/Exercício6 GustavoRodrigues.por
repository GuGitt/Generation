programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		real x1, y1, x2, y2, calc1, calc2,D

		escreva("Digite o valor x1:")
		leia(x1)
		escreva("Digite o valor x2:")
		leia(x2)
		escreva("Digite o valor y1:")
		leia(y1)
		escreva("Digite o valor y2:")
		leia(y2)

		calc1 = ((x2*x2)-(x1*x1))+((y2*y2)-(y1*y1))
		calc2 = mat.raiz (calc1,2)

		escreva ("A distancia entre os pontos são: ", calc2)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 424; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */