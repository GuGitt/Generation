package fam;

import java.util.Scanner;

public class CondExercicio1 {
	public static void main(String[] args) {
	Scanner leia =  new Scanner(System.in);
		int x, y ,z, maior;
		
		System.out.printf("Digite primeiro número: ");
		x= leia.nextInt();
		System.out.printf("Digite segundo número: ");
		y= leia.nextInt();
		System.out.printf("Digite o terceiro numero: ");
		z= leia.nextInt();
		
		
		if (x > y) {
			maior = x;
		}
		else {
			maior=y;
			}
		System.out.println("O maior número é: " +maior); 
		}
		
}


