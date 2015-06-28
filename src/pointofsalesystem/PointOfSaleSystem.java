package pointofsalesystem;

import static java.awt.image.ImageObserver.WIDTH;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 *  THIS CLASS IS USED FOR MISCELLANEOUS PIECES OF CODE, THAT ARE USED AT  
 *  MULTIPLE PLACES IN THIS PROJECT. e.g. fadeIn(), fadeOut(), loadWebsite(), searchDB(), etc...
 */

/*
 *  GLOSSARY
 *      https://www.mockaroo.com/                           - Test data
 *      http://www.w3schools.com/sql/sql_create_table.asp   - SQL Create Table statement
 *      http://www.entrepreneur.com/answer/221767           - Grocery Markup - between 9% and 13%  
 *      http://stackoverflow.com/questions/3816015/sqlexception-no-suitable-driver-found-for-jdbcderby-localhost1527
 *                                                          - Derby Driver not found
 */
public class PointOfSaleSystem
{

    static
    {
        try
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e)
        {
            System.err.println("Derby driver not found.");
        }
    }
    private Connection conn;

    public PointOfSaleSystem()  //Default constructor for instantiating a POS object 
    {
    }

    public PointOfSaleSystem(String s) //Constructor to be used when a DB connection is necessary 
    {
        try //Connect application to Database
        {
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/PointOfSaleSystem", "nbuser", "nbuser");
//            System.out.println("Connection to PointOfSaleSystem Database Established"); 
        } catch (SQLException ex) //If the connection fails...
        {
            System.out.println("Connection to PointOfSaleSystem Database Failed: " + ex); //...print an output message
        }
    }

    public void fadeIn(JFrame frame)    //Fade in the current window
    {
        for (double i = 0.0; i <= 1.0; i += 0.1)
        {
            String floatValue = i + "F"; //Convert the double I to a float value
            Float f = Float.valueOf(floatValue);

            frame.setOpacity(f);        //Set opacity of window to f

            try
            {
                Thread.sleep(25);       //100ms Delay between iterations
            } catch (Exception e)          //If the thread failed to sleep.
            {
                System.out.println("Thread failed to sleep: " + e);
            }
        }
    }

    public void fadeOut(JFrame frame)   //Fade out of the current window
    {
        for (double i = 1.0; i >= 0.0; i -= 0.1)
        {
            String floatValue = i + "F"; //Convert the double I to a float value
            Float f = Float.valueOf(floatValue);

            frame.setOpacity(f);        //Set opacity of window to f

            try
            {
                Thread.sleep(25);       //100ms Delay between iterations
            } catch (Exception e)          //If the thread failed to sleep.
            {
                System.out.println("Thread failed to sleep: " + e);
            }
        }
        frame.setVisible(false);        //Close the frame after its opacity is set to 0.0
    }

    public void loadWebSite(String url) //Display a certain webpage
    {
        try
        {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (IOException ex)
        {
            System.out.println("Failed to load website. " + ex);
        }
    }

    public ResultSet searchDB(String query)
    {
        try
        {
            Statement stmt = conn.createStatement(); //Create a statement object
            ResultSet rs = stmt.executeQuery(query); //Generate a ResultSet with the specified SQL query

            return rs;
        } catch (SQLException e)                      //If the query failed...
        {
            System.out.println("Search query unsuccessful: " + e); //...print an output message
            return null;
        }
    }

    public int getID(String query)
    {
        try
        {
            Statement stmt = conn.createStatement(); //Create a statement object
            ResultSet rs = stmt.executeQuery(query); //Generate a ResultSet with the specified SQL query

            rs.next();                              //Skip to first line of resultset
            int id = rs.getInt(1);
            return id;
        } catch (SQLException e)                      //If the query failed...
        {
            System.out.println("Search query unsuccessful: " + e); //...print an output message
            return 0;
        }
    }

    public void addDBEntry(String query)
    {
        try
        {
            Statement stmt = conn.createStatement();    //Create a statement object
            stmt.executeUpdate(query);                  //Executes the insert INTO query
            
        } catch (SQLException e)                      //If the query failed...
        {
            System.out.println("INSERT INTO query unsuccessful: " + e); //...print an output message
        }
        
        JOptionPane.showMessageDialog(null, "Data successfully added to database.");
    }

    public void deleteDBEntry(String query)
    {
        try
        {
            Statement stmt = conn.createStatement();    //Create a statement object
            stmt.executeUpdate(query);                  //Executes the insert INTO query
            
        } catch (SQLException e)                      //If the query failed...
        {
            System.out.println("DELETE query unsuccessful: " + e); //...print an output message
        }
        
        JOptionPane.showMessageDialog(null, "Data successfully removed from database.");
    }
}
