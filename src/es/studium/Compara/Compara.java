package es.studium.Compara;

import java.util.Scanner;

public class Compara 
{

	public static void main(String[] args) 
	{
		int numero1, numero2;
		
		// creamos el objeto que nos permite leer por teclado
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame un n�mero entero:");
		numero1 = teclado.nextInt();
		
		System.out.println("Dame otro n�mero entero:");
		numero2 = teclado.nextInt();
		
		if(numero1 == numero2) 
		{
			System.out.println("Los n�meros son iguales");
		}
		else
		{
			if(numero1 > numero2) 
			{
				System.out.println("El n�mero 1 es mayor que el n�mero 2");
			}
			else
			{
				System.out.println("El n�mero 2 es mayor que el n�mero 1");
			}
		}
		
		teclado.close();
	}

}
