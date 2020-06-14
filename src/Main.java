import java.util.Scanner;

public class Main {

    static public void main(String... _WillekeurigeNaamOmdatHetKan) {
        Scanner scanner = new Scanner(System.in);
        Café café = new Café("café Qien", 5, 5, 5, 25);
        System.out.println(café);
        Bezoeker bezoeker = new Bezoeker("Klaas", 40, 0);

        while (true) {
            System.out.println("Wat kan ik voor u inschenken?");
            String antwoord = scanner.nextLine();
            if (bezoeker.getPortemonnee() < 1) {
                System.out.println("Sorry, ons goedkoopste drankje (koffie) kost EUR 1,50. U heeft daarom momenteel onvoldoende geld op zak. Zie ik u morgen weer?");
                System.exit(0);
            }
            if (bezoeker.getDronkenschap() >= 10 && (!antwoord.equals("bier") || !antwoord.equals("wijn") || !antwoord.equals("whiskey"))) {
                System.out.println("Sorry, ik ruik dat u dronken bent. Slaapt u alstublieft uw roes uit en komt u morgen gerust terug.");
                System.exit(0);
            }

            if (antwoord.equals("bier") && café.getVoorraadBier() > 0) {
                Drank drank = new Drank("Bier", 2.00);
                café.voorraadBierBijwerken(1);
                bezoeker.werkPortemonneeBij(2.00);
                bezoeker.dronkenschapBijhouden(1);
            }
            if (antwoord.equals("wijn") && café.getVoorraadWijn() > 0) {
                Drank drank = new Drank("Wijn", 2.50);
                café.voorraadWijnBijwerken(1);
                bezoeker.werkPortemonneeBij(2.50);
                bezoeker.dronkenschapBijhouden(1);
            }
            if (antwoord.equals("whiskey") && café.getVoorraadWhiskey() > 0) {
                Drank drank = new Drank("Whiskey", 3.00);
                café.voorraadWhiskeyBijwerken(1);
                bezoeker.werkPortemonneeBij(3.00);
                bezoeker.dronkenschapBijhouden(1);
            }
            if (antwoord.equals("koffie") && café.getVoorraadKoffie() > 0) {
                Drank drank = new Drank("Koffie", 1.50);
                café.voorraadKoffieBijwerken(1);
                bezoeker.werkPortemonneeBij(1.50);
                bezoeker.dronkenschapBijhouden(-1);
            }
        }
    }
}
