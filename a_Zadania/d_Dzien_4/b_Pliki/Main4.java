package a_Zadania.d_Dzien_4.b_Pliki;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("text1.txt");

        Scanner scan = new Scanner(file);
       String lines="";
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            //System.out.println(line);
            boolean cont=line.contains("Javy");
            if (cont==true){
                lines+=line + "\n";
            }
        }
        System.out.println(lines);
    }
}
