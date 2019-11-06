package a_Zadania.c_Dzien_3.b_Wyjatki;


public class Main5 {

    public static void main(String[] args) {

        try {
            int num = Integer.parseInt("5o");
            System.out.println(num);
        } catch (NumberFormatException ex) {
            System.out.println("Błąd formatu");
        } finally {
            System.out.println("Koniec programu");
        }

    }

}
