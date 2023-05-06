package System;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yo200
 */
public class LeaseContract implements PaymentGateway {

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
    String Start_Date,End_Date,Next_Due;
    Tenant T;
    Store S;
    ArrayList<PaymentPaid> Payments;
    ArrayList<RentPaymentDue> DuePayments;
    
    public LeaseContract(String SD, String ED, String ND, Tenant t, Store s, double rent, double disc, frequency f){
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
        Next_Due = ND;
        T = t;
        S = s;
        Payments = new ArrayList();
        DuePayments = new ArrayList();
        
        //implement calculation of DuePayments
    }
    
    //important returns the due date to be compared with the rent payments
    String getDueDate(){
        return Next_Due;
    }
    
    public double SubtractDiscount(double total){
        total = total - Discount;
        return total;
    }
    
    public double AddRentPayment(double total){
        int i;
        for(i = 0; i < DuePayments.size();i++){
           if(DuePayments.get(i).getDueDate() == Next_Due){
               break;
           }
        }
        total += DuePayments.get(i).getRentPayment();
        
        total = SubtractDiscount(total);
        return total;
    }
    
    //implementation of interface void Verify(){} void Pay() {}
}
