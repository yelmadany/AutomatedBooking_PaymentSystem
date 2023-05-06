/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System;

/**
 *
 * @author Yo200
 */
public class Account {
    
    String Username;
    String Password;
    String Type;
    LeasingAgent Leasing_Agent;
    Customer Customer;
    
    public Account(String u, String p, String t) {
        this.Username = u;
        this.Password = p;
        
        this.Type = t;
    }
    
}
