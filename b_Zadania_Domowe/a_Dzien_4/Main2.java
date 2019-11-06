package b_Zadania_Domowe.a_Dzien_4;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {
        String filNam = "b_Zadania_Domowe/a_Dzien_4/Main1.txt";
        System.out.println(count(filNam));
    }

    static int count(String fileName) {
        Path path = Paths.get(fileName);
        List<String> outList = new ArrayList<>();
        try {
            for (String line : Files.readAllLines(path)) {
                outList.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String text = outList.toString();
        String[] tabText = text.split(" ");
        int numWords = tabText.length;
        return numWords;
    }


}
