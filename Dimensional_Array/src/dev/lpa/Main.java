package dev.lpa;
import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        int[][] array2 = new int[4][4];
        System.out.println(Arrays.toString(array2));
        System.out.println("array2.length = " + array2.length);

        for (int[] outer : array2){
            //System.out.println(outer);
            System.out.println(Arrays.toString(outer));
        }

        //Nested loop
        for (int i = 0; i < array2.length; i++){
            var innerArray = array2[i];
            for (int j = 0; j <innerArray.length; j++){ //while i = 0, j will loop from 0 to 3
                //System.out.println(array2[i][j] + "");
                array2[i][j] = (i * 10) + (j + 1); //Each iteration of the outer loop index get multiply by 10 and loop
                                                    // index gets added to that plus one.
            }
            //System.out.println();
        }

 /*       for (var outer : array2){
            for (var element : outer){
                System.out.print(element + " ");
            }
            System.out.println();
        }*/

        System.out.println(Arrays.deepToString(array2)); // We can see the two-dimensional array, printed on a single line.

        /* Section: Multi-dimensional Arrays*/
        array2[1] = new int[] {10, 20, 30};
        System.out.println(Arrays.deepToString(array2));

        Object[] anyArray = new Object[3];
        System.out.println(Arrays.deepToString(anyArray)); //In this code, we are creating an array of three objects
                                                            // in the first statement

        anyArray[0] = new String[] {"a", "b", "c"}; // We are assining the first element od our array,
                                                    // at index 0, to a String array, which has three elements.
        System.out.println(Arrays.deepToString(anyArray));

        anyArray[1] = new String[][]{ //We are saying the 2nd element of our outermost array, is a two-dimensional
                                        // String array, and we're using an array creation expression with an array initializer.
                {"1", "2"},
                {"3","4","5"},
                {"6", "7", "8", "9"}
        };
        System.out.println(Arrays.deepToString(anyArray));

        anyArray[2] = new int[2][2][2]; // This last element, our third element of the outer array, is being assigned a
                                        // three-dimensional initialized array of 2 by 2 by 2 ints.
        System.out.println(Arrays.deepToString(anyArray));

        // to see easily which arrays are nested in which
        for (Object element : anyArray){
            System.out.println("Element type = " + element.getClass().getSimpleName());
            System.out.println("Element to String() = " + element);
            System.out.println(Arrays.deepToString((Object[]) element));
        }
    }
}
