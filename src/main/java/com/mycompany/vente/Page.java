/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vente;

import sun.rmi.runtime.RuntimeUtil;
import sun.security.jca.GetInstance;

/**
 *
 * @author v.marques
 */
public class Page {

    //création des Objet de type Class
    public static Identification classIdentification;
    /**
     * requete pour DAO SOI
     * exemple de requete :
     * 
     * String sql = "SELECT COUNT(*) FROM `personnel` WHERE nom ='" + Identifiant + "' AND mdp = '" + MDP + "'";
     * ResultSet Tuples = DaoSIO.getInstance().requeteSelection(sql);
     */
    public static DaoSIO requeteDaoSIO;

    //création des Objet de type Page
    /**
     * page Accueil
     */
    public static Accueil pageAccueil;
    /**
     * Page Connexion
     */
    public static Connexion pageConnexion = new Connexion();
    
    public static SelectionProduit PageSelectionProduit;
    
    public static SelectionClient PageLesClient;


    public Page() {

    }


}
