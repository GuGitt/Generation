package Exercicios2;

import java.util.Scanner;

public class Exercicios2{
	
	public static void main (String[] args) {
		
			int totalDias, dia, mes, ano;
			
			Scanner leia= new Scanner(System.in);
			
			System.out.println("H� quantos dias voc� nasceu");
			totalDias =  leia.nextInt();
			
			ano = totalDias / 365;
			mes = (totalDias % 365) / 30;
			dia = (totalDias % 365) % 30;
			
			System.out.println("Voce tem " + totalDias+ " dias que voc� nasceu.");
			
			}	
	}