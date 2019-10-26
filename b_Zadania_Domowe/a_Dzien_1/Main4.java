package b_Zadania_Domowe.a_Dzien_1;


public class Main4 {

    public static void main(String[] args) {
        int[][] tabTwoDim = {{1, 2, 3, 4, 8}, {3, 2, 4, 5, 6, 11}, {4, 5, 3, 6, 7, 17, 9}, {5, 6, 25, 4, 8, 9}};
        for (int i = 0; i < 2; i++) {
            System.out.println(lessMore(tabTwoDim)[i]);
        }

    }

    static int[] lessMore(int[][] arr) {
        double avg = 0;
        int[] tabLessMore = new int[2];
        int counter = 0, sum = 0, less = 0, more = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
                counter++;
            }
        }
        avg = sum / counter;
        //System.out.println(avg);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > avg) {
                    more++;
                } else if (arr[i][j] < avg) {
                    less++;
                }
            }
        }
        tabLessMore[0] = less;
        tabLessMore[1] = more;
        return tabLessMore;
    }
}
