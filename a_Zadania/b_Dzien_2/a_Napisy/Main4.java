package a_Zadania.b_Dzien_2.a_Napisy;

public class Main4 {

    public static void main(String[] args) {
        String text1="adamewelina";
        String subtext="ewelinka";
        System.out.println(containsStr(text1, subtext));

    }

    static boolean containsStr(String str, String search){

        return str.contains(search);
        /*metoda contains zwraca wartosc true lub false w zaleznosci czy jeden ciag znakow
        znajduje sie w drugim
         */

    }
}
