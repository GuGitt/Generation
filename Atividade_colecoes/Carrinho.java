package mais;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;



public class Carrinho {
	public static void main(String[]args, char[] listaElementos) {
		List<Integer> lista =  new ArrayList<Integer>();
		
		lista.add(2);
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(1);
		lista.add(2);
		lista.add(5);
		
		for(Integer listaElementos:lista) {
			System.out.println(listaElementos);
		}
		System.out.println("\nRemovendo um elemnto da lista...");
		System.out.println();
		
		lista.remove(0); 
		
		for(Integer listaElemento:lista) {
			
			System.out.println(listaElementos);
		}
		int primeiroElemento = lista.get(0);
		System.out.println("\nO primeiro elemento é: "+primeiroElemento);
		System.out.println();
		
		
		
		for(int i=0;i<lista.size();i++) { 
			System.out.println("\n Elemento: "+lista.get(i));
			}
		Collections.sort(lista); 
		System.out.println("\nDepois de ordenado...");
		System.out.println(lista);
		
		Set <Integer> meuSet = new HashSet <Integer> (); 
		
		meuSet.add(1);
		meuSet.add(3);
		meuSet.add(1);
		meuSet.add(3);
		meuSet.add(2);
		meuSet.add(5);
		
		
		
		Iterator <Integer> iMeuSet = meuSet.iterator();
		
		while(iMeuSet.hasNext()) {  
			
			System.out.println(iMeuSet.next());
		}
	}

}
