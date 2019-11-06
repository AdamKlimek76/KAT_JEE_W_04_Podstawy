package a_Zadania.d_Dzien_4.c_Pakiet_java_nio;


import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main1 {

    public static void main(String[] args) {
        try {
            createDirectory("a/b/c");
        } catch (FileAlreadyExistsException e) {
            System.out.println("Katalog już istnieje.");
        }
    }

    static void createDirectory(String fileName) throws FileAlreadyExistsException {
        Path path = Paths.get(fileName);
        if (Files.exists(path)) {
            throw new FileAlreadyExistsException(fileName);
        }
        //File.createDirectory pierwsza metoda
        try {
            Files.createDirectory(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        File dirs = new File(fileName);
        //dirs.mkdirs druga metoda
        dirs.mkdirs();
    }
}
