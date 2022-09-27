import java.util.Scanner;
public class Divisible1_10
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 9 == 0 && n % 8 == 0 && n % 7 == 0 && n % 5 == 0){
            System.out.println("SI");
        }else{
            System.out.println("NO");
        }
    }
}