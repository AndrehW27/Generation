package ListaPolimorfismo;

import java.util.ArrayList;
import java.util.Collection;

public class exercicio3Collection {
	
	public static void main(String[] args) {
		
		Collection<String> produtos = new ArrayList<String>();
		
		produtos.add("Camisa polo Lacoste");
		produtos.add("Camisa polo Lacoste");
		produtos.add("Camisa polo Lacoste");
		produtos.add("Cal�a jeans LEVI`S");
		produtos.add("Cal�a jeans LEVI`S");
		produtos.add("Bon� Hang Loose");
		
		System.out.println("\nN�mero total de produtos no estoque: "+produtos.size());
		System.out.println("Os produtos dispon�veis em estoque s�o: "+produtos);
		produtos.remove("Camisa polo Lacoste");
		produtos.remove("Camisa polo Lacoste");
		System.out.println("\n***Foram vendidas 2 camisas polo da Lacoste, quantidade total atual de produtos em estoque: "+produtos.size()+" ***");
		System.out.println("\nOs produtos dispon�veis em estoque s�o: "+produtos);
		
		
		
		
		
		
		
	}
}
