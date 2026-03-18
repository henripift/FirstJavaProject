import java.util.ArrayList; // Import the ArrayList class

public class Main {
    static int nbInsectesByProvenance(String nomProvenance, ArrayList<Insecte> desInsectes) {
        int nb = 0;
        for (int i = 0 ; i < desInsectes.size(); i++) {
            if (desInsectes.get(i).getProvenance().equals(nomProvenance)){
                nb++;
            }
        }
        return nb;
    }

    static ArrayList<boite> boitesByInsecte(String nomInsecte, ArrayList<boite> l_boites) {
        ArrayList<boite> liste_boites = new ArrayList<boite>();
        for (int i = 0 ; i < l_boites.size(); i++) {
            if (l_boites.get(i).getInsecte().getNom().equals(nomInsecte)) {
                liste_boites.add(l_boites.get(i));
            }
        }
        return liste_boites;
    }

    static ArrayList<boite> boitesByAssaisonnement(String nomAssaisonnement, ArrayList<boite> l_boites) {
        ArrayList<boite> liste_boites = new ArrayList<boite>();
        for (int i = 0 ; i < l_boites.size(); i++) {
            if (l_boites.get(i).getAssaisonnement().getNom().equals(nomAssaisonnement)) {
                liste_boites.add(l_boites.get(i));
            }
        }
        return liste_boites;
    }


    public static void main(String[] args) {
        // création des insectes
        Insecte grillon = new Insecte("Grillon", 24, 80, "Espagne");
        Insecte criquet = new Insecte("Criquet", 54, 180, "France");
        Insecte molitor = new Insecte("Molitor", 14, 40, "France");

        Assaisonnement sel = new Assaisonnement("Sel", 1.80F);
        Assaisonnement poivre = new Assaisonnement("Poivre", 2.20F);
        Assaisonnement paprika = new Assaisonnement("Paprika", 1.25F);

        // création des boîtes
        boite boiteGrillons = new boite(14, grillon, sel);
        boite boiteCriquets = new boite(15, criquet, poivre);
        boite boiteMolitors = new boite(16, molitor, paprika);

        // ajout des insectes dans la liste d'insectes
        ArrayList<Insecte> liste_Insectes = new ArrayList<Insecte>();
        liste_Insectes.add(grillon);
        liste_Insectes.add(criquet);
        liste_Insectes.add(molitor);

        // ajout des boîtes d'insectes à la liste de boîtes
        ArrayList<boite> l_boites = new ArrayList<boite>();
        l_boites.add(boiteGrillons);
        l_boites.add(boiteCriquets);
        l_boites.add(boiteMolitors);

        // stockage des fonctons dans des variables
        int provenanceFrance = nbInsectesByProvenance("France", liste_Insectes);
        ArrayList<boite> boitesAvecGrillons = boitesByInsecte("Grillon", l_boites);
        ArrayList<boite> boitesAssaisonneeAuSel = boitesByAssaisonnement("Sel", l_boites);

        // affichage d'un grillon, d'une boîte de grillons, du prix d'une boîte de grillons, du nb d'insecte provenant de France, du nb de boîte contenant des grillons
        System.out.println(grillon);
        System.out.println(boiteGrillons);
        System.out.println("Le prix de la boîte de grillons est de " + boiteGrillons.prix() + "€.");
        System.out.println("Le nombre d'insecte qui provient de France est : " + provenanceFrance);
        System.out.println(("Le nombre de boîte d'insectes est de : " + boitesAvecGrillons.size()));

        // Assertions pour tester les fonctions
        // assert provenanceFrance == 2: "Erreur";
        // assert provenanceFrance == 1 : "Erreur";
        // assert boitesAvecGrillons.size() == 2: "Erreur";
        // assert boitesAvecGrillons.size() == 1: "Erreur";
        // assert boitesAssaisonneeAuSel.size () == 1 : "Erreur";
        // assert boitesAssaisonneeAuSel.size () == 2 : "Erreur";
    }
}