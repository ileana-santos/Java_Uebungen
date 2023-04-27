public class Einmaleins {
    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {

            for( int j = 1; j <=  i; j++) { // j have to be less or equal than i so that
                                            // the first row is removed in the next column,
                                            // until the column has only one row; in this case: 9 * 9 = 81
                System.out.print(i + " * " + j + " = " + (i * j) + "\t");
            }
            System.out.println();
        }
    }
}
