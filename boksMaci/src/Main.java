public class Main {
    public static void main(String[] args) {
        Fighter marc = new Fighter("Marc", 15, 100, 90, 20);
        Fighter alex = new Fighter("Alex", 10, 95, 100, 30);

        // İlk dövüşçüyü rastgele belirleme
        Fighter firstFighter;
        if (Math.random() < 0.5) {
            firstFighter = marc;
        } else {
            firstFighter = alex;
        }

        Ring r = new Ring(firstFighter, firstFighter == marc ? alex : marc, 90, 100);
        r.run();
    }
}