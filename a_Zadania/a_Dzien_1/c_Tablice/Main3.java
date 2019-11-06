package a_Zadania.a_Dzien_1.c_Tablice;


import java.util.Arrays;

public class Main3 {


    public static void main(String[] args) {
        int [] tab1={2};
        int [] tab2 = new int[10];
        Arrays.fill(tab2, tab1[0]);
        System.out.print(Arrays.toString(tab2));

    }
}
