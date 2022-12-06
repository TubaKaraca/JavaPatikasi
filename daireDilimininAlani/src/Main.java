import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double r, a, pi=3.14;  //r=Daire diliminin yarıçapı,  a=Daire diliminin merkez açısının ölçüsü

        Scanner input = new Scanner(System.in);
        System.out.print("Daire diliminin yarıçapını giriniz: ");
        r = input.nextDouble();

        System.out.print("Daire diliminin merkez açısını giriniz: ");
        a= input.nextDouble();

        double alan = (pi*(r*r)*a)/360;
        System.out.println("Daire diliminin alanı: "+alan);
    }
}