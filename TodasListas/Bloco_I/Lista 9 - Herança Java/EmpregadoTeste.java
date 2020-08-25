package ListaHeranca;

import java.util.Scanner;

public class EmpregadoTeste{
	
	public static void main(String[] args) {
		Empregado NovoEmpregado = new Empregado(null, null, null, 0, 0, 0);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com o nome do novo empregado: ");
		String novoNome = entrada.next();
		NovoEmpregado.setNome(novoNome);
		System.out.println("Digite o endereço: ");
		String novoEndereco = entrada.next();
		NovoEmpregado.setEndereco(novoEndereco);
		System.out.println("Digite o telefone: ");
		String novoTelefone = entrada.next();
		NovoEmpregado.setTelefone(novoTelefone);
		System.out.println("Digite o código: ");
		int novoCodigoSetor = entrada.nextInt();
		NovoEmpregado.setCodigoSetor(novoCodigoSetor);
		System.out.println("Digite o salário base: ");
		double novoSalario = entrada.nextDouble();
		NovoEmpregado.setSalarioBase(novoSalario);
		System.out.println("Digite o imposto: ");
		double novoImposto = entrada.nextDouble();
		NovoEmpregado.setImposto(novoImposto);
		
		
		NovoEmpregado.MostrarInfos();
		
	
	}

}
