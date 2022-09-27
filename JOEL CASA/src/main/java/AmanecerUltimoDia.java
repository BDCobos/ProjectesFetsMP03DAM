import java.util.Scanner;
public class AmanecerUltimoDia
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int dia = (s/86400)+1;
        int matiNit = s % 86400;
        if (matiNit < 43200)
        {
            System.out.println("mati del dia "+dia);
        } else {
            System.out.println("nit del dia "+dia);
        }
    }
}