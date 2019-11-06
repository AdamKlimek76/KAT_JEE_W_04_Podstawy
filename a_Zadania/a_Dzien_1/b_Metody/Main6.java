package a_Zadania.a_Dzien_1.b_Metody;


public class Main6 {

    static boolean checkMaturity(int age){
        boolean maturity;
            if (age>=18){
                maturity=true;
            }else{
                maturity=false;
            }
            return maturity;
    }

    public static void main(String[] args) {
        int podajWiek = 20;
        boolean czyDorosly = checkMaturity(podajWiek);
        System.out.print(czyDorosly);

    }
}
