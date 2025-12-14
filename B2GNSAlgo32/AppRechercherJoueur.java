package fr.gns.app;
import java.util.ArrayList;
import java.util.List;

public class AppRechercherJoueur {
    public static void main(String[] args) {
        List<Joueur> joueurs = new ArrayList<Joueur>();
        joueurs.add( new Joueur( 25 , "Stacy" , "Suisse" , 372 ) ) ;
        joueurs.add( new Joueur( 27 , "Brant" , "France" , 108 ) ) ;
        joueurs.add( new Joueur( 30 , "Allen" , "France" , 10 ) ) ;
        joueurs.add( new Joueur( 31 , "Pryde" , "Canada" , 208 ) ) ;

        
        Joueur joueur = new Joueur( 27 , "Brant" , "France" , 108 ) ; 
        
        System.out.println( "Index trouvé : " + joueurs.indexOf( joueur ) ) ;
    }
}
