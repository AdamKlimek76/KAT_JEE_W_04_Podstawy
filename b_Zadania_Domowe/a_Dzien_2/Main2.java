package b_Zadania_Domowe.a_Dzien_2;


public class Main2 {

    public static void main(String[] args) {
        String text = "abcdefghijklmnoprstuvwxyz0123456789 ,.";
        int shftChr=10;
        String encText = encode(text, shftChr);
        System.out.println(encText);
        String decText=decode(encText, shftChr);
        System.out.println(decText);
    }

    static String encode(String str, int shift){

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
            tabText[i] = alpBet[(j + shift) % alpBet.length];
        }

        String encStr = "";
        for (int i = 0; i < tabText.length; i++) {
            encStr += tabText[i];
        }
        return encStr;

    }

    static String decode(String str, int shift){
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
            tabText[i] = alpBet[(j +alpBet.length - shift) % alpBet.length];
        }

        String encStr = "";
        for (int i = 0; i < tabText.length; i++) {
            encStr += tabText[i];
        }
        return encStr;

    }

}
