public class TernaryOperator {
    public static void main(String[] args) {
        //variable = (condition) ? expressionTrue :  expressionFalse;
        //Example:
        int a = 100;
        int b = 99;
        int result = a > b? a++: b--;
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);

        //Exercise: Find the lagerst number
        int x = 6;
        int y= 13;
        int  z = 99;
        int solution = (x > y) ? (x > z ? x : z) : (y > z ? y : z);//My Solution; comparing three number in a single statement
        System.out.println(solution);//Output

        //Another Solution
        int temp = x > y ? x : y;//comparing x and y and storing the largest number in a temp variable
        int gZ= z > temp ? z : temp; //comparing the temp variable with z and storing the result in the variable
        System.out.println(gZ); // Output
    }
}