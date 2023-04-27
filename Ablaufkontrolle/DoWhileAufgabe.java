import java.util.Scanner;
public class DoWhileAufgabe {
    public static void main(String[] args) {

        /* Bauen Sie einen Scanner auf. Tipp: char c = */
        //My Code
        Scanner sc = new Scanner(System.in);
        char c;
        do {
            System.out.println("Sie haben einen Preis gewonnen, wollen Sie den Preis annehmen?(Y/N) ");
            c = sc.next().charAt(0); //The first character of the input is stored in variable "answer".
        } while (c != 'n' && c != 'N');

        /* Teacher's Code:
        Scanner sc = new Scanner(System.in);
        char antwort;
        do {
            System.out.println("Sie haben einen Preis gewonnen, wollen Sie den Preis annehmen?(Y/N) ");
            antwort = sc.next().charAt(0); // das erste Zeichen von der Eingabe wird in Variable "antwort" gespeichert
        } while (antwort != 'n' && antwort != 'N'); //
         */

    }
}
