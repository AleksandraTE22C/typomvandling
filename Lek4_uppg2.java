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

        String del_sträng = text.substring(0, 4);
        System.out.println("Text mellan index 0 och index 4 är "+del_sträng);

        boolean svar= text.contains("hej");
        System.out.println("Texten innehåller ordet hej = "+ svar);

        String del2_sträng = text.substring(4, antal_bokstäver);
        System.out.println("Skriv en ny text:");
        String text_ny = tb.nextLine();
        String byt_text = text.replace(del2_sträng, text_ny);
        System.out.println(byt_text);

    }
}