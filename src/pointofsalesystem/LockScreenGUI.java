package pointofsalesystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.Timer;

public class LockScreenGUI extends javax.swing.JFrame implements ActionListener
{
    
    String password;
    
    public LockScreenGUI()
    {
        initComponents();
        
        Timer timer = new Timer(100, this); //
        timer.setInitialDelay(0);
        timer.start();
        
        this.setVisible(true);
        this.setIconImage(new ImageIcon(getClass().getResource("/resources/POS_Icon_blue.png")).getImage());
//        clock();
    }
    
    public void clock() //https://www.youtube.com/watch?v=gyyj57O0FVI
    {
//        new Thread()
//        {
//            @Override
//            public void run()
//            {
        Calendar cal = new GregorianCalendar();

        while(true)
        {

            int hour = cal.get(Calendar.HOUR);
            int min = cal.get(Calendar.MINUTE);
            int sec = cal.get(Calendar.SECOND);
            int am_pm = cal.get(Calendar.AM_PM);
            String output;

            if (am_pm==1)
                output = hour + ":" + min + ":" + sec + " AM";

            output = hour + ":" + min + ":" + sec + " PM";

            lblClock.setText(output);
        }
                
            }
//        }.start();
//    }
    
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
        lblEnter = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        lblQuit = new javax.swing.JLabel();
        lblClock = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lbl1MouseReleased(evt);
            }
        });
        getContentPane().add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 310, 40, 80));
        getContentPane().add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 310, 50, 80));
        getContentPane().add(lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 310, 60, 80));
        getContentPane().add(lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 410, 50, 90));
        getContentPane().add(lbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 420, 50, 80));
        getContentPane().add(lbl6, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 414, 50, 90));
        getContentPane().add(lbl7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 524, 60, 80));
        getContentPane().add(lbl8, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 514, 50, 90));
        getContentPane().add(lbl9, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 524, 50, 80));
        getContentPane().add(lbl0, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 634, 60, 80));

        lblPassword.setFont(new java.awt.Font("Segoe UI", 0, 70)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(71, 156, 214));
        getContentPane().add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, 190, 40));
        getContentPane().add(lblEnter, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 644, 80, 60));
        getContentPane().add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 224, 60, 40));

        lblQuit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblQuit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblQuitMouseReleased(evt);
            }
        });
        getContentPane().add(lblQuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, 30, 30));

        lblClock.setFont(new java.awt.Font("DS-Digital", 0, 72)); // NOI18N
        lblClock.setForeground(new java.awt.Color(0, 165, 255));
        lblClock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblClock, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 340, 330));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/LockScreen.png"))); // NOI18N
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblQuitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuitMouseReleased
        System.exit(0);
    }//GEN-LAST:event_lblQuitMouseReleased

    private void lbl1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl1MouseReleased
        updatePassword("1");
    }//GEN-LAST:event_lbl1MouseReleased
    
    public void updatePassword(String num)
    {
            password+=num;
            lblPassword.setText(lblPassword.getText()+"*");
            
            if (password.length()==3) 
                System.out.println(password);
        
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
         
         String output;
         
         if (am_pm==1)
             output = hour + ":" + min + ":" + sec + " AM";
         
         output = hour + ":" + min + ":" + sec + " PM";
         
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
    private javax.swing.JLabel lblEnter;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblQuit;
    // End of variables declaration//GEN-END:variables
}
