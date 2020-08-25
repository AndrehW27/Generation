package ListaHeranca;

public class FornecedorTeste {

		public static void main(String[] args) {
			
			Fornecedor fornecedor1 = new Fornecedor("Joao","Rua do Joao","11112222",1000000,700000);
			
			System.out.printf("Nome do fornecedor: "+fornecedor1.getNome());
			System.out.printf("\nEndereço do fornecedor: "+fornecedor1.getEndereco());
			System.out.printf("\nTelefone do fornecedor: "+fornecedor1.getTelefone());
			System.out.printf("\nCredito do fornecedor: R$ "+fornecedor1.getValorCredito());
			System.out.printf("\nDivida do fornecedor: R$ "+fornecedor1.getValorDivida());
			System.out.printf("\nSaldo do fornecedor: R$ "+fornecedor1.obterSaldo());
			
			System.out.println("\n\n***Fornecedor pagou a dívida, novo saldo...***\n\n");
			fornecedor1.setValorDivida(0);
			System.out.printf("Saldo do fornecedor: R$ "+fornecedor1.obterSaldo());
			
			
	}
}
