//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Insecte
{
    private String nom;
    private int rnj;
    private float prixAuKIlo;
    private String provenance;

    public Insecte(String nom, int rnj, float prixAuKIlo, String provenance)
    {
        this.nom = nom;
        this.rnj = rnj;
        this.prixAuKIlo = prixAuKIlo;
        this.provenance = provenance;
    }

    public String getNom()
    {
        return nom;
    }

    public int getRnj()
    {
        return rnj;
    }

    public float getPrixAuKIlo()
    {
        return prixAuKIlo;
    }

    public String getProvenance()
    {
        return provenance;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setRnj(int rnj) {
        this.rnj = rnj;
    }
    public void setPrixAuKilo(float prix) {
        this.prixAuKIlo = prix;
    }
    public void setProvenance(String provenance) {
        this.provenance = provenance;
    }

    @Override // écrase le comportement du toString() "de base"
    public String toString() {
        return "Cet insecte est un " + nom + ". Son RNj est de : " + rnj + ", il coûte " + prixAuKIlo + "€/kg et enfin, cet insecte provient de " + provenance + ".";
    }
};
