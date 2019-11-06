package b_Zadania_Domowe.a_Dzien_4;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj ilość wylosowanych liczba - liczbę całkowitą:");
        while (!scan.hasNextInt()) {
            System.out.println("Podaj ilość wylosowanych liczba - liczbę całkowitą:");
            scan.next();
        }
        int ranNum = scan.nextInt();

        for (int i = 0; i < sortedArray(ranNum).length; i++) {
            System.out.println(sortedArray(ranNum)[i]);
        }


    }

    static int[] sortedArray(int tabSize) {

        int[] tab = new int[tabSize];
        Random r = new Random();
        for (int i = 0; i < tab.length; i++) {
            tab[i] = r.nextInt(101);
        }
        Arrays.sort(tab);
        return tab;


    }
}
