package project;

import java.util.Scanner;

public class project {
	
	public static void main(String[] args) {
		
		int dia, mes, ano, totaldias;
		
		Scanner leia= new Scanner(System.in);
			
				System.out.println("Escreva os anos: ");
				ano = leia.nextInt();
				
				System.out.println("Escreva os anos: ");
				mes = leia.nextInt();
				
				System.out.println("Escreva os anos: ");
				dia = leia.nextInt();
				
				ano = ano * 365;
				mes = mes * 30;
				
				totaldias = ano + mes + dia;
				
				System.out.println("Fazem: " + totaldias + "dias que você nasceu!");
				
	}
}
