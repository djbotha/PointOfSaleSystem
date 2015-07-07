/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pointofsalesystem;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class ReceiveDeliveryGUI extends javax.swing.JFrame
{

    PointOfSaleSystem pos = new PointOfSaleSystem(""); 
    
    int clickercounter = 0;                             //Counter used to determine how many times the ReceiveDelivery button has been clicked
    int orderID, orderQty, productID;
    
    
    
    
    public ReceiveDeliveryGUI()
    {
        initComponents();
        
        this.setIconImage(new ImageIcon(getClass().getResource("/resources/POS_Icon_blue.png")).getImage()); //Set taskbar icon to logo.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        tfTotalPrice = new javax.swing.JTextField();
        tfPricePerUnit = new javax.swing.JTextField();
        tfSupplierName = new javax.swing.JTextField();
        tfBarcode = new javax.swing.JTextField();
        tfProductName = new javax.swing.JTextField();
        tfProductID = new javax.swing.JTextField();
        tfOrderID = new javax.swing.JTextField();
        lblPOSLogo = new javax.swing.JLabel();
        lblProjectNotes = new javax.swing.JLabel();
        lblQuit = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        lblReceiveDelivery = new javax.swing.JLabel();
        spnQty = new javax.swing.JSpinner();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("POS Receive Delivery");
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

        tfTotalPrice.setBackground(new Color(0, 0, 0, 0));
        tfTotalPrice.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tfTotalPrice.setForeground(new java.awt.Color(255, 255, 255));
        tfTotalPrice.setBorder(null);
        tfTotalPrice.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        tfTotalPrice.setEnabled(false);
        getContentPane().add(tfTotalPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 120, 30));

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

        tfBarcode.setBackground(new Color(0, 0, 0, 0));
        tfBarcode.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tfBarcode.setForeground(new java.awt.Color(255, 255, 255));
        tfBarcode.setBorder(null);
        tfBarcode.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        tfBarcode.setEnabled(false);
        getContentPane().add(tfBarcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 460, 40));

        tfProductName.setBackground(new Color(0, 0, 0, 0));
        tfProductName.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tfProductName.setForeground(new java.awt.Color(255, 255, 255));
        tfProductName.setBorder(null);
        tfProductName.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        tfProductName.setEnabled(false);
        getContentPane().add(tfProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 360, 30));

        tfProductID.setBackground(new Color(0, 0, 0, 0));
        tfProductID.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tfProductID.setForeground(new java.awt.Color(255, 255, 255));
        tfProductID.setBorder(null);
        tfProductID.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        tfProductID.setEnabled(false);
        getContentPane().add(tfProductID, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 220, 40));

        tfOrderID.setBackground(new Color(0, 0, 0, 0));
        tfOrderID.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tfOrderID.setForeground(new java.awt.Color(255, 255, 255));
        tfOrderID.setBorder(null);
        getContentPane().add(tfOrderID, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 220, 40));

        lblPOSLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPOSLogo.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                lblPOSLogoMouseReleased(evt);
            }
        });
        getContentPane().add(lblPOSLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 4, 40, 50));

        lblProjectNotes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblProjectNotes.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                lblProjectNotesMouseReleased(evt);
            }
        });
        getContentPane().add(lblProjectNotes, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 14, 250, 30));

        lblQuit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblQuit.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                lblQuitMouseReleased(evt);
            }
        });
        getContentPane().add(lblQuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 14, 40, 30));

        lblBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBack.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                lblBackMouseReleased(evt);
            }
        });
        getContentPane().add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 14, 60, 30));

        lblReceiveDelivery.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblReceiveDelivery.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                lblReceiveDeliveryMouseReleased(evt);
            }
        });
        getContentPane().add(lblReceiveDelivery, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 364, 190, 30));
        getContentPane().add(spnQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 80, 30));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ReceiveDeliveryGUI.png"))); // NOI18N
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        pos.fadeIn(this);
    }//GEN-LAST:event_formWindowOpened

    private void lblReceiveDeliveryMouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblReceiveDeliveryMouseReleased
    {//GEN-HEADEREND:event_lblReceiveDeliveryMouseReleased
        if (clickercounter == 0)
        {
            getDetails();
            lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ReceiveDeliveryGUIConfirm.png"))); //Change background to a different button
            clickercounter++;
        }
        else
            receiveDelivery();
    }//GEN-LAST:event_lblReceiveDeliveryMouseReleased

    private void lblBackMouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblBackMouseReleased
    {//GEN-HEADEREND:event_lblBackMouseReleased
        pos.fadeOut(this);
    }//GEN-LAST:event_lblBackMouseReleased

    private void lblQuitMouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblQuitMouseReleased
    {//GEN-HEADEREND:event_lblQuitMouseReleased
        pos.fadeOut(this);
        System.exit(0);
    }//GEN-LAST:event_lblQuitMouseReleased

    private void lblPOSLogoMouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblPOSLogoMouseReleased
    {//GEN-HEADEREND:event_lblPOSLogoMouseReleased
        pos.loadWebSite("https://github.com/iggnoreza/pointofsalesystem"); //Load the github repository for this project. 
    }//GEN-LAST:event_lblPOSLogoMouseReleased

    private void lblProjectNotesMouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblProjectNotesMouseReleased
    {//GEN-HEADEREND:event_lblProjectNotesMouseReleased
        pos.loadWebSite("http://pointofsalesystem.github.io/receivedelivery/"); //Load the project notes for this screen
    }//GEN-LAST:event_lblProjectNotesMouseReleased

    public void getDetails() //Method to retrieve all the details of the order
    {
        try
        {
            orderID = Integer.parseInt(tfOrderID.getText());   //Fetch the order ID from the text field                               

            String query =  "SELECT * FROM NBUSER.ORDERS\n" +
                            "WHERE ORDERS.ORDER_ID = " + orderID; //Query to fetch all the data regarding the specific order

            ResultSet rs = pos.searchDB(query);             //Fetch all the data from the table

            rs.next();                                      //Skip to the first line of the ResultSet
        
            orderID = rs.getInt(1);                         //Fetch the productID from the table
            productID = rs.getInt(2);                   //Fetch the productName from the table
            int supplierID = rs.getInt(3);                  //Fetch the barcode from the table
            orderQty = rs.getInt(4);                    //Fetch the costprice from the table
            double orderPrice = rs.getDouble(5);            //Fetch the markup from the table
            String orderDate = rs.getString(6);             //Fetch the quantity from the table
            
            String getProductNameBarcode =    "SELECT PRODUCT_NAME, PRODUCT_BARCODE FROM NBUSER.PRODUCTS\n" +
                                        "WHERE PRODUCTS.PRODUCT_ID = " + productID + ""; //Query to fetch the productName 
            
            ResultSet rs2 = pos.searchDB(getProductNameBarcode);   //Fetch the productName from the database
            rs2.next();                                     //Skip to the first line of the file
            String productName = rs2.getString(1);          //Fetch the productName from the resultset
            String barcode = rs2.getString(2);
            
            String getSupplierName =    "SELECT SUPPLIER_NAME FROM NBUSER.SUPPLIERS\n" +
                                        "WHERE SUPPLIERS.SUPPLIER_ID  = " + supplierID + ""; //Query to fetch the supplier Name 
            
            ResultSet rs3 = pos.searchDB(getSupplierName);  //Fetch the supplierName from the database
            rs3.next();                                     //Skip to the first line of the file
            String supplierName = rs3.getString(1);                //Fetch the supplier Name from the resultset
            
            double pricePerUnit = orderPrice/orderQty;
            pricePerUnit = (int)(pricePerUnit*100);
            pricePerUnit /= 100;
            
            orderPrice = (int)(orderPrice*100);
            orderPrice /= 100;
            
            tfProductID.setText(""+productID);
            tfProductName.setText(productName);
            spnQty.setValue(orderQty);
            tfBarcode.setText(barcode);
            tfSupplierName.setText(supplierName);
            tfPricePerUnit.setText("R"+pricePerUnit);
            tfTotalPrice.setText("R"+orderPrice);
        } 
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Failed to fetch data from tables: " + ex);
        }
    }
    
    public void receiveDelivery() //Method to set the delivery status to true
    {
        try
        {
            String getDeliveredStatus = "SELECT DELIVERED FROM NBUSER.ORDERS\n"
                                        + "WHERE ORDERS.ORDER_ID = " + orderID;
            ResultSet rs = pos.searchDB(getDeliveredStatus);
            rs.next();
            
            boolean delivered = rs.getBoolean(1);
           
            if (!delivered)
            {
                String setDeliveredTrue =  "UPDATE NBUSER.ORDERS SET ORDERS.DELIVERED = true" 
                                    + " WHERE ORDERS.ORDER_ID = " + orderID; //Query to decrease the amount of product with the desired amount
                pos.deleteDBEntry(setDeliveredTrue);                           //Execute the above query 

                String increaseQty =  "UPDATE NBUSER.ORDERS SET ORDERS.DELIVERED = true" 
                                    + " WHERE ORDERS.ORDER_ID = " + orderID; //Query to decrease the amount of product with the desired amount
                pos.deleteDBEntry(setDeliveredTrue);                           //Execute the above query 

                increaseQty(productID, orderQty);

                clearFields();
            } 
            else
            {
                JOptionPane.showMessageDialog(null, "Order already delivered!");
                clearFields();
            }    
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Failed to retrieve delivery status: " + ex);
        }
    }
    
    public void increaseQty(int productid, int orderQuantity) //Change the value of the quantity field in the products table
    {
        String getProductQuantity = "SELECT PRODUCTS.PRODUCT_QTY FROM NBUSER.PRODUCTS\n" +
                                     "WHERE PRODUCTS.PRODUCT_ID = " + productid ; //Query to get the current product quantity
        
        int productqty = pos.getID(getProductQuantity);         //Get the current product quantity
        
        String increaseQty =  "UPDATE NBUSER.PRODUCTS SET PRODUCTS.PRODUCT_QTY = " + (productqty+orderQuantity) 
                                    + " WHERE PRODUCTS.PRODUCT_ID = " + productid; //Query to increase the amount of product with the desired amount
        
        pos.addDBEntry(increaseQty);                           //Increase the amount of product with the desired amount
    }
    
    public void clearFields() //Reset the GUI to accept another order
    {
        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ReceiveDeliveryGUI.png"))); //Change background to a different button
        
        clickercounter = 0;                                     //Reset the clicker counter
            
        //Clear all the textfields
        tfOrderID.setText(null);                                
        tfProductID.setText(null);
        tfProductName.setText(null);
        spnQty.setValue(0);
        tfBarcode.setText(null);
        tfSupplierName.setText(null);
        tfPricePerUnit.setText(null);
        tfTotalPrice.setText(null);
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
            java.util.logging.Logger.getLogger(ReceiveDeliveryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(ReceiveDeliveryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(ReceiveDeliveryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(ReceiveDeliveryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new ReceiveDeliveryGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblPOSLogo;
    private javax.swing.JLabel lblProjectNotes;
    private javax.swing.JLabel lblQuit;
    private javax.swing.JLabel lblReceiveDelivery;
    private javax.swing.JSpinner spnQty;
    private javax.swing.JTextField tfBarcode;
    private javax.swing.JTextField tfOrderID;
    private javax.swing.JTextField tfPricePerUnit;
    private javax.swing.JTextField tfProductID;
    private javax.swing.JTextField tfProductName;
    private javax.swing.JTextField tfSupplierName;
    private javax.swing.JTextField tfTotalPrice;
    // End of variables declaration//GEN-END:variables
}
