package a_Zadania.d_Dzien_4.a_Wprowadzanie_danych;


import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {
        textLines();
    }

    static void textLines() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wpisz zdania w liniach:");
        String text = "";
        String textTogether = "";
        do {
            text = scan.nextLine();
            //System.out.println(text);
            if (!text.equals("quit")) {
                textTogether += text + "\n";
            }
            //System.out.println(textTogether);
        } while (!text.equals("quit"));
        System.out.println(textTogether);
    }
}
