public class Museo {
    private String nimi;
    private String sijainti;
    private int perustusVuosi;

    public Museo(String nimi, String sijainti, int perustusVuosi) {
        this.nimi = nimi;
        this.sijainti = sijainti;
        this.perustusVuosi = perustusVuosi;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public String getSijainti() {
        return sijainti;
    }

    public void setSijainti(String sijainti) {
        this.sijainti = sijainti;
    }

    public int getPerustusVuosi() {
        return perustusVuosi;
    }

    public void setPerustusVuosi(int perustusVuosi) {
        this.perustusVuosi = perustusVuosi;
    }

    public String toString() {
        return "Museon nimi: " + nimi + "\nSijainti: "+ sijainti + "\nPerustettu vuonna: " + perustusVuosi +"\n";
    }
}
