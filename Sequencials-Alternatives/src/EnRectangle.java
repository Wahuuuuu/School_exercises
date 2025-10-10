/*
 * author:  Yanzhe Chen
 * data:    09/10/2025
 * version: 1.0
 */

/*
 * Exercise 7: Un rectangle que té els costats paral·lels als eixos està 
 * especificat per les coordenades dels vèrtexs de baix a l’esquerra (x1, y1) i
 * de dalt a la dreta (x2, y2). Feu un programa que donades aquestes 
 * coordenades i les coordenades d’un punt (x, y), indica si aquest punt es 
 * troba a dins o a fora del rectangle.
 */

/* Tabla de tests
 * Entrada
 * 2.5 2.5, 6.0 6.0, 5.0 4.2  | El punto está dentro del rectángulo.
 * 2.5 2.5, 6.0 6.0, 5.1 7.0  | El punto está fuera.
 */

import java.util.Scanner;
public class EnRectangle{
	public static void main (String[] arg){
		Scanner sc = new Scanner (System.in);
		float x1, y1, x2, y2, x, y;

		System.out.println ("Dame x1, y1, x2, y2, x e y. Separados por"
				   + " espacios.");
		x1 = sc.nextFloat();
		y1 = sc.nextFloat();
		x2 = sc.nextFloat();
		y2 = sc.nextFloat();
		x = sc.nextFloat();
		y = sc.nextFloat();

		if (x < x1 || y < y1 || x > x2 || y > y2) {
			System.out.println ("El punto está fuera.");
		}
		else {
			System.out.println ("El punto está dentro del " 
					    + "rectángulo.");
		}
	}
}
