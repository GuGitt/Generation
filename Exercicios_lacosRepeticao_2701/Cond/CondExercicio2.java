package fam;

import java.util.Scanner;

public class CondExercicio2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a , b, c;
		
		System.out.print("Primeiro inteiro: ");
		a = ler.nextInt();
		System.out.println("Segundo inteiro: ");
		b = ler.nextInt();
		System.out.println("Terceiro inteiro: ");
		c = ler.nextInt();
		
		if(a < b ) {
			if(b < c) {
				System.out.println(a+"\n" +b+"\n"+c);
			}
			else if (a<c) {
				System.out.println(a+"\n"+c+"\n"+b);
			} else {
				System.out.println(c+"\n"+a+"\n"+b);
			}
		}
		else if (b<c) {
			if(a<c) {
				System.out.println(b+"\n"+a+"\n"+c);
			} else {
				System.out.println(b+"\n"+c+"\n"+a);
				}
			} else {
				System.out.println(c+"\n"+b+"\n"+a);
			}
	}
}