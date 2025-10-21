/*
 * Autor:  Yanzhe Chen
 * Data:   21/10/2025
 * Versió: 1.0
 */

/*
 * P1 - Prog 24-25
 * Exercici 23.	Feu un programa que llegeix un nombre enter n i escriu els primers
 * n nombres de la successió de Fibonacci, descrita a la pàgina web:
 * https:// ca.wikipedia.org/wiki/Successió_de_Fibonacci.
 * Per exemple, si l’usuari introdueix el nombre 10,
 * la sortida per pantalla ha de ser “1, 1, 2, 3, 5, 8, 13, 21, 34, 55” (Fibonacci.java)
 */


/* Taula de tests
  Entrada            | Sortida esperada
  -------------------------------------
  10                 | 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
  0                  | 0
  1                  | 1
  		               |
*/

import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int n, a = 0, b = 1;

		System.out.println("Introdueix un nombre: ");
		n = sc.nextInt();

		if (n == 0) System.out.println("0");
		else{
			System.out.print("1");
			for (int i = 1; i < n; i++){
				System.out.printf(", %d", a + b);

				b += a;
				a = b - a;
			}
			System.out.printf("%n");
		}	
	}
}
