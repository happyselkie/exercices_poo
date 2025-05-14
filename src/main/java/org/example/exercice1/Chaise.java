package org.example.exercice1;

public class Chaise {
    private int nbrPieds;
    private String materiaux;
    private String couleur;
    private double prix;

    public Chaise(int nbrPieds, String materiaux, String couleur, double prix) {
        this.nbrPieds = nbrPieds;
        this.materiaux = materiaux;
        this.couleur = couleur;
        this.prix = prix;
    }

    public Chaise(){

    }

    public int getNbrPieds() {
        return nbrPieds;
    }

    public void setNbrPieds(int nbrPieds) {
        this.nbrPieds = nbrPieds;
    }

    public String getMateriaux() {
        return materiaux;
    }

    public void setMateriaux(String materiaux) {
        this.materiaux = materiaux;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Je suis une chaise avec " + this.nbrPieds + " pieds en " + this.materiaux + " de couleur " + this.couleur + " à un prix de " + this.prix;
    }
}
