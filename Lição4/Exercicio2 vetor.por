programa
{
	
	funcao inicio()
	{		real soma=0.0
		 	inteiro vet[10], media=0, maiorP=0, cont
		 	

			para(cont=0;cont<10;cont++)
			{
			
			escreva("Digite os valores: ")
			leia(vet[cont])

			//Calculo média
			soma+=vet[cont]
			media=soma/10

			se(vet[cont]>maiorP){
				maiorP=vet[cont]
			}
		}
		escreva("\nMédia aritmética: "+media)
		escreva("\nMaior média: "+maiorP)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 97; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */