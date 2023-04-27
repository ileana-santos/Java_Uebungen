import java.util.Scanner;

public class Schaltjahr {
    public static void main(String[] args) {
        /*Aufgabe 2: Überprüfen Sie ein Jahr z.B. 2020,
          ob das Jahr ein Schaltjahr ist. Schaltjahr ist
          durch 4 aber nicht durch 100 teilbar.
          wenn ein Jahr durch 400 teilbar ist, es auch ein Schaltjahr. */
        //z.B. jahr = 2020

        Scanner sc = new Scanner (System.in);
        System.out.println("Geben Sie eine Zahl ein, um zu sehen, ob sie durch 3 und 5 teilbar ist: ");
        int jahr = sc.nextInt();

        if ((jahr % 4 == 0 && jahr % 100 !=0) | (jahr % 400 == 0)) {
            System.out.println("Das Jahr " + jahr + " ist ein Schaltjahr");
        } else {
            System.out.println("Das Jahr " + jahr + " ist kein Schaltjahr");
        }
    }
}
