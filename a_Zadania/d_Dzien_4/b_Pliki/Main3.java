package a_Zadania.d_Dzien_4.b_Pliki;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("readFile.txt");

        Scanner scan = new Scanner(file);
        double sum = 0;
        double num = 0;
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            String[] tabLine = line.split(",");
            for (int i = 0; i < tabLine.length; i++) {
                try {
                    String tabline = tabLine[i];
                    num = Double.parseDouble(tabline.trim());
                    sum += num;
                } catch (NumberFormatException e) {
                    continue;
                }
            }

        }

        System.out.println(sum);
    }
}
