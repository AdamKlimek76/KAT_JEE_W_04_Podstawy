package a_Zadania.b_Dzien_2.b_Podzial_Napisow;


public class Main3 {

    public static void main(String[] args) {
        String text="Ala ma kota bo nie stac jej na psa";
        int numOfWords=countTokens(text);
        System.out.println(numOfWords);

    }
        static int countTokens(String str){
            String[] parts=str.split(" ");
            int numOfWords=parts.length;
            return numOfWords;


    }

}