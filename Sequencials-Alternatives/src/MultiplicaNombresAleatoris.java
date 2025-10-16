/*
 * Autor:  Yanzhe Chen
 * Data:   15/10/2025
 * Versió: 1.0
 */

/*
 * P1 - Prog 24-25
 * Exercici 10. Feu un programa que generi de forma aleatòria dos nombres d’una xifra,
 * pregunti a l’usuari el resultat de la multiplicació d’aquests nombres, i doni l’enhorabona
 * “Ben fet!” si ho fa bé i si ho fa malament li animi a estudiar més “Has d’estudiar la taula de multiplicar”. (MultiplicaNombresAleatoris.java)
 *
 * Per a generar un nombre aleatori entre 0 i 9:
 * int x = (int) (Math.random()*10);
 * Si volguesim un nombre aleatori en un interval [min, max] ambdós inclosos:
 * int x = (int) (Math.random()*(max-min+1)+min);
 */


/* Taula de tests
  Entrada             | Sortida esperada
  -------------------------------------
  El nombre correcte  | "Ben fet!"
  El nombre amb error | "Has d’estudiar la taula de multiplicar"
  No es un nombre     | ERROR
*/

import java.util.Scanner;
public class MultiplicaNombresAleatoris {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int x = (int) (Math.random() * 10);
		int y = (int) (Math.random() * 10);
		int sum;

		System.out.printf("%d * %d = ", x, y);
		sum = sc.nextInt();

		if (sum == x * y){
			System.out.println("Ben fet!");
		}
		else {
			System.out.println("Has d’estudiar la taula de multiplicar");
		}
	}
}
