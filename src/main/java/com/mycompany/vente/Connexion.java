/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vente;

import java.sql.Connection;
import com.mycompany.vente.BDD;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author v.marques
 */
public class Connexion extends javax.swing.JFrame {

    /**
     * on créer l'objet fenêtre
     */
    static String IdentifiantCo;
    Integer initialisation=0;

    public Connexion() {
        initComponents();

        Page.classIdentification = new Identification();
        Page.requeteDaoSIO = DaoSIO.getInstance();

    }

    /**
     * appel connexionProgramme dans la class Identification
     *
     * @return
     */
    public Boolean VerificationCO() {//appeler par jButtonConnexionActionPerformed

        //verification IdentifiantCo
        IdentifiantCo = jTextFieldNU.getText();//on prend le text qui se trouve dans jTextFieldNU
        String MDPCO = jPasswordFieldNU.getText();//on prend le text qui se trouve dans jPasswordFieldNU
        Boolean ReponseVerificationCo = false;//on initialise ReponseVerificationCo a false
//connexion rapide pour la premiere connexion et initialisation de la BDD
        if (Identification.connexionProgramme(IdentifiantCo, MDPCO) ) {//on envoie l'identifiant et le mdp
            ReponseVerificationCo = true;
        }
        return ReponseVerificationCo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNU = new javax.swing.JTextField();
        jButtonConnexion = new javax.swing.JButton();
        jPasswordFieldNU = new javax.swing.JPasswordField();
        jButtonBDD = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Connexion");
        setAutoRequestFocus(false);

        jLabel1.setText("Nom d'utilisateur :");

        jLabel2.setText("Mot de passe :");

        jTextFieldNU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNUActionPerformed(evt);
            }
        });

        jButtonConnexion.setText("Connexion");
        jButtonConnexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConnexionActionPerformed(evt);
            }
        });

        jButtonBDD.setText("⚙");
        jButtonBDD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBDDActionPerformed(evt);
            }
        });

        jLabel3.setText("Le bouton d'initialisation de ");

        jLabel4.setText("BDD sera supprimer pour la version Final.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNU, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonConnexion)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonBDD)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPasswordFieldNU)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordFieldNU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConnexion)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jButtonBDD))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNUActionPerformed

    private void jButtonConnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConnexionActionPerformed
        if (VerificationCO()) {
            try {
                Page.pageAccueil = new Accueil();
            } catch (SQLException ex) {
                Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
            }
            Page.pageAccueil.show();//fait apparaitre la page Accueil (pageAccueil est Initialiser dans le constructeur et créer dans la class Identification
            this.setVisible(false);
        }

    }//GEN-LAST:event_jButtonConnexionActionPerformed

    private void jButtonBDDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBDDActionPerformed
        if (initialisation == 0) {
            
        
//-------------------------------------------------------------------------------Création de la table Profil-------------------------------------------------------------------------------
        String sqlSetIniPro = "CREATE TABLE IF NOT EXISTS profil(idProfil INT AUTO_INCREMENT PRIMARY KEY,libelleProfil VARCHAR(50));";
        int TuplesSetIniPro = DaoSIO.getInstance().requeteAction(sqlSetIniPro);
        if (TuplesSetIniPro == 1) {
            System.out.println("Bien fait pour Profil 1");
        }
        //-------------------------------------------------------------------------------Creation de la Table Personnel-------------------------------------------------------------------------------
        String sqlSetIniPer = "CREATE TABLE IF NOT EXISTS personnel (idPersonnel INT AUTO_INCREMENT PRIMARY KEY, nomPersonnel VARCHAR(50), prenomPersonnel VARCHAR(50), emailPersonnel VARCHAR(50), telPersonnel VARCHAR(50), pseudo VARCHAR(50), mdp VARCHAR(50), idProfil INT NOT NULL, CONSTRAINT FK_personnel_profil FOREIGN KEY(idProfil) REFERENCES profil(idProfil) ON DELETE CASCADE ON UPDATE CASCADE,  UNIQUE `pseudo` (`pseudo`));";
        int TuplesSetIniPer = DaoSIO.getInstance().requeteAction(sqlSetIniPer);
        if (TuplesSetIniPer == 1) {
            System.out.println("Bien fait pour Profil 1");
        }
        //-------------------------------------------------------------------------------Creation de la Table Client
        String sqlSetIniCli = "CREATE TABLE IF NOT EXISTS client( idClient INT AUTO_INCREMENT PRIMARY KEY, nomClient VARCHAR(50), prenomClient VARCHAR(50), emailClient VARCHAR(50), telClient VARCHAR(12));";
        int TuplesSetCli = DaoSIO.getInstance().requeteAction(sqlSetIniCli);
        if (TuplesSetCli == 1) {
            System.out.println("Bien fait pour Profil 1");
        }
        //-------------------------------------------------------------------------------Creation de la Table Categorie
        String sqlSetIniCat = "CREATE TABLE IF NOT EXISTS categorie( idCategorie INT AUTO_INCREMENT PRIMARY KEY, libelleCategorie VARCHAR(50));";
        int TuplesSetCat = DaoSIO.getInstance().requeteAction(sqlSetIniCat);
        if (TuplesSetCat == 1) {
            System.out.println("Bien fait pour Profil 1");
        }
        //-------------------------------------------------------------------------------Creation de la Table Vente
        String sqlSetIniVen = "CREATE TABLE IF NOT EXISTS vente( idVente INT AUTO_INCREMENT PRIMARY KEY, dateVente DATE, idClient INT NOT NULL, idPersonnel INT NOT NULL, CONSTRAINT FK_vente_client FOREIGN KEY(idClient) REFERENCES client(idClient) ON DELETE CASCADE ON UPDATE CASCADE, CONSTRAINT FK_vente_personnel FOREIGN KEY(idPersonnel) REFERENCES personnel(idPersonnel)ON DELETE CASCADE ON UPDATE CASCADE);";
        int TuplesSetVen = DaoSIO.getInstance().requeteAction(sqlSetIniVen);
        if (TuplesSetVen == 1) {
            System.out.println("Bien fait pour Profil 1");
        }
        //-------------------------------------------------------------------------------Creation de la Table BonCOmmande
        String sqlSetIniBC = "CREATE TABLE IF NOT EXISTS bon_commande( idBonCommande INT AUTO_INCREMENT, facture FLOAT NOT NULL, idVente INT NOT NULL, CONSTRAINT PK_bon_commande PRIMARY KEY(idBonCommande), CONSTRAINT AK_bon_commande UNIQUE(idVente), CONSTRAINT FK_bon_commande_vente FOREIGN KEY(idVente) REFERENCES vente(idVente)ON DELETE CASCADE ON UPDATE CASCADE);";
        int TuplesSetBC = DaoSIO.getInstance().requeteAction(sqlSetIniBC);
        if (TuplesSetBC == 1) {
            System.out.println("Bien fait pour Profil 1");
        }
        //-------------------------------------------------------------------------------Creation de la Table Produit
        String sqlSetIniProd = "CREATE TABLE IF NOT EXISTS produit( idProduit INT AUTO_INCREMENT, libelleProduit VARCHAR(50), prix DOUBLE, stock INT, image VARCHAR(50), popularite INT, idCategorie INT NOT NULL, CONSTRAINT PK_produit PRIMARY KEY(idProduit), CONSTRAINT FK_produit_categorie FOREIGN KEY(idCategorie) REFERENCES categorie(idCategorie)ON DELETE CASCADE ON UPDATE CASCADE);";
        int TuplesSetProd = DaoSIO.getInstance().requeteAction(sqlSetIniProd);
        if (TuplesSetProd == 1) {
            System.out.println("Bien fait pour Profil 1");
        }
        //-------------------------------------------------------------------------------Creation de la Table Comprendre
        String sqlSetIniCom = "CREATE TABLE IF NOT EXISTS comprendre( idProduit INT, idVente INT, quantiter INT, CONSTRAINT PK_comprendre PRIMARY KEY(idProduit, idVente), CONSTRAINT FK_comprendre_produit FOREIGN KEY(idProduit) REFERENCES produit(idProduit) ON DELETE CASCADE ON UPDATE CASCADE, CONSTRAINT FK_comprendre_vente FOREIGN KEY(idVente) REFERENCES vente(idVente)ON DELETE CASCADE ON UPDATE CASCADE);";
        int TuplesSetCom = DaoSIO.getInstance().requeteAction(sqlSetIniCom);
        if (TuplesSetCom == 1) {
            System.out.println("Bien fait pour Profil 1");
        }
        
        String sql = "INSERT INTO `categorie`(`idCategorie`,`libelleCategorie`) VALUES (1,testCategorie0'),(2,'testCategorie1'),(3,'testCategorie2'),(4,'testCategorie3'),(5,'testCategorie4')";
        int Tuples = DaoSIO.getInstance().requeteAction(sql);
        if (Tuples == 1) {
            System.out.println("Bien fait");
        }
        sql = null;
        Tuples = 0;
        //--------------------------------------------------------Insertion dans la table profil-------------------------------------
        sql = "INSERT INTO `profil`(`idProfil`,`libelleProfil`) VALUES (1,'Admin'),(2,'Agent')";
        Tuples = DaoSIO.getInstance().requeteAction(sql);
        if (Tuples == 1) {
            System.out.println("Bien fait");
        }
        sql = null;
        Tuples = 0;
        //--------------------------------------------------------Insertion dans la table personnel-------------------------------------
        sql = "INSERT INTO `personnel`(`idPersonnel`,`nomPersonnel`, `prenomPersonnel`, `emailPersonnel`, `telPersonnel`, `pseudo`, `mdp`, `idProfil`) VALUES (1,'nom','prenom','email','tel','admin','admin',1),(2,'nom2','prenom2','email2','tel2','agent','agent',2),(3,'nom3','prenom3','email3','tel3','pseudo3','mdp3',1),(4,'nom4','prenom4','email4','tel4','pseudo4','mdp4',2),(5,'nom5','prenom5','email5','tel5','pseudo5','mdp5',1),(6,'nom6','prenom6','email6','tel6','pseudo6','mdp6',2),(7,'nom7','prenom7','email7','tel7','pseudo7','mdp7',1)";
        Tuples = DaoSIO.getInstance().requeteAction(sql);
        if (Tuples == 1) {
            System.out.println("Bien fait");
        }
        sql = null;
        Tuples = 0;
        //--------------------------------------------------------Insertion dans la table Client-------------------------------------
        sql = "INSERT INTO `client`(`nomClient`, `prenomClient`, `emailClient`, `telClient`) VALUES ('nomClient','PrenomClient','emailClient','telClient'),('nomClient2','PrenomClient2','emailClient2','telClient2'),('nomClient3','PrenomClient3','emailClient3','telClient3'),('nomClient4','PrenomClient4','emailClient4','telClient4'),('nomClient5','PrenomClient5','emailClient5','telClient5'),('nomClient6','PrenomClient6','emailClient6','telClient6')";
        Tuples = DaoSIO.getInstance().requeteAction(sql);
        if (Tuples == 1) {
            System.out.println("Bien fait");
        }
        sql = null;
        Tuples = 0;
        //--------------------------------------------------------Insertion dans la table Produit-------------------------------------
        sql = "INSERT INTO `produit`(`libelleProduit`, `prix`, `stock`, `image`, `popularite`, `idCategorie`) VALUES ('produit',6,50,'imageProduit',3,1),('produit1',6,50,'imageProduit1',3,2),('produit2',6,50,'imageProduit2',3,1),('produit3',6,50,'imageProduit3',3,2),('produit4',6,50,'imageProduit4',3,3),('produit5',6,50,'imageProduit5',3,1),('produit6',6,50,'imageProduit6',3,4),('produit7',6,50,'imageProduit7',3,4),('produit8',6,50,'imageProduit8',3,1),('produit9',6,50,'imageProduit9',3,1),('produit10',6,50,'imageProduit10',3,5)";
        Tuples = DaoSIO.getInstance().requeteAction(sql);
        if (Tuples == 1) {
            System.out.println("Bien fait");
        }
        sql = null;
        Tuples = 0;
        //--------------------------------------------------------Insertion dans la table Vente-------------------------------------
        sql = "INSERT INTO `vente` (`idVente`, `dateVente`, `idClient`, `idPersonnel`) VALUES (NULL, '2020-11-11', '1', '1'), (NULL, '2020-11-13', '2', '5'), (NULL, '2020-11-18', '5', '5'), (NULL, '2020-11-10', '6', '7'), (NULL, '2020-11-17', '4', '7'), (NULL, '2020-11-05', '4', '2')";
        Tuples = DaoSIO.getInstance().requeteAction(sql);
        if (Tuples == 1) {
            System.out.println("Bien fait");
        }
        sql = null;
        Tuples = 0;
        //--------------------------------------------------------Insertion dans la table Comprendre-------------------------------------
        sql = "INSERT INTO `comprendre` (`idProduit`, `idVente`, `quantiter`) VALUES ('1', '1', '2'), ('2', '3', '45'), ('7', '3', '65'), ('9', '5', '45'), ('3', '6', '95')";
        Tuples = DaoSIO.getInstance().requeteAction(sql);
        if (Tuples == 1) {
            System.out.println("Bien fait");
        }
        sql = null;
        Tuples = 0;
        //--------------------------------------------------------Insertion dans la table BonCOmmande-------------------------------------
        sql = "INSERT INTO `bon_commande` (`idBonCommande`, `facture`, `idVente`) VALUES (NULL, '43', '3'), (NULL, '45', '5'), (NULL, '46', '2'), (NULL, '47', '4')";
        Tuples = DaoSIO.getInstance().requeteAction(sql);
        if (Tuples == 1) {
            System.out.println("Bien fait");
        }
        sql = null;
        Tuples = 0;
        initialisation++;
        }else{
            JOptionPane.showMessageDialog(rootPane,"Impossible l'initialisation est déja faite.");
        }
    }//GEN-LAST:event_jButtonBDDActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Connexion.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Connexion.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Connexion.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Connexion.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Connexion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBDD;
    private javax.swing.JButton jButtonConnexion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordFieldNU;
    private javax.swing.JTextField jTextFieldNU;
    // End of variables declaration//GEN-END:variables
}