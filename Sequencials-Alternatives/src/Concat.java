/*
 * Autor:  Yanzhe Chen
 * Data:   14/10/2025
 * Versió: 1.0
 */

/*
 * P1 - Prog 24-25
 * Exercici 13. Feu un programa que concateni dues cadenes entrades per teclat.
 * S’ha de fer ús del mètode append() de la classe StringBuffer.
 * Perquè creus que no utilitzem la classe String? (Concat.java)
 */
// Perquè String es una classe inmutable

/* Taula de tests
  Entrada            | Sortida esperada
  -------------------------------------
  in mutable         | inmutable
  12 3456            | 123456
  $% &/()            | $%&/()
*/
import java.util.Scanner;
public class Concat {
    public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
    	StringBuffer sb = new StringBuffer();

        System.out.println("Prova des de Concat");
	sb.append(sc.next());
	sb.append(sc.next());

	System.out.println(sb);
    }
}
