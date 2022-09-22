import java.util.Scanner;
public class Eleccions3
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int jiden;
        jiden = sc.nextInt();
        int drump;
        drump = sc.nextInt();
        int banders;
        banders = sc.nextInt();

        // Més d'una instrucció al obrir claus
        if (jiden>drump && jiden>banders) {
            System.out.println("Jiden");
        }else if  (drump>jiden && drump>banders){
            System.out.println("Drump");
        }else{
            System.out.println("Banders");
        }
    }
}