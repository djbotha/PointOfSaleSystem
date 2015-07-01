package pointofsalesystem;

import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class HomeGUI extends javax.swing.JFrame
{
    PointOfSaleSystem pos =  new PointOfSaleSystem();       //Create a new pointofsalesystem object to use its methods
    String companyURL = "http://kwiksparpaulroos.co.za";
    String repositoryURL = "https://github.com/iggnoreza/pointofsalesystem";
    
    public HomeGUI() 
    {
        initComponents();
        
        this.setIconImage(new ImageIcon(getClass().getResource("/resources/POS_Icon_blue.png")).getImage()); //Set taskbar icon to logo
    }
    
    private final String managerPass = "1234";

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        lblNewTransaction = new javax.swing.JLabel();
        lblSearch = new javax.swing.JLabel();
        lblCompanyLogo = new javax.swing.JLabel();
        lblManagerPortal = new javax.swing.JLabel();
        lblLock = new javax.swing.JLabel();
        lblQuit = new javax.swing.JLabel();
        lblPOSLogo = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("POS Home");
        setUndecorated(true);
        setOpacity(0.0F);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNewTransaction.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblNewTransaction.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                lblNewTransactionMouseReleased(evt);
            }
        });
        getContentPane().add(lblNewTransaction, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 174, 150, 150));

        lblSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSearch.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                lblSearchMouseReleased(evt);
            }
        });
        getContentPane().add(lblSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 174, 150, 150));

        lblCompanyLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCompanyLogo.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                lblCompanyLogoMouseReleased(evt);
            }
        });
        getContentPane().add(lblCompanyLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, 860, 140));

        lblManagerPortal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblManagerPortal.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                lblManagerPortalMouseReleased(evt);
            }
        });
        getContentPane().add(lblManagerPortal, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 174, 150, 150));

        lblLock.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLock.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                lblLockMouseReleased(evt);
            }
        });
        getContentPane().add(lblLock, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, 30, 30));

        lblQuit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblQuit.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                lblQuitMouseReleased(evt);
            }
        });
        getContentPane().add(lblQuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, 30, 30));

        lblPOSLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPOSLogo.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                lblPOSLogoMouseReleased(evt);
            }
        });
        getContentPane().add(lblPOSLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 4, 40, 50));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/HomeGUI.png"))); // NOI18N
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblQuitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuitMouseReleased
        pos.fadeOut(this);                                  //Fade out the current screen
        System.exit(0);                                     //Quit the program.
    }//GEN-LAST:event_lblQuitMouseReleased

    private void lblLockMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLockMouseReleased
        pos.fadeOut(this);                                  //Fade out the current screen using fadeOut method
        new LockScreenGUI().setVisible(true);               //Bring up new screen
    }//GEN-LAST:event_lblLockMouseReleased

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        pos.fadeIn(this);                                   //Fade in the current screen as soon as it is selected.
    }//GEN-LAST:event_formWindowOpened

    private void lblCompanyLogoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCompanyLogoMouseReleased
        pos.loadWebSite(companyURL);        //Load the company webpage.
    }//GEN-LAST:event_lblCompanyLogoMouseReleased

    private void lblPOSLogoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPOSLogoMouseReleased
        pos.loadWebSite(repositoryURL);     //Load the github repository for this project. 
    }//GEN-LAST:event_lblPOSLogoMouseReleased

    private void lblManagerPortalMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManagerPortalMouseReleased
        validateManagerPassword();                          //Check if the Manager Password is correct or not
    }//GEN-LAST:event_lblManagerPortalMouseReleased

    private void lblSearchMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSearchMouseReleased
        pos.fadeOut(this);                                  //Fade out current screen
        new SearchGUI().setVisible(true);                   //Bring up search screen
    }//GEN-LAST:event_lblSearchMouseReleased

    private void lblNewTransactionMouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblNewTransactionMouseReleased
    {//GEN-HEADEREND:event_lblNewTransactionMouseReleased
        pos.fadeOut(this);
        new NewTransactionGUI().setVisible(true);
    }//GEN-LAST:event_lblNewTransactionMouseReleased

    public void validateManagerPassword()                   //Validate the password when the manager tries to log in to the manager portal
    {
        int passwordTries = 3;                              //Amount of tries a user has left to enter his password
        String password = JOptionPane.showInputDialog("Please enter your manager password"); //Grab password input from a JOptionPane dialog

        while (passwordTries > 1)                           //Repeat as long as the user can enter a password 
        {
            if (!password.equals(managerPass))              //If the password is incorrect
            {
                JOptionPane.showMessageDialog(this, "MANAGER PASSWORD INCORRECT. ", "ERROR", WIDTH); //Show error message. 
                passwordTries--;                            //Decrement the password tries counter
                password = JOptionPane.showInputDialog("Please enter your manager password. " + passwordTries + " tries remaining."); //Prompt for new password to be entered.
                if (password.equals(managerPass)) 
                {
                    pos.fadeOut(this);                      //Fade out the current GUI
                    new ManagerPortalGUI().setVisible(true);//Bring up the Manager Portal
                    return;                                 //Exit out of this method
                }
            } else                                          //If the password is valid
            {
                pos.fadeOut(this);                          //Fade out the current GUI
                new ManagerPortalGUI().setVisible(true);    //Bring up the Manager Portal
                return;                                     //Exit out of this method
            }
        }

        JOptionPane.showMessageDialog(this, "MANAGER PASSWORD INCORRECT. Exiting...", "ERROR", WIDTH); //Show error message. 
        pos.fadeOut(this);                                  //If the password was incorrect 3 times, quit the program.
        System.exit(0);
    }

//    public void loadWebSite(String url)                     //Display a certain webpage 
//    {
//        try 
//        {
//            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
//        } catch (IOException ex)                            //If the website failed to display, print an error.
//        {
//            System.out.println("Failed to load website. " + ex);
//        }
//    }

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
            java.util.logging.Logger.getLogger(HomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeGUI().setVisible(true);
//                new LockScreenGUI().setVisible(true);     //The user can only start the program in the lockscreen. 
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblCompanyLogo;
    private javax.swing.JLabel lblLock;
    private javax.swing.JLabel lblManagerPortal;
    private javax.swing.JLabel lblNewTransaction;
    private javax.swing.JLabel lblPOSLogo;
    private javax.swing.JLabel lblQuit;
    private javax.swing.JLabel lblSearch;
    // End of variables declaration//GEN-END:variables
}
