public abstract class Pojazd {
    private final int id;
    private final String marka;
    private final String model;
    private final int rokProdukcji;
    private final double cenaZaDzien;
    private boolean wypozyczony;
    private Integer idKlienta;

    public Pojazd(int id, String marka, String model, int rokProdukcji, double cenaZaDzien) {
        this.id = id;
        this.marka = marka;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
        this.cenaZaDzien = cenaZaDzien;
        this.wypozyczony = false;
        this.idKlienta = null;
    }

    public abstract String getTyp();

    public abstract String getSzczegoly();

    public void wypozycz(int idKlienta) {
        this.wypozyczony = true;
        this.idKlienta = idKlienta;
    }

    public void zwroc() {
        this.wypozyczony = false;
        this.idKlienta = null;
    }

    public int getId() { return id; }
    public String getMarka() { return marka; }
    public String getModel() { return model; }
    public int getRokProdukcji() { return rokProdukcji; }
    public double getCenaZaDzien() { return cenaZaDzien; }
    public boolean isWypozyczony() { return wypozyczony; }
    public Integer getIdKlienta() { return idKlienta; }

    @Override
    public String toString() {
        String status = wypozyczony ? "ZAJĘTY" : "WOLNY";
        return String.format("[%d] %-10s %s %s (%d) | %s | %.2f zł/dzień | %s",
                id, getTyp(), marka, model, rokProdukcji, getSzczegoly(), cenaZaDzien, status);
    }
}