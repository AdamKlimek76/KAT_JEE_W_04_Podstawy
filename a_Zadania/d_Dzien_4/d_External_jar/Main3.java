package a_Zadania.d_Dzien_4.d_External_jar;


import org.apache.commons.lang3.StringUtils;

public class Main3 {

    public static void main(String[] args) {
        String[] tab = {"jeden", "dwa", "trzy"};
        System.out.println(stringFromArray(tab));

    }

    static String stringFromArray(String[] str) {

        String result = StringUtils.join(str, " ");
        return result;
    }
}
