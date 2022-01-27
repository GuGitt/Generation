package fam;

import java.util.Scanner;

public class WhileExerci4 {

	public static void main(String[] args) {
		int idade, sexo, humor, entrada=150,x=1;
		int pessoaCalma=0, mulheresNervosas=0, homensAgressivos=0, outrosCalmo=0, pNerv40=0, pCalm18=9;
		Scanner leia = new Scanner(System.in);
		
		while(x!=entrada) {
			System.out.println("\t Pesquisa Numero "+x);
			System.out.println("\nDigite a sua idade: ");
			idade=leia.nextInt();
			System.out.println("Digite qual o seu sexo (Digite 1- Feminino / 2 - Masculino / 3 - Outros)");
			sexo=leia.nextInt();
			System.out.println("Digite qual o seu humor predominante:(Digite 1 - Calmo / 2 - Nervoso / 3 - Agressivo)");
			humor = leia.nextInt();
			
			if (humor==1) {
				pessoaCalma++;
			}
			if(sexo==1 && humor==2) {
				mulheresNervosas++;
			}
			if (sexo==2 && humor==3) {
				homensAgressivos++;
			}
			if(sexo==3 && humor==1) {
				outrosCalmo++;
			}
			if(idade>40 && humor==2) {
				pNerv40++;
			}
			if(idade<18 && humor== 1) {
				pCalm18++;
			}
			x++;
		}
		System.out.println("O resultado da pesquisa foi: ");
		System.out.println("\nO número de pessoas calmas são de:"+ pessoaCalma);
		System.out.println("\nO número de mulheres nervosas são de: "+ mulheresNervosas);
		System.out.println("\nO número de homens agressivos são de: " +homensAgressivos);
		System.out.println("\nO número de outros calmos são de: "+outrosCalmo);	
		System.out.println("\nO número de pessoas nervosas com mais de 40 anos são de: " +pNerv40);
		System.out.println("\nO número de pessoas calmas com menos de 18 são de: "+pCalm18);
		
		
}
}