
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author home
 */
public class Connect 
{
   
    public static Connection ConnectDB()
        {
            try
            {
                Connection con = DriverManager.getConnection("jdbc:ucanaccess://E://MyDatabase1.accdb");
                

                return con;
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
                return null;
            }      
        }
  
    }


