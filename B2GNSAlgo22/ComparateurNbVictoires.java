package fr.gns.app;
import java.util.Comparator;

public class ComparateurNbVictoires implements Comparator<Joueur> {
    @Override
    public int compare(Joueur j1, Joueur j2) {
        
        
        if (j1.getNbVictoires() > j2.getNbVictoires()) return 1;
        if (j1.getNbVictoires() < j2.getNbVictoires()) return -1;
        return 0;
    }
}
