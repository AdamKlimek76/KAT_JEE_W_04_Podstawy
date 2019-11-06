package a_Zadania.a_Dzien_1.b_Metody;


public class Main10 {

    static String footballWin(int aNaA, int bNaA, int aNaB, int bNaB){
        String result="err";
        if ((aNaA+aNaB)>(bNaA+bNaB)){
             result="1";
        } else if ((aNaA+aNaB)<(bNaA+bNaB)){
            result="2";
        } else if ((aNaA+aNaB)==(bNaA+bNaB)){
            if (aNaB>bNaA){
                result="1";
            } else if(bNaA>aNaB){
                result="2";
            } else {
                result="x";
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int aNa_a=3;
        int bNa_a=1;
        int aNa_b=0;
        int bNa_b=3;
        String result1=footballWin(aNa_a, bNa_a, aNa_b, bNa_b);
        System.out.print(result1);

    }
}
