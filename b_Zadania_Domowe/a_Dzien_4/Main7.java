package b_Zadania_Domowe.a_Dzien_4;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadź nazwę pliku:");
        String str = scan.next();
        if (rewrite(str)) {
            createFile_2(str);
        } else {
            System.out.println("Plik nie istnieje.");
        }

    }

    static boolean rewrite(String fileName) {
        Path path = Paths.get(fileName);
        boolean fileExist = Files.exists(path);
        return fileExist;
    }

    static void createFile_2(String fileName) {
        Path path = Paths.get(fileName);
        String newFileName = fileName.replace(".txt", "_2.txt");
        Path path_2 = Paths.get(newFileName);

        try {
            Files.createFile(path_2);
        } catch (IOException e) {
            System.out.println("Błąd zapisu pliku");
        }

        File file = new File(fileName);
        StringBuilder reading = new StringBuilder();
        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                reading.append(scan.nextLine() + "\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku.");
        }
        String strFromFile = reading.toString();
        String strToFile_2 = strFromFile + strFromFile;

        try {
            PrintWriter printWriter = new PrintWriter(newFileName);
            printWriter.println(strToFile_2);
            printWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("Nie odnaleziono pliku nr 2.");
        }
        System.out.println("Zapis do nowego pliku zakończył się powodzeniem.");

    }


}
