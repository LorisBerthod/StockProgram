/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gesstock;

import java.util.ArrayList;

/**
 *
 * @author Thomas
 */


public class Menu {
    
    private ArrayList<Article> lesArticles;
    
    public Menu ()
    {
        lesArticles = new ArrayList<>();
    }
    
    /**
     * Affiche dans la console le menu principal avec ses options.
     */
    public String afficherMenuPrincipal()
    {
        return """
                1 - Rechercher un article par numéro
                2 - Rechercher un article par nom
                3 - Rechercher un article par intervalle de prix de vente
               
                4 - Ajouter un article
                5 - Modifier un article par numéro
                6 - Supprimer un article par numéro
               
                7 - Afficher tous les articles
               
                8 - Quitter
               """;
    }
    
    
    /**
     * Permet de choisir une option dans le menu principal.
     * @param num le numéro de l'option
     */
    public void choisirOption(int num)
    {
        afficherMenuPrincipal();
        System.out.println("Donnez votre choix : " + num);
    }
    
    
    
}
