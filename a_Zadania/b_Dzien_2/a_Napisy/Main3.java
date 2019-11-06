package a_Zadania.b_Dzien_2.a_Napisy;

public class Main3 {

    public static void main(String[] args) {

        String text="JedenDwa";
        String subText=firstHalf(text);
        System.out.print(subText);

    }

    static String firstHalf(String str){

        int strLen=str.length();
        int halfLen=strLen/2;
        String substr = str.substring(0, halfLen);

        return substr;
    }
}
