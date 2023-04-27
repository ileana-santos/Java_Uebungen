public class ForAufgabe {
    public static void main(String[] args) {
        //Aufgabe: Suchen Sie alle Zahlen
        // zwischen 1 und 100, die durch 9 teilbar sind
        // Anzahl und Summe von der Zahlen sollen
        // ausgegeben werden

        int anzahl = 0;//Add new variable where the information will be storage
        int summe = 0;//Add new variable where the information will be storage
        for (int i = 1; i <= 100; i++) {
            if (i % 9 == 0) {
                System.out.println("i = " + i);
                anzahl++;//
                summe += i;//
            }
        }
        System.out.print("Anzahl: " + anzahl + " Summe: " + summe);
    }
}
