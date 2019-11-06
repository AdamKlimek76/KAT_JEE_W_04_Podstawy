package a_Zadania.b_Dzien_2.a_Napisy;

public class Main6 {

    public static void main(String[] args) {

        String str = "codersLabxyz";
        int lenOfStr = str.length();
        String backText="";
            for (int i = lenOfStr - 1; i >= 0; i--) {
            char charAt = str.charAt(i);
                backText+=charAt;
        }
        System.out.println(backText);
    }
}
