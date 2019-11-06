package b_Zadania_Domowe.a_Dzien_3;


public class Main3 {

    public static void main(String[] args) {
        System.out.println(getLength(null));

    }

    static int getLength(String str) {
        int len=0;
        try {
            len = str.length();
        } catch (NullPointerException e) {
            System.out.println("Podana wartość null");
        }
        return len;

    }
}
