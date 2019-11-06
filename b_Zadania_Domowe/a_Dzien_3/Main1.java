package b_Zadania_Domowe.a_Dzien_3;


public class Main1 {

    public static void main(String[] args) {
        average("10", "abc");

    }

    static void average(String a, String b) {
        try {
            int aa = Integer.parseInt(a);
            int bb = Integer.parseInt(b);
            System.out.println(aa / bb);
        } catch (IllegalArgumentException e) {
            System.out.println("Nie udało się zmienić tekstu na liczbę.");
        }finally {
            System.out.println("Koniec programu.");
        }
    }


}
