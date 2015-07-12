package pointofsalesystem;

import java.awt.Color;
import static java.awt.image.ImageObserver.WIDTH;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class NewTransactionGUI extends javax.swing.JFrame
{
    
    PointOfSaleSystem pos = new PointOfSaleSystem("");  //Creates a new POS Object to use it's methods.

    double transactionCost = 0.0;
    
    public NewTransactionGUI()
    {
        initComponents();
        
        jScrollPane1.getViewport().setOpaque(false);    //Set background of ScrollPane to invisible
        
        this.setIconImage(new ImageIcon(getClass().getResource("/resources/POS_Icon_blue.png")).getImage()); //Set taskbar icon to logo.
        
        displayHeadings();
    }
    
    
    private final String managerPass = "1234";    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        PointOfSaleSystemPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("PointOfSaleSystemPU").createEntityManager();
        productsQuery = java.beans.Beans.isDesignTime() ? null : PointOfSaleSystemPUEntityManager.createQuery("SELECT p FROM Products p");
        productsList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : productsQuery.getResultList();
        productsQuery1 = java.beans.Beans.isDesignTime() ? null : PointOfSaleSystemPUEntityManager.createQuery("SELECT p FROM Products p");
        productsList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : productsQuery1.getResultList();
        lblClear = new javax.swing.JLabel();
        lblComplete = new javax.swing.JLabel();
        lblManager = new javax.swing.JLabel();
        lblBarcode = new javax.swing.JLabel();
        tfSelectedItem = new javax.swing.JTextField();
        lblAddSelectedProduct = new javax.swing.JLabel();
        tfSearch = new javax.swing.JTextField();
        lblAddItemName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taOutput = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProductList = new javax.swing.JTable();
        lblTabs = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        lblQuit = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("POS New Transaction");
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

        lblClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblClear.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                lblClearMouseReleased(evt);
            }
        });
        getContentPane().add(lblClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 674, 100, 20));

        lblComplete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblComplete.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                lblCompleteMouseReleased(evt);
            }
        });
        getContentPane().add(lblComplete, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 674, 90, 20));

        lblManager.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblManager.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                lblManagerMouseReleased(evt);
            }
        });
        getContentPane().add(lblManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 90, 160, 30));

        lblBarcode.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBarcode.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                lblBarcodeMouseReleased(evt);
            }
        });
        getContentPane().add(lblBarcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 90, 130, 30));

        tfSelectedItem.setBackground(new Color(0, 0, 0, 0));
        tfSelectedItem.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tfSelectedItem.setForeground(new java.awt.Color(255, 255, 255));
        tfSelectedItem.setBorder(null);
        tfSelectedItem.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        tfSelectedItem.setEnabled(false);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblProductList, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.productName}"), tfSelectedItem, org.jdesktop.beansbinding.BeanProperty.create("text"), "");
        bindingGroup.addBinding(binding);

        getContentPane().add(tfSelectedItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, 280, 40));

        lblAddSelectedProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAddSelectedProduct.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                lblAddSelectedProductMouseReleased(evt);
            }
        });
        getContentPane().add(lblAddSelectedProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 174, 70, 30));

        tfSearch.setBackground(new Color(0, 0, 0, 0));
        tfSearch.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tfSearch.setForeground(new java.awt.Color(255, 255, 255));
        tfSearch.setBorder(null);
        getContentPane().add(tfSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, 260, 40));

        lblAddItemName.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAddItemName.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                lblAddItemNameMouseReleased(evt);
            }
        });
        getContentPane().add(lblAddItemName, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 234, 90, 30));

        jScrollPane1.setBorder(null);
        jScrollPane1.setOpaque(false);

        taOutput.setBackground(new Color(0,0,0,0));
        taOutput.setColumns(20);
        taOutput.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        taOutput.setForeground(new java.awt.Color(255, 255, 255));
        taOutput.setLineWrap(true);
        taOutput.setRows(5);
        taOutput.setBorder(null);
        taOutput.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        taOutput.setEnabled(false);
        jScrollPane1.setViewportView(taOutput);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 400, 630));

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, productsList1, tblProductList);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${productName}"));
        columnBinding.setColumnName("Product Name");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${productBarcode}"));
        columnBinding.setColumnName("Product Barcode");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane2.setViewportView(tblProductList);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 400, 360));

        lblTabs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/NewTransactionGUI_ProductList.png"))); // NOI18N
        getContentPane().add(lblTabs, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, -1, 640));

        lblBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBack.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                lblBackMouseReleased(evt);
            }
        });
        getContentPane().add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 14, 50, 30));

        lblQuit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblQuit.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                lblQuitMouseReleased(evt);
            }
        });
        getContentPane().add(lblQuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 14, 30, 30));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/NewTransactionGUI.png"))); // NOI18N
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        pos.fadeIn(this);               //Fade in this window
    }//GEN-LAST:event_formWindowOpened

    private void lblBackMouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblBackMouseReleased
    {//GEN-HEADEREND:event_lblBackMouseReleased
        pos.fadeOut(this);              //Fade out this window
        new HomeGUI().setVisible(true); //Bring up the HomeGUI screen
    }//GEN-LAST:event_lblBackMouseReleased

    private void lblQuitMouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblQuitMouseReleased
    {//GEN-HEADEREND:event_lblQuitMouseReleased
        pos.fadeOut(this);              //Fade out this screen
        System.exit(0);                 //Quit the program
    }//GEN-LAST:event_lblQuitMouseReleased

    private void lblBarcodeMouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblBarcodeMouseReleased
    {//GEN-HEADEREND:event_lblBarcodeMouseReleased
        getProductName();                   //Method to manually add a product via a barcode
    }//GEN-LAST:event_lblBarcodeMouseReleased

    private void lblManagerMouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblManagerMouseReleased
    {//GEN-HEADEREND:event_lblManagerMouseReleased
        validateManagerPassword();                          //Check if the Manager Password is correct or not
    }//GEN-LAST:event_lblManagerMouseReleased

    private void lblAddItemNameMouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblAddItemNameMouseReleased
    {//GEN-HEADEREND:event_lblAddItemNameMouseReleased
        addProductName(tfSearch.getText());
    }//GEN-LAST:event_lblAddItemNameMouseReleased

    private void lblAddSelectedProductMouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblAddSelectedProductMouseReleased
    {//GEN-HEADEREND:event_lblAddSelectedProductMouseReleased
        addProductName(tfSelectedItem.getText());
    }//GEN-LAST:event_lblAddSelectedProductMouseReleased

    private void lblClearMouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblClearMouseReleased
    {//GEN-HEADEREND:event_lblClearMouseReleased
        if(JOptionPane.showConfirmDialog(this, "ARE YOU SURE YOU WANT TO CLEAR THE TRANSACTION?") == 0) //If the user clicks the okay button
        {
            transactionCost = 0.0;  //Clear the transaction variable
            displayHeadings();      //Clear output
        }
    }//GEN-LAST:event_lblClearMouseReleased

    private void lblCompleteMouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblCompleteMouseReleased
    {//GEN-HEADEREND:event_lblCompleteMouseReleased
        if (JOptionPane.showConfirmDialog(this, "Proceed to checkout?") == 0) //If the user clicks the okay button
        {
            checkout(); //Proceed to checkout
        }
    }//GEN-LAST:event_lblCompleteMouseReleased
    
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
                    removeProduct();                        //Remove a product from the transaction
                    return;                                 //Exit out of this method
                }
            } 
            else                                            //If the password is valid
            {
                removeProduct();                            //Remove a product from the transaction
                return;                                     //Exit out of this method
            }
        }

        JOptionPane.showMessageDialog(this, "MANAGER PASSWORD INCORRECT.", "ERROR", WIDTH); //Show error message. 
    }
    
    
    
    /* <-- WORK IN PROGRESS --> */
    public void removeProduct() //Method to remove product from a transaction
    {
        String removeItemBarcode = JOptionPane.showInputDialog("Please enter an item barcode to remove from the transaction:");
    }
    /* <-- WORK IN PROGRESS --> */
    
    
    
    public void getProductName() //Method to add a product via a barcode to the transaction
    {
        try
        {
            String barcode = JOptionPane.showInputDialog("Please enter an item barcode:"); //Get barcode from user input
            
            String getProductName = "SELECT PRODUCT_NAME \n" +
                                    "FROM NBUSER.PRODUCTS\n" +
                                    "WHERE PRODUCT_BARCODE like '%"+ barcode +"%'"; //Query to retrieve product name via barcode
            
            ResultSet rs = pos.searchDB(getProductName);    //Retrieve product name
            
            rs.next();  //Skip to first line
            
            String productName = rs.getString(1);   //Select product name
            
            addProductName(productName);            //Add product to transaction
        }
        catch (SQLException ex) //If the search failed....
        {
            JOptionPane.showMessageDialog(null, "Failed to retrieve product name: " + ex); //... print an error message
        }
    }
    
    public void addProductName(String productName) //Method to add a product to the transaction via product name
    {
            String getProductDetails = "SELECT PRODUCT_ID, PRODUCT_NAME, PRODUCT_BARCODE, (PRODUCT_COSTPRICE * (PRODUCT_MARKUP+1)) AS PRICE\n" +
                                        "FROM NBUSER.PRODUCTS\n" +
                                        "WHERE PRODUCT_NAME LIKE '%" + productName + "%'" +
                                        "FETCH FIRST 1 ROW ONLY";
            
            ResultSet rs = pos.searchDB(getProductDetails);
            
            String[] headings = {"ID", "Name", "Barcode", "Price"}; //Headings to be printed on output
            int[] colWidth = {6, 24, 15, 10};                       //Sizes for "columns"
            
            displayTable(rs, headings, colWidth);
    }
  
    void checkout() //Method to add costs and calculate change
    {
        for (int i = 0; i < 57; i++)                            //For each of the headings
        {
                taOutput.append("=");                           //Print an "=" as a line break
        }
        
        transactionCost = (int)(transactionCost*100);           //Round transaction cost to 2 decimal points
        transactionCost /= 100;
        
        double vat = transactionCost*0.14;                      //Calculate the VAT of the transaction
        vat = (int)(vat*100);
        vat /= 100;
        
        double transactionCostPlusVAT = transactionCost + vat;  //Round transaction cost to 2 decimal points
        transactionCostPlusVAT = (int) (transactionCostPlusVAT*100);
        transactionCostPlusVAT /= 100;
        
        JOptionPane.showMessageDialog(this, "Amount: R" + transactionCost + "\n14% VAT: R" + vat + "\nTotal: R" + transactionCostPlusVAT); //Output message to display total
        
        taOutput.append("\nAmount: R" + transactionCost + "\n14% VAT: R" + vat + "\nTotal: R" + transactionCostPlusVAT); //Output total to output screen
        
        double cash = Double.parseDouble(JOptionPane.showInputDialog("Please enter amount of cash received:"));     //Get amount of cash payed
    
        while(cash<transactionCostPlusVAT)  //While the cash is too little for the transaction
        {
            JOptionPane.showMessageDialog(this, "The amount of cash payed is too little for the transaction."); //Print an error message
            
            cash = Double.parseDouble(JOptionPane.showInputDialog("Please enter amount of cash received:"));    //Prompt for cash again
        }
        
        double change = cash-transactionCostPlusVAT;            //Round change to 2 decimal points
        change = (int)(change*100);
        change /= 100;
        
        taOutput.append("\n\nCash: R" + cash);                  //Output cash
        taOutput.append("\t\tChange: R" + change);              //Output change
        
        JOptionPane.showMessageDialog(this, "Amount of change: R" + change + ".\nClick OK to go back to main menu."); //Amount of change to be given
        
        saveTransaction(calculateDate(), transactionCost, transactionCostPlusVAT); //Add transaction to database
    }
    
    void saveTransaction(String date, double cost, double costPlusVAT) //Method to add transaction to DB
    {
        String getTransactionID = "SELECT TRANSACTION_ID FROM NBUSER.TRANSACTIONS\n" +
                                    "ORDER BY TRANSACTION_ID DESC\n" +
                                    "FETCH FIRST 1 ROWS ONLY";              //Query to get the last transaction ID and increment it with one
        
        int transactionID = pos.getID(getTransactionID) + 1;            //Get the last transaction ID and increment it with one
        
        String addTransaction = "INSERT INTO NBUSER.TRANSACTIONS(TRANSACTION_ID, TRANSACTION_DATE, TRANSACTION_TOTALPRICE_NOVAT, TRANSACTION_TOTALPRICE_PLUSVAT)\n" +
                                "VALUES("+ transactionID +", '"+ date +"', "+ cost +", "+ costPlusVAT +")";
        pos.addDBEntry(addTransaction);
        
        
    }
    
    String calculateDate() //Method to calculate the date
    {
        Calendar c1 = Calendar.getInstance();           //Get current computer time

        String date = "";                               //Instantiate a new date string
        int year = c1.get(Calendar.YEAR);               //Get year from current computer time
        int month = c1.get(Calendar.MONTH) + 1;         //Get month from current computer time
        int day = c1.get(Calendar.DAY_OF_MONTH);        //Get day from current computer time

        if (month<10)                                   //If the month is less than 10 add a "0" to confrom to SQL Date format.
        {
            date = year + "-0" + month + "-";
        }
        else
        {
            date = year + "-" + month + "-";
        }

        if (day<10)                                     //If the day is less than 10 add a "0" to confrom to SQL Date format.
        {
            date+= "0" + day;
        }
        else
        {
            date+= day;
        }

        String time = "";                               //Instantiate a new time object
        int hour = c1.get(Calendar.HOUR_OF_DAY);        //Get the hour from the current computer time
        int minute = c1.get(Calendar.MINUTE);           //Get the minute from the current computer time
        int second = c1.get(Calendar.SECOND);           //Get the second from the current computer time

        if (hour<10)                                    //If the hour is less than 10 add a "0" to confrom to SQL Date format.
        {
            time = "0" + hour + ":";
        }
        else
        {
            time = hour + ":";
        }

        if (minute<10)                                  //If the minute is less than 10 add a "0" to confrom to SQL Date format.
        {
            time+= "0" + minute + ":";
        }
        else
        {
            time+= minute + ":";
        }

        if (second<10)                                  //If the second is less than 10 add a "0" to confrom to SQL Date format.
        {
            time+= "0" + second + ".0";
        }
        else
        {
            time+= second + ".0";
        }
        System.out.println(date+" " + time);
        return date + " " + time;                       //Concatenate the Date and the Time into SQL Date format
    }
    
    void displayHeadings() //Output the appropriate headings to the screen
    {
        String[] headings = {"ID", "Name", "Barcode", "Price"}; //Headings to be printed on output
        int[] colWidth = {6, 24, 15, 10};                       //Sizes for "columns"
        
        taOutput.setText("");
        
        for (int i = 0; i < headings.length; i++)               //For each of the headings...
        {
            taOutput.append(addSpaces(headings[i], colWidth[i])); //Add spaces to the headings to mimic collumns
        }
        
        taOutput.append("\n");                                  //Print a new line
        
        for (int i = 0; i < 57; i++)               //For each of the headings
        {
                taOutput.append("=");                           //Print an "=" as a line break
        }
    }
    
    void displayTable(ResultSet rs, String[] headings, int[] colWidth) //Code adapted from Nico C Rossouw's in PRG_IT_2015_march_test.java
    {
        try 
        {
            rs.next();
            for (int i = 0; i < headings.length-1; i++)       //For each of the collumns
            {
                taOutput.append(addSpaces(rs.getString(i+1), colWidth[i])); //Add spaces to the strings to mimic collumns
            }
            
            double price = rs.getDouble(4);
            price = (int) (price*100);
            price /= 100;
            
            transactionCost += price;
            
            taOutput.append(addSpaces("R"+price, 10));
            taOutput.append("\n");                          //Print a new line
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
            java.util.logging.Logger.getLogger(NewTransactionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(NewTransactionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(NewTransactionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(NewTransactionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new NewTransactionGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager PointOfSaleSystemPUEntityManager;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAddItemName;
    private javax.swing.JLabel lblAddSelectedProduct;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblBarcode;
    private javax.swing.JLabel lblClear;
    private javax.swing.JLabel lblComplete;
    private javax.swing.JLabel lblManager;
    private javax.swing.JLabel lblQuit;
    private javax.swing.JLabel lblTabs;
    private java.util.List<pointofsalesystem.Products> productsList;
    private java.util.List<pointofsalesystem.Products> productsList1;
    private javax.persistence.Query productsQuery;
    private javax.persistence.Query productsQuery1;
    private javax.swing.JTextArea taOutput;
    private javax.swing.JTable tblProductList;
    private javax.swing.JTextField tfSearch;
    private javax.swing.JTextField tfSelectedItem;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
