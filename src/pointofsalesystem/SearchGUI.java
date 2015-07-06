package pointofsalesystem;

import java.awt.Color;
import static java.awt.image.ImageObserver.WIDTH;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class SearchGUI extends javax.swing.JFrame 
{
    PointOfSaleSystem pos =  new PointOfSaleSystem("");   //Create a new pointofsalesystem object to use its methods
    
    public SearchGUI() 
    {
        initComponents();
        
        jScrollPane1.getViewport().setOpaque(false);    //Set background of ScrollPane to invisible
        taOutput.setBorder(null);                       //Set border of textarea to null
        jScrollPane1.setBorder(null);                   //Set border of ScrollPane to null
        
        this.setIconImage(new ImageIcon(getClass().getResource("/resources/POS_Icon_blue.png")).getImage()); //Set taskbar icon to logo.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        tfBarcode = new javax.swing.JTextField();
        tfProductName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        taOutput = new javax.swing.JTextArea();
        lblSearch = new javax.swing.JLabel();
        lblViewAll = new javax.swing.JLabel();
        lblPOSLogo = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        lblQuit = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("POS Search");
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

        tfBarcode.setBackground(new Color(0, 0, 0, 0));
        tfBarcode.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tfBarcode.setForeground(new java.awt.Color(255, 255, 255));
        tfBarcode.setAutoscrolls(false);
        tfBarcode.setBorder(null);
        tfBarcode.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfBarcode.setOpaque(false);
        getContentPane().add(tfBarcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 186, 630, 20));

        tfProductName.setBackground(new Color(0, 0, 0, 0));
        tfProductName.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tfProductName.setForeground(new java.awt.Color(255, 255, 255));
        tfProductName.setAutoscrolls(false);
        tfProductName.setBorder(null);
        tfProductName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfProductName.setOpaque(false);
        getContentPane().add(tfProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 126, 630, 20));

        taOutput.setBackground(new Color(0,0,0,0));
        taOutput.setColumns(20);
        taOutput.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        taOutput.setForeground(new java.awt.Color(255, 255, 255));
        taOutput.setRows(5);
        taOutput.setBorder(null);
        jScrollPane1.setViewportView(taOutput);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 236, 920, 490));

        lblSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSearch.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                lblSearchMouseReleased(evt);
            }
        });
        getContentPane().add(lblSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 104, 110, 110));

        lblViewAll.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblViewAll.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                lblViewAllMouseReleased(evt);
            }
        });
        getContentPane().add(lblViewAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 104, 110, 110));

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
        getContentPane().add(lblQuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 14, 40, 30));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/SearchGUI.png"))); // NOI18N
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        pos.fadeIn(this);                       //Fade in the current screen smoothly
    }//GEN-LAST:event_formWindowOpened

    private void lblQuitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuitMouseReleased
        pos.fadeOut(this);                      //Fade out current screen
        System.exit(0);                         //Quit program
    }//GEN-LAST:event_lblQuitMouseReleased

    private void lblBackMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseReleased
        pos.fadeOut(this);                      //Fade out current screen
        new HomeGUI().setVisible(true);         //Bring up home screen
    }//GEN-LAST:event_lblBackMouseReleased

    private void lblSearchMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSearchMouseReleased
        String productName = tfProductName.getText();   //Fetch product name from textfield
        String barcode = tfBarcode.getText();           //Fetch barcode from textfield
        
        String sql = "";                                //INstanstiate "sql" string, to act as the query. 
        
        if(!"".equals(productName) && "".equals(barcode))  //If the user has entered a productName
        {
            sql = "SELECT * FROM NBUSER.PRODUCTS\n" +
                    "WHERE PRODUCTS.PRODUCT_NAME like '%" + productName + "%'"; //Search for all the similar product names 
        }
        else if (!"".equals(barcode) && "".equals(productName))  //If the user has entered a barcode
        {
            sql = "SELECT * FROM NBUSER.PRODUCTS\n" +
                    "WHERE PRODUCTS.PRODUCT_BARCODE like '%" + barcode + "%'";  //Search for all the similar barcodes
        }
        else if(("".equals(barcode) && "".equals(productName)) || (!"".equals(barcode) && !"".equals(productName))) //If the user has left the input blank or is trying to search for a name AND barcode
        {
            JOptionPane.showMessageDialog(this, "Please fill in ONE of the fields.", "ERROR", WIDTH); //Instruct the user to fill in one of the fields. 
        }
        
        ResultSet rs = pos.searchDB(sql);                                    //Search for the specific query

        String[] headings = {"ID", "Name", "Barcode", "Costprice", "Markup", "Qty", "Supplier ID"};
        int[] colWidth = {6, 50, 15, 10, 10, 9, 11};
        
        displayTable(rs, headings, colWidth);
    }//GEN-LAST:event_lblSearchMouseReleased

    private void lblViewAllMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViewAllMouseReleased
        String sql = "select * from \"NBUSER\".PRODUCTS";       //View all the data
        ResultSet rs =pos.searchDB(sql);                                    //Search for query
        
        String[] headings = {"ID", "Name", "Barcode", "Costprice", "Markup", "Qty", "Supplier ID"};
        int[] colWidth = {6, 50, 15, 10, 10, 9, 11};
        
        displayTable(rs, headings, colWidth);
    }//GEN-LAST:event_lblViewAllMouseReleased

    private void lblPOSLogoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPOSLogoMouseReleased
        pos.loadWebSite("https://github.com/iggnoreza/pointofsalesystem"); //Load the github repository for this project.
    }//GEN-LAST:event_lblPOSLogoMouseReleased

    void displayTable(ResultSet rs, String[] headings, int[] colWidth) //Code adapted from Nico C Rossouw's in PRG_IT_2015_march_test.java
    {
        taOutput.setText("");                                   //Clear the text area
        for (int i = 0; i < headings.length; i++)               //For each of the headings...
        {
            taOutput.append(addSpaces(headings[i], colWidth[i])); //Add spaces to the headings to mimic collumns
        }
        
        taOutput.append("\n");                                  //Print a new line
        
        for (int i = 0; i < headings.length; i++)               //For each of the headings
        {
            for (int j = 0; j < colWidth[i]; j++)               //and for the collumn width
            {
                taOutput.append("=");                           //Print an "=" as a line break
            }
        }
        
        taOutput.append("\n");                                  //Print a new line

        try 
        {
            while (rs.next())                                   //Iterate through each line of the ResultSet
            {
                for (int i = 0; i < headings.length; i++)       //For each of the collumns
                {
                    taOutput.append(addSpaces(rs.getString(i+1), colWidth[i])); //Add spaces to the strings to mimic collumns
                }
                taOutput.append("\n");                          //Print a new line
            }
        }
        catch (Exception e) //If the SQL Query broke at some point
        {
            JOptionPane.showMessageDialog(this, "SQL Exception: " + e, "ERROR", WIDTH); //Print an error message
        }
    }
    
    private String addSpaces(String str, int colWidth)          //Method to add spaces to strings to mimic collumns        
    {
        String temp = str;                                      //Assign the String parameter value to a temporary variable
        
        if (str.length() < colWidth)                            //If the word is shorter than then collumn
        {
            for (int i = colWidth; i > str.length(); i--)       //Until the collumn width is reached            
            {
                temp += " ";                                    //Add a space      
            }
            return temp;                                        //Return the final String value
        }
        else                                                    //If the word is longer than the collumn
        {
            return str.substring(0, (colWidth-5)) + "...  ";    //Shorten it by 5, add 3 "." and 2 spaces
        }
    }
    
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
            java.util.logging.Logger.getLogger(SearchGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchGUI().setVisible(true);
//                new LockScreenGUI().setVisible(true);     //The user can only start the program in the lockscreen. 
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblPOSLogo;
    private javax.swing.JLabel lblQuit;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lblViewAll;
    private javax.swing.JTextArea taOutput;
    private javax.swing.JTextField tfBarcode;
    private javax.swing.JTextField tfProductName;
    // End of variables declaration//GEN-END:variables
}
