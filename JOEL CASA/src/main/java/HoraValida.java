import java.util.Scanner;
public class HoraValida
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        byte hora = sc.nextByte();
        byte min = sc.nextByte();
        byte seg = sc.nextByte();
        if (hora>=0  && hora<=23 && min>=0  && min<=59 && seg>=0  && seg<=59)
        {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }
}