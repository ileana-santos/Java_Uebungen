public class Float01 {
    public static void main(String[] args) {
        //float num1 = 1.1; //double passt nicht float
        /*float num2 = 1.2F;
        double num3 = 3.3;
        double num4 = 1.1f; //float passt in double
        double num5 = .123;
        System.out.println(num5);
        System.out.println(5.12e3); //5.12e3 = 5.12 x 10^3= 5120.0
        System.out.println(5.12e-2);
        //double is präsizer als float
        //Wenn Sie nicht sicher sind, nehmen Sie einfach double
        double num9 = 2.1234567891;
        float num10 = 2.1234567891f;
        System.out.println("double Variante " + num9);
        System.out.println("float Variante " + num10);
        //Falle bei float/double Daten*/
        double num11 = 2.7;
        double num12 = 8.1/3; // 8.1/3 = 2.7
        //System.out.println(num12);
        //System.out.println(num11);
        /*if(num11 == num12){
            System.out.println("gleich!");
        } else {
            System.out.println("ungleich!");
        }*/
        if(Math.abs(num11-num12) < 0.0001){
            System.out.println("gleich!");
        } else {
            System.out.println("ungleich!");
        }
    }
}