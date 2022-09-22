import java.util.Scanner;
public class HoraValida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        int S = sc.nextInt();
        if (H<24 && M<60 && S<60){
            System.out.println("Si");
        } else {
            System.out.println("No");
        }
    }
}