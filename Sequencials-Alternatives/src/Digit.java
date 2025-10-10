/*
 * author:      Yanzhe Chen
 * data:        09/10/2025
 * version:     1.0
 */

/*
 * Feu un programa que donat un nombre enter escriu si és un dígit o no.
 */

/* Tabla de test
 * Entrada     | Salida esperada
 * 0           | Es un dígito.
 * 9           | Es un dígito.
 * 10086       | No es un dígito.
 */

import java.util.Scanner;
public class Digit{
	public static void main (String[] arg) {
		Scanner sc = new Scanner (System.in);
		int number;

		System.out.println ("Dame un número entero: ");
		number = sc.nextInt();

		if ( (0 <= number) && (number <= 9) ) {
			System.out.println ("Es un dígito.");
		}
		else {
			System.out.println ("No es un dígito.");
		}
	}

}
