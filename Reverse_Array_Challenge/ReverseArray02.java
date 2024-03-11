import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray02 {

    public static void main(String[] args) {
        int[] returnedArray = readIntegers();
        System.out.println(Arrays.toString(returnedArray));

        reverse(returnedArray);
        System.out.println("After reverse " + Arrays.toString(returnedArray));
    }

    private static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of integers, separated by commas:");
        String input = scanner.nextLine();

        String[] splits = input.split(",");
        int[] values = new int[splits.length];

        for (int i = 0; i < splits.length; i++) {
            values[i] = Integer.parseInt(splits[i].trim());
        }

        return values;
    }

    private static void reverse(int[] array){
        int[] reversed = new int[array.length]; // Create a new array to store reversed elements

        for (int i = 0; i < array.length; i++){
            reversed[i] = array[array.length - 1 - i]; // Reverse the elements
        }

        // Copy reversed elements back to the original array
        for (int i = 0; i < array.length; i++){
            array[i] = reversed[i];
        }

        System.out.println("Reversed array = " + Arrays.toString(array));
    }
}
//Challenge from Java 17 Masterclass by Tim Buchalka