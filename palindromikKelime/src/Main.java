import java.util.Scanner;

public class Main {
    static boolean palindromeMi(String kelime) {
        int i = 0, j = kelime.length() - 1;
        while (i < j) {
            if (kelime.charAt(i) != kelime.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String kelime;

        Scanner input = new Scanner(System.in);

        System.out.print("Kelimeyi giriniz: ");
        kelime = input.nextLine();

        if(palindromeMi(kelime)){
            System.out.println("Kelime palindromik");
        }
        else
            System.out.println("Kelime palindromik değil");
    }
}