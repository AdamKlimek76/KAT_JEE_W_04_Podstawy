package b_Zadania_Domowe.a_Dzien_1;


public class Main2 {

    public static void main(String[] args) {
    int numA=9;
    int numB=2;
    System.out.print(divisibleBy(numA, numB));

    }
    static boolean divisibleBy(int a, int b ){
        int divRest=a%b;
        boolean isDivisible;
        if(divRest==0){
            isDivisible=true;
        }else{
            isDivisible=false;
        }
        return isDivisible;
    }

}
