package b_Zadania_Domowe.a_Dzien_2;

public class Main6 {

    public static void main(String[] args) {
        String text="adam monika wojtek adam monika ewelina";
        String forRepl="adam";
        String replacm="ewelina";
        String aftReplText=replaceStr(text, forRepl, replacm);
        System.out.println(aftReplText);
    }

    static String replaceStr(String str, String forReplace, String replacement){
        String replaceAllText = str.replaceAll(forReplace, replacement);
        return replaceAllText;

    }

}
