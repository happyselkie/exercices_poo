package org.example.exercice_bonus_pendu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jeu {
    public static void main(String[] args) {
        String motMystere =  "Test";
        char[] motSplit = motMystere.toCharArray();

        List<Character> motAtrouve = new ArrayList<>();

        Scanner scn = new Scanner(System.in);

        for(char charactere : motSplit) motAtrouve.add(Character.valueOf(charactere));

        Pendu lePendu = new Pendu(motAtrouve);
        int nbEssai = lePendu.getEssais();

        System.out.println("======= Paramètres de partie =======");
        System.out.println("Voulez-vous un nombe d'essais spécifique (10 par défaut) ? y/n : ");
        char choix = scn.next().toLowerCase().charAt(0);

        while (choix != 'y' || choix != 'n'){
            System.out.println("Erreur veuillez choisir entre y ou n. Voulez-vous un nombe d'essais spécifique (10 par défaut) ? y/n : ");
            choix = scn.next().toLowerCase().charAt(0);
        }

        if (choix == 'y'){
            System.out.printf("Combien d'essais voulez-vous ?");
            nbEssai = scn.nextInt();
            while (nbEssai < 0) {
                System.out.printf("Erreur, veuillez entrer une valeur positive. Combien d'essais voulez-vous ?");
                nbEssai = scn.nextInt();
            }
        }

        System.out.println("Jeu du pendu généré ! Nombre d'essais : "+nbEssai);

        while (nbEssai > 0){
            
        }






    }
}
