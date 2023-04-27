import java.util.Scanner;
public class SwitchExercise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your choice: ");
        char buchtabe = sc.next().charAt(0);

        switch (buchtabe) {
            case 'a' : System.out.println("A");
                break;
            case 'b' : System.out.println("B");
                break;
            case 'c' : System.out.println("C");
                break;
            case 'd' : System.out.println("D");
                break;
            case 'e' : System.out.println("E");
                break;
            default : System.out.println("andere");
                break; //optional
        }
    }
}
