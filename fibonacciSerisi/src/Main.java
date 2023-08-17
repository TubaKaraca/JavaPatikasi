import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fibonacci serisinin eleman sayısını girin: ");
        int n = scanner.nextInt();

        System.out.println(n + " Elemanlı Fibonacci Serisi:");
        int ilkEleman = 0, ikinciEleman = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(ilkEleman + " ");

            int sonrakiEleman = ilkEleman + ikinciEleman;
            ilkEleman = ikinciEleman;
            ikinciEleman = sonrakiEleman;
        }
    }
}
