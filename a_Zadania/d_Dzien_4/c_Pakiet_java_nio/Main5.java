package a_Zadania.d_Dzien_4.c_Pakiet_java_nio;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main5 {

    public static void main(String[] args) {
        String fileN = "java_nio5.txt";
        readFromFile(fileN);

    }

    static void readFromFile(String fileName) {
        Path path1 = Paths.get(fileName);
        String fileNameHtml = fileName.replaceAll(".txt", ".html");
        //System.out.println(fileNameHtml);
        Path path2 = Paths.get(fileNameHtml);

        try {
            Files.createFile(path2);
        } catch (IOException e) {
            System.out.println("Bład w tworzeniu pliku html;");
        }
        List<String> outList = new ArrayList<>();
        outList.add("<html>");
        outList.add("<body>");
        try {
            for (String line : Files.readAllLines(path1)) {
                outList.add("<p>" + line + "</p>");
            }

        } catch (IOException e) {
            System.out.println("Błąd odczytu pliku txt.");
            outList.add("</body>");
            outList.add("</html>");
        }
        try {
            Files.write(path2, outList);
        } catch (IOException ex) {
            System.out.println("Nie można zapisać pliku.");
        }

    }


}
