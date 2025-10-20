/*
 * Autor:  Yanzhe Chen
 * Data:   19/10/2025
 * Versió: 1.0
 */

/*
 * P1 - Prog 24-25
 * Exercici 28.	Feu un programa per a veure si cada caràcter ‘a’ d’una paraula llegida
 * per teclat està contenta. Una ‘a’ està contenta si té a la seva esquerra o a la seva dreta
 * una altre ‘a’. El programa ens diu si totes les ‘a’ estan contentes.
 * Per exemple: si introduïm “zdaaaoa” el programa mostra el missatge
 * “No totes les a estan contentes”,
 * amb la cadena “zdaa” el programa mostra “Totes les a estan contentes (Contentes.java)
 */


/* Taula de tests
  Entrada            | Sortida esperada
  -------------------------------------
  zdaaaoa            | No totes les a estan contentes
  zdaa               | Totes les a estan contentes
  AaaAaaaa           | Totes les a estan contentes
  bbbb               | Totes les a estan contentes
*/

import java.util.Scanner;
public class Contentes {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		String  p;

		System.out.println("Indica una palaura: ");
		p = sc.next();
		int length = p.length();

		boolean contenta = true;
		/*
		 * No contenta if:
		 * - palabra = 'a', OR
		 * - first char is 'a', and second char is not 'a' OR
		 * - last char is 'a', and second last char is not 'a'
		 */
		if ( (length < 2 && (p.charAt(0) == 'a'))
		  || (p.charAt(0) == 'a' && (p.charAt(1) != 'a'))
		  || (p.charAt(length - 1) == 'a' && (p.charAt(length - 2) != 'a')) ){
			contenta = false;
		}

		int i = 1;
		while (i < length - 1 && contenta){
			if (p.charAt(i) == 'a'){
				if (p.charAt(i - 1) != 'a' && (p.charAt(i + 1) != 'a')){
					contenta = false;
				}
			}
			i++;
		}

		if (contenta) System.out.println("Totes les a estan contentes");
		else System.out.println("No totes les a estan contentes");

		
	}
}
