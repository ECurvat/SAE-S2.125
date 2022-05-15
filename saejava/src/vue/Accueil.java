/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vue;

import java.io.File;
import javax.swing.JFileChooser;
import metier.*;

/**
 *
 * @author frsgr
 */
public class Accueil extends javax.swing.JFrame{
	
	public Graphe graphePrincipal;

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

        jPanelNavigation = new javax.swing.JPanel();
        jButtonAccueil = new javax.swing.JButton();
        jButtonEcran0 = new javax.swing.JButton();
        jButtonEcran1 = new javax.swing.JButton();
        jButtonEcran2 = new javax.swing.JButton();
        jButtonEcran3 = new javax.swing.JButton();
        jButtonEcran4 = new javax.swing.JButton();
        jPanelPrincipal = new javax.swing.JPanel();
        jButtonImporter = new javax.swing.JButton();
        jLabelMessageGraphe = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuFichier = new javax.swing.JMenu();
        jMenuItemImporter = new javax.swing.JMenuItem();
        jMenuItemInformations = new javax.swing.JMenuItem();
        jMenuItemQuitter = new javax.swing.JMenuItem();
        jMenuNavigation = new javax.swing.JMenu();
        jMenuItemAccueil = new javax.swing.JMenuItem();
        jMenuItemEcran0 = new javax.swing.JMenuItem();
        jMenuItemEcran1 = new javax.swing.JMenuItem();
        jMenuItemEcran2 = new javax.swing.JMenuItem();
        jMenuItemEcran3 = new javax.swing.JMenuItem();
        jMenuItemEcran4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Accueil");

        jPanelNavigation.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Navigation"));

        jButtonAccueil.setText("Accueil");
        jButtonAccueil.setEnabled(false);

        jButtonEcran0.setText("0-distance");
        jButtonEcran0.setEnabled(false);
        jButtonEcran0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEcran0ActionPerformed(evt);
            }
        });

        jButtonEcran1.setText("1-distance");
        jButtonEcran1.setEnabled(false);

        jButtonEcran2.setText("2-distance");
        jButtonEcran2.setEnabled(false);

        jButtonEcran3.setText(">=2-distance");
        jButtonEcran3.setEnabled(false);

        jButtonEcran4.setText("p-distance");
        jButtonEcran4.setEnabled(false);

        javax.swing.GroupLayout jPanelNavigationLayout = new javax.swing.GroupLayout(jPanelNavigation);
        jPanelNavigation.setLayout(jPanelNavigationLayout);
        jPanelNavigationLayout.setHorizontalGroup(
            jPanelNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNavigationLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButtonAccueil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonEcran0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonEcran1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonEcran2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonEcran3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonEcran4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );
        jPanelNavigationLayout.setVerticalGroup(
            jPanelNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNavigationLayout.createSequentialGroup()
                .addComponent(jButtonAccueil, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButtonEcran0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButtonEcran1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButtonEcran2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButtonEcran3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jButtonEcran4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Accueil"));

        jButtonImporter.setText("Importer un graphe");
        jButtonImporter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonImporterActionPerformed(evt);
            }
        });

        jLabelMessageGraphe.setText("En attente d'importation d'un graphe...");

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabelMessageGraphe))
                    .addComponent(jButtonImporter))
                .addGap(172, 172, 172))
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jLabelMessageGraphe)
                .addGap(173, 173, 173)
                .addComponent(jButtonImporter)
                .addGap(15, 15, 15))
        );

        jMenuFichier.setText("Fichier");

        jMenuItemImporter.setText("Importer");
        jMenuFichier.add(jMenuItemImporter);

        jMenuItemInformations.setText("Informations");
        jMenuFichier.add(jMenuItemInformations);

        jMenuItemQuitter.setText("Quitter");
        jMenuFichier.add(jMenuItemQuitter);

        jMenuBar.add(jMenuFichier);

        jMenuNavigation.setText("Navigation");

        jMenuItemAccueil.setText("Accueil");
        jMenuItemAccueil.setEnabled(false);
        jMenuNavigation.add(jMenuItemAccueil);

        jMenuItemEcran0.setText("0-distance");
        jMenuItemEcran0.setEnabled(false);
        jMenuNavigation.add(jMenuItemEcran0);

        jMenuItemEcran1.setText("1-distance");
        jMenuItemEcran1.setEnabled(false);
        jMenuNavigation.add(jMenuItemEcran1);

        jMenuItemEcran2.setText("2-distance");
        jMenuItemEcran2.setEnabled(false);
        jMenuNavigation.add(jMenuItemEcran2);

        jMenuItemEcran3.setText(">=2-distance");
        jMenuItemEcran3.setEnabled(false);
        jMenuNavigation.add(jMenuItemEcran3);

        jMenuItemEcran4.setText("p-distance");
        jMenuItemEcran4.setEnabled(false);
        jMenuNavigation.add(jMenuItemEcran4);

        jMenuBar.add(jMenuNavigation);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelNavigation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelNavigation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonImporterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImporterActionPerformed
        JFileChooser choixFichier = new JFileChooser();
		int option = choixFichier.showOpenDialog(null);
            if(option == JFileChooser.APPROVE_OPTION){
               File file = choixFichier.getSelectedFile();
			   graphePrincipal = new Graphe(file);
			   jLabelMessageGraphe.setText("Graphe correctement importé : " + file.getName());
			   jButtonEcran0.setEnabled(true);
			   jButtonEcran1.setEnabled(true);
			   jButtonEcran2.setEnabled(true);
			   jButtonEcran3.setEnabled(true);
			   jButtonEcran4.setEnabled(true);
			   jMenuItemEcran0.setEnabled(true);
			   jMenuItemEcran1.setEnabled(true);
			   jMenuItemEcran2.setEnabled(true);
			   jMenuItemEcran3.setEnabled(true);
			   jMenuItemEcran4.setEnabled(true);
			}
    }//GEN-LAST:event_jButtonImporterActionPerformed

    private void jButtonEcran0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEcran0ActionPerformed
        Ecran0 aOuvrir = new Ecran0();
		aOuvrir.setGraphePrincipal(graphePrincipal);
		aOuvrir.setVisible(true);
		this.dispose();
    }//GEN-LAST:event_jButtonEcran0ActionPerformed

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
    private javax.swing.JButton jButtonAccueil;
    private javax.swing.JButton jButtonEcran0;
    private javax.swing.JButton jButtonEcran1;
    private javax.swing.JButton jButtonEcran2;
    private javax.swing.JButton jButtonEcran3;
    private javax.swing.JButton jButtonEcran4;
    private javax.swing.JButton jButtonImporter;
    private javax.swing.JLabel jLabelMessageGraphe;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuFichier;
    private javax.swing.JMenuItem jMenuItemAccueil;
    private javax.swing.JMenuItem jMenuItemEcran0;
    private javax.swing.JMenuItem jMenuItemEcran1;
    private javax.swing.JMenuItem jMenuItemEcran2;
    private javax.swing.JMenuItem jMenuItemEcran3;
    private javax.swing.JMenuItem jMenuItemEcran4;
    private javax.swing.JMenuItem jMenuItemImporter;
    private javax.swing.JMenuItem jMenuItemInformations;
    private javax.swing.JMenuItem jMenuItemQuitter;
    private javax.swing.JMenu jMenuNavigation;
    private javax.swing.JPanel jPanelNavigation;
    private javax.swing.JPanel jPanelPrincipal;
    // End of variables declaration//GEN-END:variables
}