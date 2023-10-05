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
    public Scanner scanner = new Scanner(System.in);
    public Menu (ArrayList<Article> lesArticles)
    {
        this.lesArticles = lesArticles;
        lesArticles = new ArrayList<>();
    }
    
    /**
     * Affiche dans la console le menu principal avec ses options.
     */
    public void afficherMenuPrincipal()
    {
        System.out.println("""
                1 - Rechercher un article par numéro
                2 - Rechercher un article par nom
                3 - Rechercher un article par intervalle de prix de vente
               
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
     */
    public void choisirOption()
    {

        
        System.out.println("Donnez votre choix : ");
        int num = scanner.nextInt();
        
        switch (num) {
            case 0:
                System.out.println("L'option 0 n'existe pas.");
                break;
            case 1:
                chercherArticleNum();
                break;
            case 2:
               chercherArticleNom();
               break;
//            case 3:
//                chercherArticlePrix();
//                break;
            case 4:
                ajouterArticle();
                break;
//            case 5:
//                modifArticleNum();
//                break;
//            case 6:
//                suppArticleNum();
//                break;
            case 7:
                afficherLesArticles();
                break;
//            case 8:
//                quitterMenu();
//                break;
            default:
                throw new AssertionError();
        }
    }
    
    
    /**
     * Permet de rechercher un article par son numéro/référence.
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
    }
    
    
    /**
     * Permet de rechercher un article par un intervalle de prix de vente.
     * @author Thomas
     */
    public void chercherArticlePrix()
    {
        
    }
    /**
     * Permet de modifier les attributs d'un article à partir de son numéro.
     * @author Thomas
     */
    public void modifArticleNum()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donnez le numéro de l'article à modifier : ");
        int numArticle = scanner.nextInt();
        
        System.out.println("""
                           << Options >>
                1 - Modifier le nom
                2 - Modifier le prix
                3 - Modifier la quantité
                4 - Quitter
               """
        );
        
        System.out.println("");
        int numOption = scanner.nextInt();
        
        switch (numOption) {
            case 1:
                // Modifier le nom
                
                System.out.println("Entrez le nouveau nom de l'article : ");
                String nomArticle = scanner.nextLine();
                lesArticles.get(numArticle).setNom(nomArticle);
                
                break;
            case 2:
                // Modifier le prix
                
                System.out.println("Entrez le nouveau prix de l'article : ");
                float prixArticle = scanner.nextFloat();
                lesArticles.get(numArticle).setPrix(prixArticle);
                
                break;
            case 3:
                // Modifier la quantité
                
                System.out.println("Entrez la nouvelle quantité de l'article : ");
                int stockArticle = scanner.nextInt();
                lesArticles.get(numArticle).setStock(stockArticle);
                
                break;
            case 4:
                // Quitter
                
                
                break;
            default:
                throw new AssertionError();
        }
    }
    
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
    }

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
    }    
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

    }
}
