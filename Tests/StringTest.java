import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList; // Import the ArrayList class

public class StringTest {

    private Insecte grillon;
    private Insecte criquet;
    private Insecte molitor;
    private Assaisonnement sel;
    private Assaisonnement poivre;
    private Assaisonnement paprika;
    private boite boiteGrillons;
    private boiteAssaisonnee boiteCriquets;
    private boiteAssaisonnee boiteMolitors;
    private ArrayList<Insecte> liste_Insectes;
    private ArrayList<boite> l_boites;
    private ArrayList<boiteAssaisonnee> l_boitesAssaisonnee;


    @Before
    public void setup() {
        this.grillon = new Insecte("Grillon", 24, 80, "Espagne");
        this.criquet = new Insecte("Criquet", 54, 180, "France");
        this.molitor = new Insecte("Molitor", 14, 40, "France");
        this.sel = new Assaisonnement("Sel", 1.80F);
        this.poivre = new Assaisonnement("Poivre", 2.20F);
        this.paprika = new Assaisonnement("Paprika", 1.25F);
        this.boiteGrillons = new boite(14, grillon);
        this.boiteCriquets = new boiteAssaisonnee(15, criquet, poivre);
        this.boiteMolitors = new boiteAssaisonnee(16, molitor, paprika);
        this.liste_Insectes = new ArrayList<Insecte>();
        liste_Insectes.add(grillon);
        liste_Insectes.add(criquet);
        liste_Insectes.add(molitor);
        this.l_boites = new ArrayList<boite>();
        l_boites.add(boiteGrillons);
        l_boites.add(boiteCriquets);
        l_boites.add(boiteMolitors);
        this.l_boitesAssaisonnee = new ArrayList<boiteAssaisonnee>();
        l_boitesAssaisonnee.add(boiteCriquets);
        l_boitesAssaisonnee.add(boiteMolitors);
    }

    @Test
    public void testPrix() {
        assertEquals(1.12F, boiteGrillons.prix(), 0);
        assertEquals(1.89F, boiteMolitors.prix(), 0);
    }

    @Test
    public void testProvenance() {
        assertEquals(2, Main.nbInsectesByProvenance("France", liste_Insectes), 0);
    }

    @Test
    public void boitesByInsecte() {
        assertEquals(1, Main.boitesByInsecte("Grillon", l_boites).size(),0);
    }

    @Test
    public void boitesByAssaisonnement() {
        assertEquals(1, Main.boitesByAssaisonnement("Paprika", l_boitesAssaisonnee).size(), 0);
    }

}
