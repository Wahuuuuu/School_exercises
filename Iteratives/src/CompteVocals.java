/*
 * Autor:  Yanzhe Chen
 * Data:   18/10/2025
 * Versió: 1.0
 */

/*
 * P1 - Prog 24-25
 * Exercici 24.	Feu un programa que llegeix un String i compta el nombre de vocals
 * que hi ha en total. Per exemple, “Avui fa molta calor.” dona el missatge
 * “La frase té 8 vocals”. Utilitza el mètode CharAt() de la classe String per a resoldre’l.
 * (CompteVocals.java)
 */


/* Taula de tests
   Entrada              | Sortida esperada
   -------------------------------------
   Avui fa molta calor. | La frase té 8 vocals
   hhhhllll             | La frase té 0 vocals
   1276345%&/$/&        | La frase té 0 vocals
  		               |
*/
import java.util.Scanner;
public class CompteVocals {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String frase;
		char cha;
		int nvocals = 0;

		System.out.println("Escriu una frase: ");
		frase = sc.nextLine();

		frase = frase.toLowerCase();
		for (int i = 0; i < frase.length(); i++){
			cha = frase.charAt(i);
			if (cha == 'a' || cha == 'e'
			 || cha == 'i' || cha == 'o'
			 || cha == 'u'){
				nvocals++;
			}
		}

                System.out.printf("La frase té %d vocals%n", nvocals);
	}
}
