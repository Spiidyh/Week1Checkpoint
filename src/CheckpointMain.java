import java.util.Scanner;

public class CheckpointMain {


    private static final String menuteksti = "\nAnna vaihtoehto:\n"
            + "1: LisÃ¤Ã¤ museo\n"
            + "2: Tulosta kaikki\n"
            + "0: Lopeta";

    public void run() {
        MuseoKirjasto museot = new MuseoKirjasto();
        Scanner scanner = new Scanner(System.in);
        for (; ; ) {
            System.out.println(menuteksti);
            String vastaus = scanner.nextLine().trim();
            if ("1".equals(vastaus)) {
                lisaaUusi(scanner);
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

    private void tulostaMuseot(MuseoKirjasto m) {
        for(Museo m : m.getMuseot()) {
            System.out.println(m);
        }
    }

    private void lisaaUusi(Scanner scanner, MuseoKirjasto m) {
        System.out.println("Kirjoita museon nimi: ");
        String nimi = scanner.nextLine();
        System.out.println("Kirjoita museon sijainti: ");
        String sijainti = scanner.nextLine();
        System.out.println("Kirjoita museon perustamisvuosi: ");
        int perustamisvuosi = Integer.parseInt(scanner.nextLine());
        m.addMuseo(new Museo(nimi, sijainti, perustamisvuosi));

    }

    public static void main(String[] args) {
        new CheckpointMain().run();
    }
}









