package a_Zadania.a_Dzien_1.b_Metody;


public class Main8 {

    static int maxOfThree(int a, int b, int c){
        int max=0;
        if (a>b && a>c){
            max=a;
        } else if (b>c && b>a){
            max=b;
        } else if (c>b && c>a){
            max=c;
        }
        return max;
    }

    public static void main(String[] args) {
        int pierwsza = 10;
        int druga = 20;
        int trzecia = 30;
        int maximum = maxOfThree(pierwsza, druga, trzecia);
        System.out.print(maximum);
    }
}
