public class boite
{
    private int poids;
    private Insecte insecte;
    private Assaisonnement assaisonnement;

    public boite(int poids, Insecte insecte, Assaisonnement assaisonnement) {
        this.poids = poids;
        this.insecte = insecte;
        this.assaisonnement = assaisonnement;
    }

    public int getPoids() {
        return poids;
    }

    public Insecte getInsecte() {
        return insecte;
    }

    public Assaisonnement getAssaisonnement() {
        return assaisonnement;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    public void setInsecte(Insecte insecte) {
        this.insecte = insecte;
    }

    public float prix() {
        float i = (getPoids() * getInsecte().getPrixAuKIlo()) / 1000 + assaisonnement.getPrix();
        return i;
    }

    @Override
    public String toString() {
        return "C'est une boîte de " + getInsecte().getNom() + ". Cette boîte pèse " + getPoids() + "g. Et enfin l'assaisonnement de cette boîte est : " + assaisonnement.getNom() + ".";
    }
}
