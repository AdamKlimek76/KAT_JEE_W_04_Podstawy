package a_Zadania.d_Dzien_4.d_External_jar;


import org.apache.commons.lang3.StringUtils;

public class Main4 {

    public static void main(String[] args) {
        String str = "abc cba abc cba";
        String strOut = StringUtils.deleteWhitespace(str);
        String strOutRev = StringUtils.reverse(strOut);
        if (strOut.equals(strOutRev)) {
            System.out.println("Tekst jest palindromem.");
        } else {
            System.out.println("Tekst nie jest palindromem.");
        }

    }

}
