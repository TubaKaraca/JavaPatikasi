import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armutTL=2.14, elmaTL=3.67, domatesTL=1.11, muzTL=0.95, patlicanTL=5.00;
        double kgArmut, kgElma, kgDomates, kgMuz, kgPatlican;

        Scanner input = new Scanner(System.in);

        System.out.print("Kaç kilo armut aldınız?: ");
        kgArmut = input.nextDouble();
        System.out.print("Kaç kilo elma aldınız?: ");
        kgElma = input.nextDouble();
        System.out.print("Kaç kilo domates aldınız?: ");
        kgDomates = input.nextDouble();
        System.out.print("Kaç kilo muz aldınız?: ");
        kgMuz = input.nextDouble();
        System.out.print("Kaç kilo patlıcan aldınız?: ");
        kgPatlican = input.nextDouble();

        double toplamTutar = (kgArmut*armutTL) + (kgElma*elmaTL) + (kgDomates*domatesTL) + (kgMuz*muzTL) + (kgPatlican*patlicanTL);
        System.out.println("Toplam tutar: "+toplamTutar+" TL");
    }
}