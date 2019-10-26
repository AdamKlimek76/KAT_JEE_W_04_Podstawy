package b_Zadania_Domowe.a_Dzien_2;


public class Main1 {

    public static void main(String[] args) {
        String text = "abcdefghijklmnoprstuvwxyz0123456789 ,.";
        String encText = encode(text);
        System.out.print(encText);
    }

    static String encode(String str) {
        //kod Cezara - przesuniecie o 3 znaki z ponizszego alfabetu
        char[] alpBet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
                'l', 'm', 'n', 'o', 'p', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
                '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', ',', '.'};
        int textLong = str.length();
        char[] tabText = str.toCharArray();
        for (int i = 0; i < tabText.length; i++) {
            tabText[i] = Character.toLowerCase(tabText[i]);
        }
        for (int i = 0; i < tabText.length; i++) {
            int j = 0;
            while (tabText[i] != alpBet[j]) {
                j++;
            }
            tabText[i] = alpBet[(j + 3) % alpBet.length];
        }

        String encStr = "";
        for (int i = 0; i < tabText.length; i++) {
            encStr += tabText[i];
        }
        return encStr;

    }

}
