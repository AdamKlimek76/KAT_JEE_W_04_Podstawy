package a_Zadania.c_Dzien_3.b_Wyjatki;


public class Main1 {

    public static void main(String[] args) {

        try{
            int result = factorial(5);
            System.out.println(result);
        }catch (IllegalArgumentException e){
            e.printStackTrace();
            System.out.println("Blad!");
        }


    }

    static int factorial(int number) {
        int result=1;
        if (number < 0) {
            throw new IllegalArgumentException();
        }else{
            for(int i=1; i<=number; i++){
                result*=i;
            }
        }
        return result;
    }
}
