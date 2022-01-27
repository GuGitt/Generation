package fam;

import java.util.Scanner;

public class doWhileExercici5 {

	public static void main(String[] args) {
		int n1, soma= 0;
		Scanner leia =  new Scanner(System.in);
		
		do
		{
			System.out.println("Digite um número: ");
			n1 = leia.nextInt();
			
			soma+=n1;
			
		}while(n1!=0);
		System.out.println("A soma dos números são " +soma);
	}

}
