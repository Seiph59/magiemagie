/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magiemagie;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Administrateur
 */
public class Jeu {
    
    protected ArrayList<Joueur> joueurs;
    protected ArrayList<Carte> tempcarte;
    protected Joueur joueurEnCours;
    private void paquet(){
        
    }

    public Jeu() {
        joueurs = new ArrayList();
    }
    
    /*
    ----------------------------------------------------------------------
    FONCTION LANCER PARTIE 
    + DISTRIBUTION CARTES 
    ----------------------------------------------------------------------
    */
    
    public void lancerPartie(){
        // INITILISATION RANDOM
        Random rand = new Random();
        int n;
        // 1. distrib 7 cartes / joueur
        for (Joueur joueur : joueurs) {
            
            for (int i = 0; i < 7; i++) {
                
                Carte carte1 = new Carte();
                
                 n = rand.nextInt(5);
                
                switch(n){
                    
                    case 0:
                        carte1.setNom(Carte.TypeCarte.MANDRAGORE);
                        break;
                    case 1:
                        carte1.setNom(Carte.TypeCarte.AILE_DE_CHAUVE_SOURIS);
                        break;
                    case 2:
                        carte1.setNom(Carte.TypeCarte.BAVE_DE_CRAPAUD);
                        break;
                    case 3:
                        carte1.setNom(Carte.TypeCarte.CORNE_DE_LICORNE);
                        break;
                    case 4:
                        carte1.setNom(Carte.TypeCarte.LAPIS_LAZULI);
                    default:
                        break;
                }         
                joueur.getCartes().add(carte1);
                
            }
//            System.out.println(joueur.getNomJoueur());
//            System.out.println(joueur.getCartes());
        }    
        // 2. donne main au 1er joueur
        joueurEnCours = joueurs.get(0);
        
        //3. affiche menu action
        afficherMenuAction();
        
//        for (Joueur joueur : joueurs) {
//            
//            System.out.println(joueur.getNomJoueur());
//            System.out.println(joueur.getCartes());
//            afficherMenuAction();
//        }
   /* 
        --------------------------------------------------------------------
        MENU ACTION POUR CHAQUE JOUEUR
        --------------------------------------------------------------------
        */
        
    }
    
    public void afficherMenuAction(){
        System.out.println("Joueur: " + joueurEnCours.getNomJoueur().toUpperCase()+ " a vous de jouer !");
        System.out.println("Vos cartes : " + joueurEnCours.getCartes());
        System.out.println("MENU ACTION !!!");
        System.out.println("1/ Lancer Sort");
        System.out.println("---------------------");
        System.out.println("2/ Passer Tour");
        System.out.println("Insérez votre choix");
        
        Scanner selectAction = new Scanner(System.in);
        int a = selectAction.nextInt();
        
        switch(a){
             case 1:
                lancerSort();
                break;
            case 2:
                passerTour();
                break;
            default:
                System.err.println("Mauvais choix, recommencez");

            
        }
    }
    public void lancerSort(){
        // SORT INVISIBILITE
        if((joueurEnCours.getCartes().contains("BAVE_DE_CRAPAUD"))&&(joueurEnCours.getCartes().contains("CORNE_DE_LICORNE"))){
            System.out.println("1. Lancer Sort INVISIBILITE ");
        }
        else{
            System.out.println("Carte non disponible ! ");
        }
        
    }
    
    public void passerTour(){
        
        
    }
    /* ------------------------------------------------------------------- 
                             AFFICHE MENU JOUEUR
                             AVEC AJOUT DE CHAQUE JOUEUR
    ----------------------------------------------------------------------
    */
    
    public void afficherMenuJoueur() {
         String nom;
         System.out.print("Nouveau joueur: ");
         Scanner entreeNom = new Scanner(System.in);
         nom = entreeNom.nextLine();
         Joueur j1 = new Joueur();
         j1.setNomJoueur(nom);
         joueurs.add(j1);
    }

    
    /*
    ---------------------------------------------------------------------
                         AFFICHE MENU PRINCIPAL 
                        + SELECTION DANS LE MENU
    ---------------------------------------------------------------------
    */
    public void afficherMenuPrincipal() {
        
        boolean quitter = false;
        while (quitter == false){
            System.out.println("1. Nouveau joueur");
            System.out.println("---------------------");
            System.out.println("2. Démarrer partie");
            System.out.println("---------------------");
            System.out.println("3. Quitter");
            System.out.println("---------------------");
            System.out.println("Insérez votre choix");

            Scanner entree1 = new Scanner(System.in);
            
            int i=entree1.nextInt(); 
            switch (i) {
                case 1:
                    afficherMenuJoueur();
                    break;
                case 2:
                    lancerPartie();
                    break;
                case 3:
                    quitter = true;
                    break;
                default:
                    System.err.println("Mauvais choix, recommencez");
            }
        }
    }

    

}
