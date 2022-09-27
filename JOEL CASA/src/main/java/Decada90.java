import java.util.Scanner;
public class Decada90
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int any = sc.nextInt();
        int res = any % 100;
        if (res > 89 && res < 100) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }
}