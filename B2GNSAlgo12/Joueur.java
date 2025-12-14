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


    public boolean equals(Joueur autre) {
        System.out.println("[Joueur::equals(Joueur):boolean]");
        if (autre == null) return false;
        return this.numero == autre.numero;
    }

    @Override
    public String toString() {
        return "Num:" + numero + " Nom:" + nom;
    }
}
