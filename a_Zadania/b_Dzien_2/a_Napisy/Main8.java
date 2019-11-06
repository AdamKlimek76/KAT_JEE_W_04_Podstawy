package a_Zadania.b_Dzien_2.a_Napisy;

public class Main8 {

    public static void main(String[] args) {
        String text = "AbCdEfGhIjKl";
        System.out.print(toggleChar(text));

    }

    static String toggleChar(String str) {
        int lenOfStr = str.length();
        char[] tab = str.toCharArray();
        for (int i = 0; i < tab.length; i++) {
            if (Character.isUpperCase(tab[i])) {
                tab[i] = Character.toLowerCase(tab[i]);
            } else {
                tab[i] = Character.toUpperCase(tab[i]);
            }
        }
        String strUpsDown = "";

        for (int i = 0; i < tab.length; i++) {
            strUpsDown += tab[i];

        }

        return strUpsDown;
    }
}
