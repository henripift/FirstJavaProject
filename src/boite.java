public class boite
{
    private int poids;
    private Insecte insecte;
    private Assaisonnement assaisonnement;

    public boite(int poids, Insecte insecte) {
        this.poids = poids;
        this.insecte = insecte;
    }

    public int getPoids() {
        return poids;
    }

    public Insecte getInsecte() {
        return insecte;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    public void setInsecte(Insecte insecte) {
        this.insecte = insecte;
    }

    public float prix() {
        float i = (getPoids() * getInsecte().getPrixAuKIlo()) / 1000;
        return i;
    }

    @Override
    public String toString() {
        return "C'est une boîte de " + getInsecte().getNom() + ". Cette boîte pèse " + getPoids() + "g.";
    }
}
