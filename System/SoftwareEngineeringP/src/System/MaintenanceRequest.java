/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System;

/**
 *
 * @author Yo200
 */
public class MaintenanceRequest {
    //@Usmani
    int ID;
    String Priority;
    String Description;
    double misue_charge;
    String time;
    
    public MaintenanceRequest(int _ID, String _Priority, String descp, double m_charge, String _time){
  
    ID=_ID;
    Priority=_Priority;
    Description=descp;
    misue_charge=m_charge;
    time=_time;
    
}
    
    
    public double GetMisuseCharges(){
        //Card C = new Card(CN, Dat);
     //   return this.misue_charge;
        //Card C = new Card(CN, Dat);
        return misue_charge;
        //Card C = new Card(CN, Dat);
     //   return this.misue_charge;
        //Card C = new Card(CN, Dat);
       
    }
    //you get the jist of it get on it
}
