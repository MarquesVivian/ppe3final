/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vente;

import java.sql.ResultSet;

/**
 *
 * @author Hp
 */
public class Administration extends javax.swing.JFrame {

    /**
     * Creates new form Administration
     */
    public Administration() {
        initComponents();
        administrationProfil1.getProfil();
        administrationAgent1.getAgent();
        administrationProduit1.AfficherTouteListe();
        administrationClient1.afficherClientDansList();
        administrationStatistic1.ToutAfficher();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SertARien2 = new javax.swing.JPanel();
        SertARien = new com.mycompany.vente.AdministrationAgent();
        jTabbedPaneAdmin = new javax.swing.JTabbedPane();
        jPanelProfil = new javax.swing.JPanel();
        administrationProfil1 = new com.mycompany.vente.AdministrationProfil();
        jPanelAgent = new javax.swing.JPanel();
        administrationAgent1 = new com.mycompany.vente.AdministrationAgent();
        jPanelProduit = new javax.swing.JPanel();
        administrationProduit1 = new com.mycompany.vente.AdministrationProduit();
        jPanelClient = new javax.swing.JPanel();
        administrationClient1 = new com.mycompany.vente.AdministrationClient();
        jPanelVente = new javax.swing.JPanel();
        administrationVente1 = new com.mycompany.vente.AdministrationVente();
        jPanelStats = new javax.swing.JPanel();
        administrationStatistic1 = new com.mycompany.vente.AdministrationStatistic();
        jPanelFacture = new javax.swing.JPanel();
        jPanelJeuxEssai = new javax.swing.JPanel();
        jButtonSupprimer = new javax.swing.JButton();
        jButtonCreer = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        javax.swing.GroupLayout SertARien2Layout = new javax.swing.GroupLayout(SertARien2);
        SertARien2.setLayout(SertARien2Layout);
        SertARien2Layout.setHorizontalGroup(
            SertARien2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 629, Short.MAX_VALUE)
        );
        SertARien2Layout.setVerticalGroup(
            SertARien2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanelProfilLayout = new javax.swing.GroupLayout(jPanelProfil);
        jPanelProfil.setLayout(jPanelProfilLayout);
        jPanelProfilLayout.setHorizontalGroup(
            jPanelProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProfilLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(administrationProfil1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );
        jPanelProfilLayout.setVerticalGroup(
            jPanelProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProfilLayout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(administrationProfil1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPaneAdmin.addTab("Profil", jPanelProfil);

        javax.swing.GroupLayout jPanelAgentLayout = new javax.swing.GroupLayout(jPanelAgent);
        jPanelAgent.setLayout(jPanelAgentLayout);
        jPanelAgentLayout.setHorizontalGroup(
            jPanelAgentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAgentLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(administrationAgent1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelAgentLayout.setVerticalGroup(
            jPanelAgentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAgentLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(administrationAgent1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPaneAdmin.addTab("Agent", jPanelAgent);

        javax.swing.GroupLayout jPanelProduitLayout = new javax.swing.GroupLayout(jPanelProduit);
        jPanelProduit.setLayout(jPanelProduitLayout);
        jPanelProduitLayout.setHorizontalGroup(
            jPanelProduitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProduitLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(administrationProduit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelProduitLayout.setVerticalGroup(
            jPanelProduitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProduitLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(administrationProduit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPaneAdmin.addTab("Produit", jPanelProduit);

        javax.swing.GroupLayout jPanelClientLayout = new javax.swing.GroupLayout(jPanelClient);
        jPanelClient.setLayout(jPanelClientLayout);
        jPanelClientLayout.setHorizontalGroup(
            jPanelClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClientLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(administrationClient1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelClientLayout.setVerticalGroup(
            jPanelClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClientLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(administrationClient1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPaneAdmin.addTab("Client", jPanelClient);

        javax.swing.GroupLayout jPanelVenteLayout = new javax.swing.GroupLayout(jPanelVente);
        jPanelVente.setLayout(jPanelVenteLayout);
        jPanelVenteLayout.setHorizontalGroup(
            jPanelVenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVenteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(administrationVente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelVenteLayout.setVerticalGroup(
            jPanelVenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVenteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(administrationVente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPaneAdmin.addTab("Vente", jPanelVente);

        javax.swing.GroupLayout jPanelStatsLayout = new javax.swing.GroupLayout(jPanelStats);
        jPanelStats.setLayout(jPanelStatsLayout);
        jPanelStatsLayout.setHorizontalGroup(
            jPanelStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelStatsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(administrationStatistic1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
        );
        jPanelStatsLayout.setVerticalGroup(
            jPanelStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelStatsLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(administrationStatistic1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPaneAdmin.addTab("Stats", jPanelStats);

        javax.swing.GroupLayout jPanelFactureLayout = new javax.swing.GroupLayout(jPanelFacture);
        jPanelFacture.setLayout(jPanelFactureLayout);
        jPanelFactureLayout.setHorizontalGroup(
            jPanelFactureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelFactureLayout.setVerticalGroup(
            jPanelFactureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPaneAdmin.addTab("Facture", jPanelFacture);

        jButtonSupprimer.setText("Supprimer jeu d'essai");
        jButtonSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSupprimerActionPerformed(evt);
            }
        });

        jButtonCreer.setText("Lancée jeu d'essai");
        jButtonCreer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelJeuxEssaiLayout = new javax.swing.GroupLayout(jPanelJeuxEssai);
        jPanelJeuxEssai.setLayout(jPanelJeuxEssaiLayout);
        jPanelJeuxEssaiLayout.setHorizontalGroup(
            jPanelJeuxEssaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelJeuxEssaiLayout.createSequentialGroup()
                .addContainerGap(383, Short.MAX_VALUE)
                .addComponent(jButtonSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(jPanelJeuxEssaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelJeuxEssaiLayout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jButtonCreer, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanelJeuxEssaiLayout.setVerticalGroup(
            jPanelJeuxEssaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJeuxEssaiLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jButtonSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(262, Short.MAX_VALUE))
            .addGroup(jPanelJeuxEssaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelJeuxEssaiLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jButtonCreer, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jTabbedPaneAdmin.addTab("Jeux d'essai", jPanelJeuxEssai);

        jButton1.setText("⊗");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPaneAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(5, 5, 5))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPaneAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCreerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreerActionPerformed
//        //--------------------------------------------------------Insertion dans la table Categorie-------------------------------------

        String sql = "INSERT INTO `categorie`(`libelleCategorie`) VALUES ('testCategorie0'),('testCategorie1'),('testCategorie2'),('testCategorie3'),('testCategorie4')";
        int Tuples = DaoSIO.getInstance().requeteAction(sql);
        if (Tuples == 1) {
            System.out.println("Bien fait");
        }
        sql = null;
        Tuples = 0;
        //--------------------------------------------------------Insertion dans la table profil-------------------------------------
        sql = "INSERT INTO `profil`(`libelleProfil`) VALUES ('Admin'),('Agent')";
        Tuples = DaoSIO.getInstance().requeteAction(sql);
        if (Tuples == 1) {
            System.out.println("Bien fait");
        }
        sql = null;
        Tuples = 0;
        //--------------------------------------------------------Insertion dans la table personnel-------------------------------------
        sql = "INSERT INTO `personnel`(`nomPersonnel`, `prenomPersonnel`, `emailPersonnel`, `telPersonnel`, `pseudo`, `mdp`, `idProfil`) VALUES ('nom','prenom','email','tel','pseudo','mdp',1),('nom2','prenom2','email2','tel2','pseudo2','mdp2',2),('nom3','prenom3','email3','tel3','pseudo3','mdp3',1),('nom4','prenom4','email4','tel4','pseudo4','mdp4',2),('nom5','prenom5','email5','tel5','pseudo5','mdp5',1),('nom6','prenom6','email6','tel6','pseudo6','mdp6',2),('nom7','prenom7','email7','tel7','pseudo7','mdp7',1)";
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

    }//GEN-LAST:event_jButtonCreerActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        Page.pageAccueil.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSupprimerActionPerformed

//---------------------------------------------Suppretion de client-------------------------------------------------------------------------
        String sqlabc = "DELETE FROM `client` WHERE idClient IN(1,2,3,4,5,6,7)";
        int Tuplesabc = DaoSIO.getInstance().requeteAction(sqlabc);
        if (Tuplesabc == 1) {
            System.out.println("Bien fait");
        }
        sqlabc = null;
        Tuplesabc = 0;
        //---------------------------------------------Suppretion de Personnel-------------------------------------------------------------------------

        sqlabc = "DELETE FROM `personnel` WHERE idPersonnel IN(1,2,3,4,5,6,7)";
        Tuplesabc = DaoSIO.getInstance().requeteAction(sqlabc);
        if (Tuplesabc == 1) {
            System.out.println("Bien fait");
        }
        sqlabc = null;
        Tuplesabc = 0;
        //---------------------------------------------Suppretion de Categorie-------------------------------------------------------------------------

        sqlabc = "DELETE FROM `categorie` WHERE idCategorie IN(1,2,3,4,5)";
        Tuplesabc = DaoSIO.getInstance().requeteAction(sqlabc);
        if (Tuplesabc == 1) {
            System.out.println("Bien fait");
        }
        sqlabc = null;
        Tuplesabc = 0;
        //---------------------------------------------Suppretion de Profil-------------------------------------------------------------------------

        sqlabc = "TRUNCATE `masque`.`profil`";
        Tuplesabc = DaoSIO.getInstance().requeteAction(sqlabc);
        if (Tuplesabc == 1) {
            System.out.println("Bien fait");
        }
        sqlabc = null;
        Tuplesabc = 0;
    }//GEN-LAST:event_jButtonSupprimerActionPerformed

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
            java.util.logging.Logger.getLogger(Administration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.mycompany.vente.AdministrationAgent SertARien;
    private javax.swing.JPanel SertARien2;
    private com.mycompany.vente.AdministrationAgent administrationAgent1;
    private com.mycompany.vente.AdministrationClient administrationClient1;
    private com.mycompany.vente.AdministrationProduit administrationProduit1;
    private com.mycompany.vente.AdministrationProfil administrationProfil1;
    private com.mycompany.vente.AdministrationStatistic administrationStatistic1;
    private com.mycompany.vente.AdministrationVente administrationVente1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCreer;
    private javax.swing.JButton jButtonSupprimer;
    private javax.swing.JPanel jPanelAgent;
    private javax.swing.JPanel jPanelClient;
    private javax.swing.JPanel jPanelFacture;
    private javax.swing.JPanel jPanelJeuxEssai;
    private javax.swing.JPanel jPanelProduit;
    private javax.swing.JPanel jPanelProfil;
    private javax.swing.JPanel jPanelStats;
    private javax.swing.JPanel jPanelVente;
    private javax.swing.JTabbedPane jTabbedPaneAdmin;
    // End of variables declaration//GEN-END:variables
}
