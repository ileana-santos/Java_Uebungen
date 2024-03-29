import java.util.Arrays;
import java.util.Scanner;
public class MinimumElement {
    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int[] readElements(int el) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[el];
        for (int i = 0; i < el; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int findMin(int[] array) {
        Arrays.sort(array);
        return array[0];
    }

}

//Challenge from Java 17 Masterclass by Tim Buchalka
