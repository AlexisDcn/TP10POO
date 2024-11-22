public class Pingouin extends Oiseau{
    private Couleur[] plumage;
    private Bec formeBec;
    private int longueurAile;

    public Pingouin(Bec formeBec, int longueurAile, Couleur[] plumage) {
        this.formeBec = formeBec;
        this.longueurAile = longueurAile;
        this.plumage = plumage;
    }

    public Pingouin(Bec formeBec, int longueurAile) {
        this.formeBec = formeBec;
        this.longueurAile = longueurAile;
        this.plumage = new Couleur[]{Couleur.BLANC, Couleur.NOIR};
    }

    public Pingouin() {
        this.formeBec = Bec.CROCHET;
        this.longueurAile = 10;
        this.plumage = new Couleur[]{Couleur.BLANC, Couleur.NOIR};
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
        return "Un pingouin pond un oeuf";
    }

    public String faireNid() {
        return "Un pingouin construit son nid sur la banquise";
    }


    public String toString() {
        String str = "";
        for (Couleur couleur : plumage) {
            str += couleur + " ";
        }
        
        
        return "Le pingouin a une forme de bec " + formeBec + " et une longueur d'aile de " + longueurAile + " cm" +" et un plumage de couleur " + str;
    }
}
