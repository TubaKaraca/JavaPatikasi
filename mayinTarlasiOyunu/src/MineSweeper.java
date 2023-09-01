import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    private int satir; // Oyun tahtasının satır sayısını tutan değişken
    private int sutun; // Oyun tahtasının sütun sayısını tutan değişken
    private int[][] mayinAlani; // Mayınların bulunduğu alanı temsil eden matris
    private boolean[][] aciklanan; // Açılan hücrelerin durumunu tutan matris
    private int toplamMayin; // Toplam mayın sayısını tutan değişken
    private boolean oyunBitti; // Oyunun bitip bitmediğini belirleyen bayrak

    // Constructor: Oyun tahtasını başlatır
    public MineSweeper(int satir, int sutun) {
        this.satir = satir;
        this.sutun = sutun;
        mayinAlani = new int[satir][sutun];
        aciklanan = new boolean[satir][sutun];
        toplamMayin = satir * sutun / 4; // Toplam mayın sayısını belirler (tahtanın çeyreği kadar)
        oyunBitti = false;
        mayinAlaniOlustur(); // Mayın alanını başlatan metodu çağırır
    }

    // Mayın alanını rastgele oluşturan metot
    private void mayinAlaniOlustur() {
        Random rand = new Random();
        for (int i = 0; i < toplamMayin; i++) {
            int row, col;
            do {
                row = rand.nextInt(satir);
                col = rand.nextInt(sutun);
            } while (mayinAlani[row][col] == -1); // Rastgele bir mayın hücresi seçer
            mayinAlani[row][col] = -1; // Seçilen hücreyi mayın olarak işaretler
        }

        // Her hücrede çevresinde kaç mayın olduğunu hesaplar
        for (int row = 0; row < satir; row++) {
            for (int col = 0; col < sutun; col++) {
                if (mayinAlani[row][col] != -1) {
                    int say = cevresindekiMayinSayisi(row, col);
                    mayinAlani[row][col] = say;
                }
            }
        }
    }

    // Belirtilen hücrenin çevresindeki mayın sayısını hesaplayan metot
    private int cevresindekiMayinSayisi(int row, int col) {
        int sayi = 0;
        for (int satirDegisim = -1; satirDegisim <= 1; satirDegisim++) {
            for (int sutunDegisim = -1; sutunDegisim <= 1; sutunDegisim++) {
                int yeniSatir = row + satirDegisim;
                int yeniSutun = col + sutunDegisim;
                if (yeniSatir >= 0 && yeniSatir < satir && yeniSutun >= 0 && yeniSutun < sutun && mayinAlani[yeniSatir][yeniSutun] == -1) {
                    sayi++;
                }
            }
        }
        return sayi;
    }

    // Oyun tahtasını ekrana yazdıran metot
    public void oyunTahtasiniYazdir() {
        System.out.println("-----Mayın Tarlası Oyununa Hoşgeldiniz-----");

        // Sütun numaralarını yazdır
        System.out.print("   ");
        for (int c = 0; c < sutun; c++) {
            System.out.print(c + "  ");
        }
        System.out.println(); // Bir alt satıra geç

        for (int r = 0; r < satir; r++) {
            // Satır numarasını yazdır
            System.out.print(r + "  ");

            for (int c = 0; c < sutun; c++) {
                if (aciklanan[r][c]) {
                    if (mayinAlani[r][c] == -1) {
                        System.out.print("*  ");
                    } else {
                        System.out.print(mayinAlani[r][c] + "  ");
                    }
                } else {
                    System.out.print(".  ");
                }
            }
            System.out.println();
        }
    }

    // Mayınların yerini gösteren metot
    public void mayinlariGoster() {
        System.out.println("Mayınların Konumu");

        // Sütun numaralarını yazdır
        System.out.print("   ");
        for (int c = 0; c < sutun; c++) {
            System.out.print(c + "  ");
        }
        System.out.println(); // Bir alt satıra geç

        for (int r = 0; r < satir; r++) {
            // Satır numarasını yazdır
            System.out.print(r + "  ");

            for (int c = 0; c < sutun; c++) {
                if (mayinAlani[r][c] == -1) {
                    System.out.print("*  ");
                } else {
                    System.out.print(".  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    // Oyunu oynatan metot
    public void oyna() {
        Scanner scanner = new Scanner(System.in);

        mayinlariGoster();

        while (!oyunBitti) {
            oyunTahtasiniYazdir();
            System.out.print("Satır girin: ");
            int secilenSatir = scanner.nextInt();
            System.out.print("Sütun girin: ");
            int secilenSutun = scanner.nextInt();

            if (secilenSatir < 0 || secilenSatir >= satir || secilenSutun < 0 || secilenSutun >= sutun) {
                System.out.println("Geçersiz bir nokta girdiniz. Tekrar deneyin.");
                continue;
            }

            if (aciklanan[secilenSatir][secilenSutun]) {
                System.out.println("Bu noktayı zaten seçtiniz. Tekrar deneyin.");
                continue;
            }

            if (mayinAlani[secilenSatir][secilenSutun] == -1) {
                System.out.println("Mayına bastınız! Oyun bitti.");
                oyunBitti = true;
            } else {
                acikla(secilenSatir, secilenSutun);
                if (kazanmaKontrolu()) {
                    oyunTahtasiniYazdir();
                    System.out.println("Tebrikler, oyunu kazandınız!");
                    oyunBitti = true;
                }
            }
        }
    }

    // Belirtilen hücreyi açan ve gerektiğinde çevresindeki boş hücreleri açan metot
    private void acikla(int r, int c) {
        if (r < 0 || r >= satir || c < 0 || c >= sutun || aciklanan[r][c]) {
            return;
        }

        aciklanan[r][c] = true;

        if (mayinAlani[r][c] == 0) {
            for (int dr = -1; dr <= 1; dr++) {
                for (int dc = -1; dc <= 1; dc++) {
                    acikla(r + dr, c + dc);
                }
            }
        }
    }

    // Oyunun kazanılıp kazanılmadığını kontrol eden metot
    private boolean kazanmaKontrolu() {
        for (int r = 0; r < satir; r++) {
            for (int c = 0; c < sutun; c++) {
                if (!aciklanan[r][c] && mayinAlani[r][c] != -1) {
                    return false;
                }
            }
        }
        return true;
    }
}