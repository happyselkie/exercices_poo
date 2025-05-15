package org.example.exercice_bonus_pendu;

import java.util.ArrayList;
import java.util.List;

public class Pendu {
    private int essais = 10;
    private List<Character> motAtrouver;

    private static List<Character> masque =  new ArrayList<>();

    public Pendu(List<Character> motAtrouver) {
        this.motAtrouver = motAtrouver;
    }

    public static List<Character> getMasque() {
        return masque;
    }

    public static void setMasque(List<Character> masque) {
        Pendu.masque = masque;
    }

    public int getEssais() {
        return essais;
    }

    public void setEssais(int essais) {
        this.essais = essais;
    }

   public List testChar(char c){
        Character testChar = Character.valueOf(c);
        if(motAtrouver.contains(testChar)) {
            for (int i = 0; i < motAtrouver.size(); i++) {
                if (motAtrouver.get(i).equals(c)) this.genererMasque(motAtrouver.get(i), c);
            }
            essais--;
        } else essais--;
        return masque;
    }

    public void genererMasque(int i, Character c){
        masque.set(i, c);
    }

    public boolean testWin(){
        if (masque.equals(motAtrouver)) return true;
        return false;
    }

}
