/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magiemagie;

import java.util.ArrayList;

/**
 *
 * @author Administrateur
 */
public class Joueur {
    
    protected String nomJoueur;
    protected ArrayList<Carte> cartes;

    @Override
    public String toString() {
        return "Joueur{" + "nomJoueur=" + nomJoueur + ", cartes=" + cartes + '}';
    }

    

    
    public Joueur() {
        cartes = new ArrayList<>();
    }
    
    
    
        

    public String getNomJoueur() {
        return nomJoueur;
    }

    public void setNomJoueur(String nomJoueur) {
        this.nomJoueur = nomJoueur;
    }

    public ArrayList<Carte> getCartes() {
        return cartes;
    }

    public void setCartes(ArrayList<Carte> cartes) {
        this.cartes = cartes;
    }

    
    
    
    
}
