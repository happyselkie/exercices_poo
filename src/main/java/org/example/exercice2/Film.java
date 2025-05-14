package org.example.exercice2;

import java.util.Date;

public class Film {
    private String titre;
    private String realisateur;
    private String dateSortie;
    private String genre;

    public Film(String titre, String realisateur, String dateSortie, String genre) {
        this.titre = titre;
        this.realisateur = realisateur;
        this.dateSortie = dateSortie;
        this.genre = genre;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }

    public String getDateSortie() {
        return dateSortie;
    }

    public void setdateSortie(String dateSortie) {
        this.dateSortie = dateSortie;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Film{" +
                "titre='" + titre + '\'' +
                ", realisateur='" + realisateur + '\'' +
                ", dateSortie=" + dateSortie +
                ", genre='" + genre + '\'' +
                '}';
    }
}
