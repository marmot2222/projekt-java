public abstract class Pojazd {
    private static int licznik = 1;
    protected final int id;
    protected final String marka;
    protected final String model;
    protected final double cena;

    public Pojazd(String marka, String model, double cena) {
        this.id = licznik++;
        this.marka = marka;
        this.model = model;
        this.cena = cena;
    }

    public int getId() { return id; }

    public abstract String szczegoly();

    @Override
    public String toString() {
        return "[" + id + "] " + marka + " " + model + " | " + szczegoly() + " | " + cena + " zl/dzien";
    }
}