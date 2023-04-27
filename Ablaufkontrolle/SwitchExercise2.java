import java.util.Scanner;
public class SwitchExercise2 {
    public static void main(String[] args) {
        // Tengo que usar coma
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your score: ");
        double score = sc.nextDouble();

        if (score > 100) {
            System.out.println("Falsche Note");
        } else {

            switch ((int)score / 10) {
                case 10:
                case 9:
                case 8:
                case 7:
                case 6:
                    System.out.println("Bestanden");
                    break;
                default:
                    System.out.println("Nicht bestanden");
                    break;
            }
        }
    }
}
