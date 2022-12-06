import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a,b,c;  // Üçgenin kenar uzunlukları
        double u; /*  Üçgenin çevresi = 2u
                      u=(a+b+c)/2          */
        double alan; // alan = karekök[(𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐))]

        Scanner input = new Scanner(System.in);
        System.out.print("Üçgenin 1. kenar uzunluğunu giriniz: ");
        a=input.nextDouble();
        System.out.print("Üçgenin 2. kenar uzunluğunu giriniz: ");
        b=input.nextDouble();
        System.out.print("Üçgenin 3. kenar uzunluğunu giriniz: ");
        c=input.nextDouble();

        u = (a+b+c)/2;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin alanı: "+alan);
    }
}