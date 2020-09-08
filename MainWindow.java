package dbscheduler;

import java.awt.*;
import java.io.*;
import java.util.Date;  

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.*;

import com.mindfusion.common.*;
import com.mindfusion.common.Rectangle;
import com.mindfusion.drawing.*;
import com.mindfusion.drawing.awt.AwtImage;
import com.mindfusion.scheduling.*;
import com.mindfusion.scheduling.awt.*;
import com.mindfusion.scheduling.model.*;




/**
 * Created by MindFusion.
 */
public class MainWindow extends JFrame {
    String Name;
    String Date;
    AwtCalendar calendar;
    Recurrence recurrence;

    protected MainWindow()//String Name,String Date)
    {
          // this.Name=Name;
         //  this.Date=Date;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //setTitle("MindFusion.Scheduling Sample: Calendar With Events");
        setMinimumSize(new Dimension(400,600));

        BorderLayout layout = new BorderLayout();
        getContentPane().setLayout(layout);

        Appointment item = new Appointment();
      // item.setStartTime(e.getDate());
      // item.setEndTime(e.getDate());
       // item.setHeaderText(events[dayIndex]);
        
        

        JLabel label = new JLabel("This sample demonstrates the TimeTable view and recurrent events. " +
        "Click on a cell and a new event will be created that will occur each week on the selected day.");
        label.setBorder(new EmptyBorder(10,10,10,10));
         getContentPane().add(label, BorderLayout.NORTH);

        // Calendar initialization start
        calendar = new AwtCalendar();
        calendar.beginInit();
        //set the current time
        calendar.setCurrentTime(DateTime.now());
        DateTime today = DateTime.today();
        //set the current date
        calendar.setDate(today);
        // Select the current date
        calendar.getSelection().set(DateTime.today());

        calendar.setCurrentView(CalendarView.SingleMonth);
        calendar.setCustomDraw(CustomDrawElements.CalendarItem);
      //  calendar.getMonthSettings().getDaySettings().setHeaderSize(10);
        calendar.getItemSettings().setSize(32);
        calendar.endInit();

        

        //add a listener for custom draw
       calendar.addCalendarListener(new CalendarAdapter()
        {
            @Override()
            public void draw(DrawEvent e) {
                onDraw(e);
            }
        });

        //add a listener for selecting events
        calendar.addCalendarListener(new CalendarAdapter(){
            public void dateClick(ResourceDateEvent e) {
                onDateClicked(e);
            }

        });


        // arrange the calendar
        getContentPane().add(calendar, BorderLayout.CENTER);

        pack();
        setVisible(true);
    }

    /* called when a date is clicked. Creates a recurring appointment. */
    protected void onDateClicked(ResourceDateEvent e) {

        int dayIndex = e.getDate().getDayOfWeek();
        Appointment item = new Appointment();
       item.setStartTime(e.getDate());
       item.setEndTime(e.getDate());
        item.setHeaderText(events[dayIndex]);
        item.getStyle().setBrush(brushes[dayIndex]);
        String s = item.getHeaderText();
        System.out.println(s);
        // Create the recurrence pattern.
       /* recurrence = new Recurrence();
        recurrence.setPattern(RecurrencePattern.Weekly);
        recurrence.setDaysOfWeek(getDayOfWeek(dayIndex));
        recurrence.setStartDate(e.getDate());
        recurrence.setRecurrenceEnd(RecurrenceEnd.Never);
        item.setRecurrence(recurrence);
*/      
       
        calendar.getSchedule().getItems().add(item);
    }

    /* gets the day of the week as a value of the DaysOfWeek enumeration.
    The arguments identifies the day of the week as an integer. */
    private int getDayOfWeek ( int i ) {

        switch (i) {
            case 1:
                return DaysOfWeek.Monday;
            case 2:
                return DaysOfWeek.Tuesday;
            case 3:
                return DaysOfWeek.Wednesday;
            case 4:
                return DaysOfWeek.Thursday;
            case 5:
                return DaysOfWeek.Friday;
            case 6:
                return DaysOfWeek.Saturday;
        }

        return DaysOfWeek.Sunday;

    }

    /* custom drawing is performed here/ */
    private void onDraw(DrawEvent e)
    {
        if(recurrence == null)
            return;
        if (e.getElement() == CustomDrawElements.CalendarItem)
        {
            if(e.getDate().getDay() == 6 )
            {
                java.awt.Image img = null;

                try {
                    // Read the image file from an input stream
                    InputStream is = new BufferedInputStream(
                            new FileInputStream("../cake.png"));
                    img = ImageIO.read(is);

                } 
                catch (IOException ioe) {
                }

                //gets the bounds of the drawing area
                Rectangle r = e.getBounds();
                AwtImage awtImage = new AwtImage(img);
                //draw the image
                e.getGraphics().drawImage(awtImage, e.getBounds().getLeft(), e.getBounds().getTop(), 32, 32);
                //JButton b = new JButton("THis");
                //b.setBounds(35,35,35,35);
                //this.add(b);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MainWindow window = null;
                try {
                    window = new MainWindow();
                    window.setVisible(true);
                }
                catch (Exception exp) {
                }
            }
        });
    }

    Brush[] brushes = {
            Brushes.AliceBlue, Brushes.Beige, Brushes.LightBlue,
            Brushes.LightGreen, Brushes.LightGray, Brushes.LightPink,
            Brushes.LemonChiffon
    };

   String[] events = {
            , "Name", "Name",
            "Name", "Name", "Name",
            "Name"
    };

}

