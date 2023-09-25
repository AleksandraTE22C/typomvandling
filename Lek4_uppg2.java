import java.util.Scanner;
public class Lek4_uppg2 {
    public static void main(String[] args){
    Scanner tb = new Scanner(System.in);

    System.out.println("Skriv en text:");
        String text = tb.nextLine();

        int antal_bokstäver = text.length();
        System.out.println("Texten innehåller "+antal_bokstäver+" bokstäver");

        int o_index = text.indexOf("o");
        System.out.println("Bokstaven 'o' ligger på plats "+o_index);

        String del_sträng = text.substring(0, 5);
        System.out.println("Text mellan index 0 och index 5 är "+del_sträng);

        boolean svar= text.contains("hej");
        System.out.println("Texten innehåller ordet hej = "+ svar);
    }
}