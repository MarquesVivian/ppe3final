# ppe3final
PPE3 : logiciel de vente

Pour modifier l’ip de la BDD il faut aller dans le code et modifier DaoSio.java
![test](https://raw.githubusercontent.com/MarquesVivian/ppe3final/master/image/1.png)


Pour modifier l’ip de la BDD il faut aller dans le code et modifier :
Par l’ip de la BDD ou modifier le nomBDD pour modifier le nom de la BDD
Pour initialiser la base donnée et la remplir d’un jeux de test il suffi de clicker sur le bouton en forme d’engrenage (pas besoin de connexion)
![](https://raw.githubusercontent.com/MarquesVivian/ppe3final/master/image/2.png)


Les comptes Admin et Agent seront créer.
Pseudp : admin || mdp : admin 
Pseudo :agent || mdp: agent
Si la connexion via
Connexion.VerificationCO()->Identification.connexionProgramme fonctionne c’est ok.
La premiere page de accueil c’est le client. On peut le modifier ou en créer. Il suffi t d’en selectionner un pour effectuer une vente
![](https://raw.githubusercontent.com/MarquesVivian/ppe3final/master/image/3.png)


La seconde page est la page Produit ou on peut selectionner les categorie et les produit.
![](https://raw.githubusercontent.com/MarquesVivian/ppe3final/master/image/4.png)


Si on est connecter en tan qu’Admin on peut clicker sur le bouton Administration qui ouvre.
![](https://raw.githubusercontent.com/MarquesVivian/ppe3final/master/image/5.png)
Avec cette page on peu gerer les Profil/Agente/Produit/client/vente et supprimer le jeux d’essai


MLD de la BDD :
![](https://raw.githubusercontent.com/MarquesVivian/ppe3final/master/image/6.png)
categorie = (idCategorie INT, libelleCategorie VARCHAR(50));
profil = (idProfil INT, libelleProfil VARCHAR(50));
client = (idClient INT, nomClient VARCHAR(50), prenomClient VARCHAR(50), emailClient VARCHAR(50), telClient VARCHAR(50));
produit = (idProduit INT, libelleProduit VARCHAR(50), prix DOUBLE, stock INT, image VARCHAR(300), popularite INT, #idCategorie);
personnel = (idPersonnel INT, nomPersonnel VARCHAR(50), prenomPersonnel VARCHAR(50), emailPersonnel VARCHAR(50), telPersonnel VARCHAR(50), pseudo VARCHAR(50), mdp VARCHAR(50), #idProfil);
vente = (idVente INT, dateVente DATE, #idClient, #idPersonnel);
bon_commande = (idBonCommande INT, facture VARCHAR(50), #idVente);
Comprendre = (#idProduit, #idVente, quantiter INT);


