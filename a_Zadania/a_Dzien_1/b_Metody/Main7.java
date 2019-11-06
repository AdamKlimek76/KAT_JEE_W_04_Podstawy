package a_Zadania.a_Dzien_1.b_Metody;


public class Main7 {

    static String checkEvenOdd(int number){
        int czyParz=number%2;
        String czyParzys;
            if(czyParz==0) {
                czyParzys = "even";
            } else{
                czyParzys="odd";
            }
            return czyParzys;
    }

    public static void main(String[] args) {
            int a = 100;
            String checkevent = checkEvenOdd(a);
            System.out.print(checkevent);

    }
}
