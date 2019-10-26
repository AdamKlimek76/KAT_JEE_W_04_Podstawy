package b_Zadania_Domowe.a_Dzien_1;


public class Main6 {

    public static void main(String[] args) {
        int[][] tabTwoDim = {{1, 2, 3, 4, 8}, {3, 2, 4, 5, 6, 11}, {4, 5, 3, 6, 7, 17, 9}, {5, 6, 25, 4, 8, 9}};
        System.out.print(oddSum(tabTwoDim));

    }

    static int oddSum(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j / 2 == 1) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

}
