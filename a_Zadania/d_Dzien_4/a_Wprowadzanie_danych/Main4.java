package a_Zadania.d_Dzien_4.a_Wprowadzanie_danych;


import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {

        rowsColumns();
    }

    static void rowsColumns() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbe wierszy: ");
        int rows = scan.nextInt();
        System.out.println("Podaj liczbe kolumn: ");
        int col = scan.nextInt();
        int[][] tab = new int[rows][col];
        int k = 0;
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                k++;
                tab[i][j] = k;
                sum += k;
            }
        }
        avg = sum / k;
        System.out.println("Suma liczb w tablicy to: " + sum);
        System.out.println("Średnia liczb w tablicy to " + avg);
    }
}
