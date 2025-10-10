/*
 * author:   Yanzhe Chen
 * data:     09/10/2025
 * version:  1.0
 */

/*
 * Feu un programa que donat un nombre enter introduït per teclat
 * per l'usuari, mostraper pantalla la seva última xifra.
 */

/* Taula de tests
 * Entrada             | Sortida esperada
 * 123                 | 3
 */

import java.util.Scanner;
public class UltimDigit{
	public static void main(String[] arg){

	int number, lastDigit;
	Scanner sc = new Scanner (System.in);
	
	System.out.println ("Da me un numero de tipo int: ");
	number = sc.nextInt ();
	
	lastDigit = number % 10;
	System.out.println ("La última cifra del número es " + lastDigit);
	}
}
