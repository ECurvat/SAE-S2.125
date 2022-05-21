/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vue;

import modele.ModeleListRestaurant;
import modele.ModeleListLoisir;
import modele.ModeleListLVille;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import metier.*;
import modele.ModeleListAutoroute;
import modele.ModeleListDepartementale;
import modele.ModeleListNationale;

/**
 *
 * @author François, Elliot
 */
public class Accueil extends javax.swing.JFrame{
	
	public Graphe graphePrincipal;
	private ModeleListLVille modeleVille = new ModeleListLVille();
	private ModeleListRestaurant modeleRestaurant = new ModeleListRestaurant();
	private ModeleListLoisir modeleLoisir = new ModeleListLoisir();
	private ModeleListAutoroute modeleAutoroutes = new ModeleListAutoroute();
	private ModeleListNationale modeleNationales = new ModeleListNationale();
	private ModeleListDepartementale modeleDepartementales = new ModeleListDepartementale();
	
	private DefaultComboBoxModel modeleVilleCombo = new DefaultComboBoxModel();
	private DefaultComboBoxModel modeleRestoCombo = new DefaultComboBoxModel();
	private DefaultComboBoxModel modeleLoisirCombo = new DefaultComboBoxModel();
	

	/**
	 * Creates new form Accueil
	 */
	public Accueil() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPaneSelectionMenus = new javax.swing.JTabbedPane();
        jPanelAccueil = new javax.swing.JPanel();
        jButtonImporter = new javax.swing.JButton();
        jLabelMessageGraphe = new javax.swing.JLabel();
        jPanelEcran0 = new javax.swing.JPanel();
        jPanel_resultat = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jLabelVilles = new javax.swing.JLabel();
        jLabelRestaurant = new javax.swing.JLabel();
        jLabelLoisir = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList5 = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        jList6 = new javax.swing.JList<>();
        jLabelAutoroutes = new javax.swing.JLabel();
        jLabelNationales = new javax.swing.JLabel();
        jLabelDepartementales = new javax.swing.JLabel();
        jLabelRecap = new javax.swing.JLabel();
        jPanelEcran1 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanelNoeuds = new javax.swing.JPanel();
        jComboBoxVille = new javax.swing.JComboBox<>();
        jComboBoxRestaurant = new javax.swing.JComboBox<>();
        jComboBoxLoisir = new javax.swing.JComboBox<>();
        jLabelVoisin = new javax.swing.JLabel();
        jButtonReinitialiser = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jListResNoeuds = new javax.swing.JList<>();
        jPanelLiens = new javax.swing.JPanel();
        jPanelEcran2 = new javax.swing.JPanel();
        jPanelEcran3 = new javax.swing.JPanel();
        jPanelEcran4 = new javax.swing.JPanel();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuFichier = new javax.swing.JMenu();
        jMenuItemImporter = new javax.swing.JMenuItem();
        jMenuItemInformations = new javax.swing.JMenuItem();
        jMenuItemQuitter = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Accueil");

        jTabbedPaneSelectionMenus.setEnabled(false);

