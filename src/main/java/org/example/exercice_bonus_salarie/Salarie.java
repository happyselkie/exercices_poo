package org.example.exercice_bonus_salarie;

public class Salarie {
    private int matricule;
    private String service;
    private String categorie;
    private String nom;
    private double salaire;

    private static int nbEmploye;
    private static int salaireTotal;

    public Salarie(int matricule, String service, String categorie, String nom, double salaire) {
        this.matricule = matricule;
        this.service = service;
        this.categorie = categorie;
        this.nom = nom;
        this.salaire = salaire;
        nbEmploye++;
        salaireTotal += salaire;
    }

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public static int getNbEmploye() {
        return nbEmploye;
    }

    public static int getSalaireTotal() {
        return salaireTotal;
    }

    public static void resetEmploye(){
        nbEmploye = 0;
        salaireTotal = 0;
    }

    public String AfficherSalaire(){
        return "Le salaire de "+this.nom+" est de "+this.salaire;
    }


}
