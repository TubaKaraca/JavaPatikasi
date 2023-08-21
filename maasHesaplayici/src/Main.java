public class Main {
    public static void main(String[] args) {
        // Employee sınıfından bir nesne oluşturulması
        Employee employee = new Employee("kemal", 2000.0, 45, 1985);

        // Employee sınıfının metotlarını kullanarak bilgilerin ekrana yazdırılması
        System.out.println(employee.toString());
    }
}