package b_Zadania_Domowe.a_Dzien_2;


public class Main4 {

    public static void main(String[] args) {
        String text = "aaabcdefffghijbbb";
        int numbOfTripleText = tripple(text);
        System.out.println(numbOfTripleText);
    }

    static int tripple(String str) {
        char[] tab = str.toCharArray();
        int counter = 0;
        for (int i = 0; i < tab.length - 2; i++) {
            if (tab[i] == tab[i + 1] && tab[i] == tab[i + 2]) {
                counter++;
            }
        }
        return counter;
    }
}
