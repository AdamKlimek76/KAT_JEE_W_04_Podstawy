package a_Zadania.a_Dzien_1.c_Tablice;


public class Main4 {

    public static void main(String[] args) {
        int[] numbers={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] revers=new int[10];
            for (int i=0; i<numbers.length; i++){
                revers[i]=numbers[numbers.length-1-i];
            }
        for (int i=0; i<numbers.length; i++) {
            System.out.println(revers[i]);
        }
    }
}
