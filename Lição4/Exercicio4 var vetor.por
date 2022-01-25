programa
{
	
	funcao inicio()
	{
		inteiro num[3][3], somaNum=0, somaDiagonal=0, linha, coluna

		para(linha=0;linha<3;linha++)
		{
			para(coluna=0;coluna<3;coluna++)
			{
				escreva("\nEntre com um valor:")
				leia(num[linha][coluna])
				somaNum += num[linha][coluna]

				se(linha==coluna)
				{
					somaDiagonal+=num[linha][coluna]
				}
			}
		}
		escreva("\nSomatório dos valores da Matriz" +somaNum)
		escreva("\nSomatórido dos valores da Matriz"+somaDiagonal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 397; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {num, 6, 10, 3}-{somaNum, 6, 21, 7}-{somaDiagonal, 6, 32, 12};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */