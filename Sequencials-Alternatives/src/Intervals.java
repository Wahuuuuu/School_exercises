/*
 * Autor:  Yanzhe Chen
 * Data:   14/10/2025
 * Versió: 1.0
 */

/*
 * P1 - Prog 24-25
 * Exercici 9. Feu un programa que donats dos intervals [x1, x2] i [y1, y2] descrits pels quatre nombres reals x1, x2, i y1, y2,
 * indica si aquests intervals s’intersequen o no.
 * Per exemple, si l’usuari introdueix els intervals [2.0, 4.4] [5.0, 6.3] ha de sortir el missatge
 * “Els intervals no intersequen”.
 * Si l’usuari introdueix els intervals [2.0, 4.4] [3.0, 6.3] ha de sortir el missatge “Els intervals intersequen”. (Intervals.java)
 */

/* Taula de tests
   Entrada            | Sortida esperada
  -------------------------------------
   2.0 4.4 5.0 6.3    | Els intervals no intersequen
   2.0 4.4 3.0 6.3    | Els intervals intersequen
   5.0 6.3 2.0 4.4    | Els intervals no intersequen
   3.0 6.3 2.0 4.4    | Els intervals intersequen
*/


import java.util.Scanner;
public class Intervals {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float x1, x2, y1, y2;

		System.out.println("Indroduerix dos intervals descrits pels quatre nombres reals: ");
		x1 = sc.nextFloat();
	        x2 = sc.nextFloat();
		y1 = sc.nextFloat();
		y2 = sc.nextFloat();

		// Els intervals intersequen quan x2 >= y1 o y2 >= x1

		if ((x1 <= y1 && x2 >= y1) || (x1 >= y1 && x1 <= y2)){
			System.out.println("Els intervals intersequen");
		}
		else {
			System.out.println("Els intervals no intersequen");
		}
	}
}
