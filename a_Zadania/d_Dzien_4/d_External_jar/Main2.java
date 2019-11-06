package a_Zadania.d_Dzien_4.d_External_jar;


import org.apache.commons.lang3.StringUtils;

public class Main2 {

    public static void main(String[] args) {
        String text = "AbCdEfGhIjKl";
        System.out.println(toggleChar(text));

    }

    static String toggleChar(String str) {
        String result = StringUtils.swapCase(str);
        return result;
    }


}
