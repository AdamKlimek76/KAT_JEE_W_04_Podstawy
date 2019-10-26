package b_Zadania_Domowe.a_Dzien_1;


public class Main3 {

    public static void main(String[] args) {
        int[][] tabTwoDim = {{1, 2, 3, 4, 5}, {3, 2, 4, 5, 6, 7}, {4, 5, 3, 6, 7, 8, 9}, {5, 6, 7, 4, 8, 9}};
        for (int i=0; i<tabTwoDim.length; i++){
            System.out.println(minimum(tabTwoDim)[i]);
        }

    }

    static int[] minimum(int[][] arr) {
        int[] min = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            min[i] = 2147483647;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min[i]) {
                    min[i] = arr[i][j];
                }
            }
        }
        return min;
    }

}
