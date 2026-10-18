public abstract class Pojazd {
    private final int id;
    private final String marka;
    private final String model;
    private final int rokProdukcji;
    private final double cenaZaDzien;

    public Pojazd(int id, String marka, String model, int rokProdukcji, double cenaZaDzien) {
        this.id = id;
        this.marka = marka;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
        this.cenaZaDzien = cenaZaDzien;
    }

    public int getId() { return id; }
    public String getMarka() { return marka; }
    public String getModel() { return model; }
}