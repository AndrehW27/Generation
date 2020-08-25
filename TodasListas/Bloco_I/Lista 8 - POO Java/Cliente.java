package ListaPOO;

public class Cliente {

	/*
	1) Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto cliente, 
	defina as instancias deste objeto e apresente as informações deste objeto no console. 
	*/	
	
	private String primeiroNome;
	private String sobrenome;
	private int codigoCliente;
	
	
	public Cliente (String nome, String sobrenome, int codigo)
	{
		this.primeiroNome = nome;
		this.sobrenome = sobrenome;
		this.codigoCliente = codigo;
	}

	public void imprimirDados() {
		System.out.println("\nNome do cliente: "+primeiroNome+" "+sobrenome+". Código do cliente: "+codigoCliente+".");
	}

	
}



	