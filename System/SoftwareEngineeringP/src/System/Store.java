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
    int id;
    public String Location;
    public String Space;
    public double Rental_rate;
    public String Classifier;
    public String Purpose;
    public char Rank;
    public LeaseContract lease_c;
    public ArrayList<MaintenanceRequest> Maint_req;
    public ArrayList<Appointment> Appt;
    public ArrayList<UtilityConsumption> Util_con;
    


    public Store(int _id,String loc, String space, double r_rate, String classy, String purp, char rank) {
          this.id=_id;
        this.Location = loc;
        this.Space = space;
        this.Rental_rate = r_rate;
        this.Classifier = classy;
        this.Purpose = purp;
        this.Rank = rank;
        
        this.Maint_req = new ArrayList();
        this.Appt = new ArrayList();
        this.Util_con = new ArrayList();
    }
    
    public void setLease(LeaseContract _lease_c){
        this.lease_c = _lease_c;
    }
    
    public double GetUnifiedBill() {
        double Total_util=0;
        double unifiedBill=0;
        double freq=lease_c.frequency;
        
   
        for(int i=0; i<(int)freq;i++){
            Total_util= Total_util+ Util_con.get(i).GetTotalUtilityPrice();
        }
        unifiedBill=unifiedBill + Total_util;
        
        
        for(int i=0; i<Maint_req.size();i++){
            unifiedBill=unifiedBill + Maint_req.get(i).GetMisuseCharges();
            //Maint_req.get(i).misue_charge=0;
            
            
        }
        
        double rent_p=(lease_c.AddRentPayment(lease_c.TotalRentPrice,lease_c.frequency));
        unifiedBill=unifiedBill +rent_p;
        
        return unifiedBill;
  } 
        
       
    public boolean RequestVerifyTransaction(int i, Date d) {
       // please work
       return true;
    }
    
    public boolean RequestPay(Card c, double i) {
        
        return true;
    }
}
