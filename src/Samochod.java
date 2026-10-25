public class Samochod extends Pojazd {
    private final int miejsca;

    public Samochod(String marka, String model, double cena, int miejsca) {
        super(marka, model, cena);
        this.miejsca = miejsca;
    }

    @Override
    public String szczegoly() {
        return "Samochod, miejsc: " + miejsca;
    }
}
