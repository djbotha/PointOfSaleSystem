package pointofsalesystem;

import java.awt.Color;
import static java.awt.image.ImageObserver.WIDTH;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class IncomeStatementGUI extends javax.swing.JFrame 
{

    PointOfSaleSystem pos = new PointOfSaleSystem("");  //Create a new POS object
    PrintWriter writer;                                 //Create a new filewriter object
    String fileName, todayDate;
    
    public IncomeStatementGUI() 
    {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/resources/POS_Icon_blue.png")).getImage()); //Set taskbar icon to logo.
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpEndDate = new org.jdesktop.swingx.JXDatePicker();
        dpStartDate = new org.jdesktop.swingx.JXDatePicker();
        tfProfit = new javax.swing.JTextField();
        tfExpense = new javax.swing.JTextField();
        tfIncome = new javax.swing.JTextField();
        lblBack = new javax.swing.JLabel();
        lblQuit = new javax.swing.JLabel();
        lblHelp = new javax.swing.JLabel();
        lblExportToFile = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblPOSLogo = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("POS Income Statement");
        setUndecorated(true);
        setOpacity(0.0F);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dpEndDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
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
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblBackMouseReleased(evt);
            }
        });
        getContentPane().add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 14, 60, 30));

        lblQuit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblQuit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblQuitMouseReleased(evt);
            }
        });
        getContentPane().add(lblQuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 30, 30));

        lblHelp.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblHelp.setForeground(new java.awt.Color(25, 168, 250));
        lblHelp.setText("?");
        lblHelp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblHelp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblHelpMouseReleased(evt);
            }
        });
        getContentPane().add(lblHelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, 30));

        lblExportToFile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblExportToFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblExportToFileMouseReleased(evt);
            }
        });
        getContentPane().add(lblExportToFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 364, 200, 50));

        lblEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblEmailMouseReleased(evt);
            }
        });
        getContentPane().add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 364, 190, 50));

        lblPOSLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPOSLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
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

    private void lblExportToFileMouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblExportToFileMouseReleased
    {//GEN-HEADEREND:event_lblExportToFileMouseReleased
        exportToText();
    }//GEN-LAST:event_lblExportToFileMouseReleased

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

    private void lblHelpMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHelpMouseReleased
        pos.loadWebSite("http://pointofsalesystem.github.io/printstatements/");
    }//GEN-LAST:event_lblHelpMouseReleased
    
    double calculateValues(String query) //Method to retrieve values from one field in a resultset
    {
        try
        {
            ResultSet rs = pos.searchDB(query); //Search for the specified field
            
            double price = 0.0;                 //Create an empty variable
            while(rs.next())                    //Loop through each record
            {
                price += rs.getDouble(1);       //Add it's price to the total
            }
            
            price = (int) (price*100);          //Round to 2 decimals
            price /= 100;
            
            return price;                       //Return the value
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Failed to fetch data from tables: " + ex);//Print an error message
            return 0.0; //Return 0.0
        }
    }
    
    void calculateProfit() //Method to calculate values for each textfield
    {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        
        String startDate = formatter.format(dpStartDate.getDate()) + " 00:00:00.0"; //Concatenate the start date and time into a string
        String endDate = formatter.format(dpEndDate.getDate()) + " 23:59:59.9";     //Concatenate the end date and time into a string
        
        String getIncomes = "SELECT TRANSACTION_TOTALPRICE_NOVAT \n" +
                                "FROM NBUSER.TRANSACTIONS\n" +
                                "WHERE TRANSACTION_DATE > '"+ startDate +"' AND TRANSACTION_DATE < '"+ endDate +"'\n" +
                                "ORDER BY TRANSACTION_DATE";                        //Query to retrieve all transaction details
        
        double income = calculateValues(getIncomes);                                //Calculate the total income
        
        String getExpenses = "SELECT ORDER_PRICE \n" +
                                "FROM NBUSER.ORDERS\n" +
                                "WHERE ORDER_DATE > '"+ startDate +"' AND ORDER_DATE < '"+ endDate +"'\n" +
                                "ORDER BY ORDER_DATE";                              //Query to retrieve all orders' prices
        
        double expenses = calculateValues(getExpenses);                             //Calculate the total income
        
        double profit = income-expenses;                                            //Calculate the net profit
        profit = (int)(profit*100);
        profit /= 100;
        
        tfIncome.setText("R" + income);         //Set the income in it's textfield
        tfExpense.setText("R" + expenses);      //Set the expense in it's textfield
        tfProfit.setText("R" + profit);         //Set the profit in it's textfield
    }
    
    void exportToText() //method to save all the transactions and orders in a text file
    {
        Calendar cal = Calendar.getInstance(); //Create a new calendar object to get the computer time
        todayDate = ""+(cal.get(Calendar.YEAR) + (cal.get(Calendar.MONTH)+1) + cal.get(Calendar.DAY_OF_MONTH));
        fileName = "IncomeStatement"+ todayDate + ".txt";  //Get the current date for the file name

        try
        {
            writer = new PrintWriter("statements/" + fileName); //Instantiate a new FileWriter object to create a text file
        }
        catch (FileNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null, "Failed to export to a file: " + ex); //Print an error message
        }
        
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd"); //Format the date and time from the JXDatePickers to convert it to SQL Datetime format

        String startDate = formatter.format(dpStartDate.getDate()) + " 00:00:00.0"; //Concatenate the start date and time into a string
        String endDate = formatter.format(dpEndDate.getDate()) + " 23:59:59.9";     //Concatenate the end date and time into a string

        String getIncomes = "SELECT TRANSACTION_ID, TRANSACTION_DATE, TRANSACTION_TOTALPRICE_NOVAT, TRANSACTION_TOTALPRICE_PLUSVAT\n" +
                            "FROM NBUSER.TRANSACTIONS\n" +
                            "WHERE TRANSACTION_DATE > '"+ startDate +"' AND TRANSACTION_DATE < '"+ endDate +"'\n" +
                            "ORDER BY TRANSACTION_DATE"; //Query to get all the income details for a specific time period

        double income = calculateValues(getIncomes);    //Calculate the total income for a specific time period
        
        ResultSet incomeRS = pos.searchDB(getIncomes);                          //Get all the income details for a specific time period

        String[] incomeHeadings = {"ID", "TRANSACTION DATE", "PRICE excl VAT", "PRICE incl VAT"}; //Headings to be printed on output
        int[] incomeColWidth = {6, 30, 20, 20};                                       //Sizes for "columns"
        
        writer.println("TRANSACTIONS (Income)\n");                              //Print a header
        
        displayTable(incomeRS, incomeHeadings, incomeColWidth);                 //Output rs
        writer.println("Total income: R" + income + "\n");                      //Output total income
        
        String getExpenses = "SELECT ORDERS.ORDER_ID, ORDERS.ORDER_DATE, ORDERS.ORDER_PRICE, ORDERS.ORDER_QTY, PRODUCTS.PRODUCT_NAME, SUPPLIERS.SUPPLIER_NAME\n" +
                                "FROM NBUSER.ORDERS\n" +
                                "INNER JOIN PRODUCTS\n" +
                                "ON ORDERS.PRODUCT_ID = PRODUCTS.PRODUCT_ID\n" +
                                "INNER JOIN SUPPLIERS\n" +
                                "ON ORDERS.SUPPLIER_ID = SUPPLIERS.SUPPLIER_ID\n" +
                                "WHERE ORDER_DATE > '"+ startDate +"' AND ORDER_DATE < '"+ endDate +"'\n" +
                                "ORDER BY ORDER_DATE";                          //Query to get all the order details for a specific time period

        double expenses = calculateValues(getExpenses);                         //Calculate the total expenses for a specific period of time

        ResultSet expenseRS = pos.searchDB(getExpenses);                        //Search for query

        String[] expenseHeadings = {"ID", "ORDER DATE", "PRICE", "QTY", "Product Name", "Supplier Name"}; //Headings to be printed on output
        int[] expenseColWidth = {6, 30, 20, 10, 20, 20};                        //Sizes for "columns"

        writer.println();
        writer.println("ORDERS (Expenses)\n");                                  //Print a heading

        displayTable(expenseRS, expenseHeadings, expenseColWidth);              //Output rs
        
        writer.println("Total expense: R" + expenses);                          //Output the total expenses
        
        writer.close();                                                         //Close and save the file
        
        String path = Paths.get(".").toAbsolutePath().normalize().toString();   //Get the current working directory
        
        JOptionPane.showMessageDialog(null, "File \"" + fileName + "\" successfully saved in directory \"" + path + "\\statements\\\" "); //Print a message that the file has been successfully saved.
    }
    
    public void orderStock() //Method to send the text file as an email
     {
        //http://www.tutorialspoint.com/javamail_api/javamail_api_gmail_smtp_server.htm - Sending a GMAIL email through TLS 
        try
        {
            JOptionPane.showMessageDialog(null, "Processing... Click OK to continue.");
            
        
            String to = "botha.daniel1@gmail.com";                //Recipient's email - the manager of the store.

            final String from = "pointofsalesystem.github.io@gmail.com";              //Sender's email
            final String username = "pointofsalesystem.github.io";              //Sender email accounts
            final String password = "pointofsalesystem";            //Sender password
            
            final String managerName = "Koos Visagie";
            
            String host = "smtp.gmail.com";             //GMAIL server address

            Properties props = new Properties();        //Instantiate new Properties object
            props.put("mail.smtp.auth", "true");        //Server details
            props.put("mail.smtp.starttls.enable", "true"); //Connect to server
            props.put("mail.smtp.host", host);          //More details
            props.put("mail.smtp.port", "587");         //SMTP Port 

            Session session = Session.getInstance(props, // Get the Session object.
                    new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(username, password);
                }
            });

            try 
            {
                Message message = new MimeMessage(session); // Create a message object.

                message.setFrom(new InternetAddress(from)); // Set from

                message.setRecipients(Message.RecipientType.TO,
                        InternetAddress.parse(to));         // Set to
                message.setSubject(fileName); // Set subject

                message.setText("Good afternoon "  + managerName + ","
                        + "\n\nAttached please find the Income Statement as generated on "+ todayDate+".\n\n"
                        + "\n\nKind Regards"
                        + "\nDaniël Botha"
                        +"\n\nSent from my PointofSaleSystem Application."); // Now set the actual message

                Transport.send(message); // Send message
                
                JOptionPane.showMessageDialog(null, "Email successfully sent!"); //Print an error message

            } 
            catch (MessagingException e) //If the mail failed to send
            {
                throw new RuntimeException(e); //Throw an error
            }
        } 
        catch (RuntimeException ex) //If the mail failed to send
        {
            JOptionPane.showMessageDialog(null, "Failed to send email: " + ex); //Print an error message
        } 
    }
    
    void displayTable(ResultSet rs, String[] headings, int[] colWidth) //Code adapted from Nico C Rossouw's in PRG_IT_2015_march_test.java - Method to add the ResulSet to the file
    {
        writer.print("");

        for (int i = 0; i < headings.length; i++)               //Print a new line
        {
            writer.print(addSpaces(headings[i], colWidth[i])); //Add spaces to the headings to mimic collumns
        }

        writer.println("");                                     //Print a new line

        for (int i = 0; i < headings.length; i++)               //For each of the headings
        {
            for (int j = 0; j < colWidth[i]; j++)
            {
                writer.print("=");                              //Print an "=" as a line break
            }
        }

        writer.println("");                                     //Print a new line

        try 
        {
            while (rs.next())                                   //For each of the collumns
            {
                for (int i = 0; i < headings.length; i++)       //Add spaces to the strings to mimic collumns
                {
                    writer.print(addSpaces(rs.getString(i+1), colWidth[i])); //Add spaces to the strings to mimic collumns
                }
                writer.println("");                             //Print a new line
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
    private javax.swing.JLabel lblExportToFile;
    private javax.swing.JLabel lblHelp;
    private javax.swing.JLabel lblPOSLogo;
    private javax.swing.JLabel lblQuit;
    private javax.swing.JTextField tfExpense;
    private javax.swing.JTextField tfIncome;
    private javax.swing.JTextField tfProfit;
    // End of variables declaration//GEN-END:variables
}
