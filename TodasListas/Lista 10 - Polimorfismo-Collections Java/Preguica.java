package ListaPolimorfismo;

public class Preguica extends Animal{
	
	public Preguica(String nome, int idade) {
		super(nome, idade);
	}

	public void EmitirSom(String nome, String som) {
		System.out.printf("\nO animal "+nome+",  que � um cachorro, faz o som: "+som+"\n");
	}
	
	public void SubirArvores()
	{
		System.out.println("A pregui�a demora, mas sobe a �rvore...");
	}
}
