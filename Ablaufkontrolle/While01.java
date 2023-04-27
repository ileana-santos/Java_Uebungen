public class While01 {
    public static void main(String[] args) {

        /*int i = 1;

        while (i <= 10) {
            System.out.print(i + "\t");
            i++;
        }*/

        //Aufgabe: Ausgabe von allen Zahlen,
        //die zwischen 1 bis 200 sind,
        //die durch 7 aber nicht durch 9 teilbar sind

        int i = 1;
        while (i <= 200){
            i++;
            if (i % 7 == 0 && i % 9 != 0) {
                System.out.println("Zahl, die durch 7 aber nicht durch 9 teilbar ist: "+ i);
            }
        }


    }
}
