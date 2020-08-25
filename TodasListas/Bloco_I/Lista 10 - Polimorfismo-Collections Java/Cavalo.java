package ListaPolimorfismo;

public class Cavalo extends Animal{
	
	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}

	public void EmitirSom(String nome, String som) {
		System.out.printf("\nO animal "+nome+", que é um cavalo, faz o som: "+som+"\n");
	}
	
	public void Correr()
	{
		System.out.println("O cavalo corre nas pradarias.");
	}
}
