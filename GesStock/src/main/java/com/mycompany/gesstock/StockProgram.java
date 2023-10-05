
package com.mycompany.gesstock;

import java.util.ArrayList;

/**
 *
 * @author Thomas
 */


public class StockProgram 
{
    public static void main(String[] args)
    {
        /// Instancier 5 articles
        Article article1 = new Article("art1","Whisky" ,29.99f , 12);
        Article article2 = new Article("art2","Rosé" ,9f , 26);
        Article article3 = new Article("art3","Vin blanc" ,15 , 50);
        Article article4 = new Article("art4","Vin rouge" ,19.99f , 5);
        Article article5 = new Article("art5","Prosecco" ,5 , 0);
        
        ArrayList<Article> lesArticles = new ArrayList<>();
        
        // Ajout des articles dans l'ArrayList
        lesArticles.add(article1);
        lesArticles.add(article2);
        lesArticles.add(article3);
        lesArticles.add(article4);
        lesArticles.add(article5);
        
        Menu menu = new Menu(lesArticles);
        menu.afficherMenuPrincipal();

    }
    
    
}
