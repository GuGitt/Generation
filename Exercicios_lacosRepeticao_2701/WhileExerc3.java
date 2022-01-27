/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)
*/


package fam;

import java.util.Scanner;

public class WhileExerc3 {

	public static void main(String[] args) {
	
		int idade, x, y ;
		idade=0;
		x= 0;
		y= 0;
		Scanner leia = new Scanner(System.in); 	
		
		System.out.printf("Digite a sua idade: ");
		idade = leia.nextInt();
		
		while(idade!=99)
		{
			System.out.printf("informe a idade: "); 
			idade = leia.nextInt();
			
			if(idade<=21)
			{
				x++;
			}
			if(idade>=50)
			{
				y++;
			}
		}
		System.out.println("\nA quantidade de pessoas menores de 21 anos são: " +x);
		System.out.println("\nA quantidade de pessoas maiores de 50 anos são: " +y);
	}

}
