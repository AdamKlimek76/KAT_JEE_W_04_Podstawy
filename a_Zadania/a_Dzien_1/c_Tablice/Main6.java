package a_Zadania.a_Dzien_1.c_Tablice;


import java.util.Arrays;

public class Main6 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] secondNumbers = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] sumNumbers = new int[numbers.length];
        for (int i = 0; i<numbers.length; i++){
            sumNumbers[i] = numbers[i] + secondNumbers[i];
        }
        System.out.print(Arrays.toString(sumNumbers));
    }
}