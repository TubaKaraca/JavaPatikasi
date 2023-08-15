import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        while (true) {
            System.out.print("Bir tek sayı giriniz: ");
            n = input.nextInt();

            if (n % 2 == 1) {
                break; // Tek sayı girilmişse döngüden çık
            } else {
                System.out.println("Lütfen tek sayı giriniz.");
            }
        }
        n=(n/2)+1;

        //ELMASIN ÜST KISMI
        for (int i=1; i<=n ; i++) {
            for (int j=1; j<=(n-i); j++) {
                System.out.print(" ");
            }
            for (int k=1; k<=(2*i)-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //ELMASIN ALT KISMI
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}