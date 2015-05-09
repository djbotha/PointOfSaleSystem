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
    
    String password = "";
    String masterPass = "0000";
    JOptionPane optPane = new JOptionPane();
    int passwordTries = 3;
    
    public LockScreenGUI()
    {
        initComponents();
        
        //https://docs.oracle.com/javase/tutorial/uiswing/misc/timer.html
        Timer timer = new Timer(100, this); //100ms pause inbetween calls
        timer.setInitialDelay(0);           //Starts instantly
        timer.start();                      //start the "thread"
        
        this.setVisible(true);
        this.setIconImage(new ImageIcon(getClass().getResource("/resources/POS_Icon_blue.png")).getImage());
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

        lblClock.setFont(new java.awt.Font("DS-Digital", 0, 68)); // NOI18N
        lblClock.setForeground(new java.awt.Color(0, 165, 255));
        lblClock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblClock, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 340, 330));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/LockScreen.png"))); // NOI18N
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblQuitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuitMouseReleased
        new PointOfSaleSystem().fadeOut(this); 
        System.exit(0);
    }//GEN-LAST:event_lblQuitMouseReleased

    private void lbl1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl1MouseReleased
        updatePassword("1");
    }//GEN-LAST:event_lbl1MouseReleased

    private void lbl2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl2MouseReleased
        updatePassword("2");
    }//GEN-LAST:event_lbl2MouseReleased

    private void lbl3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl3MouseReleased
        updatePassword("3");
    }//GEN-LAST:event_lbl3MouseReleased

    private void lbl4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl4MouseReleased
        updatePassword("4");
    }//GEN-LAST:event_lbl4MouseReleased

    private void lbl5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl5MouseReleased
        updatePassword("5");
    }//GEN-LAST:event_lbl5MouseReleased

    private void lbl6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl6MouseReleased
        updatePassword("6");
    }//GEN-LAST:event_lbl6MouseReleased

    private void lbl7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl7MouseReleased
        updatePassword("7");
    }//GEN-LAST:event_lbl7MouseReleased

    private void lbl8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl8MouseReleased
        updatePassword("8");
    }//GEN-LAST:event_lbl8MouseReleased

    private void lbl9MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl9MouseReleased
        updatePassword("9");
    }//GEN-LAST:event_lbl9MouseReleased

    private void lbl0MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl0MouseReleased
        updatePassword("0");
    }//GEN-LAST:event_lbl0MouseReleased

    private void lblOKMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOKMouseReleased
        commitPassword();
    }//GEN-LAST:event_lblOKMouseReleased

    private void lblBackMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseReleased
        password = "";  //Clear the temporary password variable
        lblPassword.setText(""); //clear the password field
    }//GEN-LAST:event_lblBackMouseReleased

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        new PointOfSaleSystem().fadeIn(this); //Fade in the current screen smoothly
    }//GEN-LAST:event_formWindowOpened
    
    public void updatePassword(String num)
    {
        lblPassword.setText(lblPassword.getText()+"*");
        password+=num;
    }
    
    public void commitPassword()
    {
        if (!password.equals("")) 
        {
            if (password.equals(masterPass)) 
            {
                new PointOfSaleSystem().fadeOut(this);
                new HomeGUI().setVisible(true);
            }
            else
            {
                passwordTries--;
                if (passwordTries == 0) 
                {
                    JOptionPane.showMessageDialog(this, "PASSWORD INCORRECT. If you forgot your password, please contact your store manager. ", "ERROR", WIDTH);
                    new PointOfSaleSystem().fadeOut(this);
                    System.exit(0);
                }
                else
                {
                    JOptionPane.showMessageDialog(this, ("PASSWORD INCORRECT. " + passwordTries + " tries left."), "ERROR",  WIDTH);
                    lblPassword.setText("");
                    password = "";
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "No password entered. Please enter a password.", "ERROR", WIDTH);
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
            }
        });
    }
    
     public void actionPerformed(ActionEvent e) 
     {
         Calendar cal = new GregorianCalendar();
         int hour = cal.get(Calendar.HOUR);
         int min = cal.get(Calendar.MINUTE);
         int sec = cal.get(Calendar.SECOND);
         int am_pm = cal.get(Calendar.AM_PM);
         String output = "";
         
         if (hour==0)
             output += 12 + ":";
         
         if (hour<10) 
         {
             output += "0" + hour + ":";
         }
         else
         {
            output += hour + ":";
         }
         
         if (min<10) 
             output += "0";
         
         output+= ""+min + ":";
         
         if (sec<10)
             output +="0";
         
         output+=""+sec;
         
         if (am_pm==1)
         {    
             output+= " PM";
         }
         else
         {
             output+= " AM";
         }
         
         lblClock.setText(output);
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
