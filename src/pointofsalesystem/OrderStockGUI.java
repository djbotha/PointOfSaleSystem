package pointofsalesystem;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;


/**
 *
 * @author Daniel
 */
public class OrderStockGUI extends javax.swing.JFrame 
{
    
    PointOfSaleSystem pos = new PointOfSaleSystem(""); //Creates a new PointOfSaleSystem object to use its methods
    int clickercounter = 0;                             //Counter used to determine how many times the OrderStock button has been clicked
    
    int supplierID, orderID, orderQty;                  //Global order variables
    String supplierName, contactName, productName;      //Global name variables 
    double costPrice;                                   //Global costprice variable
    
    public OrderStockGUI()
    {
        initComponents();
     
        this.setIconImage(new ImageIcon(getClass().getResource("/resources/POS_Icon_blue.png")).getImage()); //Set taskbar icon to logo.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        tfTotalPrice = new javax.swing.JTextField();
        tfPricePerUnit = new javax.swing.JTextField();
        tfSupplierName = new javax.swing.JTextField();
        tfOrderID = new javax.swing.JTextField();
        tfOrderDate = new javax.swing.JTextField();
        tfBarcode = new javax.swing.JTextField();
        tfProductName = new javax.swing.JTextField();
        spnQty = new javax.swing.JSpinner();
        lblPlaceOrder = new javax.swing.JLabel();
        lblPOSLogo = new javax.swing.JLabel();
        lblQuit = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("POS Order Stock");
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

        tfTotalPrice.setBackground(new Color(0, 0, 0, 0));
        tfTotalPrice.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tfTotalPrice.setForeground(new java.awt.Color(255, 255, 255));
        tfTotalPrice.setBorder(null);
        tfTotalPrice.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        tfTotalPrice.setEnabled(false);
        getContentPane().add(tfTotalPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 120, 30));

