public class AutoConvert {
    public static void main(String[] args) {
        
        /*int a = 'c'; //char kann int umgewandelt werden
        double d = 80; //int kann double umgewandelt werden

        System.out.println(a);// 99
        System.out.println(d);// 80.0*/

        int n1 = 10;
        double d1 = n1 + 1.1; // weil 1.1 automatisch als double anerkannt
        float d2 = n1 + 1.1f; // 1.1 als float, dass Ergebnis auch float

        System.out.println(d1);
        System.out.println(d2);

        //(byte, short) char können nicht ineinander ungewandelt weden.
        byte b1 = 10;
        int n2 = 1;
        //byte b2 = n2; // n2 int (4 xByte) passt nicht in eine byte
        //char c1 = b1; // byte darf nicht in char umgewandelt werden.
        byte b2 = 1;
        byte b3 = 2;
        short s1 = 1;
        //short s2 = b2 + s1; // béin Kalkulation werden byte, short und char in int umgewandelt,
        //int darf nicht in short umgewandelt werden
        int s2 = b2 + s1;
        //byte b4 = b2 + b3;// byte werde in int konvertiert
        // int darf nicht in byte konvertiert werden.

        byte b4 = 1;
        short s3 = 100;
        int num200 = 1;
        double num300 = 1.1;
        double s = b4 + s3 + num200 + num300;// der größte Datentypen in der
        //Berechnung ist double, dann das Ergebnis auch in double
        float f5 = s3 + num200 + num300;//Double darf nicht in float konveriert werden.

    }
}