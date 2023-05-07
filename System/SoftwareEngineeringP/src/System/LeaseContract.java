package System;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yo200
 */
public class LeaseContract implements PaymentGateway {

    public LeaseContract(Calendar SD, Calendar ED, Tenant t, Store s, double rent, double disc, frequency f) {
       PaymentFrequency = f;
        switch(PaymentFrequency) {
      case monthly:
        frequency=1.0;
        break;
      case tri_annual:
         frequency=4.0;
        break;
      case bi_annual:
        frequency=6.0;
        break;
      case yearly:
        frequency=12.0;
        break;
    }
        TotalRentPrice = rent;
        Discount = disc;
        Start_Date = SD;
        End_Date = ED;
        Next_Due=Start_Date;
       // Next_Due = SD+(30*f);
        T = t;
        S = s;
        Payments = new ArrayList();
        DuePayments = new ArrayList();
        
        //implement calculation of DuePayments
    }

    @Override
    public void Pay(int Number, String Date) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void Verify(int Number, String Date) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    enum frequency {monthly, tri_annual, bi_annual, yearly}
    
    frequency PaymentFrequency;
    double frequency;
    double TotalRentPrice, Discount;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd");	
    Calendar Start_Date,End_Date,Next_Due = new GregorianCalendar();	
    //String Start_Date,End_Date,Next_Due;
    Tenant T;
    Store S;
    ArrayList<PaymentPaid> Payments;
    ArrayList<RentPaymentDue> DuePayments;
    
    
    
    //important returns the due date to be compared with the rent payments
    public Calendar getDueDate(){
        Next_Due.add(Calendar.MONTH, (int) frequency);
        return Next_Due;
    }
    
    public double SubtractDiscount(double total){
        total = total - Discount;
        return total;
    }
    
    public double AddRentPayment(double total, double frequency){
        double rent;
        double freq=0;
        switch((int)frequency) {
      case 1:
        freq=12.0;
        break;
      case 4:
         freq=4.0;
        break;
      case 6:
        freq=2.0;
        break;
      case 12:
        freq=1.0;
        break;
    }
        rent = SubtractDiscount(total);
        rent= rent/freq;
        
        
        
        return rent;
    }
    
    //implementation of interface void Verify(){} void Pay() {}
}
