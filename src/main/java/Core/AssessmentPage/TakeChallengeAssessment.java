/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Core.AssessmentPage;

import Core.AssessmentPage.TakeChallengeModeOfDifficulty.EasyTakeChallenge;
import Core.AssessmentPage.TakeChallengeModeOfDifficulty.HardTakeChallenge;
import Core.AssessmentPage.TakeChallengeModeOfDifficulty.IntermediateTakeChallenge;

/**
 *
 * @author Marc
 */
public class TakeChallengeAssessment extends javax.swing.JFrame {

	/**
	 * Creates new form TakeChallengeAssessment
	 */
	public TakeChallengeAssessment() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                takeChallengeEasyButton = new javax.swing.JButton();
                takeChallengeIntermediateButton = new javax.swing.JButton();
                takeChallengeHardButton = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                getContentPane().setLayout(new java.awt.GridLayout(1, 0));

                takeChallengeEasyButton.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
                takeChallengeEasyButton.setText("Easy");
                takeChallengeEasyButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                takeChallengeEasyButtonActionPerformed(evt);
                        }
                });
                getContentPane().add(takeChallengeEasyButton);

                takeChallengeIntermediateButton.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
                takeChallengeIntermediateButton.setText("Intermediate");
                takeChallengeIntermediateButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                takeChallengeIntermediateButtonActionPerformed(evt);
                        }
                });
                getContentPane().add(takeChallengeIntermediateButton);

                takeChallengeHardButton.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
                takeChallengeHardButton.setText("Hard");
                takeChallengeHardButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                takeChallengeHardButtonActionPerformed(evt);
                        }
                });
                getContentPane().add(takeChallengeHardButton);

                pack();
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

        private void takeChallengeHardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_takeChallengeHardButtonActionPerformed
                // TODO add your handling code here:
		HardTakeChallenge hardTakeChallenge = new HardTakeChallenge();
		hardTakeChallenge.setVisible(true);
		this.dispose();
        }//GEN-LAST:event_takeChallengeHardButtonActionPerformed

        private void takeChallengeEasyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_takeChallengeEasyButtonActionPerformed
                // TODO add your handling code here:
		EasyTakeChallenge easyTakeChallenge = new EasyTakeChallenge();
		easyTakeChallenge.setVisible(true);
		this.dispose();
        }//GEN-LAST:event_takeChallengeEasyButtonActionPerformed

        private void takeChallengeIntermediateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_takeChallengeIntermediateButtonActionPerformed
                // TODO add your handling code here:
		IntermediateTakeChallenge intermediateTakeChallenge = new IntermediateTakeChallenge();
		intermediateTakeChallenge.setVisible(true);
		this.dispose();
        }//GEN-LAST:event_takeChallengeIntermediateButtonActionPerformed

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
			java.util.logging.Logger.getLogger(TakeChallengeAssessment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(TakeChallengeAssessment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(TakeChallengeAssessment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(TakeChallengeAssessment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new TakeChallengeAssessment().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton takeChallengeEasyButton;
        private javax.swing.JButton takeChallengeHardButton;
        private javax.swing.JButton takeChallengeIntermediateButton;
        // End of variables declaration//GEN-END:variables
}