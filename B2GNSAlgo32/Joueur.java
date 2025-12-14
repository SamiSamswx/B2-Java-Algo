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
    public boolean equals(Object obj) {
        
        if (this == obj) return true;
        
        if (obj == null) return false;
        
        if (getClass() != obj.getClass()) return false;
        
        
        Joueur autre = (Joueur) obj;
        if (numero != autre.numero) return false;
        if (nom == null) {
            if (autre.nom != null) return false;
        } else if (!nom.equals(autre.nom)) return false;
        
        if (pays == null) {
            if (autre.pays != null) return false;
        } else if (!pays.equals(autre.pays)) return false;
        
        return true;
    }

    @Override
    public String toString() {
        return "Joueur " + nom;
    }
}
