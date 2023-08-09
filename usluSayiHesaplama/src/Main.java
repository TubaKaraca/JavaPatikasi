import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, k, sonuc=1;

        Scanner input = new Scanner(System.in);
        System.out.print("Üssü alınacak sayı: ");
        n = input.nextInt();

        System.out.print("Üs olacak sayı: ");
        k = input.nextInt();

        for(int i=0; i<k; i++){
            sonuc *= n;
        }
        System.out.print("Sonuc: "+sonuc);

    }
}