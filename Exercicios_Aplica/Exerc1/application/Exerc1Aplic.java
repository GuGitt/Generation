package application;

import entities.Cliente;

public class Exerc1Aplic {
	public static void main(String[]args) {
		
		Cliente Ale = new Cliente("Alessandro Castro", 1.81,93);
		Cliente Fer = new Cliente("Fer Godô", 1.70,93);
		
		double imc= Ale.getPeso() / (Ale.getAltura()* Ale.getAltura());
		
		double imc1= Fer.getPeso() / (Fer.getAltura()* Fer.getAltura());
		
		System.out.println("O cliente " +Ale.getName()+" tem o IMC de: " +Ale.imc());
		System.out.println("O cliente " +Fer.getName()+" tem o IMC de: " +Fer.imc());
	}
	}
