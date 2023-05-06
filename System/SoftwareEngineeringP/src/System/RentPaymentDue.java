/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System;

/**
 *
 * @author Yo200
 */
public class RentPaymentDue {
    
    //Implementation Done
    
    private String Due_Date;
    private double installment_amount;
    private LeaseContract LC;
    
    public RentPaymentDue(String _Due_Date,  LeaseContract _LC){
    LC=_LC;
    Due_Date=_Due_Date;
    
    installment_amount=LC.SubtractDiscount(LC.TotalRentPrice)/LC.frequency;
}
    
    public double getRentPayment(){
        
        return installment_amount;
        
    }
    
    public String getDueDate(){
        return Due_Date;
    }
    
}
