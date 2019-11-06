package b_Zadania_Domowe.a_Dzien_4;


import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        System.out.println("Podaj nazwę pliku:");
        Scanner scan = new Scanner(System.in);
        String fileName = scan.next();
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

        System.out.println("Podaj Imię i Nazwisko:");
        Scanner scanName = new Scanner(System.in);
        String nameSurname = scanName.nextLine();

        Scanner scanBornDate = new Scanner(System.in);

        int bornDate = 0;
        while (bornDate <= 1900 | bornDate > 2019) {
            System.out.println("Podaj rok urodzenia pomiędzy 1901 a 2019.");
            while (!scanBornDate.hasNextInt()) {
                System.out.println("Rok urodzenia musi być liczbą.");
                scanBornDate.next();
            }
            bornDate = scanBornDate.nextInt();
        }


        System.out.println("Podaj płeć M lub K");
        Scanner scanSex = new Scanner(System.in);
        String sex = scan.next();
        while (!(sex.equals("M") | (sex.equals("K")))) {
            System.out.println("Powienieneś podać płeć M mężczyzna lub K kobieta!");
            sex = scan.next();
        }

        String bornDateStr = Integer.toString(bornDate);
        String personalData = nameSurname + " " + bornDateStr + " " + sex;

        try {
            FileWriter fileWriter = new FileWriter(fileName, true);
            fileWriter.append(personalData + "\n");
            fileWriter.close();
        } catch (Exception ex) {
            System.out.println("Błąd zapisu do pliku.");
        }
        System.out.println("Wpisanie danych do pliku zakończone powodzeniem.");

        System.out.println("Lista osób które osiągnęły wiek emerytalny:");
        try {
            for (int i = 0; i < retirement(fileName).length; i++) {
                System.out.println(retirement(fileName)[i]);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Nie znaleziono pliku!");
        }
    }


    static String[] retirement(String filenameOfPersons) throws FileNotFoundException {
        int tabSize = 0;

        File file = new File(filenameOfPersons);
        Scanner scanLines = new Scanner(file);
        while (scanLines.hasNextLine()) {
            String nextLine = scanLines.nextLine();
            String bYear = StringUtils.getDigits(nextLine);
            int bornYear = Integer.parseInt(bYear);
            String sex = StringUtils.right(nextLine, 1);
            int yearsOld = 2019 - bornYear;
            if ((sex.equals("M") && yearsOld >= 65) | (sex.equals("K") && yearsOld >= 60)) {
                tabSize++;
            }
        }

        String[] tabRet = new String[tabSize];
        int tabIndex = 0;
        Scanner scanLinesTab = new Scanner(file);
        while (scanLinesTab.hasNextLine()) {
            String nextLine = scanLinesTab.nextLine();
            String bYear = StringUtils.getDigits(nextLine);
            int bornYear = Integer.parseInt(bYear);
            String sex = StringUtils.right(nextLine, 1);
            int yearsOld = 2019 - bornYear;
            if ((sex.equals("M") && yearsOld >= 65) | (sex.equals("K") && yearsOld >= 60)) {
                int numbLeft = nextLine.length();
                tabRet[tabIndex] = StringUtils.left(nextLine, numbLeft - 7);
                tabIndex++;
            }
        }

        return tabRet;


    }


}