        jButtonImporter.setText("Importer un graphe");
        jButtonImporter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonImporterActionPerformed(evt);
            }
        });

        jLabelMessageGraphe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMessageGraphe.setText("En attente d'importation d'un graphe ...");

        javax.swing.GroupLayout jPanelAccueilLayout = new javax.swing.GroupLayout(jPanelAccueil);
        jPanelAccueil.setLayout(jPanelAccueilLayout);
        jPanelAccueilLayout.setHorizontalGroup(
            jPanelAccueilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelMessageGraphe, javax.swing.GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE)
            .addGroup(jPanelAccueilLayout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addComponent(jButtonImporter, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelAccueilLayout.setVerticalGroup(
            jPanelAccueilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAccueilLayout.createSequentialGroup()
                .addContainerGap(295, Short.MAX_VALUE)
                .addComponent(jLabelMessageGraphe)
                .addGap(127, 127, 127)
                .addComponent(jButtonImporter)
                .addGap(44, 44, 44))
        );

        jTabbedPaneSelectionMenus.addTab("Accueil", jPanelAccueil);

        jPanelEcran0.setEnabled(false);

        jList1.setModel(modeleVille);
        jScrollPane1.setViewportView(jList1);

        jList3.setModel(modeleLoisir);
        jScrollPane3.setViewportView(jList3);

        jList2.setModel(modeleRestaurant);
        jScrollPane2.setViewportView(jList2);

        jLabelVilles.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabelRestaurant.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabelLoisir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jList4.setModel(modeleAutoroutes);
        jScrollPane4.setViewportView(jList4);

        jList5.setModel(modeleNationales);
        jScrollPane5.setViewportView(jList5);

        jList6.setModel(modeleDepartementales);
        jScrollPane6.setViewportView(jList6);

        jLabelAutoroutes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabelNationales.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabelDepartementales.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel_resultatLayout = new javax.swing.GroupLayout(jPanel_resultat);
        jPanel_resultat.setLayout(jPanel_resultatLayout);
        jPanel_resultatLayout.setHorizontalGroup(
            jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_resultatLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel_resultatLayout.createSequentialGroup()
                        .addGroup(jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabelAutoroutes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabelNationales, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDepartementales, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel_resultatLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_resultatLayout.createSequentialGroup()
                        .addComponent(jLabelVilles, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelRestaurant, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelLoisir, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel_resultatLayout.setVerticalGroup(
            jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_resultatLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelVilles)
                    .addComponent(jLabelRestaurant)
                    .addComponent(jLabelLoisir))
                .addGroup(jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_resultatLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(jScrollPane6))
                        .addGap(84, 84, 84))
                    .addGroup(jPanel_resultatLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelAutoroutes, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNationales, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDepartementales, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56))))
        );

        jLabelRecap.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanelEcran0Layout = new javax.swing.GroupLayout(jPanelEcran0);
        jPanelEcran0.setLayout(jPanelEcran0Layout);
        jPanelEcran0Layout.setHorizontalGroup(
            jPanelEcran0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_resultat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelRecap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelEcran0Layout.setVerticalGroup(
            jPanelEcran0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEcran0Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelRecap, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_resultat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPaneSelectionMenus.addTab("0-distance", jPanelEcran0);

        jComboBoxVille.setModel(modeleVilleCombo);
        jComboBoxVille.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxVilleActionPerformed(evt);
            }
        });

        jComboBoxRestaurant.setModel(modeleRestoCombo);

        jComboBoxLoisir.setModel(modeleLoisirCombo);

        jLabelVoisin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelVoisin.setText("Voisins direct :");

        jButtonReinitialiser.setText("Réinitialiser");

        jListResNoeuds.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane7.setViewportView(jListResNoeuds);

        javax.swing.GroupLayout jPanelNoeudsLayout = new javax.swing.GroupLayout(jPanelNoeuds);
        jPanelNoeuds.setLayout(jPanelNoeudsLayout);
        jPanelNoeudsLayout.setHorizontalGroup(
            jPanelNoeudsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNoeudsLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanelNoeudsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelVoisin)
                    .addGroup(jPanelNoeudsLayout.createSequentialGroup()
                        .addComponent(jComboBoxVille, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxRestaurant, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxLoisir, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane7))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelNoeudsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonReinitialiser, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(321, 321, 321))
        );
        jPanelNoeudsLayout.setVerticalGroup(
            jPanelNoeudsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNoeudsLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanelNoeudsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxVille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxRestaurant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxLoisir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelVoisin)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonReinitialiser)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Noeuds", jPanelNoeuds);

        javax.swing.GroupLayout jPanelLiensLayout = new javax.swing.GroupLayout(jPanelLiens);
        jPanelLiens.setLayout(jPanelLiensLayout);
        jPanelLiensLayout.setHorizontalGroup(
            jPanelLiensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 794, Short.MAX_VALUE)
        );
        jPanelLiensLayout.setVerticalGroup(
            jPanelLiensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 471, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("Liens", jPanelLiens);

        javax.swing.GroupLayout jPanelEcran1Layout = new javax.swing.GroupLayout(jPanelEcran1);
        jPanelEcran1.setLayout(jPanelEcran1Layout);
        jPanelEcran1Layout.setHorizontalGroup(
            jPanelEcran1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );
        jPanelEcran1Layout.setVerticalGroup(
            jPanelEcran1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jTabbedPaneSelectionMenus.addTab("1-distance", jPanelEcran1);

        javax.swing.GroupLayout jPanelEcran2Layout = new javax.swing.GroupLayout(jPanelEcran2);
        jPanelEcran2.setLayout(jPanelEcran2Layout);
        jPanelEcran2Layout.setHorizontalGroup(
            jPanelEcran2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 794, Short.MAX_VALUE)
        );
        jPanelEcran2Layout.setVerticalGroup(
            jPanelEcran2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 504, Short.MAX_VALUE)
        );

        jTabbedPaneSelectionMenus.addTab("2-distance", jPanelEcran2);

        javax.swing.GroupLayout jPanelEcran3Layout = new javax.swing.GroupLayout(jPanelEcran3);
        jPanelEcran3.setLayout(jPanelEcran3Layout);
        jPanelEcran3Layout.setHorizontalGroup(
            jPanelEcran3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 794, Short.MAX_VALUE)
        );
        jPanelEcran3Layout.setVerticalGroup(
            jPanelEcran3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 504, Short.MAX_VALUE)
        );

        jTabbedPaneSelectionMenus.addTab(">= 2-distance", jPanelEcran3);

        javax.swing.GroupLayout jPanelEcran4Layout = new javax.swing.GroupLayout(jPanelEcran4);
        jPanelEcran4.setLayout(jPanelEcran4Layout);
        jPanelEcran4Layout.setHorizontalGroup(
            jPanelEcran4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 794, Short.MAX_VALUE)
        );
        jPanelEcran4Layout.setVerticalGroup(
            jPanelEcran4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 504, Short.MAX_VALUE)
        );

        jTabbedPaneSelectionMenus.addTab("p-distance", jPanelEcran4);

        jMenuFichier.setText("Fichier");

        jMenuItemImporter.setText("Importer");
        jMenuFichier.add(jMenuItemImporter);

        jMenuItemInformations.setText("Informations");
        jMenuFichier.add(jMenuItemInformations);

        jMenuItemQuitter.setText("Quitter");
        jMenuFichier.add(jMenuItemQuitter);

        jMenuBar.add(jMenuFichier);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneSelectionMenus)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneSelectionMenus, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonImporterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImporterActionPerformed
		if (jButtonImporter.getText().equals("Importer un graphe")) {
			JFileChooser choixFichier = new JFileChooser();
			int option = choixFichier.showOpenDialog(null);
			if(option == JFileChooser.APPROVE_OPTION){
				try {
					File file = choixFichier.getSelectedFile();
					jLabelMessageGraphe.setText("Graphe correctement importé : " + file.getName());
					graphePrincipal = new Graphe(file.getName());
					jTabbedPaneSelectionMenus.setEnabled(true);
					jButtonReinitialiser.setEnabled(true);

					if(jLabelNationales.getText().equals("")){
						int nbSommets = graphePrincipal.comptageSommets().get(0);
						int nbVilles = graphePrincipal.comptageSommets().get(1);
						int nbRestaurants = graphePrincipal.comptageSommets().get(2);
						int nbLoisir = graphePrincipal.comptageSommets().get(3);

						jLabelVilles.setText(nbVilles+" Villes");
						jLabelRestaurant.setText(nbRestaurants+" Restaurant");
						jLabelLoisir.setText(nbLoisir+" lieux de loisir");

						int nbAretes = graphePrincipal.comptageAretes().get(0);
						int nbAutoroutes = graphePrincipal.comptageAretes().get(1);
						int nbNationales = graphePrincipal.comptageAretes().get(2);
						int nbDepartmentales = graphePrincipal.comptageAretes().get(3);

						jLabelAutoroutes.setText(nbAutoroutes+" Autoroutes");
						jLabelNationales.setText(nbNationales+" Nationales");
						jLabelDepartementales.setText(nbDepartmentales+" Departementales");

						jLabelRecap.setText("votre graphe posséde : "+nbSommets+" noeuds"+" et "+nbAretes+" arete");

						modeleVille.ajouterVille(graphePrincipal.trouverSommetsParType("V"));
						modeleRestaurant.ajouterRestaurant(graphePrincipal.trouverSommetsParType("R"));
						modeleLoisir.ajouterLoisir(graphePrincipal.trouverSommetsParType("L"));

						modeleAutoroutes.ajouterAutoroute(graphePrincipal.trouverAretesParType("A"));
						modeleNationales.ajouterNationales(graphePrincipal.trouverAretesParType("N"));
						modeleDepartementales.ajouterDepartmentales(graphePrincipal.trouverAretesParType("D"));
					}
					for(Sommet elem :graphePrincipal.trouverSommetsParType("V")){
						modeleVilleCombo.addElement(elem);
					}
					for(Sommet elem:graphePrincipal.trouverSommetsParType("R")){
						modeleRestoCombo.addElement(elem);
					}
					for(Sommet elem:graphePrincipal.trouverSommetsParType("L")){
						modeleLoisirCombo.addElement(elem);
					}
					jButtonImporter.setText("Supprimer le graphe");
				} catch (IOException e) {
					System.out.println("Erreur dans l'importation : " + e.getMessage());
				}
			}
		} else {
			jButtonReinitialiser.setEnabled(false);
			jTabbedPaneSelectionMenus.setEnabled(false);

			modeleVille.viderModele();
			modeleLoisir.viderModele();
			modeleRestaurant.viderModele();
			modeleAutoroutes.viderModele();
			modeleDepartementales.viderModele();
			modeleNationales.viderModele();
			jLabelMessageGraphe.setText("En attente d'importation d'un graphe ...");
			jButtonImporter.setText("Importer un graphe");
		}
		
    }//GEN-LAST:event_jButtonImporterActionPerformed

    private void jComboBoxVilleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxVilleActionPerformed
        
    }//GEN-LAST:event_jComboBoxVilleActionPerformed

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
			java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Accueil().setVisible(true);
			}
		});
		
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonImporter;
    private javax.swing.JButton jButtonReinitialiser;
    private javax.swing.JComboBox<String> jComboBoxLoisir;
    private javax.swing.JComboBox<String> jComboBoxRestaurant;
    private javax.swing.JComboBox<String> jComboBoxVille;
    private javax.swing.JLabel jLabelAutoroutes;
    private javax.swing.JLabel jLabelDepartementales;
    private javax.swing.JLabel jLabelLoisir;
    private javax.swing.JLabel jLabelMessageGraphe;
    private javax.swing.JLabel jLabelNationales;
    private javax.swing.JLabel jLabelRecap;
    private javax.swing.JLabel jLabelRestaurant;
    private javax.swing.JLabel jLabelVilles;
    private javax.swing.JLabel jLabelVoisin;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JList<String> jList4;
    private javax.swing.JList<String> jList5;
    private javax.swing.JList<String> jList6;
    private javax.swing.JList<String> jListResNoeuds;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuFichier;
    private javax.swing.JMenuItem jMenuItemImporter;
    private javax.swing.JMenuItem jMenuItemInformations;
    private javax.swing.JMenuItem jMenuItemQuitter;
    private javax.swing.JPanel jPanelAccueil;
    private javax.swing.JPanel jPanelEcran0;
    private javax.swing.JPanel jPanelEcran1;
    private javax.swing.JPanel jPanelEcran2;
    private javax.swing.JPanel jPanelEcran3;
    private javax.swing.JPanel jPanelEcran4;
    private javax.swing.JPanel jPanelLiens;
    private javax.swing.JPanel jPanelNoeuds;
    private javax.swing.JPanel jPanel_resultat;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPaneSelectionMenus;
    // End of variables declaration//GEN-END:variables
}
