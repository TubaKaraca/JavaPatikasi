import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan satır ve sütun boyutlarını alın
        int satir = alBoyut("Satır", 2, 100, input);
        int sutun = alBoyut("Sütun", 2, 100, input);

        // Mayın Tarlası oyununu başlatın
        MineSweeper oyun = new MineSweeper(satir, sutun);
        oyun.oyna();
    }

    // Kullanıcıdan geçerli bir boyut almak için kullanılan yardımcı metot
    private static int alBoyut(String boyutAdi, int min, int max, Scanner input) {
        int boyut;
        do {
            System.out.print(boyutAdi + " sayısını giriniz (" + min + "-" + max + " arası): ");
            boyut = input.nextInt();

            if (boyut < min || boyut > max) {
                System.out.println("Geçersiz " + boyutAdi.toLowerCase() + " sayısı. " + min + " ile " + max + " arasında bir değer girin.");
            }
        } while (boyut < min || boyut > max);

        return boyut;
    }
}