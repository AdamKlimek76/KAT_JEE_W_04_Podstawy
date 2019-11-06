package a_Zadania.d_Dzien_4.b_Pliki;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("text2.txt");

        Scanner scan = new Scanner(file);
        StringBuilder line=new StringBuilder();
        String lines="";
        while (scan.hasNextLine()) {
            line = line.append(scan.nextLine()).append(",");
        }
        lines=line.toString();
        String [] tabLines=lines.split(",");
        Arrays.sort(tabLines);
        for (int i=0; i<tabLines.length; i++){
            System.out.println(tabLines[i]);
        }


    }
}
