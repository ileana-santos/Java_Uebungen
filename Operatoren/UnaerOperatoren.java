public class UnaerOperatoren {
    public static void main(String[] args) {

        int a = 2;
        int b = a++;
        //zuerst zugewiesen dann um 1 erhöhrt
        System.out.println(a);//3
        System.out.println(b);//2
        a = 2;
        b = ++a; //zuerst zu 1 erhöht dann zuweisen
        System.out.println(a);//3
        System.out.println(b);//3


        //zuerst zu 1 reduziert dann zuweisen
        a = 2;
        b = --a;
        System.out.println(a);//1
        System.out.println(b);//1

        //zuerst zugewiesen dann um 1 reduziert
        a = 2;
        b = a--;
        System.out.println(a);//1
        System.out.println(b);//2


    }
}