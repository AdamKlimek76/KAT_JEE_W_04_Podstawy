package b_Zadania_Domowe.a_Dzien_2;


public class Main5 {

    public static void main(String[] args) {
        String text = "abccabccabccabcc";
        char forRepl = 'b';
        char rplcement = 'c';
        String textAftChange = replaceChar(text, forRepl, rplcement);
        System.out.println(textAftChange);

    }

    static String replaceChar(String str, char forReplace, char replacement) {
        char[] tab = str.toCharArray();
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == forReplace) {
                tab[i] = replacement;
            }
        }
        String textAfrRepl = "";
        for (int i = 0; i < tab.length; i++) {
            textAfrRepl += tab[i];
        }
        return textAfrRepl;
    }

}
