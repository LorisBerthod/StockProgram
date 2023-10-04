
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
        
        ArrayList<Article> lesArticles = new ArrayList<>();
        
        // Ajout des articles dans l'ArrayList
        lesArticles.add(article1);
        lesArticles.add(article2);
        lesArticles.add(article3);
        lesArticles.add(article4);
        lesArticles.add(article5);
        
        Menu menu = new Menu();
        
        System.out.println(menu.afficherMenuPrincipal());
        
        
    }
    
    
}
