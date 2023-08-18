import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int n = scanner.nextInt();

        recursiveYazdir(n);
    }

    public static void recursiveYazdir(int n) {
        if (n <= 0) {
            System.out.print(n + " ");
            return;
        }

        System.out.print(n + " ");
        recursiveYazdir(n - 5);
        System.out.print(n + " ");
    }
}
