public class Motocykl extends Pojazd {
    private final int pojemnoscSilnika;
    private final boolean maKufer;

    public Motocykl(int id, String marka, String model, int rokProdukcji, double cenaZaDzien,
                    int ojemnoscSilnika, boolean maKufer) {
        super(id, marka, model, rokProdukcji, cenaZaDzien);
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.maKufer = maKufer;
    }
}