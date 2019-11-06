package a_Zadania.d_Dzien_4.a_Wprowadzanie_danych;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        operations();
    }


    static void operations() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe:");
        while (!scan.hasNextDouble()) {
            scan.next();
            System.out.println("Nie podales pierwszej prawidlowej liczby!");
        }
        double numb01 = scan.nextDouble();

        System.out.println("Podaj druga liczbe:");
        while (!scan.hasNextDouble()) {
            scan.next();
            System.out.println("Nie podales drugiej prawidlowej liczby!");
        }
        double numb02 = scan.nextDouble();
        System.out.println("Wynik dodawania to " + (numb01 + numb02));
        System.out.println("Wynik odejmowania to " + (numb01 - numb02));
        System.out.println("Wynik mnozenia to " + (numb01 * numb02));
        if (numb02 == 0) {
            System.out.println("Nie dziel przez 0.");
        } else {
            System.out.println("Wynik dzielenia to " + (numb01 / numb02));
        }

    }
}
