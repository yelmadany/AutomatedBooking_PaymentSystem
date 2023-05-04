/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author Yo200
 */
public class Tenant extends Customer{

    
    //add attributes
    private String TenantID;
    private ArrayList<LeaseContract> Lease_Contract;
    private ArrayList<Card> Card; 
    
    public Tenant(String tID) {
        this.TenantID = tID;
        this.Lease_Contract = new ArrayList();
        this.Card = new ArrayList();
    }

}
