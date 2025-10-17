/*
 * Autor:  Yanzhe Chen
 * Data:   17/10/2025
 * Versió: 1.0
 */

/*
 * P1 - Prog 24-25
 * Exercici 20.	Feu un programa que llegeix tres enters a, b i c i escriu el valor
 * que pren la funció f(x) = ax2 + bx + c per x = 0, 1, 2, ..., 20. (Funcio.java)
 */

/* Taula de tests
  Entrada            | Sortida esperada
  -------------------------------------
  1 2 3              | 3 6 11 18 27 38 51 66 83 102 123 146 171 198 227 258 291
                     | 326 363 402 443
  0 0 0              | 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
  1 2 3              | -3 -6 -11 -18 -27 -38 -51 -66 -83 -102 -123 -146 -171 
                     | -198 -227 -258 -291 -326 -363 -402 -443
*/
import java.util.Scanner;
public class Funcio {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int a, b, c;

		System.out.println("Introduce tres números enteros a b i c"
			       + " de la fórmula ax² + bx + c: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		int resultat;
		for (int i = 0; i <= 20; i++){
			resultat = a * i * i + b * i + c;
			System.out.printf("%d ", resultat);
		}
		System.out.printf("%n");
	}
}
