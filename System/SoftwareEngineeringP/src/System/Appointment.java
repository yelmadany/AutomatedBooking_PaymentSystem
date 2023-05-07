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
public class Appointment {
    //Usmani do ur thing
    String time;
    String date;
    String day;
    String meetup_Location;
    LeasingAgent agent;
    ArrayList<Store> Cart;
    
    public Appointment(LeasingAgent ag, String _date, String _time, String _day, String Loc, ArrayList<Store> _Cart){
        date = _date;
        time=_time;
        day=_day;
        meetup_Location=Loc;
        agent=ag;
        Cart=_Cart;
    }    
}
