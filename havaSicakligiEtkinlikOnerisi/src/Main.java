import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sicaklik;

        Scanner input = new Scanner(System.in);
        System.out.println("Hava Sıcaklığına Göre Etkinlik Önerme");
        System.out.print("Bugün hava kaç derece?: ");
        sicaklik = input.nextInt();

        if(sicaklik<5){
            System.out.println("Kayak yapabilirsin...");
        }
        else if(sicaklik<=25){
            if(sicaklik<=15)
                System.out.println("Sinemaya gidebilirsin...");
            if(sicaklik>=10)
                System.out.println("Pikniğe gidebilirsin...");
        }
        else
            System.out.println("Yüzmeye gidebilirsin...");
    }
}