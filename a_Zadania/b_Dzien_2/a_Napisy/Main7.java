package a_Zadania.b_Dzien_2.a_Napisy;

import java.sql.SQLOutput;

public class Main7 {

    public static void main(String[] args) {

        String str = "A to kanapa pana kota";
        String strOutSpace = str.replaceAll(" ", "").toLowerCase();
        int lenOfStr = strOutSpace.length();
        String backText = "";
        for (int i = lenOfStr - 1; i >= 0; i--) {
            char charAt = strOutSpace.charAt(i);
            backText += charAt;
        }
        System.out.println(strOutSpace);
        System.out.println(backText);
        int howManyDiff = strOutSpace.compareTo(backText);
        if (howManyDiff == 0) {
            System.out.println("Zdanie jest palindromem.");
        } else {
            System.out.println("Zdanie nie jest palindromem.");
        }

    }

}
