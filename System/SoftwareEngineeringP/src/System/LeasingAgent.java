/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System;

import java.util.ArrayList;

/**
 *
 * @author Yo200
 */
public class LeasingAgent {
    //add attributes
    String name;
    String PhoneNumb; 
    String Email;
    int Salary;
    String Purpose;
    String Agent_id;
    Schedule sched;
    ArrayList <Appointment> appointment=new ArrayList<Appointment>(); 
    
    public LeasingAgent(String _name, String _PhoneNumb, String _Email, int _Sal, String _purp, String ID){
 
        name=_name;
     PhoneNumb=_PhoneNumb; 
     Email=_Email;
     Salary=_Sal;
    Purpose = _purp;
     Agent_id= ID;
}
    //connect with Account, Appointment, and Leasing Office
    
    //implement functions:::
    public String[][] GetAgentSchedule(){
        return sched.schedule_timings;
    }
    
    public void AddAppointment(Appointment app){
        sched.AdjustSchedule(app);
    }
    
    public void SendNotif(){}
}
