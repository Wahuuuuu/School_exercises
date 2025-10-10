/*
 * author:  Yanzhe Chen
 * data:    09/10/2025
 * version: 1.0
 */

/*
 * Exercici 3: Feu un programa que donada l’edat d’una persona 
 * el 31 de desembre de 2025 calcula el seu any de naixement i 
 * en quin any tindrà el doble de l’edat que té el 31 desembre de 2025.
 */

/* Tabla de tests
 * Entrada  | Salida esperada
 * 18       | Naciste en 2007, tendrás 36 años en el 2043.
 * 0        | Naciste en 2025, tendrás 0 años en el 2025.
 */


import java.util.Scanner;
public class Edat {
	public static void main (String[] arg){
		Scanner sc = new Scanner (System.in);
		int age, yearBorn, yearDouble;
		int yearCurrent = 2025;

		System.out.println ("Cuántos años tiene?");
		age = sc.nextInt();

		yearBorn = yearCurrent - age;
		yearDouble = yearCurrent + age;

		System.out.println("Naciste en " + yearBorn + ", tendrás "
				 + (2 * age) + " años en el " + yearDouble + ".");
	}
}
