package pointofsalesystem;

import java.awt.Color;
import javax.swing.ImageIcon;

public class AddNewStockGUI extends javax.swing.JFrame 
{

    PointOfSaleSystem pos =  new PointOfSaleSystem(""); //Create a new pointofsalesystem object to use its methods
    
    public AddNewStockGUI() 
    {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/resources/POS_Icon_blue.png")).getImage()); //Set taskbar icon to logo.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfMarkup = new javax.swing.JTextField();
        tfPricePerUnit = new javax.swing.JTextField();
        tfSupplierName = new javax.swing.JTextField();
        tfBarcode = new javax.swing.JTextField();
        tfProductName = new javax.swing.JTextField();
        lblAddToDB = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        lblQuit = new javax.swing.JLabel();
        lblPOSLogo = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setOpacity(0.0F);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfMarkup.setBackground(new Color(0, 0, 0, 0));
        tfMarkup.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tfMarkup.setForeground(new java.awt.Color(255, 255, 255));
        tfMarkup.setBorder(null);
        getContentPane().add(tfMarkup, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 110, 30));

        tfPricePerUnit.setBackground(new Color(0, 0, 0, 0));
        tfPricePerUnit.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tfPricePerUnit.setForeground(new java.awt.Color(255, 255, 255));
        tfPricePerUnit.setBorder(null);
        getContentPane().add(tfPricePerUnit, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 110, 30));

        tfSupplierName.setBackground(new Color(0, 0, 0, 0));
        tfSupplierName.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tfSupplierName.setForeground(new java.awt.Color(255, 255, 255));
        tfSupplierName.setBorder(null);
        getContentPane().add(tfSupplierName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 246, 460, 20));

        tfBarcode.setBackground(new Color(0, 0, 0, 0));
        tfBarcode.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tfBarcode.setForeground(new java.awt.Color(255, 255, 255));
        tfBarcode.setBorder(null);
        getContentPane().add(tfBarcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 460, 20));

        tfProductName.setBackground(new Color(0, 0, 0, 0));
        tfProductName.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tfProductName.setForeground(new java.awt.Color(255, 255, 255));
        tfProductName.setBorder(null);
        getContentPane().add(tfProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 116, 340, 20));

        lblAddToDB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAddToDB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblAddToDBMouseReleased(evt);
            }
        });
        getContentPane().add(lblAddToDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 304, 150, 30));

        lblBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblBackMouseReleased(evt);
            }
        });
        getContentPane().add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 14, 60, 20));

        lblQuit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblQuit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblQuitMouseReleased(evt);
            }
        });
        getContentPane().add(lblQuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 40, 30));

        lblPOSLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPOSLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblPOSLogoMouseReleased(evt);
            }
        });
        getContentPane().add(lblPOSLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 4, 40, 40));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/AddNewStockGUI.png"))); // NOI18N
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 370));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        pos.fadeIn(this);                       //Fade in the current screen smoothly
    }//GEN-LAST:event_formWindowOpened

    private void lblQuitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuitMouseReleased
        pos.fadeOut(this);                      //Fade out the current screen
        System.exit(0);                         //Quit the program
    }//GEN-LAST:event_lblQuitMouseReleased

    private void lblBackMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseReleased
        pos.fadeOut(this);                      //Fade out the current screen
        new ManagerPortalGUI().setVisible(true);//Bring up the manager portal
    }//GEN-LAST:event_lblBackMouseReleased

    private void lblPOSLogoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPOSLogoMouseReleased
        pos.loadWebSite("https://github.com/iggnoreza/pointofsalesystem"); //Load the github repository for this project. 
    }//GEN-LAST:event_lblPOSLogoMouseReleased

    private void lblAddToDBMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddToDBMouseReleased
        String productName = tfProductName.getText();       //Fetch product name from the text field
        String barcode = tfBarcode.getText();               //Fetch barcode from the text field
        String supplierName = tfSupplierName.getText();     //Fetch supplier name from the text field
        double pricePerUnit = Double.parseDouble(tfPricePerUnit.getText()); //Fetch price per unit from the text field
        double markup = Double.parseDouble(tfMarkup.getText()); //Fetch product markup from the text field
        int supplierID = 0;                                 //Supplier ID to be fetched from table
        
        String getSupplierID = "SELECT SUPPLIER_ID FROM NBUSER.SUPPLIERS\n" +
                                "WHERE SUPPLIER_NAME LIKE '" +  supplierName + "'";
        
        System.out.println(pos.getSupplierID(getSupplierID));
        
        
        
        String query =    "INSERT INTO NBUSER.PRODUCTS(PRODUCT_NAME, PRODUCT_BARCODE,"
                + " PRODUCT_COSTPRICE, PRODUCT_MARKUP, PRODUCT_QTY, SUPPLIER_ID)\n" +
                        "VALUES ('" + productName + "', '" + barcode + "', '" + pricePerUnit + "', "
                + "'" + markup + "', '" + supplierID + "')"; //SQL query to add the data to the DB
        
        pos.addDBEntry(query);
    }//GEN-LAST:event_lblAddToDBMouseReleased

    public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(AddNewStockGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewStockGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewStockGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewStockGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNewStockGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblAddToDB;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblPOSLogo;
    private javax.swing.JLabel lblQuit;
    private javax.swing.JTextField tfBarcode;
    private javax.swing.JTextField tfMarkup;
    private javax.swing.JTextField tfPricePerUnit;
    private javax.swing.JTextField tfProductName;
    private javax.swing.JTextField tfSupplierName;
    // End of variables declaration//GEN-END:variables
}
