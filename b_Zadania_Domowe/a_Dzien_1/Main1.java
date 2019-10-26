package b_Zadania_Domowe.a_Dzien_1;


public class Main1 {

    public static void main(String[] args) {
        double entDogAge=20;
        if (entDogAge<0){
            System.out.print("Incorrect age of the dog.");
        }else{
            System.out.print("Real dog age is " + dogAge(entDogAge));
        }

    }

    static double dogAge(double dogAge){
        double realDogAge=0;
        if (dogAge<=2){
            realDogAge=dogAge*10.5;
        }else {
            realDogAge = 21 + (dogAge - 2) * 4;
        }
        return realDogAge;
    }

}
