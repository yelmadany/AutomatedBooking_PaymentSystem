/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Yo200
 */
public class RentPaymentDue {
    
    //Implementation Done
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd");	
    Calendar Due_Date = new GregorianCalendar();
    //private String Due_Date;
    private double installment_amount;
    private LeaseContract LC;
    
    public RentPaymentDue(Calendar _Due_Date,  LeaseContract _LC){
    LC=_LC;
    Due_Date=_Due_Date;
    
    installment_amount=LC.SubtractDiscount(LC.TotalRentPrice)/LC.frequency;
}
    
    public double getRentPayment(){
        
        return installment_amount;
        
    }
    
    public Calendar getDueDate(){
        return Due_Date;
    }
    
}
