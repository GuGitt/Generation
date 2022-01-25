programa
{
	
	funcao inicio()
	{
		real nota1, nota2, nota3,media

		escreva("Entre com a nota 1: ")
		leia(nota1)
		escreva("Entre com a nota 2: ")
		leia(nota2)
		escreva("Entre com a nota 3: ")
		leia(nota3)

		media = (nota1+nota2+nota3)/3

		escreva("\nMédia aritmética do aluno foi de: ")

		se(media>=7.0 e media <=10.0)
		{
			escreva("\nAluno Aprovado")
		}
		senao se (media>=5.0 e media < 7.0)
		{
				escreva("\nAluno de Exame!!")	
		}
		senao se (media>=0.0 e media <5.0)
		{
			escreva("\n Aluno foi Reprovado!!")
		}
		senao
		{
			escreva("\nMédia fora do intervalo aceitável...")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 367; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */