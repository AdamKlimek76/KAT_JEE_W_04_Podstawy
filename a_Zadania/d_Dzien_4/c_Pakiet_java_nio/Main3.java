package a_Zadania.d_Dzien_4.c_Pakiet_java_nio;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main3 {

    public static void main(String[] args) {
        String path = "java_nio/";
        String file1 = "java_nio31.txt";
        String file2 = "java_nio32.txt";
        copyFile(path, file1, file2);

    }

    static void copyFile(String directory, String fileName, String secondFileName) {
        String file01 = directory + fileName;
        String file02 = directory + secondFileName;
        Path path1 = Paths.get(file01);
        Path path2 = Paths.get(file02);
        try {
            if (!Files.exists(path1)) {
                Files.createFile(path1);
            } else {
                System.out.println("Plik " + path1 + " już istnieje.");
            }
        } catch (IOException e) {
            System.out.println("Błąd z plikiem 1");
        }
        try {
            if (!Files.exists(path2)) {
                Files.copy(path1, path2, StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Kopiowanie pliku zakończone powodzeniem.");
            } else {
                System.out.println("Plik " + path2 + " już istnieje.");
            }
        } catch (IOException e) {
            System.out.println("Błąd z plikiem 2");
        }
    }


}
