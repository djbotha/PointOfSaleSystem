package pointofsalesystem;

import java.awt.Color;
import javax.swing.ImageIcon;

public class NewTransactionGUI extends javax.swing.JFrame
{
    
    PointOfSaleSystem pos = new PointOfSaleSystem("");  //Creates a new POS Object to use it's methods.
    
    public NewTransactionGUI()
    {
        initComponents();
        
        jScrollPane1.getViewport().setOpaque(false);    //Set background of ScrollPane to invisible
        
        this.setIconImage(new ImageIcon(getClass().getResource("/resources/POS_Icon_blue.png")).getImage()); //Set taskbar icon to logo.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        PointOfSaleSystemPUEntityManager0 = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("PointOfSaleSystemPU").createEntityManager();
        productsQuery = java.beans.Beans.isDesignTime() ? null : PointOfSaleSystemPUEntityManager0.createQuery("SELECT p FROM Products p");
        productsList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : productsQuery.getResultList();
        productsQuery1 = java.beans.Beans.isDesignTime() ? null : PointOfSaleSystemPUEntityManager0.createQuery("SELECT p FROM Products p");
        productsList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : productsQuery1.getResultList();
        jScrollPane1 = new javax.swing.JScrollPane();
        taOutput = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProducts = new javax.swing.JTable();
        lblManager = new javax.swing.JLabel();
        lblKeypad = new javax.swing.JLabel();
        lblProductList = new javax.swing.JLabel();
        tfSelectedItem = new javax.swing.JTextField();
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

        jScrollPane1.setBorder(null);
        jScrollPane1.setOpaque(false);

        taOutput.setBackground(new Color(0,0,0,0));
        taOutput.setColumns(20);
        taOutput.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        taOutput.setForeground(new java.awt.Color(255, 255, 255));
        taOutput.setRows(5);
        taOutput.setBorder(null);
        jScrollPane1.setViewportView(taOutput);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 400, 630));

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, productsList1, tblProducts);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${productName}"));
        columnBinding.setColumnName("Product Name");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${productBarcode}"));
        columnBinding.setColumnName("Product Barcode");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane2.setViewportView(tblProducts);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 400, 420));

        lblManager.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(lblManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 90, 160, 30));

        lblKeypad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(lblKeypad, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 90, 130, 30));

        lblProductList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(lblProductList, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 94, 150, 30));

        tfSelectedItem.setBackground(new Color(0, 0, 0, 0));
        tfSelectedItem.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tfSelectedItem.setForeground(new java.awt.Color(255, 255, 255));
        tfSelectedItem.setBorder(null);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblProducts, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.productName}"), tfSelectedItem, org.jdesktop.beansbinding.BeanProperty.create("text"), "");
        bindingGroup.addBinding(binding);

        getContentPane().add(tfSelectedItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, 290, 40));

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
    private javax.persistence.EntityManager PointOfSaleSystemPUEntityManager0;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblKeypad;
    private javax.swing.JLabel lblManager;
    private javax.swing.JLabel lblProductList;
    private javax.swing.JLabel lblQuit;
    private javax.swing.JLabel lblTabs;
    private java.util.List<Products> productsList;
    private java.util.List<pointofsalesystem.Products> productsList1;
    private javax.persistence.Query productsQuery;
    private javax.persistence.Query productsQuery1;
    private javax.swing.JTextArea taOutput;
    private javax.swing.JTable tblProducts;
    private javax.swing.JTextField tfSelectedItem;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
