package ListaPolimorfismo;

import java.util.ArrayList;
import java.util.Collection;

public class exercicio3Collection {
	
	public static void main(String[] args) {
		
		Collection<String> produtos = new ArrayList<String>();
		
		produtos.add("Camisa polo Lacoste");
		produtos.add("Camisa polo Lacoste");
		produtos.add("Camisa polo Lacoste");
		produtos.add("Calça jeans LEVI`S");
		produtos.add("Calça jeans LEVI`S");
		produtos.add("Boné Hang Loose");
		
		System.out.println("\nNúmero total de produtos no estoque: "+produtos.size());
		System.out.println("Os produtos disponíveis em estoque são: "+produtos);
		produtos.remove("Camisa polo Lacoste");
		produtos.remove("Camisa polo Lacoste");
		System.out.println("\n***Foram vendidas 2 camisas polo da Lacoste, quantidade total atual de produtos em estoque: "+produtos.size()+" ***");
		System.out.println("\nOs produtos disponíveis em estoque são: "+produtos);
		
		
		
		
		
		
		
	}
}
