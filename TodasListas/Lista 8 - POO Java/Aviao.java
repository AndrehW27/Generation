package ListaPOO;

public class Aviao {

	/*
	1) Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto cliente, 
	defina as instancias deste objeto e apresente as informações deste objeto no console. 
	*/	
	
	private String modelo;
	private String capacidade;
	private String localAtual;
	private String destino;	
	private int alturaAtual;
	private int velocidadeAtual;
	private int nivelCombustivel;
	private double tempoPrevisto;
	private double tempoDecorrido;

	//CONSTRUTOR
	public Aviao (String modelo, String capacidade, String local, String destino, int altura, int velocidade, int combustivel, double previsto, double decorrido)
	{
		this.modelo = modelo;
		this.capacidade = capacidade;
		this.localAtual = local;
		this.destino = destino;
		this.alturaAtual = altura;
		this.velocidadeAtual = velocidade;
		this.nivelCombustivel = combustivel;
		this.tempoPrevisto = previsto;
		this.tempoDecorrido = decorrido;
	}

	public void imprimirInfo() {
		System.out.println("\n***INFORMAÇÕES SOBRE O VÔO***");
		System.out.println("\nModelo: "+modelo);
		System.out.println("Capacidade: "+capacidade+" passageiros");
		System.out.println("Local atual: "+localAtual);
		System.out.println("Destino: "+destino);
		System.out.println("Altura Atual: "+alturaAtual+" pés");
		System.out.println("Velocidade Atual: "+velocidadeAtual+" Km/h");
		System.out.println("Nível de combustível: "+nivelCombustivel+"%");
		System.out.println("Tempo previsto: "+tempoPrevisto+" horas");
		System.out.println("Tempo decorrido: "+tempoDecorrido+" horas");
	}

//ALTERAR TEMPO DECORRIDO
	public void setTempoDecorrido(double horas) {
		double novoTempo = this.tempoDecorrido+horas;
		this.tempoDecorrido = novoTempo;		
	}
//VERIFICAR TEMPO DECORRIDO
	public void getTempoDecorrido() {
		System.out.println("Tempo decorrido: "+tempoDecorrido+" horas");		
	}
//ALTERAR LOCAL ATUAL
	public void setLocalAtual(String estado) {
		this.localAtual = estado;		
	}
//VERIFICAR LOCAL ATUAL
	public void getLocalAtual() {
		System.out.println("Local Atual: "+localAtual);		
	}
//ALTERAR ALTURA
	public void setAlturalAtual(int pes) {
		this.alturaAtual = pes;		
	}
//VERIFICAR ALTURA
	public void getAlturaAtual() {
		System.out.println("Altura Atual: "+alturaAtual+" pés");		
	}
//ALTERAR COMBUSTIVEL
	public void setCombustivelAtual(int porcentagem) {
		this.nivelCombustivel = porcentagem;		
	}
//VERIFICAR COMBUSTIVEL
	public void getCombustivelAtual() {
		System.out.println("Combustível Atual: "+nivelCombustivel+"%");		
	}
//ALTERAR VELOCIDADE
	public void setVelocidadelAtual(int velocidade) {
		this.velocidadeAtual = velocidade;		
	}
//VERIFICAR VELOCIDADE
	public void getVelocidadeAtual() {
		System.out.println("Velocidade Atual: "+velocidadeAtual+" Km/h");		
	}

	
	public void getinfosAtualizadas() {
		System.out.println("\n\n***INFORMAÇÕES ATUAIS***\n");
		getTempoDecorrido();
		getLocalAtual();
		getAlturaAtual();
		getVelocidadeAtual();
		getCombustivelAtual();
		
	}
	
}



	