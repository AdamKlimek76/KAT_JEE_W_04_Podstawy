package a_Zadania.a_Dzien_1.b_Metody;


public class Main9 {

    static int factorial (int n){
        int silnia=1;
        for (int i=1; i<=n; i++){
            silnia*=i;
        }
        return silnia;
    }
    public static void main(String[] args) {
        int k=10;
        int silnia=factorial(k);
        System.out.print(silnia);

    }
}
