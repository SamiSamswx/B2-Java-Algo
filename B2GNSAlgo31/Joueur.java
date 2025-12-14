package fr.gns.app;

public class Joueur {
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

    @Override
    public String toString() {
        return "Joueur [numero=" + numero + ", nom=" + nom + ", pays=" + pays + ", nbVictoires=" + nbVictoires + "]";
    }
}
