package b_Zadania_Domowe.a_Dzien_1;


import java.util.Arrays;

public class Main5 {

    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5};
        for(int i=0; i<tab.length*2; i++){
            System.out.println(append(tab)[i]);
        }
    }

    static int[] append(int[] arr) {
        int[] tabTemp;
        tabTemp = Arrays.copyOf(arr, 2 * arr.length);
        int j = arr.length - 1;
        for (int i = arr.length; i < tabTemp.length; i++) {
            tabTemp[i] = arr[j];
            j--;
        }
        return tabTemp;
    }
}
