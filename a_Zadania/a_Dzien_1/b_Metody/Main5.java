package a_Zadania.a_Dzien_1.b_Metody;


public class Main5 {


    static double calculateNetto(double gross, double vat){
        double netto = gross - vat;
        return netto;

    }
    public static void main(String[] args) {
        double brutto = 123.89;
        double vat = 23.12;
        double netto = calculateNetto(brutto, vat);
        System.out.print(netto);

    }
}
