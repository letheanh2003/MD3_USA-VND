import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       do {
           int Dola = 24000;
           Scanner scanner = new Scanner(System.in);
           System.out.println("USD:");
           int rate = scanner.nextInt();
           System.out.println("VND:" + (rate * Dola));
       }while (true);
    }
}