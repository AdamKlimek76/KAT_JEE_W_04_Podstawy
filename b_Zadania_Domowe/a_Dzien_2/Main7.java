package b_Zadania_Domowe.a_Dzien_2;

public class Main7 {

    public static void main(String[] args) {
        String[] uglyWords = {"kutwa", "chudz", "skugizon"};
        String text = "Milo Cie widziec kutwa chudz z nimi o on to taki skugizon";
        String textOutUglyWords = censor(text, uglyWords);
        System.out.println(textOutUglyWords);

    }

    static String censor(String str, String[] words) {
        String[] tab = str.split(" ");
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (tab[i].equals(words[j])) {
                    tab[i] = "****";
                }
            }
        }
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < tab.length; i++) {
            text = text.append(tab[i]).append(" ");
        }
        String textOutWords = text.toString();
        return textOutWords;
    }

}
