package Lista1ProgramacaoSequencial;

import java.util.Scanner;

public class exercicio7 {
	public static void main (String args[]) 
	{
		Scanner ler = new Scanner(System.in);
		
		double a, b, c, d, E, f, x, y, eq1, eq2;
			
		System.out.println("Por favor, insira o valor da vari�vel a: ");
		a = ler.nextDouble();
		System.out.println("Por favor, insira o valor da vari�vel b: ");
		b = ler.nextDouble();
		System.out.println("Por favor, insira o valor da vari�vel c: ");
		c = ler.nextDouble();
		System.out.println("Por favor, insira o valor da vari�vel d: ");
		d = ler.nextDouble();
		System.out.println("Por favor, insira o valor da vari�vel E: ");
		E = ler.nextDouble();
		System.out.println("Por favor, insira o valor da vari�vel f: ");
		f = ler.nextDouble();

		x= ((c*E) - (b*f))/((a*E) - (b*d));
		y= ((a*f) - (c*d))/((a*E) - (b*d));
		eq1 = a*x + b*y;
		eq2 = d*x + E*y;

		System.out.println("\nO valor de x �: "+x);
		System.out.println("\nO valor de y �: "+y);

		System.out.println("\n\nO valor inserido de c �: "+c);
		System.out.println("\nO valor inserido de f �: "+f);

		System.out.println("\n\nEqua��o1 -> a*x + b*y = "+eq1+" = c, portanto a equq��o 1 � v�lida.");
		System.out.println("\nEqua��o2 -> d*x + E*y = "+eq2+" = f, portanto a equq��o 2 � v�lida.");
	}

}
