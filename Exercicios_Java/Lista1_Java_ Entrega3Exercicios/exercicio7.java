package Lista1ProgramacaoSequencial;

import java.util.Scanner;

public class exercicio7 {
	public static void main (String args[]) 
	{
		Scanner ler = new Scanner(System.in);
		
		double a, b, c, d, E, f, x, y, eq1, eq2;
			
		System.out.println("Por favor, insira o valor da variável a: ");
		a = ler.nextDouble();
		System.out.println("Por favor, insira o valor da variável b: ");
		b = ler.nextDouble();
		System.out.println("Por favor, insira o valor da variável c: ");
		c = ler.nextDouble();
		System.out.println("Por favor, insira o valor da variável d: ");
		d = ler.nextDouble();
		System.out.println("Por favor, insira o valor da variável E: ");
		E = ler.nextDouble();
		System.out.println("Por favor, insira o valor da variável f: ");
		f = ler.nextDouble();

		x= ((c*E) - (b*f))/((a*E) - (b*d));
		y= ((a*f) - (c*d))/((a*E) - (b*d));
		eq1 = a*x + b*y;
		eq2 = d*x + E*y;

		System.out.println("\nO valor de x é: "+x);
		System.out.println("\nO valor de y é: "+y);

		System.out.println("\n\nO valor inserido de c é: "+c);
		System.out.println("\nO valor inserido de f é: "+f);

		System.out.println("\n\nEquação1 -> a*x + b*y = "+eq1+" = c, portanto a equqção 1 é válida.");
		System.out.println("\nEquação2 -> d*x + E*y = "+eq2+" = f, portanto a equqção 2 é válida.");
	}

}
