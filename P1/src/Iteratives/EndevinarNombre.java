/*
 * Autor:  Nom Cognom1 Cognom2
 * Data:   dd/mm/aa
 * Versió: 1.0
*/

/* 
 * P1 - Prog 24-25
 * Exercici 33.	Feu un programa per a jugar al joc d’endevinar un nombre. 
 * El jugador ha d’endevinar un nombre secret, dins del rang [0 , 5], 
 * escollit per l’ordinador. L’ordinador pregunta al jugador/a un nombre. 
 * En cas que el jugador/a falli, la màquina li diu si el nombre introduït 
 * era més petit o més gran que el nombre secret i repta al jugador/a tornar a intentar-lo 
 * amb altre nombre secret. El joc acaba quan el jugador/a encerti el nombre secret, 
 * moment en que la màquina li diu que ha encertat, 
 * i a continuació li pregunta si vol o no vol (“s”/”n”) tornar a jugar.
 *
 * La sortida per pantalla ha de ser com la que es mostra a l’exemple d’execució. 
 * Fixeu-vos que s’ha de comprovar que el nombre està al rang [0 , 5], 
 * i que la resposta a la pregunta de tornar a jugar ha de ser “s” o “n”. (EndevinarNombre.java)
 * 
 * Exemple d’execució: (s’indiquen en cursiva i subratllat les entrades per teclat del jugador/a)
 * Benvingut/da al joc d'endevinar nombres! Estic pensant un nombre entre 0 i 5....
 * Quin nombre creus que he pensat?:
 * 9
 * El nombre 9 no és vàlid. Ha d'estar en el rang [0, 5]. 
 * Estic pensant un nombre entre 0 i 5....
 * Quin nombre creus que he pensat?:
 * 2
 * El nombre secret era 1, és menor que 2. 
 * Estic pensant un nombre entre 0 i 5.... 
 * Quin nombre creus que he pensat?:
 * 0
 * El nombre secret era 4, és major que 0. 
 * Estic pensant un nombre entre 0 i 5.... 
 * Quin nombre creus que he pensat?:
 * 3
 * Has esbrinat que era 3! Has guanyat! 
 * Vols jugar altre vegada? [s/n]
 * n
 * Fins altra vegada!
 */

/*  NO es necessari fer Taula de tests */
