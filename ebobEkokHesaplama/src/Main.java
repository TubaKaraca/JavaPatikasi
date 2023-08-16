import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        int sayi1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = input.nextInt();

        int ebob = 1;
        int ekok = (sayi1 * sayi2);

        int min = Math.min(sayi1, sayi2);

        while (min >= 1) {
            if (sayi1 % min == 0 && sayi2 % min == 0) {
                ebob = min;
                break;
            }
            min--;
        }

        int max = Math.max(sayi1, sayi2);

        while (true) {
            if (max % sayi1 == 0 && max % sayi2 == 0) {
                ekok = max;
                break;
            }
            max++;
        }

        System.out.println("Girilen sayıların EBOB değeri: " + ebob);
        System.out.println("Girilen sayıların EKOK değeri: " + ekok);
    }
}