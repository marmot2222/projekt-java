public class Samochod extends Pojazd {
    private final int liczbaMiejsc;
    private final String rodzajPaliwa;

    public Samochod(int id, String marka, String model, int rokProdukcji, double cenaZaDzien,
                    int liczbaMiejsc, String rodzajPaliwa) {
        super(id, marka, model, rokProdukcji, cenaZaDzien);
        this.liczbaMiejsc = liczbaMiejsc;
        this.rodzajPaliwa = rodzajPaliwa;
    }
}