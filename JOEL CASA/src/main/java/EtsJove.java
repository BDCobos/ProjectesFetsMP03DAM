import java.util.Scanner;
public class EtsJove
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edat = sc.nextInt();
        if (edat<30){
            System.out.println("SI");
        } else{
            System.out.println("NO");
        }
    }
}