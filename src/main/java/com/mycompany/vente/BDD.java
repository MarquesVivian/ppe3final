/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vente;

import com.mysql.jdbc.Connection;
import java.awt.Frame;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author v.marques
 */
public class BDD {

    String Identifiant;
    String MDP;
    String nomBDD;
    String urlBDD;
    String idBDD;
    String mdpBDD;
    /**
     * Propiété connexion de type Connection
     */
    Connection connexion;

    /**
     * Constructeur
     * implémentation 
     */
    public BDD() {
        this.nomBDD = "gode";
        this.urlBDD = "jdbc:mysql://10.0.10.131:3306/" + nomBDD;
        this.idBDD = "root";
        this.mdpBDD = "root";
    }

    /**
     * Permet la connexion a la base de donnée
     */
    public void coBDD() {
        try {
            this.connexion = (Connection) DriverManager.getConnection(urlBDD, idBDD, mdpBDD);
//            System.out.println("ok");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur lors de la connexion a la BDD");
        }
    }

    /**
     * verifie si l'Identifiant et le MDP existe
     *
     * @param Identifiant sur la BDD nomUtilisateur
     * @param MDP sur la BDD mdp
     */
    public void connexionProgramme(String Identifiant, String MDP) {
        this.Identifiant = Identifiant;
        this.MDP = MDP;
        System.out.println(Identifiant+" - "+MDP);
        try {
            
            Statement Requete = this.connexion.createStatement();
            
            ResultSet Tuples = Requete.executeQuery("SELECT COUNT(*) FROM `personnel` WHERE nomUtilisateur ='" + Identifiant +"' AND mdp = '" + MDP+"'" );
            Tuples.next();
            System.out.println(Tuples.getInt("COUNT(*)"));
            if (Tuples.getInt("COUNT(*)")==1) {
                System.out.println("ok");
            }else{
            JOptionPane.showMessageDialog(null,"Probleme le compte n'existe pas");
            }
        } catch (SQLException e) {
            System.out.println("Probleme lors de la requete");
        }
    }

}
