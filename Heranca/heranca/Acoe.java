package heranca;

public class Acoe {
	public static void main(String[]args) {
		Cachorro dog = new Cachorro();
		Cavalo horse = new Cavalo();
		Preguica laziness = new Preguica();
		
		dog.setNome("Frank");
		dog.setIdade(4);
		dog.setSom("Au au");
		dog.setCorrer("*Correndo");
		
		
		horse.setNome("white horse");
		horse.setIdade(10);
		horse.setSom("irrrr");
		horse.setCorrer("*Correndo");
		
		laziness.setNome("Preguicinha");
		laziness.setIdade(5);
		laziness.setSom("ZzZzZzZ");
		laziness.setSubir("*Escalando");
		
	
		
		System.out.println("O nome do cachorro �: "+ dog.getNome());
		System.out.println("A idade do cachorro: "+ dog.getIdade());
		System.out.println("O som do latido do cachorro faz: "+dog.getSom());
		System.out.println("O cachorro deve "+ dog.getCorrer());
		System.out.println("\n\n");
		System.out.println("O nome do cavalo �: "+ horse.getNome());
		System.out.println("A idade do cavalo: "+ horse.getIdade());
		System.out.println("O som do latido que o cavalo faz: "+horse.getSom());
		System.out.println("O cavalo deve "+ horse.getCorrer());
		System.out.println("\n\n");
		System.out.println("O nome do pregui�a �: "+ laziness.getNome());
		System.out.println("A idade do pregui�a: "+ laziness.getIdade());
		System.out.println("O som do latido que o pregui�a faz: "+laziness.getSom());
		System.out.println("O pregui�a deve "+ laziness.getSubir());
		
	}
}
