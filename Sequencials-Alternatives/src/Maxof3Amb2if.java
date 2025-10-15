/*
 * Autor:  Yanzhe Chen
 * Data:   15/10/2025
 * Versió: 1.0
 */

/*
 * P1 - Prog 24-25
 * Exercici 5. Feu un programa que calcula el màxim de tres nombres enters, usant com a molt dues instruccions if. (Maxof3Amb2if.java)
 */

/* Taula de tests
   Entrada            | Sortida esperada
  -------------------------------------
   1 2 3              | 3
   -10086 -3 0        | 0
   0 0 0              | 0
*/

import java.util.Scanner;
public class Maxof3Amb2if {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int n1, n2, n3, max;

		System.out.println("Introdueix 3 nombres enters: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();

		max = n1;
		if ((n2 > n1) && (n2 > n3)) {
			max = n2;
		}
		else if (n3 > n1) {
			max = n3;
		}

		System.out.println(max);
	}
}
