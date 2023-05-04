package System;
import java.util.ArrayList;
import java.util.Date;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yo200
 */
public class Store {
    private String Location;
    private String Space;
    private double Rental_rate;
    private String Classifier;
    private String Purpose;
    private char Rank;
    private LeaseContract lease_c;
    private ArrayList<MaintenanceRequest> Maint_req;
    private ArrayList<Appointment> Appt;
    private ArrayList<UtilityConsumption> Util_con;
    
    public Store(String loc, String space, double r_rate, String classy, String purp, char rank, LeaseContract lea_c){
        this.Location = loc;
        this.Space = space;
        this.Rental_rate = r_rate;
        this.Classifier = classy;
        this.Purpose = purp;
        this.Rank = rank;
        this.lease_c = lea_c;
        this.Maint_req = new ArrayList();
        this.Appt = new ArrayList();
        this.Util_con = new ArrayList();
    }
    
    public double GetUnifiedBillDue() {
        return 1;
    }
    
    public void RequestVerifyTransaction(int i, Date d) {
       // please work
    }
    
    public void  RequestPay(Card c, int i) {
        
    }
}
