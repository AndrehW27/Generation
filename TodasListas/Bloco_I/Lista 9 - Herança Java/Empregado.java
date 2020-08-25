package ListaHeranca;

public class Empregado extends Pessoa{
	
	/*
	3. Considere, como subclasse da classe Pessoa, a classe Empregado. Considere que cada instância da classe Empregado tem, 
	para além dos atributos que caracterizam a classe Pessoa, os atributos codigoSetor (inteiro), salarioBase (vencimento base) 
	e imposto (porcentagem retida dos impostos). Implemente a classe Empregado com métodos seletores e modificadores 
	e um método calcularSalario. Escreva um programa de teste adequado para a classe Empregado.  
	 */
	
	private int codigoSetor;
	private double salarioBase;
	private double imposto;
	
	public Empregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto) {
		super(nome, endereco, telefone);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}
	
	public double getCodigoSetor() {
		return codigoSetor;
	}
	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public double getImposto() {
		return imposto;
	}
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

	public double calcularSalario()
	{
		double salarioFinal = this.salarioBase-this.imposto;
		return salarioFinal;
	}
	
	public void MostrarInfos() {
		System.out.printf("Nome do empregado: "+getNome());
		System.out.printf("\nEndereço do empregado: "+getEndereco());
		System.out.printf("\nTelefone do empregado: "+getTelefone());
		System.out.printf("\nCódigo do empregado: "+getCodigoSetor());
		System.out.printf("\nSalário base do empregado: R$ "+getSalarioBase());
		System.out.printf("\nImposto a ser debitado: R$ "+getImposto());
		System.out.printf("\nSalário final do  empregado: R$ "+calcularSalario());
	}

}
