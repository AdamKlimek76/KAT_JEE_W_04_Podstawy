package a_Zadania.d_Dzien_4.c_Pakiet_java_nio;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        String fileName = "java_nio4.txt";
        writeToFile(fileName);

    }

    static void writeToFile(String fileName) {

        Path path = Paths.get(fileName);

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
        System.out.println("Wpisz jakieś zdanie do wpisania do utworzonego pliku.");
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        List<String> outList = new ArrayList<>();
        outList.add(text);

        try {
            Files.write(path, outList);
        } catch (IOException ex) {
            System.out.println("Nie można zapisać pliku.");
        }
        System.out.println("Dodano wpis do pliku.");

    }


}
