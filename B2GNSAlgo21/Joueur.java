package fr.gns.app;

public class Joueur implements Comparable<Joueur> {
    private int numero;
    private String nom;
    private String pays;
    private int nbVictoires = 0;

    public Joueur(int numero, String nom, String pays, int nbVictoires) {
        this.numero = numero;
        this.nom = nom;
        this.pays = pays;
        this.nbVictoires = nbVictoires;
    }

    // Question 1.8
    @Override
    public int compareTo(Joueur autre) {
        System.out.println("[Joueur::compareTo(Joueur):int]");
        if (this.nbVictoires > autre.nbVictoires) return 1;
        if (this.nbVictoires < autre.nbVictoires) return -1;
        return 0;
    }
    
    public int getNbVictoires() { return nbVictoires; }
    
    @Override
    public String toString() { return nom + " (" + nbVictoires + " vict.)"; }
}
