package ListaPOO;

public class ProdutoEletronicoObjeto {
	public static void main(String[] args) {
		
		ProdutoEletronico PS5 = new ProdutoEletronico("Playstation 5","Sony",2000.0,1234);
		
		System.out.println("\nNome do produto: "+PS5.getNome());
		System.out.println("Fabricante: "+PS5.getFabricante());
		System.out.println("Pre�o: R$"+PS5.getPreco());
		System.out.println("C�digo do produto: "+PS5.getCodigo());
		
		System.out.println("\n***AP�S CHEGAR NO BRASIL, COM OS IMPOSTOS...***");
		PS5.setPreco(4000);
		
		System.out.println("\nNovo pre�o: R$"+PS5.getPreco());
	}

}
