import java.util.Scanner;// eine Funktion Scanner zu importieren
public class IF01 {
    public static void main(String[] args) {

            Scanner sc = new Scanner (System.in);
            System.out.println("please enter your age: ");

            int age = sc.nextInt();

            if (age >= 16) {
                System.out.println("You are older than 16. Allow to buy beers.");
            } else {
                System.out.println("You are too young for beers. Go home!");
            }

            System.out.println("Go On!");

    }
}