/*
 * Autor:  Yanzhe Chen
 * Data:   19/10/2025
 * Versió: 1.0
 */

/*
 * P1 - Prog 24-25
 * Exercici 26.	Feu un programa que indiqui si una paraula entrada per teclat és palíndrom.
 * No es pot suposar que totes les lletres de la paraula s’escriuen en minúscula.
 * Recorda que hi ha un mètode toLowerCase() de la classe String.
 * Per exemple: la paraula “Refer” ha de sortir com palíndrom, i “ahir”
 * ha de sortir com no palíndrom (Palindrom.java)
 */

/* Taula de tests
  Entrada            | Sortida esperada
  -------------------------------------
  Refer              | Palindrom
  ahir               | No palindrom
  $%&456654&%$       | Palindrom
*/

import java.util.Scanner;
public class Palindrom {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		String palaura;

		System.out.println("Indicar una palaura: ");
		palaura = sc.next();
		palaura = palaura.toLowerCase();
		int length = palaura.length();

		boolean isPalindrom = true;
		int i = 0;
		int edge = (int) Math.ceil((length - 1) / 2.0);
		while(i < edge && isPalindrom){
			isPalindrom = palaura.charAt(i) == palaura.charAt(length - 1 - i);
			i++;
		}

		if (isPalindrom) System.out.println("Palíndrom");
		else System.out.println("No palíndrom");
	}
}
