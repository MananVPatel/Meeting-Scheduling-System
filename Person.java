/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meetingschedulesystem;

/**
 *
 * @author mvp5542
 */
public class Person {

    private String firstName, LastName;
    private String phoneNumber;
    
    public Person(String firstName, String LastName, String phoneNumber) {
        this.firstName = firstName;
        this.LastName = LastName;
        this.phoneNumber = phoneNumber;
       
        
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    @Override
    public String toString() {
        return "Person{" + "firstName=" + firstName + ", LastName=" + LastName + ", phoneNumber=" + phoneNumber + '}';
    }

    
}
