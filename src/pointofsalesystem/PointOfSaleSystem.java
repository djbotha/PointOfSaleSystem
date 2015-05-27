package pointofsalesystem;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.swing.JFrame;

/*
 *  THIS CLASS IS USED FOR MISCELLANEOUS PIECES OF CODE, THAT ARE USED AT  
 *  MULTIPLE PLACES IN THIS PROJECT. e.g. fadeIn(), fadeOut(), etc...
 */

/*
 *  GLOSSARY
 *      https://www.mockaroo.com/                           - Test data
 *      http://www.w3schools.com/sql/sql_create_table.asp   - SQL Create Table statement
 *      http://www.entrepreneur.com/answer/221767           - Grocery Markup - between 9% and 13%  
 */
public class PointOfSaleSystem 
{    
    public PointOfSaleSystem()
    {
        
    }
    
    public void fadeIn(JFrame frame)    //Fade in the current window
    {
        for (double i = 0.0; i <= 1.0; i+=0.1) 
        {
            String floatValue = i +"F"; //Convert the double I to a float value
            Float f = Float.valueOf(floatValue);
            
            frame.setOpacity(f);        //Set opacity of window to f
            
            try
            {
                Thread.sleep(25);       //100ms Delay between iterations
            }
            catch(Exception e)          //If the thread failed to sleep.
            {
                System.out.println("Thread failed to sleep: " + e);
            }
        }
    }
    
    public void fadeOut(JFrame frame)   //Fade out of the current window
    {
        for (double i = 1.0; i >= 0.0; i-=0.1) 
        {
            String floatValue = i +"F"; //Convert the double I to a float value
            Float f = Float.valueOf(floatValue);
            
            frame.setOpacity(f);        //Set opacity of window to f
            
            try
            {
                Thread.sleep(25);       //100ms Delay between iterations
            }
            catch(Exception e)          //If the thread failed to sleep.
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
        } 
        catch (IOException ex) 
        {
            System.out.println("Failed to load website. " + ex);
        }
    }
}
