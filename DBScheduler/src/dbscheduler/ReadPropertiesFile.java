package dbscheduler;

import java.io.FileInputStream;
import java.util.Properties;
import javaConstants.Constants;
 
public class ReadPropertiesFile
{
 public  static void readConfig() throws Exception
 {
 try
 {
 
     Properties pro = new Properties();
     String path = System.getProperty("user.dir")+"/CProps.properties";
     pro.load(new FileInputStream(path));
 
     Constants.delay = pro.getProperty("delay");
     Constants.timetoquery = pro.getProperty("timetoquery");
     Constants.setFrom = pro.getProperty("setFrom");
     Constants.setPassword = pro.getProperty("setPassword");
     
     Properties Spro = new Properties();
     String Spath = System.getProperty("user.dir")+"/Props.properties";
     Spro.load(new FileInputStream(Spath));
     
     Constants.emailTO = Spro.getProperty("emailTO");   		   
 
 }
 catch(Exception e)
 {
            throw new Exception(e);
 }
 
 }
 
}