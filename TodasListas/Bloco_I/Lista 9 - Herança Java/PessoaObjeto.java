package ListaHeranca;

public class PessoaObjeto {

	public static void main(String[] args) {
		
		Pessoa Andre = new Pessoa("Andre","Rua dos bobos, numero 0","11 12345678");
		
		System.out.println(Andre.getNome());
		System.out.println(Andre.getEndereco());
		System.out.println(Andre.getTelefone());		
		
	}	
}
