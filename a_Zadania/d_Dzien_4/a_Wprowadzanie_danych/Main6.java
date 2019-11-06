package a_Zadania.d_Dzien_4.a_Wprowadzanie_danych;


import java.util.Scanner;

public class Main6 {

    public static void main(String[] args) {

        equation();
    }

    static void equation() {
        System.out.println("Obliczanie równania kwadratowego.");
        System.out.println("Podaj a:");
        Scanner scan = new Scanner(System.in);
        double a = scan.nextInt();
        System.out.println("Podaj b:");
        double b = scan.nextInt();
        System.out.println("Podaj c:");
        double c = scan.nextInt();
        double delt = b * b - (4 * a * c);
        System.out.println(delt);
        System.out.println(Math.sqrt(delt));

        if (a == 0) {
            System.out.println("To nie jest równanie kwadratowe. Rozwiązanie to: " + (c / b));
        } else {
            if (delt < 0) {
                System.out.println("Równanie nie ma rozwiązań.");
            } else if (delt == 0) {
                double x = (-b) / (2 * a);
                System.out.println("Równanie ma jedno rozwiązanie równe: " + x);
            } else {
                double sqrDelt = Math.sqrt(delt);
                //System.out.println(sqrDelt);
                //System.out.println(-b);
                //System.out.println(sqrDelt);
                //System.out.println(a);
                double x1 = (-b - sqrDelt) / (2 * a);
                double x2 = (-b + sqrDelt) / (2 * a);
                System.out.println("Równanie ma dwa rozwiązania x1=" + x1 + " oraz x2=" + x2);
            }
        }
    }
}
