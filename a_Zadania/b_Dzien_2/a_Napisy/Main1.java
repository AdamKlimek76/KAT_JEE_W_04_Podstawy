package a_Zadania.b_Dzien_2.a_Napisy;

public class Main1 {

    public static void main(String[] args) {

    String str = "CodersLab jak dobrze zacząć programować";
    String newString=str.substring(str.length()-2, str.length()-1);
        System.out.println(newString);
        int index=str.length()-2;
        char[] tab=str.toCharArray();
        char character=str.charAt(index);
         int sum=0;
        for (int i=0; i< tab.length;i++){
             if(tab[i]==character){
                 sum++;
             }
         }
        System.out.println(sum);
    }
}
