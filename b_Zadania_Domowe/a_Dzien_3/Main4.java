package b_Zadania_Domowe.a_Dzien_3;


public class Main4 {

    public static void main(String[] args) {

        System.out.println(toInt(null));
    }

    static int toInt(String str) {
        int number = 0;

        try {
            number = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Podanej wartości tekstowej nie można zamienić na liczbę.");
        }

        return number;
    }


}
