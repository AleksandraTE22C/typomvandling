import java.util.Scanner;

public class lek4_uppg1{
    public static void main(String[] args){
        Scanner tangentbord = new Scanner (System.in);

        int tal1 = 4;
        int tal2 = 5;
        double kvot = (double)tal1/tal2;

        System.out.println("Uppgift A");
        System.out.println(tal1+" / "+tal2+" = "+kvot);  
        System.out.println("som heltal: "+tal1+" / "+tal2+" = "+(int)kvot);

        String ord1 = "elefant";
        String ändelse = "er";

        String ord2 = ord1+ändelse;

        System.out.println("Uppgift B");
        System.out.println("En "+ord1+", flera "+ord2);
    }
}