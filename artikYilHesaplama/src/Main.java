import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yil;
        boolean artikYilMi=false;

        Scanner input = new Scanner(System.in);

        System.out.println("*ARTIK YIL HESAPLAMA*");
        System.out.print("Yılı giriniz: ");
        yil = input.nextInt();

        if(yil%4==0){
            if(yil%100!=0)
                artikYilMi=true;
            else if(yil%100==0 && yil%400==0)
                artikYilMi=true;
        }
        if(artikYilMi)
            System.out.println(yil + " bir artık yıldır.");
        else
            System.out.println(yil + " bir artık yıl değildir.");
    }
}