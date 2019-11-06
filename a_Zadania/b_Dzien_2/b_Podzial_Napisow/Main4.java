package a_Zadania.b_Dzien_2.b_Podzial_Napisow;


public class Main4 {

    public static void main(String[] args) {
        String text = "abc def ghi cba fed";
        char textseparator = 'c';
        for (int i = 0; i < 2; i++) {
            System.out.println(onlyTwoElements(text, textseparator)[i]);
        }
    }

    static String[] onlyTwoElements(String str, char separator) {

        String separatorstr = Character.toString(separator);
        String strSecPart = "";
        String[] parts = str.split(separatorstr);
        String strFirstPart = parts[0];
        for (int i = 1; i < parts.length; i++) {
            strSecPart += separatorstr + parts[i];
        }
        String[] twoElements = new String[2];
        twoElements[0] = strFirstPart;
        twoElements[1] = strSecPart;
        return twoElements;


    }

}