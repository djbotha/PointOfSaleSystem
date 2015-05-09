package pointofsalesystem;

import javax.swing.JFrame;

/*
 *  THIS CLASS IS USED FOR MISCELLANEOUS PIECES OF CODE, THAT ARE USED AT  
 *  MULTIPLE PLACES IN THIS PROJECT. e.g. fadeIn(), fadeOut()...
 */

public class PointOfSaleSystem 
{    
    
    
    
    
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
            catch(Exception e)
            {
                System.out.println("Thread failed to sleep: " + e);
            }
        }
    }
    
    public void fadeOut(JFrame frame) //Fade out of the current window
    {
        for (double i = 1.0; i >= 0.0; i-=0.1) 
        {
            String floatValue = i +"F"; //Convert the double I to a float value
            Float f = Float.valueOf(floatValue);
            
            frame.setOpacity(f);   //Set opacity of window to f
            
            try
            {
                Thread.sleep(25); //100ms Delay between iterations
            }
            catch(Exception e)
            {
                System.out.println("Thread failed to sleep: " + e);
            }
        }
        
        
    }

}
