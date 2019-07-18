package ec.edu.espe.schweitzer_revision.view;

import javax.swing.ImageIcon;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


/**
 *
 * @author Jhony Naranjo
 */
public class FRMSchweitzerSystem extends javax.swing.JFrame {
private static final Logger LOG = Logger.getLogger(FRMSchweitzerSystem.class.getName());
    /**
     * Creates new form FRMSchweitzerSystem
     */
    public FRMSchweitzerSystem() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("icono.png")).getImage());
            try{
            Handler consoleHandler = new ConsoleHandler();
            Handler fileHandler = new FileHandler("Logger.log", false);
            SimpleFormatter simpleFormatter = new SimpleFormatter();
            fileHandler.setFormatter(simpleFormatter);
            LOG.addHandler(consoleHandler);
            LOG.addHandler(fileHandler);
            consoleHandler.setLevel(Level.ALL);
            fileHandler.setLevel(Level.ALL);
            LOG.log(Level.INFO, "Logger Initilized");
        }catch(Exception ex){
            LOG.log(Level.SEVERE, "Error of IO");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMnuFile = new javax.swing.JMenu();
        jMenuItemReserveOrder = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItemViewSpareParts = new javax.swing.JMenuItem();
        jMenuTechnician = new javax.swing.JMenu();
        menuAdmin = new javax.swing.JMenu();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Schweitzer System");

        jMnuFile.setBorder(null);
        jMnuFile.setText("Cliente");
        jMnuFile.setToolTipText("Visualizar el menu para el cliente");

        jMenuItemReserveOrder.setText("Agendar Orden");
        jMenuItemReserveOrder.setToolTipText("Menu para generar orden");
        jMenuItemReserveOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItemReserveOrderMouseClicked(evt);
            }
        });
        jMenuItemReserveOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemReserveOrderActionPerformed(evt);
            }
        });
        jMnuFile.add(jMenuItemReserveOrder);

        jMenuItem1.setText("Cancelar Orden");
        jMenuItem1.setToolTipText("Menu para cancelar la orden\n");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseClicked(evt);
            }
        });
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMnuFile.add(jMenuItem1);

        jMenuItemViewSpareParts.setText("Visualizar Repuestos");
        jMenuItemViewSpareParts.setToolTipText("Menu para visualizar los repuestos");
        jMenuItemViewSpareParts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemViewSparePartsActionPerformed(evt);
            }
        });
        jMnuFile.add(jMenuItemViewSpareParts);

        jMenuBar1.add(jMnuFile);

        jMenuTechnician.setText("Técnico");
        jMenuTechnician.setToolTipText("Visualizar menu del tecnico");
        jMenuTechnician.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuTechnicianMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuTechnician);

        menuAdmin.setText("Admin");
        menuAdmin.setToolTipText("Visualizar menu del tecnico");
        menuAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuAdminMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuAdmin);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jMenuItemReserveOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemReserveOrderMouseClicked
        new FRMClient().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItemReserveOrderMouseClicked

    private void jMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseClicked

    }//GEN-LAST:event_jMenuItem1MouseClicked
    
    private void jMenuTechnicianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuTechnicianMouseClicked
        new FRMLoginTechnician().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuTechnicianMouseClicked

    private void jMenuItemReserveOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemReserveOrderActionPerformed
        new FRMClient().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItemReserveOrderActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        new FRMCancelOrder().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItemViewSparePartsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemViewSparePartsActionPerformed
        new FRMSparePart().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItemViewSparePartsActionPerformed

    private void menuAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAdminMouseClicked
        new FRMLoginAdmin().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuAdminMouseClicked
    
    
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
            java.util.logging.Logger.getLogger(FRMSchweitzerSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRMSchweitzerSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRMSchweitzerSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRMSchweitzerSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRMSchweitzerSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItemReserveOrder;
    private javax.swing.JMenuItem jMenuItemViewSpareParts;
    private javax.swing.JMenu jMenuTechnician;
    private javax.swing.JMenu jMnuFile;
    private javax.swing.JMenu menuAdmin;
    // End of variables declaration//GEN-END:variables
}
