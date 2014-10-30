package com.calstephens.cluster;

import java.io.File;

/**
 *
 * @author cal
 */
public class FileFrame extends javax.swing.JFrame {

    private final ClusterFrame cluster;

    /**
     * Creates new form FileFrame
     */
    public FileFrame() {
	cluster = null;
	initComponents();
    }

    public FileFrame(ClusterFrame cluster) {
	this.cluster = cluster;
	initComponents();
    }

    /**
     * This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Open File\n");

        jFileChooser1.setCurrentDirectory(new java.io.File("/Users"));
        jFileChooser1.setDialogTitle("");
        jFileChooser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooser1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFileChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFileChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
        );

        jFileChooser1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFileChooser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser1ActionPerformed
	if(evt.getActionCommand().equalsIgnoreCase("ApproveSelection")) {
	    File f = jFileChooser1.getSelectedFile();
	    cluster.giveFile(f);
	    this.setVisible(false);
	    this.dispose();
	} else if(evt.getActionCommand().equalsIgnoreCase("CancelSelection")) {
	    this.setVisible(false);
	    this.dispose();
	}
    }//GEN-LAST:event_jFileChooser1ActionPerformed

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
	    for(javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
		if("Nimbus".equals(info.getName())) {
		    javax.swing.UIManager.setLookAndFeel(info.getClassName());
		    break;
		}
	    }
	} catch(ClassNotFoundException ex) {
	    java.util.logging.Logger.getLogger(FileFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch(InstantiationException ex) {
	    java.util.logging.Logger.getLogger(FileFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch(IllegalAccessException ex) {
	    java.util.logging.Logger.getLogger(FileFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch(javax.swing.UnsupportedLookAndFeelException ex) {
	    java.util.logging.Logger.getLogger(FileFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}
        //</editor-fold>

	/* Create and display the form */
	java.awt.EventQueue.invokeLater(new Runnable() {
	    public void run() {
		new FileFrame().setVisible(true);
	    }
	});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser jFileChooser1;
    // End of variables declaration//GEN-END:variables
}