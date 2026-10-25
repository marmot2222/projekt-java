public class Motocykl extends Pojazd {
    private final int pojemnosc;

    public Motocykl(String marka, String model, double cena, int pojemnosc) {
        super(marka, model, cena);
        this.pojemnosc = pojemnosc;
    }

    @Override
    public String szczegoly() {
        return "Motocykl, " + pojemnosc + " cm3";
    }
}