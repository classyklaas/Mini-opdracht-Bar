public class Café {

    private String naam;
    private int voorraadBier;
    private int voorraadWijn;
    private int voorraadWhiskey;
    private int voorraadKoffie;

    public Café(String naam, int voorraadBier, int voorraadWijn, int voorraadWhiskey, int voorraadKoffie){
        this.naam = naam;
        this.voorraadBier = voorraadBier;
        this.voorraadWijn = voorraadWijn;
        this.voorraadWhiskey = voorraadWhiskey;
        this.voorraadKoffie = voorraadKoffie;
    }

    public int getVoorraadBier() {
        return voorraadBier;
    }

    public int voorraadBierBijwerken(int consumptieBier){
        this.voorraadBier = this.voorraadBier -1;
        if (this.voorraadBier == 0){
            System.out.println("De huidige voorraad bier is " + this.voorraadBier + ". We hebben nu dus helaas geen bier meer, excuses.");
        } else
        System.out.println("De huidige voorraad bier is " + this.voorraadBier);
        return voorraadBier;
    }

    public int getVoorraadWijn() {
        return voorraadWijn;
    }

    public int voorraadWijnBijwerken(int consumptieWijn){
        this.voorraadWijn = this.voorraadWijn -1;
        if (this.voorraadWijn == 0){
            System.out.println("De huidige voorraad wijn is " + this.voorraadWijn + ". We hebben nu dus helaas geen wijn meer, excuses.");
        } else
        System.out.println("De huidige voorraad wijn is " + this.voorraadWijn);
        return voorraadWijn;
    }

    public int getVoorraadWhiskey() {
        return voorraadWhiskey;
    }

    public int voorraadWhiskeyBijwerken(int consumptieWhiskey){
        this.voorraadWhiskey = this.voorraadWhiskey -1;
        if (this.voorraadWhiskey == 0){
            System.out.println("De huidige voorraad whiskey is " + this.voorraadWhiskey + ". We hebben nu dus helaas geen whiskey meer, excuses.");
        } else
        System.out.println("De huidige voorraad whiskey is " + this.voorraadWhiskey);
        return voorraadWhiskey;
    }

    public int getVoorraadKoffie() {
        return voorraadKoffie;
    }

    public int voorraadKoffieBijwerken(int consumptieKoffie){
        this.voorraadKoffie = this.voorraadKoffie -1;
        if (this.voorraadKoffie == 0){
            System.out.println("De huidige voorraad koffie is " + this.voorraadKoffie + ". We hebben nu dus helaas geen koffie meer, excuses.");
        } else
        System.out.println("De huidige voorraad koffie is " + this.voorraadKoffie);
        return voorraadKoffie;
    }

    public String toString(){
        return "Welkom in " + this.naam + "! We hebben "
                + voorraadBier + " bier, "
                + voorraadWijn + " wijn, "
                + voorraadWhiskey + " whiskey en "
                + voorraadKoffie + " koffie op voorraad.";
    }
}
