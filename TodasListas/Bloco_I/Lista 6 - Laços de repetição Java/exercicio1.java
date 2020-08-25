package Lista6LacodeRepeticaoJava;

import java.util.Scanner;

public class exercicio1 {
	/*1-	Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)*/
	
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		int x, div, res;
		
		for(x=1000;x<2000;x++)
		{
			if(x%11==5)
			{
				div = x/11;
				res = x%11;
				System.out.println("Valor: "+x+", divido por 11 = "+div+" e tem resto = "+res);
			}
		}
	}

}
