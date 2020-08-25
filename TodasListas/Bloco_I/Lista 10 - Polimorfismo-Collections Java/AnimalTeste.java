package ListaPolimorfismo;

public class AnimalTeste {

	public static void main(String[] args) {
		
	Cachorro dogzera = new Cachorro("Billy",5);	
	dogzera.EmitirSom(dogzera.getNome(),"Au au");
	dogzera.Correr();
	
	Cavalo cavalinho = new Cavalo("Zeus",15);	
	cavalinho.EmitirSom(cavalinho.getNome(),"IHIHIIII");
	cavalinho.Correr();
	
	Preguica preguica = new Preguica("Sid",20);	
	preguica.EmitirSom(preguica.getNome(),"...?...?");
	preguica.SubirArvores();
		
	}	
}
