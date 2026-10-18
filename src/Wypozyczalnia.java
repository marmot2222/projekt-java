public class Wypozyczalnia {

    public static void main(String[] args) {
        System.out.println("=== WYPOŻYCZALNIA POJAZDÓW ===");

        Pojazd auto = new Samochod(1, "Toyota", "Corolla", 2021, 150.0, 5, "benzyna");
        Pojazd motor = new Motocykl(2, "Honda", "CBR600RR", 2022, 120.0, 600, false);

        System.out.println(auto.getMarka() + " " + auto.getModel());
        System.out.println(motor.getMarka() + " " + motor.getModel());
    }
}