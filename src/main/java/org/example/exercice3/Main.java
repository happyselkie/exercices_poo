package org.example.exercice3;

public class Main {
    public static void main(String[] args) {

        Joueur joueur1 = new Joueur("WarriorDu59", 1, 0);
        Joueur joueur2 = new Joueur("JustMe", 16, 90);
        Joueur joueur3 = new Joueur("Reroll1254", 2, 80);

        /*System.out.println(joueur2);

        joueur2.effectuerUneQuete();

        System.out.println(joueur2);
        System.out.println(joueur3);

        joueur3.effectuerUneQuete();
        joueur3.effectuerUneQuete();

        System.out.println(joueur3);*/

        String nomJoueur1 = joueur1.getNom();
        for(int i = 1; i <= 20; i++){
            System.out.println("Le joueur "+ nomJoueur1 + " effectue la quête n°" + i);
            joueur1.effectuerUneQuete();
        }

        joueur1.setNom("LeGigaBossDuJava");
    }
}
