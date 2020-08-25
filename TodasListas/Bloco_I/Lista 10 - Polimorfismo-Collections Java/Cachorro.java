package ListaPolimorfismo;

public class Cachorro extends Animal{
	
	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}

	public void EmitirSom(String nome, String som) {
		System.out.printf("\nO animal "+nome+", que é um cachorro, faz o som: "+som+"\n");
	}

	public void Correr()
	{
		System.out.println("O cachorro corre atrás do gato.");
	}
}
