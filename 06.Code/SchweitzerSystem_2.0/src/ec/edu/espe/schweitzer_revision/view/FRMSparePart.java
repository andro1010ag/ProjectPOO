package ec.edu.espe.schweitzer_revision.view;

import com.google.gson.Gson;
import filemanager.FileManager;
import ec.edu.espe.schweitzer_revision.model.Path;
import ec.edu.espe.schweitzer_revision.model.SparePart;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Jhony Naranjo
 */
public class FRMSparePart extends javax.swing.JFrame {
    DefaultTableModel columns = new DefaultTableModel();
    static ArrayList<SparePart> arraySparePart = new ArrayList<SparePart>();
    String sellForm = Path.itemList;
    /**
     * Creates new form FRMSparePart
     */
    public FRMSparePart(){
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("icono.png")).getImage());
        try {
            readLastLine(sellForm);
        } catch (IOException ex) {
            Logger.getLogger(FRMSparePart.class.getName()).log(Level.SEVERE, null, ex);
        }
        setTable();
    }
    
    public void setTable(){
        ArrayList<String> column = new ArrayList<String>();
        column.add("Nombre");
        column.add("Precio");
        column.add("Cantidad");
        for (Object col : column) {
            columns.addColumn(col);
        }
        this.jTableSpareParts.setModel(columns);
        Object[] fila = new Object[columns.getColumnCount()];
        for (int i = 0; i < arraySparePart.size(); i++) {
            fila[0] = arraySparePart.get(i).getName();
            fila[1] = arraySparePart.get(i).getPrice();
            fila[2] = arraySparePart.get(i).getStock();
            columns.addRow(fila);
        }       
    }
    
    
    public static void readLastLine(String filePath) throws IOException{
         BufferedReader input = null;
         
         try {
             input = new BufferedReader(new FileReader(filePath));
         } catch (FileNotFoundException ex) {
             Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
         }

         String last = null, line;

         while ((line = input.readLine()) != null) {
             last = line;
             Gson gson = new Gson();
             SparePart sparePart;
             sparePart = gson.fromJson(last, SparePart.class);
             arraySparePart.add(sparePart);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonMenu = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableSpareParts = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Productos Disponibles");

        jButtonMenu.setText("Menú");
        jButtonMenu.setToolTipText("Regresar al menu principal");
        jButtonMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonMenuMouseClicked(evt);
            }
        });

        jTableSpareParts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTableSpareParts);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(326, 326, 326)
                        .addComponent(jButtonMenu))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jButtonMenu)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMenuMouseClicked
        FRMSchweitzerSystem system = new FRMSchweitzerSystem();
        system.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonMenuMouseClicked

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
            java.util.logging.Logger.getLogger(FRMSparePart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRMSparePart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRMSparePart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRMSparePart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRMSparePart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableSpareParts;
    // End of variables declaration//GEN-END:variables
}
