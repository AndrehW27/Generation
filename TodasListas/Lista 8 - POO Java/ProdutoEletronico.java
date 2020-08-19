package ListaPOO;

public class ProdutoEletronico {

	/*
	1) Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto cliente, 
	defina as instancias deste objeto e apresente as informações deste objeto no console. 
	*/	
	
	private String nome;
	private String fabricante;
	private double preco;
	private int codigo;
	
	public ProdutoEletronico(String nome, String fabricante, double preco, int codigo) {
		this.nome = nome;
		this.fabricante = fabricante;
		this.preco = preco;
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
	
	
	
	/*public ProdutoEletronico (String nome, String sobrenome, int codigo)
	{
		this.primeiroNome = nome;
		this.sobrenome = sobrenome;
		this.codigoCliente = codigo;
	}

	public void imprimirDados() {
		System.out.println("\nNome do cliente: "+primeiroNome+" "+sobrenome+". Código do cliente: "+codigoCliente+".");
	}*/

	
}



	