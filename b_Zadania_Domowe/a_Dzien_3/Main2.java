package b_Zadania_Domowe.a_Dzien_3;


public class Main2 {

    public static void main(String[] args) {
        String[] tab = {"jeden", "dwa", "trzy", "cztery"};

        System.out.println(safeGet(tab, 4));

    }

    static String safeGet(String[] strTab, int index) {
        String texttab = "";
        try {
            texttab = strTab[index];

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Nieprawidlowy index w tablicy.");
        }
        return texttab;
    }
}



