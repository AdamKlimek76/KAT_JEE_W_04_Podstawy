package a_Zadania.d_Dzien_4.c_Pakiet_java_nio;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main2 {
    public static void main(String[] args) {
        String file = "java_nio2.txt";
        createFile(file);

    }

    static void createFile(String fileName) {
        Path path = Paths.get(fileName);
        //boolean czyIstnieje = Files.exists(path);
        //System.out.println(czyIstnieje);
        try {
            if (!Files.exists(path)) {
                Files.createFile(path);
                System.out.println("Utworzenie pliku zakończone powodzeniem.");
            } else {
                System.out.println("Plik " + path + " już istnieje.");
            }
        } catch (IOException e) {
            System.out.println("Błąd");
        }

    }

}
