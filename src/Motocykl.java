public class Motocykl extends Pojazd {
    private final int pojemnoscSilnika;
    private final boolean maKufer;

    public Motocykl(int id, String marka, String model, int rokProdukcji, double cenaZaDzien,
                    int pojemnoscSilnika, boolean maKufer) {
        super(id, marka, model, rokProdukcji, cenaZaDzien);
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.maKufer = maKufer;
    }

    @Override
    public String getTyp() {
        return "Motocykl";
    }

    @Override
    public String getSzczegoly() {
        return "pojemność: " + pojemnoscSilnika + " cm3, kufer: " + (maKufer ? "tak" : "nie");
    }
}