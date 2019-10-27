package b_Zadania_Domowe.a_Dzien_2;


public class Main3 {

    public static void main(String[] args) {
        String text="abcdefghijklmnoprstuw";
        int divIdx=3;
        String changText=upperCase(text, divIdx);
        System.out.println(changText);

    }

    static String upperCase(String str, int index){
        char []tab=str.toCharArray();
        for (int i=0; i<tab.length; i++){
            if(i%index==0){
                tab[i]=Character.toUpperCase(tab[i]);
            }
        }
        String toUpStr="";
        for (int i=0; i<tab.length; i++){
            toUpStr+=tab[i];
        }
        return toUpStr;
    }

}
