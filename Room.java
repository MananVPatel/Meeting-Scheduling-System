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
public class Room {

    private int roomNumber;
    private ArrayList<Meeting> meetings;
    
    public Room(int roomNumber, ArrayList<Meeting> meetings) {
        this.roomNumber = roomNumber;
        meetings = new ArrayList<>(15); // set default size to `5
    }

    public int getRoomNumber() {
        return roomNumber;
    }
    
    public void addMeeting(Meeting meeting)
    {
        meetings.add(meeting);
    }

    public ArrayList<Meeting> getMeetings() {
        return meetings;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setMeetings(ArrayList<Meeting> meetings) {
        this.meetings = meetings;
    }

    @Override
    public String toString() {
        return "Room{" + "roomNumber=" + roomNumber + ", meetings=" + meetings + '}';
    }


}
