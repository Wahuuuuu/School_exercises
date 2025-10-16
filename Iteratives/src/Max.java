/*
 * Autor:  Yanzhe Chen
 * Data:   16/10/2025
 * Versió: 1.0
 */

/*
 * P1 - Prog 24-25
 * Exercici 18.	Feu un programa que llegeix un nombre enter n i una seqüencia de n enters
 * i imprimeix per pantalla el màxim. (Max.java)
 */

/* Taula de tests
  Entrada            | Sortida esperada
  -------------------------------------
  0 0 0 0            | 0
  1 2 3 4            | 4
                     |
  		               |
*/
import java.util.Scanner;
public class Max {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n, max;

		n = sc.nextInt();
		max = n;
		while (sc.hasNextInt()){
			n = sc.nextInt();
			if (n > max) {
				max = n;
			}
		}

		System.out.println(max);
	}
}