        tfPricePerUnit.setBackground(new Color(0, 0, 0, 0));
        tfPricePerUnit.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tfPricePerUnit.setForeground(new java.awt.Color(255, 255, 255));
        tfPricePerUnit.setBorder(null);
        tfPricePerUnit.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        tfPricePerUnit.setEnabled(false);
        getContentPane().add(tfPricePerUnit, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 120, 30));

        tfSupplierName.setBackground(new Color(0, 0, 0, 0));
        tfSupplierName.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tfSupplierName.setForeground(new java.awt.Color(255, 255, 255));
        tfSupplierName.setBorder(null);
        tfSupplierName.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        tfSupplierName.setEnabled(false);
        getContentPane().add(tfSupplierName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 460, 40));

        tfOrderID.setBackground(new Color(0, 0, 0, 0));
        tfOrderID.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tfOrderID.setForeground(new java.awt.Color(255, 255, 255));
        tfOrderID.setBorder(null);
        tfOrderID.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        tfOrderID.setEnabled(false);
        getContentPane().add(tfOrderID, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 210, 40));

        tfOrderDate.setBackground(new Color(0, 0, 0, 0));
        tfOrderDate.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tfOrderDate.setForeground(new java.awt.Color(255, 255, 255));
        tfOrderDate.setBorder(null);
        tfOrderDate.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        tfOrderDate.setEnabled(false);
        getContentPane().add(tfOrderDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 210, 40));

        tfBarcode.setBackground(new Color(0, 0, 0, 0));
        tfBarcode.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tfBarcode.setForeground(new java.awt.Color(255, 255, 255));
        tfBarcode.setBorder(null);
        tfBarcode.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        tfBarcode.setEnabled(false);
        getContentPane().add(tfBarcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 460, 40));

        tfProductName.setBackground(new Color(0, 0, 0, 0));
        tfProductName.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tfProductName.setForeground(new java.awt.Color(255, 255, 255));
        tfProductName.setBorder(null);
        getContentPane().add(tfProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 106, 340, 40));
        getContentPane().add(spnQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 80, 30));

        lblPlaceOrder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPlaceOrder.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                lblPlaceOrderMouseReleased(evt);
            }
        });
        getContentPane().add(lblPlaceOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 364, 190, 20));

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

        lblBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBack.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                lblBackMouseReleased(evt);
            }
        });
        getContentPane().add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 14, 60, 30));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/OrderStockGUI.png"))); // NOI18N
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 440));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblBackMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseReleased
        pos.fadeOut(this);                                  //Fade out this window
    }//GEN-LAST:event_lblBackMouseReleased

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        pos.fadeIn(this);                                   //Fade in this window
    }//GEN-LAST:event_formWindowOpened

    private void lblQuitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuitMouseReleased
        pos.fadeOut(this);                                  //Fade out current screen
        System.exit(0);                                     //Quit program
    }//GEN-LAST:event_lblQuitMouseReleased

    private void lblPOSLogoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPOSLogoMouseReleased
        pos.loadWebSite("https://github.com/iggnoreza/pointofsalesystem"); //Load the github repository for this project. 
    }//GEN-LAST:event_lblPOSLogoMouseReleased

    private void lblPlaceOrderMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPlaceOrderMouseReleased
        if (clickercounter == 0)
        {
            getDetails();
            lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/OrderStockConfirmGUI.png"))); //Change background to a different button
            clickercounter++;
        }
        else
            orderStock();
    }//GEN-LAST:event_lblPlaceOrderMouseReleased

    public void getDetails() //Method to retrieve all the details of the product
    {
        try
        {
            productName = tfProductName.getText();   //Fetch the product name from the text field                               
            orderQty = (int) spnQty.getValue();              //Fetch the quantity to be deleted from the spinner

            String query =  "SELECT * FROM NBUSER.PRODUCTS\n" +
                            "WHERE PRODUCTS.PRODUCT_NAME LIKE '" + productName + "'"; //Query to fetch all the data regarding the specific product

            ResultSet rs = pos.searchDB(query);             //Fetch all the data from the table

            rs.next();                                      //Skip to the first line of the ResultSet
        
            int productID = rs.getInt(1);                   //Fetch the productID from the table
            String dbProductName = rs.getString(2);         //Fetch the productName from the table
            String barcode = rs.getString(3);               //Fetch the barcode from the table
            costPrice = rs.getDouble(4);                    //Fetch the costprice from the table
            double markup = rs.getDouble(5);                //Fetch the markup from the table
            int dbQty = rs.getInt(6);                       //Fetch the quantity from the table
            supplierID = rs.getInt(7);                      //Fetch the supplierIDfrom the table
            
            String getSupplierName =    "SELECT SUPPLIER_NAME, CONTACT_NAME FROM NBUSER.SUPPLIERS\n" +
                                        "WHERE SUPPLIERS.SUPPLIER_ID  = " + supplierID + ""; //Query to fetch the supplier Name 
            
            ResultSet rs2 = pos.searchDB(getSupplierName);  //Fetch the supplierName from the database
            rs2.next();                                     //Skip to the first line of the file
            supplierName = rs2.getString(1);                //Fetch the supplier Name from the resultset
            contactName = rs2.getString(2);                 //Fetch the supplier contact name from the resultset
            String getOrderID = "SELECT ORDER_ID FROM NBUSER.ORDERS\n" +
                                "ORDER BY ORDER_ID DESC\n" +
                                "FETCH FIRST 1 ROWS ONLY"; //Query to get the last order ID and increment it with one
        
            orderID = pos.getID(getOrderID) + 1;            //Get the last order ID and increment it with one
            
            Calendar c1 = Calendar.getInstance();           //Get current computer time
            
            String date = "";                               //Instantiate a new date string
            int year = c1.get(Calendar.YEAR);               //Get year from current computer time
            int month = c1.get(Calendar.MONTH);             //Get month from current computer time
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
            
            String sqlDate = date + " " + time;             //Concatenate the Date and the Time into SQL Date format
            
            costPrice =(int)(costPrice*100);                //Convert the costPrice to 2 decimals
            costPrice = costPrice/100;                      
            
            tfBarcode.setText(barcode);                     //Set the textfield's value to the barcode
            tfOrderDate.setText(sqlDate);                   //Set the textfield's value to the current date and time
            tfOrderID.setText(""+orderID);                  //Set the textfield's value to the orderID
            tfSupplierName.setText(supplierName);           //Set the textfield's value to the supplierName
            tfPricePerUnit.setText(""+costPrice);           //Set the textfield's value to the price per unit
            tfTotalPrice.setText(""+(orderQty*costPrice));  //Set the textfield's value to the total price of the order
            
        } 
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Failed to fetch data from tables: " + ex);
        }
    }
    
     public void orderStock() 
    {
        //http://www.tutorialspoint.com/javamail_api/javamail_api_gmail_smtp_server.htm - Sending a GMAIL email through TLS 
        try
        {
            String getSupplierEmail =    "SELECT SUPPLIER_EMAIL FROM NBUSER.SUPPLIERS\n" +
                                        "WHERE SUPPLIERS.SUPPLIER_ID  = " + supplierID + ""; //Query to fetch the supplier Name 
            ResultSet rs2 = pos.searchDB(getSupplierEmail);  //Fetch the supplierName from the database

            rs2.next();                                     //Skip to the first line of the file
            String supplierEmail = rs2.getString(1);         //Fetch the supplier Name from the resultset
        
            String to = supplierEmail;                //Recipient's email

            final String from = "pointofsalesystem.github.io@gmail.com";              //Sender's email
            final String username = "pointofsalesystem.github.io";              //Sender email accounts
            final String password = "pointofsalesystem";            //Sender password

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

                message.setSubject("ORDER ID "+ orderID +" for Paul Roos Kwikspar"); // Set subject

                message.setText("Good afternoon "  + contactName + ","
                        + "\n\nPaul Roos Kwikspar would like to order the following goods from you:\n\n"
                        + "\t" + orderQty +" x " + productName 
                        + "\t"+ "@R" + costPrice + " per unit."
                        + "\n\tTotal: R" + (costPrice*orderQty)); // Now set the actual message

                Transport.send(message); // Send message

                JOptionPane.showMessageDialog(null, "Order successfully placed....");

            } 
            catch (MessagingException e) 
            {
                throw new RuntimeException(e);
            }
        } 
        catch (RuntimeException ex)
        {
            JOptionPane.showMessageDialog(null, "Failed to send email: " + ex);
        } 
        catch (SQLException ex)
        {
            Logger.getLogger(OrderStockGUI.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(OrderStockGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderStockGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderStockGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderStockGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderStockGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblPOSLogo;
    private javax.swing.JLabel lblPlaceOrder;
    private javax.swing.JLabel lblQuit;
    private javax.swing.JSpinner spnQty;
    private javax.swing.JTextField tfBarcode;
    private javax.swing.JTextField tfOrderDate;
    private javax.swing.JTextField tfOrderID;
    private javax.swing.JTextField tfPricePerUnit;
    private javax.swing.JTextField tfProductName;
    private javax.swing.JTextField tfSupplierName;
    private javax.swing.JTextField tfTotalPrice;
    // End of variables declaration//GEN-END:variables
}
