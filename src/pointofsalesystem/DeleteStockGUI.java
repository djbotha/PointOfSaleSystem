package pointofsalesystem;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class DeleteStockGUI extends javax.swing.JFrame
{

    PointOfSaleSystem pos = new PointOfSaleSystem("");
    int clickercounter = 0;
    
    public DeleteStockGUI()
    {
        initComponents();
        
        this.setIconImage(new ImageIcon(getClass().getResource("/resources/POS_Icon_blue.png")).getImage()); //Set taskbar icon to logo
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        spnQty = new javax.swing.JSpinner();
        tfMarkup = new javax.swing.JTextField();
        tfPricePerUnit = new javax.swing.JTextField();
        tfSupplierName = new javax.swing.JTextField();
        tfSupplierID = new javax.swing.JTextField();
        tfProductID = new javax.swing.JTextField();
        tfBarcode = new javax.swing.JTextField();
        tfProductName = new javax.swing.JTextField();
        lblDeleteStock = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        lblQuit = new javax.swing.JLabel();
        lblPOSLogo = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("POS Delete Stock");
        setUndecorated(true);
        setOpacity(0.0F);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        spnQty.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        getContentPane().add(spnQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 110, 130, 30));

        tfMarkup.setBackground(new Color(0, 0, 0, 0));
        tfMarkup.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tfMarkup.setForeground(new java.awt.Color(255, 255, 255));
        tfMarkup.setBorder(null);
        tfMarkup.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        tfMarkup.setEnabled(false);
        getContentPane().add(tfMarkup, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 120, 30));

        tfPricePerUnit.setBackground(new Color(0, 0, 0, 0));
        tfPricePerUnit.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tfPricePerUnit.setForeground(new java.awt.Color(255, 255, 255));
        tfPricePerUnit.setBorder(null);
        tfPricePerUnit.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        tfPricePerUnit.setEnabled(false);
        getContentPane().add(tfPricePerUnit, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 120, 30));

        tfSupplierName.setBackground(new Color(0, 0, 0, 0));
        tfSupplierName.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tfSupplierName.setForeground(new java.awt.Color(255, 255, 255));
        tfSupplierName.setBorder(null);
        tfSupplierName.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        tfSupplierName.setEnabled(false);
        getContentPane().add(tfSupplierName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 460, 40));

        tfSupplierID.setBackground(new Color(0, 0, 0, 0));
        tfSupplierID.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tfSupplierID.setForeground(new java.awt.Color(255, 255, 255));
        tfSupplierID.setBorder(null);
        tfSupplierID.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        tfSupplierID.setEnabled(false);
        getContentPane().add(tfSupplierID, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 210, 40));

        tfProductID.setBackground(new Color(0, 0, 0, 0));
        tfProductID.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tfProductID.setForeground(new java.awt.Color(255, 255, 255));
        tfProductID.setBorder(null);
        tfProductID.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        tfProductID.setEnabled(false);
        getContentPane().add(tfProductID, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 230, 40));

        tfBarcode.setBackground(new Color(0, 0, 0, 0));
        tfBarcode.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tfBarcode.setForeground(new java.awt.Color(255, 255, 255));
        tfBarcode.setBorder(null);
        tfBarcode.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        tfBarcode.setEnabled(false);
        getContentPane().add(tfBarcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 460, 30));

        tfProductName.setBackground(new Color(0, 0, 0, 0));
        tfProductName.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tfProductName.setForeground(new java.awt.Color(255, 255, 255));
        tfProductName.setBorder(null);
        tfProductName.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(tfProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 290, 40));

        lblDeleteStock.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDeleteStock.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                lblDeleteStockMouseReleased(evt);
            }
        });
        getContentPane().add(lblDeleteStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 364, 200, 30));

        lblBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBack.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                lblBackMouseReleased(evt);
            }
        });
        getContentPane().add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 14, 60, 30));

        lblQuit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblQuit.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                lblQuitMouseReleased(evt);
            }
        });
        getContentPane().add(lblQuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 14, 30, 30));

        lblPOSLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPOSLogo.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                lblPOSLogoMouseReleased(evt);
            }
        });
        getContentPane().add(lblPOSLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 4, 40, 50));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/DeleteStockGUI.png"))); // NOI18N
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        pos.fadeIn(this);                       //Fade in this window
    }//GEN-LAST:event_formWindowOpened

    private void lblPOSLogoMouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblPOSLogoMouseReleased
    {//GEN-HEADEREND:event_lblPOSLogoMouseReleased
        pos.loadWebSite("https://github.com/iggnoreza/pointofsalesystem"); //Load the github repository for this project. 
    }//GEN-LAST:event_lblPOSLogoMouseReleased

    private void lblBackMouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblBackMouseReleased
    {//GEN-HEADEREND:event_lblBackMouseReleased
        pos.fadeOut(this);                      //Fade out the current GUI
        new ManagerPortalGUI().setVisible(true);//Bring up the Manager Portal
    }//GEN-LAST:event_lblBackMouseReleased

    private void lblQuitMouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblQuitMouseReleased
    {//GEN-HEADEREND:event_lblQuitMouseReleased
        pos.fadeOut(this);                      //Fade out the current GUI
        System.exit(0);                         //Quit this program
    }//GEN-LAST:event_lblQuitMouseReleased

    private void lblDeleteStockMouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblDeleteStockMouseReleased
    {//GEN-HEADEREND:event_lblDeleteStockMouseReleased
        if (clickercounter == 0)
        {
            getDetails();
            lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/DeleteStockPermanantlyGUI.png"))); //Change background to a different button
        }
        else
        {
            
        }
    }//GEN-LAST:event_lblDeleteStockMouseReleased

    public void getDetails()
    {
        try
        {
            String productName = tfProductName.getText();
            int qty = (int) spnQty.getValue();

            String query =  "SELECT * FROM NBUSER.PRODUCTS\n" +
                            "WHERE PRODUCTS.PRODUCT_NAME LIKE '" + productName + "'";

            ResultSet rs = pos.searchDB(query);

            rs.next();
        
            int productID = rs.getInt(1);
            String dbProductName = rs.getString(2);
            String barcode = rs.getString(3);
            double costPrice = rs.getDouble(4);
            double markup = rs.getDouble(5);
            int dbQty = rs.getInt(6);
            int supplierID = rs.getInt(7);
            
            String getSupplierName =    "SELECT SUPPLIER_NAME FROM NBUSER.SUPPLIERS\n" +
                                        "WHERE SUPPLIERS.SUPPLIER_ID  = " + supplierID + "";
            ResultSet rs2 = pos.searchDB(getSupplierName);
            rs2.next();
            String supplierName = rs2.getString(1);

            tfBarcode.setText(barcode);
            tfProductID.setText(""+productID);
            tfSupplierID.setText(""+supplierID);
            tfSupplierName.setText(supplierName);
            tfPricePerUnit.setText(""+costPrice);
            tfMarkup.setText(""+ (markup*100.0));
            
            
        } 
        catch (SQLException ex)
        {
            Logger.getLogger(DeleteStockGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        
    }
            /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(DeleteStockGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(DeleteStockGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(DeleteStockGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(DeleteStockGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new DeleteStockGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblDeleteStock;
    private javax.swing.JLabel lblPOSLogo;
    private javax.swing.JLabel lblQuit;
    private javax.swing.JSpinner spnQty;
    private javax.swing.JTextField tfBarcode;
    private javax.swing.JTextField tfMarkup;
    private javax.swing.JTextField tfPricePerUnit;
    private javax.swing.JTextField tfProductID;
    private javax.swing.JTextField tfProductName;
    private javax.swing.JTextField tfSupplierID;
    private javax.swing.JTextField tfSupplierName;
    // End of variables declaration//GEN-END:variables
}
