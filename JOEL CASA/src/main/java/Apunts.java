import java.util.Locale;
import java.util.Scanner;

public class Apunts
{

    public static void main(String[] args) {
        //APUNTS
        //CANVIEM L'IDIOMA DEL PROGRAMA
        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);
    }
}