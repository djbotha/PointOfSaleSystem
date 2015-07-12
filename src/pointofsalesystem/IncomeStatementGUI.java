package pointofsalesystem;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class IncomeStatementGUI extends javax.swing.JFrame 
{

    PointOfSaleSystem pos = new PointOfSaleSystem("");
    
    public IncomeStatementGUI() 
    {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/resources/POS_Icon_blue.png")).getImage()); //Set taskbar icon to logo.
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        dpEndDate = new org.jdesktop.swingx.JXDatePicker();
        dpStartDate = new org.jdesktop.swingx.JXDatePicker();
        tfProfit = new javax.swing.JTextField();
        tfExpense = new javax.swing.JTextField();
        tfIncome = new javax.swing.JTextField();
        lblBack = new javax.swing.JLabel();
        lblQuit = new javax.swing.JLabel();
        lblExport = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblPOSLogo = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("POS Income Statement");
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

        dpEndDate.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                dpEndDateActionPerformed(evt);
            }
        });
        getContentPane().add(dpEndDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 150, 40));
        getContentPane().add(dpStartDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 150, 40));

        tfProfit.setBackground(new Color(0, 0, 0, 0));
        tfProfit.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tfProfit.setForeground(new java.awt.Color(255, 255, 255));
        tfProfit.setBorder(null);
        tfProfit.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        tfProfit.setEnabled(false);
        getContentPane().add(tfProfit, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 130, 40));

        tfExpense.setBackground(new Color(0, 0, 0, 0));
        tfExpense.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tfExpense.setForeground(new java.awt.Color(255, 255, 255));
        tfExpense.setBorder(null);
        tfExpense.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        tfExpense.setEnabled(false);
        getContentPane().add(tfExpense, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 130, 40));

        tfIncome.setBackground(new Color(0, 0, 0, 0));
        tfIncome.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tfIncome.setForeground(new java.awt.Color(255, 255, 255));
        tfIncome.setBorder(null);
        tfIncome.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        tfIncome.setEnabled(false);
        getContentPane().add(tfIncome, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 130, 40));

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
        getContentPane().add(lblQuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 30, 30));

        lblExport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblExport.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                lblExportMouseReleased(evt);
            }
        });
        getContentPane().add(lblExport, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 364, 200, 50));

        lblEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEmail.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                lblEmailMouseReleased(evt);
            }
        });
        getContentPane().add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 364, 190, 50));

        lblPOSLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPOSLogo.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                lblPOSLogoMouseReleased(evt);
            }
        });
        getContentPane().add(lblPOSLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 4, 40, 50));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/IncomeStatementGUI.png"))); // NOI18N
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 586, 442));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        pos.fadeIn(this);
    }//GEN-LAST:event_formWindowOpened

    private void lblPOSLogoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPOSLogoMouseReleased
        pos.loadWebSite("https://github.com/iggnoreza/pointofsalesystem");
    }//GEN-LAST:event_lblPOSLogoMouseReleased

    private void lblEmailMouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblEmailMouseReleased
    {//GEN-HEADEREND:event_lblEmailMouseReleased
        
    }//GEN-LAST:event_lblEmailMouseReleased

    private void lblExportMouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblExportMouseReleased
    {//GEN-HEADEREND:event_lblExportMouseReleased
        
    }//GEN-LAST:event_lblExportMouseReleased

    private void lblBackMouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblBackMouseReleased
    {//GEN-HEADEREND:event_lblBackMouseReleased
        pos.fadeOut(this);
    }//GEN-LAST:event_lblBackMouseReleased

    private void lblQuitMouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblQuitMouseReleased
    {//GEN-HEADEREND:event_lblQuitMouseReleased
        pos.fadeOut(this);
        System.exit(0);
    }//GEN-LAST:event_lblQuitMouseReleased

    private void dpEndDateActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_dpEndDateActionPerformed
    {//GEN-HEADEREND:event_dpEndDateActionPerformed
        calculateProfit();
    }//GEN-LAST:event_dpEndDateActionPerformed
    
    double calculateValues(String query)
    {
        try
        {
            ResultSet rs = pos.searchDB(query);
            
            double price = 0.0;
            while(rs.next())
            {
                price += rs.getDouble(1);
            }
            
            price = (int) (price*100);
            price /= 100;
            
            return price;
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Failed to fetch data from tables: " + ex);
            return 0.0;
        }
    }
    
    void calculateProfit()
    {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        
        String startDate = formatter.format(dpStartDate.getDate()) + " 00:00:00.0";
        String endDate = formatter.format(dpEndDate.getDate()) + " 00:00:00.0";
        
        String getIncomes = "SELECT TRANSACTION_TOTALPRICE_NOVAT \n" +
                                "FROM NBUSER.TRANSACTIONS\n" +
                                "WHERE TRANSACTION_DATE > '"+ startDate +"' AND TRANSACTION_DATE < '"+ endDate +"'\n" +
                                "ORDER BY TRANSACTION_DATE";
        
        double income = calculateValues(getIncomes);
        
        String getExpenses = "SELECT ORDER_PRICE \n" +
                                "FROM NBUSER.ORDERS\n" +
                                "WHERE ORDER_DATE > '"+ startDate +"' AND ORDER_DATE < '"+ endDate +"'\n" +
                                "ORDER BY ORDER_DATE";
        
        double expenses = calculateValues(getExpenses);
        
        double profit = income-expenses;
//        profit = (int) (profit*100);
//        profit /= 100;
        
        tfIncome.setText("R" + income);
        tfExpense.setText("R" + expenses);
        tfProfit.setText("R" + profit);
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
            java.util.logging.Logger.getLogger(IncomeStatementGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IncomeStatementGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IncomeStatementGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IncomeStatementGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IncomeStatementGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXDatePicker dpEndDate;
    private org.jdesktop.swingx.JXDatePicker dpStartDate;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblExport;
    private javax.swing.JLabel lblPOSLogo;
    private javax.swing.JLabel lblQuit;
    private javax.swing.JTextField tfExpense;
    private javax.swing.JTextField tfIncome;
    private javax.swing.JTextField tfProfit;
    // End of variables declaration//GEN-END:variables
}
