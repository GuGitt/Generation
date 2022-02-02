package fam;

public class AcoesAnima {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Cachorro dog = new Cachorro();
		Cavalo horse = new Cavalo();
		Preguica laziness = new Preguica();
		
		dog.setNome("Pit");
	
		
	
		horse.setNome("Guri");

	
		
		laziness.setNome("Gu");
	
		
		System.out.println("O cachorro "+dog.getNome()+" emite o som: ");
		dog.emitirSom();
		System.out.println("O Cavalo "+horse.getNome()+" emite o som: ");
		horse.emitirSom();
		System.out.println("A Preguiça "+laziness.getNome()+" emite o som: ");
		laziness.emitirSom();
	}
	
}
