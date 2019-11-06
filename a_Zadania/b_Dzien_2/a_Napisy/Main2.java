package a_Zadania.b_Dzien_2.a_Napisy;

public class Main2 {

    public static void main(String[] args) {

        String text="abcabcabc";
        char c='c';
       int numberOfCharC=charPos(text, c);
       System.out.print(numberOfCharC);
    }

    static int charPos(String str, char c) {
            int index=str.indexOf(c);
            return index;
        }


    }

