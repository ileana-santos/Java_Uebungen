public class SchleifenStruktur {
    public static void main(String[] args) {

        for (int i = 1; i < 6; i++){

            if (i == 3) {
                System.out.println("Grundprogrammierung " + i);
                //break;// aus der aktuellen Schleife raus
                //continue; // aus der aktuellen Schleifenrunde aus, aber mit der nächten Schleifenrunde an
                //return; // in Main Methode bedeutet return das komplette Aufhören des aktuellen Programms
            }
            System.out.println("Hello World!" + i);
        }
        System.out. println("Go on!");
    }
}
