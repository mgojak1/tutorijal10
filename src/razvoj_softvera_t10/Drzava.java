package razvoj_softvera_t10;

public class Drzava {
    private String naziv, jedinica_za_povrsinu;
    private int broj_stanovnika;
    private  double povrsina;
    private Grad glavni_grad;

    public Drzava(String naziv, String jedinica_za_povrsinu, int broj_stanovnika, double povrsina, Grad glavni_grad) {
        this.naziv = naziv;
        this.jedinica_za_povrsinu = jedinica_za_povrsinu;
        this.broj_stanovnika = broj_stanovnika;
        this.povrsina = povrsina;
        this.glavni_grad = glavni_grad;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getJedinica_za_povrsinu() {
        return jedinica_za_povrsinu;
    }

    public void setJedinica_za_povrsinu(String jedinica_za_povrsinu) {
        this.jedinica_za_povrsinu = jedinica_za_povrsinu;
    }

    public int getBroj_stanovnika() {
        return broj_stanovnika;
    }

    public void setBroj_stanovnika(int broj_stanovnika) {
        this.broj_stanovnika = broj_stanovnika;
    }

    public double getPovrsina() {
        return povrsina;
    }

    public void setPovrsina(double povrsina) {
        this.povrsina = povrsina;
    }

    public Grad getGlavni_grad() {
        return glavni_grad;
    }

    public void setGlavni_grad(Grad glavni_grad) {
        this.glavni_grad = glavni_grad;
    }
}
