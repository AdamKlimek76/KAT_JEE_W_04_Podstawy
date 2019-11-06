package a_Zadania.a_Dzien_1.c_Tablice;


import java.util.Random;

public class Main2 {


    public static void main(String[] args) {
        int [] randNumbers = new int[20];
        Random r = new Random();
            for (int i=0; i<20; i++){
                randNumbers[i]=r.nextInt(100);
            }

            int lowestNumber=999;
            for (int i=0; i<randNumbers.length; i++){
                if (randNumbers[i]<lowestNumber){
                    lowestNumber=randNumbers[i];
                }
            }
        System.out.print(lowestNumber);
    }
}
