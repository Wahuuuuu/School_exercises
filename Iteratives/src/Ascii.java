/*
 * Autor:  Yanzhe Chen
 * Data:   17/10/2025
 * Versió: 1.0
 */

/*
 * P1 - Prog 24-25
 * Exercici 25.	Feu un programa que llegeix un String i mostra el codi ASCII de
 * cadascun dels seus caràcters. (Ascii.java) Per exemple amb “Hola”, la sortida ha de ser:
 * H 72
 * o 111
 * l 108
 * a 97
 */

/* Taula de tests
  Entrada            | Sortida esperada
  -------------------------------------
  Hola               | H 72
                     | o 111
                     | l 108
                     | a 97
  123                | 1 49
                     | 2 50
		     | 3 51
*/

import java.util.Scanner;
public class Ascii {
    public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	String word;

	word = sc.next();
	for (int i = 0; i < word.length(); i++){
		System.out.printf("%c %d%n", 
				  word.charAt(i), (int) word.charAt(i));
	}
    }
}
