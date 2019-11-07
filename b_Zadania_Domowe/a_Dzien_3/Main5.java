package b_Zadania_Domowe.a_Dzien_3;


import java.util.NoSuchElementException;

public class Main5 {

    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5, 6, 7};
        try {
            System.out.println(indexOf(tab, 10));
        } catch (NoSuchElementException e) {
            System.out.println("Nie ma takiego elementu w tablicy.");
        }

    }

    static int indexOf(int[] elements, int value) {
        int index = -1;
        for (int i = 0; i < elements.length; i++) {
            if (value == elements[i]) {
                index = i;
            }
        }
        if (index == -1) {
            throw new NoSuchElementException();
        }
        return index;
    }
}



