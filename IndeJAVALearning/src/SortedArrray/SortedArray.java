package sortedArray;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
    public static int[] getIntegers(int size) {
        Scanner userInput = new Scanner(System.in);

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = userInput.nextInt();
        }
        return array;
    }

    public static int[] sortIntegers(int[] array) {
        int len = array.length;
        int[] copyArray = Arrays.copyOf(array, len);

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if (copyArray[j] < copyArray[j + 1]) {
                    int temp = copyArray[j];
                    copyArray[j] = copyArray[j + 1];
                    copyArray[j + 1] = temp;
                }
            }
        }
        return copyArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }
}
