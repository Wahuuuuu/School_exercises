/*
 * author:  Yanzhe Chen
 * data:    09/10/2025
 * version: 1.0
 */

// ejercicio 4: Feu un programa que calcula el màxim de tres nombres enters.

/* Tabla de tests
 * Entrada   | Salida esperada
 * 1 9 19    | El número máximo es 19.
 * 1 1 1     | El número máximo es 1.
 * -1 0 0    | El número máximo es 0.
 */

import java.util.Scanner;
public class Maxof3{
	public static void main (String[] args){
		Scanner sc = new Scanner (System.in);
		int max, n2, n3;

		System.out.println("Dame tres números enteros :");
		max = sc.nextInt();  // Suppose the first number is the max
		n2 = sc.nextInt();
		n3 = sc.nextInt();

		if (max > n2) {
			if (max < n3) max = n3;
		}
		else if (n2 > n3) max = n2;
		else max = n3;

		System.out.println ("El número máximo es " + max + ".");
	}
}
