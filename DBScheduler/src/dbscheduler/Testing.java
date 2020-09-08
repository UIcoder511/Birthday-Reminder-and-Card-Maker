package dbscheduler;
import java.io.BufferedInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;
import java.io.*;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
//import javax.media.*;
import java.util.TimerTask;
import javaConstants.Constants;
import javazoom.jl.player.Player;
 
public class Testing extends TimerTask
{
 //long diff;
 public void run()
          {
              
              try {
                  
       Class.forName("org.sqlite.JDBC");  // MySQL database connection
       Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\umang\\OneDrive\\Documents\\NetBeansProjects\\BD.db" ); //+ "user= & password=");     
       Statement pst = conn.createStatement();//("select from BD(Name,Date) values (?,?) ");
       ResultSet rs =pst.executeQuery("SELECT Name,Date FROM BD");
       
       SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        //Date d = sdf.parse("04/06/2018");
      //  Calendar user = Calendar.getInstance();
       // user.setTime(d);  
       // user.set(Calendar.HOUR_OF_DAY, 0);  
       // user.set(Calendar.MINUTE, 0);  
       // user.set(Calendar.SECOND, 0);  
       // user.set(Calendar.MILLISECOND, 0);
      //  System.out.println("Before : Date : " + sdf.format(user.getTime()) + "miliseconds :" + user.getTimeInMillis());
      //  cal.set(2016, 3, 28);
         //the current time as UTC milliseconds from the epoch.
        Calendar now = Calendar.getInstance();
        System.out.println("Time now: " + (sdf.format(now.getTime())).substring(0,5));// +"milsec : "+ now.getTimeInMillis());
       
       //String Check_date=
       String Now_d=(sdf.format(now.getTime())).substring(0,2);
       String Now_m=(sdf.format(now.getTime())).substring(3,5);
       String Now_date=(sdf.format(now.getTime())).substring(0,5);
       int dd=Integer.parseInt(Now_d);
       int mm=Integer.parseInt(Now_m);
       //System.out.println("Intigrr" + dd);
       if(dd<10 )
       {
           if(mm<10)
           {
               Now_date=Integer.toString(dd) + "/" + Integer.toString(mm);
           }
           else
           {
               Now_date=Integer.toString(dd) + "/" + Now_m;
           }
              
       }
      /* if(mm<10 )
       {
          Now_date=Integer.toString(dd) + "/";
       }*/
           
           
       
       while(rs.next())
       {
          String data_name =rs.getString("Name");
          String data_date = rs.getString("Date");
          
          System.out.println(data_name + data_date.substring(0,5));
          
          
             // String Check_date=Now_date.substring(0,2);
              String Prev_date=null;
              
              int Check_day=Integer.parseInt(data_date.substring(3,5));
              int Check_month=Integer.parseInt(data_date.substring(0,2));
              int Check_year=Integer.parseInt(data_date.substring(6,10));
              
              //checking previous date...
              if(Check_day>=2 && Check_day<=31 && ( Check_month==1 || Check_month==3 || Check_month==5 || Check_month==7 || Check_month==8 || Check_month==10 || Check_month==12))
              {
                  Prev_date=Integer.toString(Check_month) + "/" +  Integer.toString(Check_day - 1) ;
              }
              else if(Check_day>=2 && Check_day<=30 && ( Check_month==4 || Check_month==6 || Check_month==9 || Check_month==11))// || Check_month==8 || Check_month==10 || Check_month==12))
              {
                  Prev_date=Integer.toString(Check_month) + "/" +  Integer.toString(Check_day - 1) ;
              }
              else if(Check_month==2)
              {
                  if(Check_day>=2 && Check_day<=29)
                  {
                      Prev_date=Integer.toString(Check_month) + "/" +  Integer.toString(Check_day - 1) ;
                  }
              }
              else if(Check_day==1)
              {
              switch (Check_month) {
                  case 2:
                  case 4:
                  case 6:
                  case 8:
                  case 9:
                  case 11:
                      Prev_date=Integer.toString(Check_month-1) + "/" + "31" ;
                      break;
                  case 5:
                  case 7:
                  case 10:
                  case 12:
                      Prev_date=Integer.toString(Check_month-1) + "/" + "30" ;
                      break;
                  case 1:
                      Prev_date="12" + "/" + "31" ;
                      break;
                  case 3:
                      if((Check_year % 4 == 0 && Check_year % 100 != 0) || (Check_year % 400 == 0))
                      {
                          Prev_date="02" + "/" + "29" ;
                      }
                      else
                          Prev_date="02" + "/" + "28" ;
                      break;
                  default:
                      break;
              }
              }
          
          System.out.println(Prev_date);
          
          
          if(Now_date.equals(Prev_date))
          {
              
           System.out.println("!!!!!!It matched: " + data_name + Now_date);
           GMailServer sender = new GMailServer(Constants.setFrom, Constants.setPassword);
          
             try {
                 sender.sendMail("_____BIRTHDAY REMINDER_____",data_name + "'s Birthday is tomorrow....",Constants.setFrom,Constants.emailTO);
                 }
             catch (Exception e) {
                 }  
             //javax.swing.JFrame.JOptionPane.showMessageDialog(null, "Incorrect Login Credentials");
             System.out.println("Email Sent Succesfully...");
             Testing song=new Testing();
           //  song.play();
          } 
          else
          {
           System.out.println("No match with: "+data_name + data_date);
          }

       }
    
    
    /*
     * Returns the number of milliseconds since January 1, 1970, 00:00:00 GMT represented by this Date object.
     */
    //System.out.println(d.getTime());
    //OR
       
     //   diff=(user.getTimeInMillis() - now.getTimeInMillis());
       
 } catch (Exception e)
{
                  // TODO Auto-generated catch blo
}
        
        /*if(diff<= (86400000+86400000) && diff>=0)
        { 
            GMailServer sender = new GMailServer(Constants.setFrom, Constants.setPassword);
          
             try {
                 sender.sendMail("_____BIRTHDAY REMINDER_____","Birthday is coming....",Constants.setFrom,Constants.emailTO);
                 }
             catch (Exception e) {
                 e.printStackTrace();
                 }  
 
             System.out.println("Email Sent Succesfully...");
 
         }*/
        
        
   }
 
 /*public void play()
{
       // String song = "http://www.ntonyx.com/mp3files/Morning_Flower.mp3";
        String song="http://www.thewavsite.com/Birthday/bday00.wav";
        Player mp3player = null;
        BufferedInputStream in = null;
        try {
          in = new BufferedInputStream(new URL(song).openStream());
          mp3player = new Player(in);
          mp3player.play();
        } catch (Exception ex) {
        }
       /* catch (IOException e) {
        }
        catch (JavaLayerException e) {
        } 
        catch (NullPointerException ex) {
        }

}*/
}
