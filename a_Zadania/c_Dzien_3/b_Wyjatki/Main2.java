package a_Zadania.c_Dzien_3.b_Wyjatki;

public class Main2 {

    public static void main(String[] args) {

        try {
            int[] tab = {5, 1, 6, 7, 8};
            System.out.println(tab[21]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Nieprawidlowy index tablicy.");
        }
    }

}
