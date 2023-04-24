public class ArithmeticOperator {
    public static void main(String[] args) {
        
        System.out.println(10/4);//2; Java berechent und gibt ein Integer aus; 10 & 4 sind integer 
        System.out.println(10.0/4);//2.5; double in Kalkulation daher 2.5
        double d = 10/4; //10 & 4 sind Integer
        System.out.println(d);//2.0; dann in double gespeichert

        System.out.println(10%3);//1
        //a%b = a - a/b*b (a=10 und b=3 sind int)
        //10%3 = 10 - 10/3*3
        //     = 10 - 3 * 3
        //     = 10 - 9
        //     = 1

        System.out.println(-10%3);//-1
        //10%3 = -10 - (-10)/3*3
        //     = -10 - (-3) * 3
        //     = -10 - (-9)
        //     = -10 + 9
        //     = -1
        System.out.println(10%-3);// 1
        //10%3 = 10 - 10/-3*-3
        //     = 10 - (-3) * -3
        //     = 10 - (9)
        //     = 1
        System.out.println(-10%-3);// -1
        //10%3 = -10 - (-10)/-3*-3
        //     = -10 - (3) * -3
        //     = -10 - (-9)
        //     = -10 + 9
        //     = -1
    }
}