public class UebungenForceConvert {
	public static void main(String[] args) {
		short s = 12;
        //short s1 = s - 9;// it doesn't work. Kalkulation wird short zu int umgewandelt. Ergibnis int. int darf nicht in short konvertier werden.

        byte b = 10;
        //byte b2 = b + 11;// it doesn't work, 
        byte b3 = (byte)(b+11); // It works.

        char c = 'a';
        int i = 16;
        float d = .314f;
        double result = c +i + d;// It works. Ergebnis in float. Float darf in double konvertiert werden.

        byte b4 = 16;
        short s = 14;
        //short = s + b; //it doesn't work. Ergebnis int. int darf nicht in short konvertier werden.



	}
}