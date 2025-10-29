/*
 * Autor:  Yanzhe Chen
 * Data:   20/10/2025
 * Versió: 1.0
 */

/*
 * P1 - Prog 24-25
 * Exercici 31.	Feu un programa que donat un enter n i una seqüència de n estudiants
 * especificats per nom i cognoms (String) i la nota (float), retorni les dades de
 * l'estudiant amb millor nota. (MillorEstudiant.java)
 */


/* Taula de tests
  Entrada                     | Sortida esperada
  -------------------------------------
  4                           | Sandy Cheeks 9.87
  Spongebob Squarepants 7.86  |
  Patric Stars 0.13           |
  Squidward Tentacles 9.877     |
  Sandy Cheeks 9.877          |
  		               |
*/
import java.util.Scanner;
public class MillorEstudiant {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int n;
		float score;
		float maxScore = -1;
		String name, surname, fullname;
		StringBuffer bestStudent = new StringBuffer("Nadie");
		

		System.out.println("Introdueix: ");
		n = sc.nextInt();

		for (int i = 0; i < n; i++){
			name = sc.next();
			surname = sc.next();
			fullname = name + " " + surname;
			score = sc.nextFloat();

			if (score >= maxScore){
				maxScore = score;
				bestStudent.replace(0, bestStudent.length(), fullname);
				bestStudent.append(" " + score);
			}
		}
		System.out.println(bestStudent);
	}
}
