import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, r, bolunen=1, bolen1=1, bolen2=1, sonuc;

        Scanner input = new Scanner(System.in);

        System.out.println("*Kombinasyon Hesabı*\nC(n,r)");
        System.out.print("n sayısını giriniz: ");
        n = input.nextInt();
        System.out.print("r sayısını giriniz: ");
        r = input.nextInt();

        for(int i=1; i<=n; i++){
            bolunen = bolunen * i;
        }
        for(int j=1; j<=r; j++){
            bolen1 = bolen1 * j;
        }
        for(int k=1; k<=(n-r); k++){
            bolen2 = bolen2 * k;
        }
        sonuc = bolunen / (bolen1 * bolen2);
        System.out.println("Sonuç: " + sonuc);
    }
}