/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meetingschedulesystem;

import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author mvp5542
 */
public class MeetingScheduleSystem{

    /**
     * @param args the command line arguments
     */
    public static ArrayList<Person> peopleArrayList;
    public static ArrayList<Meeting> meetingArrayList;
    public static ArrayList<Room> roomArrayList;
    
    
    public static void main(String[] args) {
        
        init();
        SchedulingSystemUI schedulingSystemUI = new SchedulingSystemUI();
        schedulingSystemUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        schedulingSystemUI.setVisible(true);

    }
    
    public static void init()
    {
        peopleArrayList = new ArrayList<>();
        meetingArrayList = new ArrayList<>();
        roomArrayList = new ArrayList<>();
        
        
        
        
    }
}
