package b_Zadania_Domowe.a_Dzien_4;


import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {
        printTriangle();
    }

    static void printTriangle() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą:");
        while (!scan.hasNextInt()) {
            System.out.println("Podaj liczbę całkowitą:");
            scan.next();
        }
        int trianNumb = scan.nextInt();
        String trianStr = "";
        for (int i = 0; i < trianNumb; i++) {
            trianStr += "*";
            System.out.println(trianStr);
        }
    }
}
