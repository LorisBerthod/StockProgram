/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gesstock;

import java.util.ArrayList;
import java.util.Scanner;

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
    
//    public void chercherArticleNom(){
//        Scanner scanner = new Scanner (System.in);
// 
//        System.out.println("Donnez le numéro de l'article à rechercher : ");
//        String nom = scanner.nextLine();
//        
//        
//
//        lesArticles.forEach(lesArticles -> System.out.println(nom));
//}
    
//    public void ajouterArticle(){
//        System.out.println("Donnez le numéro de l'article à ajouter : " + + "donnez le nom : " + se); 
//   }
    
    public void suppArticleNum(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donnez le numéro de l'article à supprimer : ");
        String num = scanner.nextLine(); // NB : On cherche l'article par sa référence.
        
        for (int i = 0; i < lesArticles.size(); i++)
        {
            if (num.equals(lesArticles.get(i).getReference()))
            {
                System.out.println(lesArticles.remove(i));
            }
        }
        
        System.out.println("Votre article a été supprimé");
    }
    public void quitterMenu(){
        System.exit(0);
    }
}
