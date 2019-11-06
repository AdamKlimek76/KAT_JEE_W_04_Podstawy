package a_Zadania.a_Dzien_1.b_Metody;


public class Main4 {


    static String createName(String name, String surname, String nickname){
        String nazwa = name + " " + nickname + " " + surname;
        return nazwa;
    }
    public static void main(String[] args) {
        String imie = "Adam";
        String nazwisko = "Klimek";
        String pseudo = "Pseudonim";
        String razem = (createName(imie, nazwisko, pseudo));
        System.out.print(razem);


    }
}
