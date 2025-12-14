package fr.gns.app;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppTrierParNbVictories {
    public static void main(String[] args) {
        List<Joueur> joueurs = new ArrayList<>();
        joueurs.add(new Joueur(28, "Parker", "France", 30));
        joueurs.add(new Joueur(10, "Zidane", "France", 100));


        Collections.sort(joueurs, new ComparateurNbVictoires());
        System.out.println("Liste triée via Comparator : " + joueurs);
    }
}
