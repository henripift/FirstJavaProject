public class Assaisonnement {
    private String nom;
    private Float prix;

    public Assaisonnement(String nom, Float prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public String getNom() {
        return nom;
    }

    public Float getPrix() {
        return prix;
    }

    public void setPrix(Float prix) {
        this.prix = prix;
    }

    @Override
    public  String toString() {
        return "Assaisonnement : " + nom + ", Prix : " + prix;
    }

}
