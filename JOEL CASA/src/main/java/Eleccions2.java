import java.util.Scanner;
public class Eleccions2
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int jiden;
        jiden = sc.nextInt();
        int drump;
        drump = sc.nextInt();

        // Més d'una instrucció al obrir claus
        if (jiden>drump) {
            System.out.println("Jiden");
        }
        else if (drump==jiden) {
            System.out.println("No");
        }else {
            System.out.println("Drump");
        }
    }
}