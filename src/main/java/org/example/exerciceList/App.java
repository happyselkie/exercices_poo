package org.example.exerciceList;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        int option = 0;
        Scanner scn = new Scanner(System.in);
        Annuaire annuaire = new Annuaire();

        while (option != 4){
            System.out.println("======  Bienvenue sur l'annuaire d'entreprise : =====");
            System.out.println("Il y a actuellement "+annuaire.getCompanyList().size() + " entreprise(s) dans l'annuaire");
            System.out.println("1) Ajouter une entreprise");
            System.out.println("2) Voir toutes les entreprises (leurs noms)");
            System.out.println("3) Voir les details d'une entreprise");
            System.out.println("4) Quitter");
            option = scn.nextInt();
            scn.nextLine();

            switch (option){
                case 1:
                    System.out.println("Quel est le nom de l'entreprise ?");
                    String name = scn.nextLine();
                    System.out.println("Quel est son siret ?");
                    int siret = scn.nextInt();
                    scn.nextLine();
                    System.out.println("Quelle est son adresse ?");
                    String address = scn.nextLine();
                    System.out.println("Quel est son site web ?");
                    String website = scn.nextLine();

                    annuaire.addCompany(name, siret, address, website);
                    System.out.println("L'entreprise "+ name + "a bien été créée");
                    break;
                case 2 :
                    annuaire.seeCompaniesNames();
                    break;
                case 3:
                    annuaire.seeCompaniesDetails();
                    break;
                default:break;
            }
        }
    }
}
