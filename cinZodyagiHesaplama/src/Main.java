import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int dogumYili, kalan;
        String cinZodyagi="";

        Scanner input = new Scanner(System.in);

        System.out.print("Doğum yılınızı giriniz: ");
        dogumYili = input.nextInt();
        kalan = dogumYili % 12;

        switch (kalan){
            case 0:
                cinZodyagi = "Maymun";
                break;
            case 1:
                cinZodyagi ="Horoz";
                break;
            case 2:
                cinZodyagi ="Köpek";
                break;
            case 3:
                cinZodyagi ="Domuz";
                break;
            case 4:
                cinZodyagi ="Fare";
                break;
            case 5:
                cinZodyagi ="Öküz";
                break;
            case 6:
                cinZodyagi ="Kaplan";
                break;
            case 7:
                cinZodyagi ="Tavşan";
                break;
            case 8:
                cinZodyagi ="Ejderha";
                break;
            case 9:
                cinZodyagi ="Yılan";
                break;
            case 10:
                cinZodyagi ="At";
                break;
            case 11:
                cinZodyagi ="Koyun";
                break;

        }
        System.out.println("Çin Zodyağı Burcunuz: " + cinZodyagi);
    }
}