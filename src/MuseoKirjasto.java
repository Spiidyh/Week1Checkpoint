import java.util.ArrayList;
import java.util.List;

public class MuseoKirjasto {
    private List<Museo> lista = new ArrayList<>();

    public MuseoKirjasto() {
        this.lista = new ArrayList<>();
    }

    public void addMuseo(Museo m) {
        lista.add(m);
    }
    public Museo getMuseo(String nimi) {
        for(Museo m : lista) {
            if(m.getNimi().equalsIgnoreCase("nimi")) {
                return m;
            }
        }
        return null;
    }
    public List<Museo> getMuseot() {
        return lista;
    }
}
