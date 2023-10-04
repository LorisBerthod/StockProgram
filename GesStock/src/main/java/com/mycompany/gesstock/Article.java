/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gesstock;

/**
 *
 * @author BERTHOD
 */
public class Article {
    private final String art_Reference;
    private String art_Nom;
    private float art_PrixVente;
    private int art_Stock;
    
    public Article (String art_Reference,  String art_Nom, float art_PrixVente, int art_Stock){
    this.art_Reference = art_Reference;
    this.art_Nom = art_Nom;
    this.art_PrixVente = art_PrixVente;
    this.art_Stock = art_Stock;
    }
    
    public String getReference(){
        return art_Reference;
    }
    
    public String getNom(){
        return art_Nom;
    }
        
    public float getPrixVente(){
        return art_PrixVente;
    }
    
    public int getStock(){
        return art_Stock;
    }
    
    public void setNom(String art_Nom){
        this.art_Nom = art_Nom;
    }
    
    public void setPrix(float art_PrixVente){
        this.art_PrixVente = art_PrixVente;
    }
    
    public void setStock(int art_Stock){
        this.art_Stock = art_Stock;
    }
    
    @Override
    public String toString(){
        return "nom de l'article : " + getNom() + "\n" 
                + "prix de l'article : " + getPrixVente() + "\n" 
                + "stock de l'article : " + getStock() + "\n";
    }
}
