package Lista5LacoDecisaoJava;

import java.util.Scanner;

public class exercicio2 {
	/*Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.*/
	public static void main (String args[])
	{
		
		Scanner ler = new Scanner(System.in);
		
		int num1,num2,num3;
		System.out.println("Por favor, insira o primeiro n�mero");
		num1 = ler.nextInt();
		//System.out.flush();
		System.out.println("Por favor, insira o segundo n�mero");
		num2 = ler.nextInt();
		System.out.println("Por favor, insira o terceiro n�mero");
		num3 = ler.nextInt();
		
	    if ( (num1 >= num2 && num1 >= num3) && num2 >= num3 )
            System.out.printf("A ordem crescente dos valores inseridos �:  %d %d %d", num3, num2, num1);
        else if ((num1 >= num2 && num1 >= num3) && num3 >= num2)
            System.out.printf("A ordem crescente dos valores inseridos �:  %d %d %d", num2, num3, num1);
        else if ( (num2 >= num1 && num2 >= num3) && num1 >= num3 )
            System.out.printf("A ordem crescente dos valores inseridos �:  %d %d %d", num3, num1, num2);
        else if ((num2 >= num1 && num2 >= num3) && num3 >= num1)
            System.out.printf("A ordem crescente dos valores inseridos �:  %d %d %d", num1, num3, num2);
        else if ( (num3 >= num2 && num3 >= num1) && num2 >= num1 )
            System.out.printf("A ordem crescente dos valores inseridos �:  %d %d %d", num1, num2, num3);
        else if ((num3 >= num2 && num3 >= num1) && num1 >= num2)
            System.out.printf("A ordem crescente dos valores inseridos �:  %d %d %d", num2, num1, num3);
		
	}

}
