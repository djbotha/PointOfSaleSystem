package pointofsalesystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.ImageIcon;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class LockScreenGUI extends javax.swing.JFrame implements ActionListener
{
    
    PointOfSaleSystem pos =  new PointOfSaleSystem(); //Create a new pointofsalesystem object to use its methods
    String password = "";                       //Temporary password variable for validation         
    public String masterPass = "0000";          //Master password. Can be edited from Manager Portal
    int passwordTries = 3;                      //Password counter for amount of times the user can enter a false password
    
    public LockScreenGUI()
    {
        initComponents();
        
        //https://docs.oracle.com/javase/tutorial/uiswing/misc/timer.html
        Timer timer = new Timer(100, this);     //100ms pause inbetween calls
        timer.setInitialDelay(0);               //Starts instantly
        timer.start();                          //start the "thread"
        
        this.setVisible(true); 
        this.setIconImage(new ImageIcon(getClass().getResource("/resources/POS_Icon_blue.png")).getImage()); //Set taskbar icon to logo
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        lbl8 = new javax.swing.JLabel();
        lbl9 = new javax.swing.JLabel();
        lbl0 = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblOK = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        lblQuit = new javax.swing.JLabel();
        lblClock = new javax.swing.JLabel();
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

        lbl1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lbl1MouseReleased(evt);
            }
        });
        getContentPane().add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 310, 40, 80));

        lbl2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lbl2MouseReleased(evt);
            }
        });
        getContentPane().add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 310, 50, 80));

        lbl3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lbl3MouseReleased(evt);
            }
        });
        getContentPane().add(lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 310, 60, 80));

        lbl4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lbl4MouseReleased(evt);
            }
        });
        getContentPane().add(lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 410, 50, 90));

        lbl5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lbl5MouseReleased(evt);
            }
        });
        getContentPane().add(lbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 420, 50, 80));

        lbl6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lbl6MouseReleased(evt);
            }
        });
        getContentPane().add(lbl6, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 414, 50, 90));

        lbl7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lbl7MouseReleased(evt);
            }
        });
        getContentPane().add(lbl7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 524, 60, 80));

        lbl8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lbl8MouseReleased(evt);
            }
        });
        getContentPane().add(lbl8, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 514, 50, 90));

        lbl9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lbl9MouseReleased(evt);
            }
        });
        getContentPane().add(lbl9, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 524, 50, 80));

        lbl0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lbl0MouseReleased(evt);
            }
        });
        getContentPane().add(lbl0, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 634, 60, 80));

        lblPassword.setFont(new java.awt.Font("Segoe UI", 0, 70)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(71, 156, 214));
        getContentPane().add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, 190, 40));

        lblOK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblOK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblOKMouseReleased(evt);
            }
        });
        getContentPane().add(lblOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 644, 100, 60));

        lblBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblBackMouseReleased(evt);
            }
        });
        getContentPane().add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 224, 60, 40));

        lblQuit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblQuit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblQuitMouseReleased(evt);
            }
        });
        getContentPane().add(lblQuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, 30, 30));

        lblClock.setFont(new java.awt.Font("DS-Digital", 0, 58)); // NOI18N
        lblClock.setForeground(new java.awt.Color(0, 165, 255));
        lblClock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblClock, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 340, 330));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/LockScreen.png"))); // NOI18N
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblQuitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuitMouseReleased
        pos.fadeOut(this);                      //Fade out current screen
        System.exit(0);                         //Quit program
    }//GEN-LAST:event_lblQuitMouseReleased

    private void lbl1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl1MouseReleased
        updatePassword("1");                    //Add 1 to the password variable
    }//GEN-LAST:event_lbl1MouseReleased

    private void lbl2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl2MouseReleased
        updatePassword("2");                    //Add 2 to the password variable
    }//GEN-LAST:event_lbl2MouseReleased

    private void lbl3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl3MouseReleased
        updatePassword("3");                    //Add 3 to the password variable
    }//GEN-LAST:event_lbl3MouseReleased

    private void lbl4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl4MouseReleased
        updatePassword("4");                    //Add 4 to the password variable
    }//GEN-LAST:event_lbl4MouseReleased

    private void lbl5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl5MouseReleased
        updatePassword("5");                    //Add 5 to the password variable
    }//GEN-LAST:event_lbl5MouseReleased

    private void lbl6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl6MouseReleased
        updatePassword("6");                    //Add 6 to the password variable
    }//GEN-LAST:event_lbl6MouseReleased

    private void lbl7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl7MouseReleased
        updatePassword("7");                    //Add 7 to the password variable
    }//GEN-LAST:event_lbl7MouseReleased

    private void lbl8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl8MouseReleased
        updatePassword("8");                    //Add 8 to the password variable
    }//GEN-LAST:event_lbl8MouseReleased

    private void lbl9MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl9MouseReleased
        updatePassword("9");                    //Add 9 to the password variable
    }//GEN-LAST:event_lbl9MouseReleased

    private void lbl0MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl0MouseReleased
        updatePassword("0");                    //Add 0 to the password variable
    }//GEN-LAST:event_lbl0MouseReleased

    private void lblOKMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOKMouseReleased
        commitPassword();                       //Check if password is valid
    }//GEN-LAST:event_lblOKMouseReleased

    private void lblBackMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseReleased
        password = "";                          //Clear the temporary password variable
        lblPassword.setText("");                //clear the password field
    }//GEN-LAST:event_lblBackMouseReleased

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        pos.fadeIn(this);                       //Fade in the current screen smoothly
    }//GEN-LAST:event_formWindowOpened
    
    public void updatePassword(String num)      //Method used to update the password label on screen and password variable
    {
        lblPassword.setText(lblPassword.getText()+"*"); //Add another * to password label
        password+=num;                          //increase password variable with num that is parsed on from actionperformed.
    }
    
    public void commitPassword()                //Variable to validate password and continue to next screen
    {
        if (!password.equals(""))               //If password is not empty 
        {
            if (password.equals(masterPass))    //If password is valid
            {
                pos.fadeOut(this);  //Fade out current screen
                new HomeGUI().setVisible(true); //Bring up home screen
            }
            else                                //If password is invalid
            {
                passwordTries--;                //Decrement amount of tries remaining
                if (passwordTries == 0)         //If user has reached password cap
                {
                    JOptionPane.showMessageDialog(this, "PASSWORD INCORRECT. Exiting...", "ERROR", WIDTH); //Show error message. 
                    pos.fadeOut(this); //Fade out current screen
                    System.exit(0);             //Quit program
                }
                else
                {
                    JOptionPane.showMessageDialog(this, ("PASSWORD INCORRECT. " + passwordTries + " tries left."), "ERROR",  WIDTH); //Show error message with the amount of tries left.
                    lblPassword.setText("");    //Clear password field
                    password = "";              //Clear password variable
                }
            }
        }
        else                                    //If password field is empty
        {
            JOptionPane.showMessageDialog(this, "No password entered. Please enter a password.", "ERROR", WIDTH); //Prompt user to enter a password
        }
    }
    
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
            java.util.logging.Logger.getLogger(LockScreenGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LockScreenGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LockScreenGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LockScreenGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LockScreenGUI().setVisible(true);
//                new LockScreenGUI().setVisible(true);     //The user can only start the program in the lockscreen. 
            
            }
        });
    }
    
     public void actionPerformed(ActionEvent e)     //Method to update clock
     {
         Calendar cal = new GregorianCalendar();    //Calendar object
         int hour = cal.get(Calendar.HOUR);         //Get hours 
         int min = cal.get(Calendar.MINUTE);        //Get minutes
         int sec = cal.get(Calendar.SECOND);        //Get seconds
         int am_pm = cal.get(Calendar.AM_PM);       //Get whether or not the time is in the morning or evening
         String output = "";                        //Instantiate blank output string
         
         if (hour==0)                               //If hour == 0, rather print a 12 instead of a 0. 
             hour = 12;
         
         if (hour < 10)                             //If hour is less than 10, add a 0.
             output += "0";
         
         output += hour + ":";                      //Print hours
         
         if (min<10)                                //If minutes are less than 10, add a 0.
             output += "0";
         
         output+= ""+min + ":";                     //Add minutes
         
         if (sec<10)                                //If seconds are less than 10, add a 0.
             output +="0";
         
         output+=""+sec;                            //Add seconds
         
         if (am_pm==1)                              //If the time is in the evening, add a PM.
         {    
             output+= " PM";
         }
         else                                       //If the time is in the morning, add an AM.
         {
             output+= " AM";
         }
         
         lblClock.setText(output);                  //Print output
     }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbl0;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblClock;
    private javax.swing.JLabel lblOK;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblQuit;
    // End of variables declaration//GEN-END:variables
}
