package pointofsalesystem;

import java.awt.Color;
import javax.swing.ImageIcon;

public class AddNewSupplierGUI extends javax.swing.JFrame
{

    PointOfSaleSystem pos = new PointOfSaleSystem(""); //Create a new pointofsalesystem object to use its methods

    public AddNewSupplierGUI()
    {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/resources/POS_Icon_blue.png")).getImage()); //Set taskbar icon to logo.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        tfPhone = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        tfContactName = new javax.swing.JTextField();
        tfSupplierName = new javax.swing.JTextField();
        lblSave = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        lblPOSLogo = new javax.swing.JLabel();
        lblQuit = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("POS Add New Supplier");
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

        tfPhone.setBackground(new Color(0, 0, 0, 0));
        tfPhone.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tfPhone.setForeground(new java.awt.Color(255, 255, 255));
        tfPhone.setBorder(null);
        getContentPane().add(tfPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 300, 40));

        tfEmail.setBackground(new Color(0, 0, 0, 0));
        tfEmail.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tfEmail.setForeground(new java.awt.Color(255, 255, 255));
        tfEmail.setBorder(null);
        getContentPane().add(tfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 460, 40));

        tfContactName.setBackground(new Color(0, 0, 0, 0));
        tfContactName.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tfContactName.setForeground(new java.awt.Color(255, 255, 255));
        tfContactName.setBorder(null);
        getContentPane().add(tfContactName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 460, 30));

        tfSupplierName.setBackground(new Color(0, 0, 0, 0));
        tfSupplierName.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tfSupplierName.setForeground(new java.awt.Color(255, 255, 255));
        tfSupplierName.setBorder(null);
        getContentPane().add(tfSupplierName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 460, 40));

        lblSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSave.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                lblSaveMouseReleased(evt);
            }
        });
        getContentPane().add(lblSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 304, 150, 30));

        lblBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBack.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                lblBackMouseReleased(evt);
            }
        });
        getContentPane().add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 14, 60, 30));

        lblPOSLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPOSLogo.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                lblPOSLogoMouseReleased(evt);
            }
        });
        getContentPane().add(lblPOSLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 4, 40, 50));

        lblQuit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblQuit.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                lblQuitMouseReleased(evt);
            }
        });
        getContentPane().add(lblQuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 40, 30));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/AddNewSupplierGUI.png"))); // NOI18N
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 586, 376));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        pos.fadeIn(this);                   //Fade in this window
    }//GEN-LAST:event_formWindowOpened

    private void lblBackMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseReleased
        pos.fadeOut(this);                  //Fade out this window
        new ManagerPortalGUI().setVisible(true); //Bring up the manager screen
    }//GEN-LAST:event_lblBackMouseReleased

    private void lblQuitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuitMouseReleased
        pos.fadeOut(this);                  //Fade out the current screen
        System.exit(0);                     //Quit the program
    }//GEN-LAST:event_lblQuitMouseReleased

    private void lblPOSLogoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPOSLogoMouseReleased
        pos.loadWebSite("https://github.com/iggnoreza/pointofsalesystem"); //Load the github repository for this project. 
    }//GEN-LAST:event_lblPOSLogoMouseReleased

    private void lblSaveMouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblSaveMouseReleased
    {//GEN-HEADEREND:event_lblSaveMouseReleased
        String supplierName = tfSupplierName.getText(); //Get the supplier name from the textfield
        String contactName = tfContactName.getText();   //Get the contact name from the textfield
        String email = tfEmail.getText();               //Get the email address from the textfield
        String phone = tfPhone.getText();               //Get the phone number from the textfield
        
        String getSupplierID = "SELECT SUPPLIER_ID FROM NBUSER.SUPPLIERS\n" +
                                "ORDER BY SUPPLIER_ID DESC\n" +
                                "FETCH FIRST 1 ROWS ONLY"; //Get the last supplier ID and increment it with one
        
        int supplierID = pos.getID(getSupplierID) + 1;  //Increment the last supplierID with 1 
        
        String query =  "INSERT INTO NBUSER.SUPPLIERS(SUPPLIER_ID, SUPPLIER_NAME, CONTACT_NAME,"
                        + " SUPPLIER_EMAIL, SUPPLIER_PHONE)\n" +
                        "VALUES (" + supplierID + ", '" + supplierName + "', '" + contactName + "', '" + email + "', "
                        + "'" + phone + "')"; //SQL query to add the data to the DB
        
        pos.addDBEntry(query);                          //Add the data to the DB
    }//GEN-LAST:event_lblSaveMouseReleased

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
            java.util.logging.Logger.getLogger(AddNewSupplierGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(AddNewSupplierGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(AddNewSupplierGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(AddNewSupplierGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new AddNewSupplierGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblPOSLogo;
    private javax.swing.JLabel lblQuit;
    private javax.swing.JLabel lblSave;
    private javax.swing.JTextField tfContactName;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfPhone;
    private javax.swing.JTextField tfSupplierName;
    // End of variables declaration//GEN-END:variables
}
