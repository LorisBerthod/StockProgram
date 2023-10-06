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

    public Menu (ArrayList<Article> lesArticles)
    {
        this.lesArticles = lesArticles;
        lesArticles = new ArrayList<>();
    }
    
    /**
     * Affiche dans la console le menu principal avec ses options.
     * @author Thomas
     */
    public void afficherMenuPrincipal()
    {
        // Les """ sont des "text blocks".
        
        System.out.println("""
                1 - Rechercher un article par numéro
                2 - Rechercher un article par nom
                3 - Rechercher un article par prix de vente
               
                4 - Ajouter un article
                5 - Modifier un article par numéro
                6 - Supprimer un article par numéro
               
                7 - Afficher tous les articles
               
                8 - Quitter
               """
        ); 
        
        choisirOption();
    }
    
    
    /**
     * Permet de choisir une option dans le menu principal.
     * @author Thomas
     */
    public void choisirOption()
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Donnez votre choix : ");
        int num = scanner.nextInt();
        
        switch (num) {
            case 1 -> chercherArticleNum();
            case 2 -> chercherArticleNom();
            case 3 -> chercherArticlePrix();
            case 4 -> ajouterArticle();
            //case 5 -> modifArticleNum();
            case 6 -> suppArticleNum();
            case 7 -> afficherLesArticles();
            case 8 -> quitterMenu();
            default -> throw new AssertionError();
        }
    }
    
    
    /**
     * Permet de rechercher un article par son numéro/référence.
     * (( NB : A MODIFIER -> Fix boucle + retour au menu ))
     * @author Thomas
     */
    public void chercherArticleNum()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donnez le numéro de l'article à rechercher : ");
        String num = scanner.nextLine(); // NB : On cherche l'article par sa référence.
        
        for (int i = 0; i < lesArticles.size(); i++)
        {
            if (num.equals(lesArticles.get(i).getReference()))
            {
                System.out.println(lesArticles.get(i).toString());
            }
            else
            {
                System.out.println("L'article que vous cherchez n'existe pas.");
            }
        }
        
        afficherMenuPrincipal();
    }
    
    
    /**
     * Permet de rechercher un article par un intervalle de prix de vente.
     * (( NB : A MODIFIER -> Ajouter l'intervalle  + retour au menu. ))
     * @author Thomas
     */
    public void chercherArticlePrix()
    {
        Article articleChoisi = null;
        System.out.println("Choisissez un prix d'article : ");
        Scanner scanner = new Scanner(System.in);
        Float prix = scanner.nextFloat();

        for (Article article : lesArticles) {
            if (prix.equals(article.getPrixVente())) {
                System.out.println(article.toString());
                articleChoisi = article;
                break;
            }
        }
        if (articleChoisi == null) {
            System.out.println("Aucun nom d'article trouvé avec le prix : " + prix);
        }
        
        afficherMenuPrincipal();
    }
    
    
    /**
     * Permet de modifier les attributs d'un article à partir de son numéro.
     * (( NB : A MODIFIER -> Erreur ? ))
     * @author Thomas
     */
//    public void modifArticleNum()
//    {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Donnez le numéro de l'article à modifier : ");
//        String numArticle = scanner.nextLine();
//
//        System.out.println("""
//                           << Options >>
//                1 - Modifier le nom
//                2 - Modifier le prix
//                3 - Modifier la quantité
//                4 - Quitter
//               """
//        );
//        
//        int numOption = scanner.nextInt();
//        
//        switch (numOption) {
//            case 1 -> {
//                // Modifier le nom
//                
//                System.out.println("Entrez le nouveau nom de l'article : ");
//                String nomArticle = scanner.nextLine();
//                
//                lesArticles.get(i).setNom(nomArticle);
//            }
//            case 2 -> {
//                // Modifier le prix
//                
//                int i = Integer.parseInt(numArticle);
//                System.out.println("Entrez le nouveau prix de l'article : ");
//                float prixArticle = scanner.nextFloat();
//                lesArticles.get(i).setPrix(prixArticle);
//            }
//            case 3 -> {
//                // Modifier la quantité
//                
//                int i = Integer.parseInt(numArticle);
//                System.out.println("Entrez la nouvelle quantité de l'article : ");
//                int stockArticle = scanner.nextInt();
//                lesArticles.get(i).setStock(stockArticle);
//            }
//            case 4 -> // Quitter
//                
//                quitterMenu();
//            default -> throw new AssertionError();
//        }
//        
//        afficherMenuPrincipal();
//    }
    
    /**
     * Permet d'afficher tout les articles dans la liste.
     * @author Thomas
     */
    public void afficherLesArticles()
    {
        for (Article a : lesArticles)
        {
            System.out.println(a.toString());
        }
        
        afficherMenuPrincipal();
    }
    
    /**
     * Permet de rechercher un article par son nom.
     * @author Loris
     */
    public void chercherArticleNom(){
        Article articleChoisi = null;
        System.out.println("Choisissez votre article : ");
        Scanner scanner = new Scanner(System.in);
        String nom = scanner.nextLine();

        for (Article article : lesArticles) {
            if (article.getNom().equals(nom)) {
                System.out.println(article.toString());
                articleChoisi = article;
                break;
            }
        }
        if (articleChoisi == null) {
            System.out.println("Aucun article trouvé avec le nom : " + nom);
        }
        
        afficherMenuPrincipal();
    }    
    
    /**
     * Permet de supprimer un article à partir de son numéro.
     * (( NB : A MODIFIER -> Retour au menu ))
     * @author Loris
     */
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
        afficherMenuPrincipal();
    }
    
    /**
     * Permet de quitter le menu principal / la console.
     * @author Loris
     */
    public void quitterMenu(){
        System.exit(0);
    }
    
    /**
     * Permet d'ajouter un article dans la collection d'articles.
     * (( NB : A MODIFIER -> Retour au menu ))
     * @author Loris
     */
    public void ajouterArticle(){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donnez le numéro de l'article à ajouter : ");
        String refArticle = scanner.nextLine();
         
        
        System.out.println("Donnez le nom : ");
        String nomArticle = scanner.nextLine();


        System.out.println("Donnez le prix : ");
        float prixArticle = scanner.nextFloat();
        
        System.out.println("Donnez le stock : ");
        int stockArticle = scanner.nextInt();
        
        Article article = new Article(refArticle, nomArticle ,prixArticle ,stockArticle);
        lesArticles.add(article);
        
        System.out.println("Article ajouté avec succès");
        
        afficherMenuPrincipal();

    }
}
