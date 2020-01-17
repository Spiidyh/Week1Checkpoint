import java.util.Scanner;

public class CheckpointMain {


    private static final String menuteksti = "\nAnna vaihtoehto:\n"
            + "1: Lisää museo\n"
            + "2: Tulosta kaikki\n"
            + "0: Lopeta";

    public void run() {
        MuseoKirjasto museot = new MuseoKirjasto();
        Scanner scanner = new Scanner(System.in);
        for (; ; ) {
            System.out.println(menuteksti);
            String vastaus = scanner.nextLine().trim();
            if ("1".equals(vastaus)) {
                lisaaUusi(scanner, museot);
            } else if ("2".equals(vastaus)) {
                tulostaMuseot(museot);
            } else if ("0".equals(vastaus)) {
                break;
            } else {
                System.err.println(String.format("Tuntematon vaihtoehto: '%s'",
                        vastaus));
            }
        }
    }

    private void tulostaMuseot(MuseoKirjasto mk) {
        for(Museo m : mk.getMuseot()) {
            System.out.println(m);
        }
    }

    private void lisaaUusi(Scanner scanner, MuseoKirjasto m) {
        System.out.println("Museon nimi: ");
        String nimi = scanner.nextLine();
        System.out.println("Sijainti: ");
        String sijainti = scanner.nextLine();
        System.out.println("Perustamisvuosi: ");
        int perustamisvuosi = Integer.parseInt(scanner.nextLine());
        m.addMuseo(new Museo(nimi, sijainti, perustamisvuosi));

    }

    public static void main(String[] args) {
        new CheckpointMain().run();
    }
}









