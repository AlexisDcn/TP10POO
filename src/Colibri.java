public class Colibri extends Oiseau implements Volant, Siffleur {
    private Couleur[] plumage;
    private Bec formeBec;
    private int longueurAile;

    public Colibri(Bec formeBec, int longueurAile, Couleur[] plumage) {
        this.formeBec = formeBec;
        this.longueurAile = longueurAile;
        this.plumage = plumage;
    }

    public Colibri() {
        this.formeBec = Bec.CROCHET;
        this.longueurAile = 10;
        this.plumage = new Couleur[]{Couleur.MULTICOLORE};
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

    public String voler() {
        return "Un colibri vole";
    }

    public String pondreOeuf() {
        return "Un colibri pond un oeuf";
    }

    public String faireNid() {
        return "Un colibri construit son nid dans un arbre";
    }

    @Override
    public String siffler() {
        return "Un colibri siffle";
    }



}
