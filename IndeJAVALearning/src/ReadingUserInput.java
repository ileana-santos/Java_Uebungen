import java.util.Scanner;

public class ReadingUserInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        int sum = 0;

        while (counter <= 5) {
            System.out.println("Enter number #" + counter + ":");
            String netNumber = scanner.nextLine();
            try {
                int number = Integer.parseInt(netNumber);
                counter++;
                sum += number;
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Invalid number");
            }
        }

        System.out.println("The sum of the 5 number = " + sum);

    }
}
