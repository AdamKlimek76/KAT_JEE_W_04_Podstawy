package a_Zadania.b_Dzien_2.a_Napisy;

public class Main5 {

    public static void main(String[] args) {
        String[] tab={"adam", "franek", "jadzia"};
        String textFromTable=stringFromArray(tab);
        System.out.println(textFromTable);

    }

    static String stringFromArray(String[] str){
           String wordsTogether="";
            for (int i=0; i<str.length; i++){
                wordsTogether+=str[i];
            }


        return wordsTogether;
    }
}
