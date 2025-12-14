package fr.gns.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppTrierParNbVictories {
    public static void main(String[] args) {
        List<Joueur> joueurs = new ArrayList<Joueur>();
        joueurs.add(new Joueur(28, "Parker", "France", 30));
        joueurs.add(new Joueur(25, "Noah", "France", 15));
        joueurs.add(new Joueur(10, "Zidane", "France", 100));

        
        Joueur minVictoires = Collections.min(joueurs);
        System.out.println("Joueur avec le moins de victoires : " + minVictoires);

       
        System.out.println("Avant tri : " + joueurs);
        Collections.sort(joueurs);
        System.out.println("Après tri : " + joueurs);
    }
}
