package a_Zadania.c_Dzien_3.b_Wyjatki;


public class Main6 {

    public static void main(String[] args) {
        try {
            System.out.println(divide(1, 0));
        } catch (IllegalArgumentException e) {
            System.out.println("Próba dzielenia przez 0");
        }
    }

    static int divide(int a, int b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException();
        }
        int c = a / b;

        return c;
    }

}
