public class Bezoeker {

    private String naam;
    private double portemonnee;
    private int dronkenschap;

    public Bezoeker(String naam, double portemonnee, int dronkenschap) {
        this.naam = naam;
        this.portemonnee = portemonnee;
        this.dronkenschap = dronkenschap;
    }

    public int dronkenschapBijhouden(int dronkenschap) {
        this.dronkenschap = this.dronkenschap + dronkenschap;
        if (this.dronkenschap == 10) {
            System.out.println(this.naam + ", je dronkenschapsniveau is " + this.dronkenschap + " Je bent nu helaas dronken. Komt u morgen alstublieft terug.");
            System.exit(0);
        } else {
            System.out.println(this.naam + ", je dronkenschapsniveau is " + this.dronkenschap);
        }

        return dronkenschap;
    }


    public double getPortemonnee() {
        return portemonnee;
    }

    public int getDronkenschap() {
        return dronkenschap;
    }

    public double werkPortemonneeBij(double prijs) {
        this.portemonnee = this.portemonnee - prijs;
        System.out.println("Je hebt nog EUR " + this.portemonnee + " op zak.");
        return portemonnee;
    }

    public String toString() {
        if (dronkenschap >= 10) {
            return "De bezoeker heet " + this.naam + ", heeft " + this.portemonnee + " euro bij zich en is dronken.";
        } else {
            return "De bezoeker heet " + this.naam + ", heeft " + this.portemonnee + " euro bij zich en is niet dronken.";
        }
    }

}
