public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    double oralPercentage; // Sözlü notunun yüzdesi
    double examPercentage; // Sınav notunun yüzdesi

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.oralPercentage = 0; // Varsayılan olarak 0 ayarlandı
        this.examPercentage = 100; // Varsayılan olarak 100 ayarlandı
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }

    // Sözlü notunun yüzdesini ayarlamak için metot
    public void setOralPercentage(double oralPercentage) {
        if (oralPercentage >= 0 && oralPercentage <= 100) {
            this.oralPercentage = oralPercentage;
            this.examPercentage = 100 - oralPercentage;
        } else {
            System.out.println("Geçersiz yüzde değeri!");
        }
    }
}