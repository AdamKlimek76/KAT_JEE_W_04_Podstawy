package a_Zadania.d_Dzien_4.a_Wprowadzanie_danych;


import java.util.Scanner;

public class Main7 {

    public static void main(String[] args) {
        nettoBrutto();

    }

    static void nettoBrutto() {
        //System.out.println("Podaj czy chcesz przeliczyć brutto na netto wpisz bn, albo netto na brutto nb.");
        Scanner scan = new Scanner(System.in);
        String text = "";
         do {
             System.out.println("Podaj nb lub bn");
             text = scan.next();

        } while (!(text.equals("bn")| text.equals("nb")));
        if (text.equals("bn")) {
            System.out.println("Podaj brutto:");
            double brutto = scan.nextDouble();
            double netto = brutto / 1.23;
            System.out.println("Netto wynosi: " + netto);

        } else if (text.equals("nb")) {
            System.out.println("Podaj netto:");
            double netto = scan.nextDouble();
            double brutto = netto * 1.23;
            System.out.println("Brutto wynosi: " + brutto);
        }


    }
}
