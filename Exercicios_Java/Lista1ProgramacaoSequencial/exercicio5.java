package Lista1ProgramacaoSequencial;

import java.util.Scanner;

public class exercicio5 {
	public static void main (String args[]) 
	{
		/*Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste aluno. 
		Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5, respectivamente.*/
		
		Scanner ler = new Scanner(System.in);
		float n1,n2,n3,mf;
		System.out.println("Por favor, insira o valor da primeira nota: ");	
		n1 = ler.nextFloat();
		System.out.println("Por favor, insira o valor da segunda nota: ");	
		n2 = ler.nextFloat();
		System.out.println("Por favor, insira o valor da terceira nota: ");	
		n3 = ler.nextFloat();
		
		mf = Math.round((n1*2+n2*3+n3*5)/10);
		
				
		System.out.println("\nA m�dia final �: %.2f\""+mf);
				
		
	}

}
