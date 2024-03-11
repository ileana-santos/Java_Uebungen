//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] returnedArray = readIntegers();
        System.out.println(Arrays.toString(returnedArray));

        int returnedMin = findMin(returnedArray);
        System.out.println("min = " + returnedMin);
    }

    private static int[] readIntegers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of integers, separated by coma:");
        String input = scanner.nextLine();

        String[] splits = input.split(",");
        int[] values = new int[splits.length];

        for (int i = 0; i < splits.length; i++){
            values[i] = Integer.parseInt(splits[i].trim());
        }

        return values;
    }

    private static int findMin(int[] nums){
        int min = Integer.MAX_VALUE;

        for (int el : nums){
            if (el < min){
                min = el;
            }
        }

        /* Long way to write the code
        int min = nums[0];

        for (int i = 0; i < nums.length; i++){
            if (nums[i] < min){
                min = nums[i];
            }
        }*/
        return min;
    }

}

//Challenge from Java 17 Masterclass by Tim Buchalka