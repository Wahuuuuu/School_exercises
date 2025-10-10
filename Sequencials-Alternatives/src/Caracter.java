/*
 * Autor:  Yanzhe Chen
 * Data:   10/10/2025
 * Versió: 1.0
 */

/*
 * P1 - Prog 24-25
 * Exercici 12. Feu un programa per obtenir el caràcter a l’índex indicat per teclat dins de la cadena.
 * Comprova que l'index que s'introdueix és correcte (està dintre dels límits del String [0,length-1]).
 * Per exemple, si s’indica 1 i la cadena es “Hola”, el programa ha d’imprimir “A la posició 1 està el caràcter o”.
 * Si s'indica 4, el programa imprimeix "Index no correcte" (Caracter.java)
 */


/* Taula de tests
  Entrada            | Sortida esperada
  -------------------------------------
  Hola 1             | A la posició 1 està el caràcter o
  Hola 4             | Index no correcte
  Hola -1            | Index no correcte
*/

import java.util.Scanner;
public class Caracter{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
	String cadena;
	int index;
	
	System.out.println ("Dame una cadena de carácteres y un index, "
			   + "separados por un espacio: ");
	cadena = sc.next();
	index = sc.nextInt();

	// El index es correcto cuando es igual o más grande que zero, y al
	// mismo tiempo más pequeño que el número de carácteres de la cadena.
	if (index >= 0 && index < cadena.length() ) {
		System.out.println("A la posició " + index 
				 + " está el caràcter " + cadena.charAt(index));
	}
	else {
		System.out.println ("Index no correcte");
	}
    }
}
