package a_Zadania.d_Dzien_4.a_Wprowadzanie_danych;


import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        getData();
    }

    static void getData() {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        int scanned=0;
        do {
            System.out.println("Podaj liczbe:");
            scanned=scan.nextInt();
            sum += scanned;
            if (scanned != 0) {
                counter++;
            }
        } while (scanned != 0);
        System.out.println("Suma wpisanych liczb to " + sum);
        System.out.println("Wpisano liczby " + counter + " razy.");
    }
}
