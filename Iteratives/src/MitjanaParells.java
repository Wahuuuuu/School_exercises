/*
 * Autor:  Yanzhe Chen
 * Data:   20/10/2025
 * Versió: 1.0
 */

/*
 * P1 - Prog 24-25
 * Exercici 32.	Feu un programa que demani un enter n, seguidament llegeixi n enters
 * i finalment retorni la mitjana dels nombres parells. (MitjanaParells.java)
 */


/* Taula de tests
  Entrada            | Sortida esperada
  -------------------------------------
  5 2 6 8 1 9        | 5.33
  4 1 3 5 7          | 0.00
  0                  | No valor
*/

import java.util.*;
public class MitjanaParells {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int n, x;
		int sumParells = 0;
		float mitjana;

		System.out.println("Quantes nombres vols introduir?");
		n = sc.nextInt();

		if (n == 0) System.out.println("No valor");
		else{
			System.out.printf("Introdueix %d nombres enters, separades per espais: ", n);
			for (int i = 0; i < n; i++){
				x = sc.nextInt();
				if (x % 2 == 0) sumParells += x;
			}
	
			mitjana = (float) sumParells / n;
			
			System.out.printf("%.2f%n", mitjana);
		}
	}
}
