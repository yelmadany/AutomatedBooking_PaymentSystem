/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System;

/**
 *
 * @author Yo200
 */
public class PotentialTenant extends Customer{

    String GuestID;
    
    public PotentialTenant(String n, String p_num, String email,String gID) {
        super(n, p_num, email);
        this.GuestID = gID;
    }
}
