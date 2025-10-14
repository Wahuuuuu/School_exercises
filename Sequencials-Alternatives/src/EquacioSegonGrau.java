/*
 * Autor:  Yanzhe Chen
 * Data:   14/10/2025
 * Versió: 1.0
 */

/*
 * P1 - Prog 24-25
 * Exercici 11. Feu un programa per resoldre qualsevol equació de 2n grau de la forma ax^2+bx+c=0,
 * on a, b i c siguin nombres racionals demanats per teclat, on assumirem que no s'introdueix a=0 i s'arrodoneixen els resultats a 2 decimals.
 *
 * Per exemple, si l'usuari introdueix a=1, b=2, c=4, ha de sortir el missatge:
 * "1.0x^2 + 2.0x + 4.0 = 0 no té solucions reals".
 * Si s'introdueix a=1, b=2, c=1, ha de sortir el missatge: "1.0x^2 + 2.0x + 1.0 = 0 té una única solució x = -1.0".
 * Si s'introdueix a=-4, b=2, c=3, ha de sortir el misssatge: "-4.0x^2 + 2.0x + 3.0 = 0 té com a solucions x1 = -0.65 i x2 = 1.15”. (EquacioSegonGrau.java)
 */


/* Taula de tests
  Entrada            | Sortida esperada
  -------------------------------------
 1 2 4               | 1.0x^2 + 2.0x + 4.0 = 0 no té solucions reals
 1 2 1               | 1.0x^2 + 2.0x + 1.0 = 0 té una única solució x = -1.0
 -4 2 3              | -4.0x^2 + 2.0x + 3.0 = 0 té com a solucions x1 = -0.65 i x2 = 1.15
  		               |
*/


import java.util.Scanner;
public class EquacioSegonGrau {
	public static void main(String[] arg){
		/*
		 * La fórmula de la ecuación del segundo grado es:
		 * 	(-b +- sqrt(b * b - 4 * a * c)) / 2a
		 *
		 * Llamamos la parte "b * b - 4 * a * c" delta.
		 * La ecuación tiene 2 resultados si delta > 0
		 *             tiene 1 resultado si delta = 0
		 *             no tiene resultado si delta < 0
		 */
		Scanner sc = new Scanner(System.in);
		double a, b, c;

		System.out.println("a b c separados por espacio: ");
		a = sc.nextDouble(); b = sc.nextDouble(); c = sc.nextDouble();
		
		// producir String de la ecuación
		String ecua = String.format("%.2fx^2 + %.2fx + %.2f = 0", a, b, c);

		double delta, soluc1, soluc2;
                delta = b * b - 4 * a * c;
		if (delta < 0){
			System.out.println(ecua + " no té solucions reals");
		}
		else if (delta == 0){
			soluc1 = -b / 2 * a;
			System.out.printf("%s té una única solució x = %.2f%n",ecua, soluc1);
		} else {
			soluc1 = (-b + Math.sqrt(delta)) / (2 * a);
			soluc2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.printf("%s té com a solucions x1 = %.2f i x2 = %.2f%n", ecua, soluc1, soluc2);
		}
	}
}
