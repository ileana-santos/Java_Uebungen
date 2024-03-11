import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] test = {1,2,3,4,5};
        System.out.println(Arrays.toString(test));
        reverse(test);
        System.out.println(Arrays.toString(test));

    }

    private static void reverse(int[] array){
        int[] swapped = Arrays.copyOf(array, array.length); //make a copy

        for (int i = 0; i < array.length; i++){
            array[i] = swapped[swapped.length - 1 - i];
        }

    }
}

//Challenge from Java 17 Masterclass by Tim Buchalka
