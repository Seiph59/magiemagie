/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magiemagie;

/**
 *
 * @author Administrateur
 */
public class Carte {
    
    public enum TypeCarte{
        BAVE_DE_CRAPAUD,
        AILE_DE_CHAUVE_SOURIS,
        LAPIS_LAZULI,
        MANDRAGORE,
        CORNE_DE_LICORNE
    }

    @Override
    public String toString() {
        return "Carte{"  + nom + '}';
    }
    
    protected TypeCarte nom;

    public TypeCarte getNom() {
        return nom;
    }

    public void setNom(TypeCarte nom) {
        this.nom = nom;
    }

    
    
    //String strTypeCarte = Carte.TypeCarte.BAVE_DE_CRAPAUD.toString();
    //Carte.TypeCarte tc = Carte.TypeCarte.valueOf("BAVE_DE_CRAPAUD");    

    @Override
    public boolean equals(Object obj) {
        
        if( obj instanceof String ){
            
            String str = (String) obj;
            
            return this.nom.toString().equals( str );
        }
        
        return super.equals(obj);
    }
    
    
}
