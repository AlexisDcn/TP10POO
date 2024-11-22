public class Cigogne extends Oiseau implements Volant {
    private Couleur[] plumage;
    private Bec formeBec;
    private int longueurAile;

    public Cigogne(Bec formeBec, int longueurAile, Couleur[] plumage) {
        this.formeBec = formeBec;
        this.longueurAile = longueurAile;
        this.plumage = plumage;
    }

    public Cigogne() {
        this.formeBec = Bec.CROCHET;
        this.longueurAile = 10;
        this.plumage = new Couleur[] { Couleur.BLANC, Couleur.NOIR };
    }

    public Cigogne(Bec formeBec, int longueurAile) {
        this.formeBec = formeBec;
        this.longueurAile = longueurAile;
        this.plumage = new Couleur[] { Couleur.BLANC, Couleur.NOIR };
    }

    public Couleur[] getPlumage() {
        return plumage;
    }

    public Bec getFormeBec() {
        return formeBec;
    }

    public int getLongueurAile() {
        return longueurAile;
    }

    public void setLongueurAile(int longueurAile) {
        if (longueurAile > this.longueurAile) {
            this.longueurAile = longueurAile;
        }
    }

    public String pondreOeuf() {
        return "Une cigogne pond un oeuf";
    }

    public String faireNid() {
        return "Une cigogne fait son nid sur un clocher";
    }

    public String voler() {
        return "Une cigogne vole";
    }

    public String toString() {
        String str = "";
        for (Couleur couleur : plumage) {
            str += couleur + " ";
        }

        return "La Cigogne a une forme de bec " + formeBec + " et une longueur d'aile de " + longueurAile + " cm"
                + " et un plumage de couleur " + str;
    }
}
