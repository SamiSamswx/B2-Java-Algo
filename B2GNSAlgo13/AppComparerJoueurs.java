package fr.gns.app;

public class AppComparerJoueurs {
    public static void main(String[] args) {
        Joueur jr1 = new Joueur(28, "Parker", "France", 30);
        Joueur jr2 = new Joueur(25, "Noah", "France", 15);

        int res = jr1.compareTo(jr2);
        System.out.println("Resultat comparaison (victoires) : " + res);
    }
}
