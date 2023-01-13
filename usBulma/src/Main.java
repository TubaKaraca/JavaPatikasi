import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sinir;

        Scanner input = new Scanner(System.in);

        System.out.print("Sınır sayısını giriniz: ");
        sinir = input.nextInt();

        System.out.println("4'ün kuvvetleri: ");
        for(int i=1; i<=sinir; i *= 4){
            System.out.println(i);
        }

        System.out.println("\n5'in kuvvetleri: ");
        for(int j=1; j<=sinir; j *= 5){
            System.out.println(j);
        }
    }
}