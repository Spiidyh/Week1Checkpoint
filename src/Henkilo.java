import java.util.ArrayList;
import java.util.List;

public class Henkilo {
    private String nimi;
    private int syntymavuosi;
    private String paikkakunta;
    private List<String> lempiMuseot;

    public Henkilo(String nimi, int syntymavuosi, String paikkakunta) {
        this.lempiMuseot = new ArrayList<>();
        this.nimi = nimi;
        this.syntymavuosi = syntymavuosi;
        this.paikkakunta = paikkakunta;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public int getSyntymavuosi() {
        return syntymavuosi;
    }

    public void setSyntymavuosi(int syntymavuosi) {
        this.syntymavuosi = syntymavuosi;
    }

    public String getPaikkakunta() {
        return paikkakunta;
    }

    public void setPaikkakunta(String paikkakunta) {
        this.paikkakunta = paikkakunta;
    }

    public List<String> getLempiMuseot() {
        return lempiMuseot;
    }

    public void addLempiMuseot(String m) {
        this.lempiMuseot.add(m);
    }

    public String toString() {
        return nimi + ", " + syntymavuosi + ", " + paikkakunta;
    }

    public String tulostaLempiMuseot() {
        String museot = ": ";
        for (int i = 0 ; i < lempiMuseot.size() ; i++) {
            museot += lempiMuseot.get(i);
            if(i+1 < lempiMuseot.size()) {
                museot += ", ";
            }
        }

        return museot;
    }
}
