/*- 1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:  
a) média do salário da população;
b) média do número de filhos;
c) maior salário;
d) percentual de pessoas com salário até R$100,00.


*/
programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		inteiro i, x=20, nFilhos=0, totalFilhos=0, mediaFilhos=0, cont=0,porcentSal=0
		real salario, totalSalario=0.0, mediaSalario=0.0, maiorSalario=0.0
	 	
	
		para (i=0;i<x;i++){
		
			escreva("\nEntre com seu salário: ")
			leia(salario)
		
			escreva("\nEntre com número de Filhos: ")
			leia(nFilhos)

			totalSalario += salario
			mediaSalario = totalSalario / x

			totalFilhos += nFilhos
			mediaFilhos = totalFilhos / x		

			se (salario> maiorSalario){
				maiorSalario = salario		
			}
			se (salario <= 100){
				cont++				
			}
			porcentSal = cont * 100 / x
		}
		
		escreva("\nA média do salário da cidade é: R$ " +mat.arredondar (mediaSalario,2))
		escreva("\nA média de filhos da cidade é: " +mat.arredondar (mediaFilhos,2))
		escreva("\nO maior salário da cidade é: R$ " + maiorSalario)
		escreva("\nPorcentual de pessoas com salario abaixo de 100$: " +mat.arredondar (porcentSal,2) + "%")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1282; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */