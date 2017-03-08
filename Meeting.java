/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meetingschedulesystem;

import java.util.ArrayList;

/**
 *
 * @author mvp5542
 */
public class Meeting {

    public Meeting() {
    }

    public Meeting(String meetingName) {
        this.meetingName = meetingName;
    }
    
    private String meetingName;
    private Room room;
    private String time;
    
    
    
    public String getMeetingName() {
        return meetingName;
    }

    public Room getRoom() {
        return room;
    }

    public String getTime() {
        return time;
    }

    public void setMeetingName(String meetingName) {
        this.meetingName = meetingName;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Meeting{" + "meetingName=" + meetingName + ", room=" + room + ", time=" + time + '}';
    }
    
    


   
    
    
    
    
    
}
