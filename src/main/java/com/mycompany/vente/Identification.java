/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vente;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author v.marques
 */
public class Identification {

    //création des Variable
    private static String Identifiants;
    private static String MDPs;
    public static String Profil;

    /**
     * Constructeur de la class Identification
     */
    public Identification() {

    }

    /**
     * Vérifie la connexion au programme grace au info :
     *
     * @param Identifiant
     * @param MDP
     * @return ReponseVerificationCo
     */
    public static Boolean connexionProgramme(String Identifiant, String MDP) {//on récup l'identifiant et le mdp de Connexion.VerificationCo
        Identifiants = Identifiant;
        MDPs = MDP;
        /**
         * ReponseVerificationCo de la méthode connexionProgramme de la page
         * Identification
         */
        Boolean ReponseVerificationCo = false;//Initialisation de ReponseVerificationCo à false

        try {
//création de la requete
            String sql = "SELECT COUNT(*) FROM `personnel` WHERE pseudo ='" + Identifiants + "' AND mdp = '" + MDPs + "'";
//on envoie la raquete sur DaoSIO
            ResultSet Tuples = DaoSIO.getInstance().requeteSelection(sql);
            Tuples.next();
            if (Tuples.getInt("COUNT(*)") == 1) {//si il y a 1 personne alors
                ReponseVerificationCo = true;//si SQL renvoie 1 modifie la valeur de ReponseVerificationCo en true
            } else {//sinon
                JOptionPane.showMessageDialog(null, "Le compte n'existe pas");//afficher message erreur
            }
        } catch (SQLException e) {
            System.out.println("Probleme lors de la requete");
        }
        return ReponseVerificationCo;//on renvoie ReponseVerificationCo vers Connexion.VerificationCo
    }

    public ResultSet getPersonnel() {
        //création de la requete
        String sql = "SELECT * FROM personnel INNER JOIN profil ON personnel.idProfil = profil.idProfil WHERE pseudo ='" + Identifiants + "' AND mdp = '" + MDPs + "'";
        //on envoie la raquete sur DaoSIO
        ResultSet Tuples = DaoSIO.getInstance().requeteSelection(sql);
        return Tuples;//on renvoie ReponseVerificationCo vers Connexion.VerificationCo

    }

    

}
