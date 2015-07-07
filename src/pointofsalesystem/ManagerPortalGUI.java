package pointofsalesystem;

import javax.swing.ImageIcon;

public class ManagerPortalGUI extends javax.swing.JFrame 
{
    
    PointOfSaleSystem pos =  new PointOfSaleSystem(); //Create a new pointofsalesystem object to use its methods
    
    public ManagerPortalGUI() 
    {
        initComponents();

        this.setIconImage(new ImageIcon(getClass().getResource("/resources/POS_Icon_blue.png")).getImage()); //Set taskbar icon to logo.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        lblAddNewStock = new javax.swing.JLabel();
        lblOrderStock = new javax.swing.JLabel();
        lblRemoveStock = new javax.swing.JLabel();
        lblIncomeStatement = new javax.swing.JLabel();
        lblReceiveDelivery = new javax.swing.JLabel();
        lblAddNewSupplier = new javax.swing.JLabel();
        lblPOSLogo = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        lblQuit = new javax.swing.JLabel();
        lblCompanyLogo = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("POS Manager Portal");
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

        lblAddNewStock.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAddNewStock.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                lblAddNewStockMouseReleased(evt);
            }
        });
        getContentPane().add(lblAddNewStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 150, 150));

        lblOrderStock.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblOrderStock.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                lblOrderStockMouseReleased(evt);
            }
        });
        getContentPane().add(lblOrderStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 150, 150));

        lblRemoveStock.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRemoveStock.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                lblRemoveStockMouseReleased(evt);
            }
        });
        getContentPane().add(lblRemoveStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 534, 150, 150));

        lblIncomeStatement.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblIncomeStatement.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                lblIncomeStatementMouseReleased(evt);
            }
        });
        getContentPane().add(lblIncomeStatement, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 344, 150, 140));

        lblReceiveDelivery.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblReceiveDelivery.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                lblReceiveDeliveryMouseReleased(evt);
            }
        });
        getContentPane().add(lblReceiveDelivery, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 154, 150, 140));

        lblAddNewSupplier.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAddNewSupplier.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                lblAddNewSupplierMouseReleased(evt);
            }
        });
        getContentPane().add(lblAddNewSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 530, 150, 150));

        lblPOSLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPOSLogo.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                lblPOSLogoMouseReleased(evt);
            }
        });
        getContentPane().add(lblPOSLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 4, 40, 50));

        lblBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBack.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                lblBackMouseReleased(evt);
            }
        });
        getContentPane().add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 14, 60, 30));

        lblQuit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblQuit.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                lblQuitMouseReleased(evt);
            }
        });
        getContentPane().add(lblQuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, 30, 30));

        lblCompanyLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCompanyLogo.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                lblCompanyLogoMouseReleased(evt);
            }
        });
        getContentPane().add(lblCompanyLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 224, 320, 380));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ManagerPortalGUI.png"))); // NOI18N
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        pos.fadeIn(this);                           //Fade in this window
    }//GEN-LAST:event_formWindowOpened

    private void lblBackMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseReleased
        pos.fadeOut(this);                          //Fade out this window
        new HomeGUI().setVisible(true);             //Bring up the home screen
    }//GEN-LAST:event_lblBackMouseReleased

    private void lblQuitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuitMouseReleased
        pos.fadeOut(this);                          //Fade out this screen
        System.exit(0);                             //Quit the program
    }//GEN-LAST:event_lblQuitMouseReleased

    private void lblAddNewStockMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddNewStockMouseReleased
        new AddNewStockGUI().setVisible(true);      //Bring up add new stock screen
    }//GEN-LAST:event_lblAddNewStockMouseReleased

    private void lblAddNewSupplierMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddNewSupplierMouseReleased
        new AddNewSupplierGUI().setVisible(true);   //Bring up add new supplier screen
    }//GEN-LAST:event_lblAddNewSupplierMouseReleased

    private void lblOrderStockMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOrderStockMouseReleased
        new OrderStockGUI().setVisible(true);       //Bring up order stock screen
    }//GEN-LAST:event_lblOrderStockMouseReleased

    private void lblPOSLogoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPOSLogoMouseReleased
        pos.loadWebSite("https://github.com/iggnoreza/pointofsalesystem"); //Load the github repository for this project. 
    }//GEN-LAST:event_lblPOSLogoMouseReleased

    private void lblCompanyLogoMouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblCompanyLogoMouseReleased
    {//GEN-HEADEREND:event_lblCompanyLogoMouseReleased
        pos.loadWebSite("http://kwiksparpaulroos.co.za"); //Load the company's website
    }//GEN-LAST:event_lblCompanyLogoMouseReleased

    private void lblRemoveStockMouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblRemoveStockMouseReleased
    {//GEN-HEADEREND:event_lblRemoveStockMouseReleased
        new DeleteStockGUI().setVisible(true);      //Bring up order stock screen
    }//GEN-LAST:event_lblRemoveStockMouseReleased

    private void lblIncomeStatementMouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblIncomeStatementMouseReleased
    {//GEN-HEADEREND:event_lblIncomeStatementMouseReleased
        new IncomeStatementGUI().setVisible(true);  //Bring up IncomeStatement screen
    }//GEN-LAST:event_lblIncomeStatementMouseReleased

    private void lblReceiveDeliveryMouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblReceiveDeliveryMouseReleased
    {//GEN-HEADEREND:event_lblReceiveDeliveryMouseReleased
        new ReceiveDeliveryGUI().setVisible(true); //Bring up ReceiveDelivery screen
    }//GEN-LAST:event_lblReceiveDeliveryMouseReleased
    
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
            java.util.logging.Logger.getLogger(ManagerPortalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerPortalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerPortalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerPortalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerPortalGUI().setVisible(true);
//                new LockScreenGUI().setVisible(true);     //The user can only start the program in the lockscreen. 
            
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblAddNewStock;
    private javax.swing.JLabel lblAddNewSupplier;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblCompanyLogo;
    private javax.swing.JLabel lblIncomeStatement;
    private javax.swing.JLabel lblOrderStock;
    private javax.swing.JLabel lblPOSLogo;
    private javax.swing.JLabel lblQuit;
    private javax.swing.JLabel lblReceiveDelivery;
    private javax.swing.JLabel lblRemoveStock;
    // End of variables declaration//GEN-END:variables
}
