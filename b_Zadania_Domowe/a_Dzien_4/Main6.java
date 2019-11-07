package b_Zadania_Domowe.a_Dzien_4;


import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main6 {

    public static void main(String[] args) {
        System.out.println(checkFileExist());

    }

    static boolean checkFileExist() {
        Scanner scan = new Scanner(System.in);
        String fileName = scan.next();
        Path path = Paths.get(fileName);
        boolean fileExis = Files.exists(path);
        return fileExis;
    }


}
