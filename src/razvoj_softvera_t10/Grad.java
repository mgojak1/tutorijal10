package razvoj_softvera_t10;

public class Grad {
    private String naziv;
    private int broj_stanovnika;
    private double[] temperature;

    public Grad(String naziv, int broj_stanovnika, double[] temperature) {
        this.naziv = naziv;
        this.broj_stanovnika = broj_stanovnika;
        this.temperature = temperature;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getBroj_stanovnika() {
        return broj_stanovnika;
    }

    public void setBroj_stanovnika(int broj_stanovnika) {
        this.broj_stanovnika = broj_stanovnika;
    }

    public double[] getTemperature() {
        return temperature;
    }

    public void setTemperature(double[] temperature) {
        this.temperature = temperature;
    }
}
