import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {

    }
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true) {
            try {
                sum += Integer.parseInt(scanner.nextLine());
                count++;
            } catch (NumberFormatException e) {
                break;
            }
        }

        System.out.println("SUM = " + sum + " AVG = " + Math.round((double) sum/count));

        scanner.close();

    }
}
