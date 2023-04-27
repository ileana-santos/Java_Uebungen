import java.util.Scanner;
public class IFExecirse {
    public static void main(String[] args) {
        /*Aufgabe 1: Überprüfen Sie ob "a" durch 3
        und 5 teilbar ist.
        Wenn ja Ausgabe:"Durch 3 und 5 teilbar."
        wenn nein Ausgabe: "Kondition nicht erfüllt"*/
        //

        Scanner sc = new Scanner (System.in);
        System.out.println("Geben Sie eine Zahl ein, um zu sehen, ob sie durch 3 und 5 teilbar ist: ");
        int a = sc.nextInt();

        if (a % 3 ==0 && a % 5 == 0) {
            System.out.println("Durch 3 und 5 teilbar.");
        } else {
            System.out.println("Kondition nicht erfüllt");
        }
    }
}
