/*
 * Autor:  Nom Cognom1 Cognom2
 * Data:   dd/mm/aa
 * Versió: 1.0
 */

/*
 * P1 - Prog 24-25
 * Exercici 16.	Feu un programa que llegeix dos enters positius i escriu tots els enters
 * de l’interval tancat definit per aquests dos, en ordre decreixent.
 * Per exemple, si l’usuari introdueix els enters 4 i 14 la sortida ha de ser “14, 13, 12, 11, .... , 5, 4”
 * (NombresInterval.java)
 */

/* Taula de tests
  Entrada            | Sortida esperada
  -------------------------------------
  4 9                | 9, 8, 7, 6, 5, 4
  10086 10090        | 10090, 10089, 10088, 10087, 10086
  5 5                | 5
*/
import java.util.Scanner;
public class NombresInterval {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int n, m;

		System.out.println("Introdueix dues nombres: ");
		n = sc.nextInt();
		m = sc.nextInt();

		// Asegurar que n <=  m
		int aux = -1;
		if (n > m){
			aux = n; n = m; m = aux;
		}

		System.out.print(m);
		for (int i = m - 1; i >= n; i--){
			System.out.print(", " + i);
		}
		System.out.println();
	}
}
