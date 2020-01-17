import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckpointMain {


    private static final String menuteksti = "\nAnna vaihtoehto:\n"
            + "1: Lisää museo\n"
            + "2: Tulosta museot\n"
            + "3: Lisää henkilo\n"
            + "4: Kerro mistä museosta henkilö pitää\n"
            + "5: Tulosta henkilöt\n"
            + "0: Lopeta";

    public void run() {
        List<Museo> museot = new ArrayList<>();
        List<Henkilo> henkilot = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (; ; ) {
            System.out.println(menuteksti);
            String vastaus = scanner.nextLine().trim();
            if ("1".equals(vastaus)) {
                lisaaUusi(scanner, museot);
            } else if ("2".equals(vastaus)) {
                tulostaMuseot(museot);
            } else if ("3".equals(vastaus)) {
                lisaaHenkilo(scanner, henkilot);
            } else if ("4".equals(vastaus)) {
                lisaaHenkilonMuseoKiinnostus(scanner, henkilot, museot);
            } else if ("5".equals(vastaus)) {
                tulostaHenkilot(henkilot);
            } else if ("0".equals(vastaus)) {
                break;
            } else {
                System.err.println(String.format("Tuntematon vaihtoehto: '%s'",
                        vastaus));
            }
        }
    }

    private void lisaaHenkilo(Scanner s, List<Henkilo> hlot) {
        try {
            System.out.println("Nimi: ");
            String nimi = s.nextLine();
            System.out.println("Syntymävuosi: ");
            int syntymavuosi = Integer.parseInt(s.nextLine());
            System.out.println("Paikkakunta: ");
            String paikkakunta = s.nextLine();
            hlot.add(new Henkilo(nimi, syntymavuosi, paikkakunta));
        }
        catch (Exception e) {
            System.out.println("Virhe syötteessä: "+  e.getMessage());
        }
    }

    private void lisaaHenkilonMuseoKiinnostus(Scanner s, List<Henkilo> lista, List<Museo> mlista) {
        try {
            System.out.println("Kenelle lisätään lempimuseo (syötä listasta henkilön numero): ");
            for (int i = 0; i < lista.size(); i++) {
                System.out.println("Numero: " + i + ", Tiedot: " + lista.get(i));
            }
         System.out.println("Syötä henkilön numero: ");
            int hlonumero = Integer.valueOf(s.nextLine());
            System.out.println("Mikä museo lisätään (syötä listasta museon numero)");
            for (int i = 0; i < mlista.size(); i++) {
                System.out.println("Numero: " + i + " Tiedot: " + mlista.get(i).getNimi());
            }
            System.out.println("Syötän museon numero: ");
            int museonumero = Integer.parseInt(s.nextLine());
            String museonimi = mlista.get(museonumero).getNimi();
            lista.get(hlonumero).addLempiMuseot(museonimi);
        }
        catch(Exception e) {
            System.out.println("Virhe: museoo, tai henkilöö ei löydy");
        }
    }

    private void tulostaHenkilot(List<Henkilo> hlot) {
        try {
            System.out.println(hlot.size());
            for (Henkilo h : hlot) {
                System.out.println(h +h.tulostaLempiMuseot());

            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    private void tulostaMuseot(List<Museo> mk) {
        for (Museo m : mk) {
            System.out.println(m);
        }
    }

    private void lisaaUusi(Scanner scanner, List<Museo> m) {
        try {
            System.out.println("Museon nimi: ");
            String nimi = scanner.nextLine();
            System.out.println("Sijainti: ");
            String sijainti = scanner.nextLine();
            System.out.println("Perustamisvuosi: ");
            int perustamisvuosi = Integer.parseInt(scanner.nextLine());
            m.add(new Museo(nimi, sijainti, perustamisvuosi));
        }
        catch(Exception e) {
            System.out.println("Virhe syötteessä: " + e.getMessage());
        }

    }

    public static void main(String[] args) {
        new CheckpointMain().run();
    }
}









