programa
{
	
	funcao inicio()
	{
		inteiro n1[4][6], n2[4][6], m1[4][6], m2[4][6],co,li
		

		para(li=0;li<4;li++){
			para(co=0;co<6;co++){

				escreva("\nLeia os valores do N1: ")
				leia(n1[1][co])
				escreva("\nLeia os valores do N2: ")
				leia(n2[1][co])

				m1[li][co]= n1[li][co] + n2[li][co]
				m2[li][co]= n2[li][co] - n2[li][co]
				
			}
		}
		para(li=0;li<4;li++){
			para(co=0;co<6;co++){
				escreva("\nSoma: "+m1[li][co])
				escreva("\nDiferença: " +m2[li][co])
			}
	}
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 269; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */