public class boiteAssaisonnee extends boite{
    private Assaisonnement assaisonnement;

    public boiteAssaisonnee(int poids, Insecte insecte, Assaisonnement assaisonnement) {
        super(poids, insecte);
        this.assaisonnement = assaisonnement;
    }


    public float prix() {
        float i = super.prix() + assaisonnement.getPrix();
        return i;
    }

    public Assaisonnement getAssaisonnement() {
        return assaisonnement;
    }

    @Override
    public String toString() {
        return super.toString() + " De plus, cette boîte est assaisonnée au " + assaisonnement.getNom() + ".";
    }

}
