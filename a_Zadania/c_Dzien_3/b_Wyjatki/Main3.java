package a_Zadania.c_Dzien_3.b_Wyjatki;

public class Main3 {

    public static void main(String[] args) {


        showLength(null);
    }

    static void showLength(String s) {
        try {
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("Argument nie istnieje");
        }
    }

}
