import java.util.Scanner;
public class ButlletiNotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n<5){
            System.out.println("Suspes");
        }else if (n<7){
            System.out.println("Aprovat");
        }else if (n<9){
            System.out.println("Notable");
        }else{
            System.out.println("Excelent");
        }
    }
}