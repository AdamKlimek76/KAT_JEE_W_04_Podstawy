package a_Zadania.a_Dzien_1.b_Metody;


public class Main3 {

    static double convertToUse(double pln){
        double usd = pln*4.04;
        return usd;

    }
    public static void main(String[] args) {
        double zloty=400.45;
        double dolars = convertToUse(zloty);
        System.out.print(dolars);

    }
}
