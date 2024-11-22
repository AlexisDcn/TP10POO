public class Main {
    public static void main(String[] args) {
        // Oiseau titi = new Cigogne();
        // System.out.println(titi.pondreOeuf());

        // Couleur[] plumage = {Couleur.BLANC, Couleur.NOIR}; 
        // Oiseau titi = new Cigogne(Bec.CISAILLE, 80, plumage);
        // System.out.println(titi);

        
        // Oiseau titi = new Cigogne(); 
        // System.out.println(titi);

        Oiseau titi; 
        titi = new Cigogne(Bec.CISAILLE, 80); 
        titi = new Pingouin(Bec.CISAILLE, 20); 
        System.out.println(titi.faireNid());
        }
    
}
